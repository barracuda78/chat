package com.barracuda.client;

import com.barracuda.ConsoleHelper;
import com.barracuda.bot.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BarracudaBotClient extends Client {

    public static volatile BlockingQueue<String> messagesQueue = new ArrayBlockingQueue<String>(100);

    public class BarraSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            //sendTextMessage("Привет всем. Я бот. Умею болтать на любые темы.");
            super.clientMainLoop();
        }

        @Override
        public void processIncomingMessage(String message) {
//            if(messagesQueue.add(message))
//                ConsoleHelper.writeMessage("в очередь добавлено: " + message + " из класса BarracudaBotClient");
            ConsoleHelper.writeMessage(message);
            Greeting.whatIsYourName(BarracudaBotClient.this);
            try {
                // Greeting.greeting(user);
                Deal.dealer(BarracudaBotClient.this);
                Util.exit("exit"); //по идее это должен быть выход из программы....
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
//            Helper helper = new Helper(BarracudaBotClient.this);
//            helper.readString();
        }
    }

    @Override
    public SocketThread getSocketThread(){
        return new BarracudaBotClient.BarraSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole(){
        return false;
    }

    @Override
    protected String getUserName(){
        return "barracuda_bot";
    }

    public static void main(String[] args) {
        new BarracudaBotClient().run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("содержимое очереди: " + messagesQueue);
            }
        }).start();
    }
}
