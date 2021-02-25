package com.barracuda.client;

import com.barracuda.ConsoleHelper;
import com.barracuda.bot.*;

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
            //моя добавочка---для бота
            //String message = messageFromServer.getData();
            String[] nameAndTextArray = message.split(": ");
            String name = null;
            String text = null;
            if (nameAndTextArray.length > 1) {
                name = nameAndTextArray[0];
                text = nameAndTextArray[1];
            }

            if(text != null && name.equals("Andrey")) {          //<======= пока костыль, расхардкодить имя и заменить на client.getName();
                BarracudaBotClient.messagesQueue.add(message);   //<========добавляем message, разделенный двоеточием с именем клиента!
                ConsoleHelper.writeMessage("в очередь добавлено: " + text + " из класса Client, нить: " + Thread.currentThread().getName());
            }
            //конец добавочки.


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

        new Thread(() -> {
            while(true) {
                System.out.println("содержимое очереди: " + BarracudaBotClient.messagesQueue + ", выполняет нить: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new BarracudaBotClient().run();

    }
}
