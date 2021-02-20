package com.barracuda.client;

import com.barracuda.bot.*;

import java.io.IOException;

public class BarracudaBotClient extends Client {
    protected static User user = new User();

    public class BarraSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException{

            sendTextMessage("Привет всем. Я бот. Умею болтать на любые темы.");
            //здесь сообщение с вариантами первого приветствия из barracudaChat:

            super.clientMainLoop();
        }

        @Override
        public void processIncomingMessage(String message) {
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
    }

}
