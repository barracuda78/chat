package com.barracuda.client;

import com.barracuda.bot.Deal;
import com.barracuda.bot.Greeting;
import com.barracuda.bot.User;
import com.barracuda.bot.Util;

import java.io.IOException;

public class BarracudaBotClient extends Client {
    protected static User user = new User();

    public class BarraSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException{

            sendTextMessage("Привет всем. Я бот. Умею болтать на любые темы.");
            //здесь сообщение с вариантами первого приветствия из barracudaChat:

            Greeting.whatIsYourName(BarracudaBotClient.this);
            try {
                Greeting.greeting(user);
                Deal.dealer();
                Util.exit("exit"); //по идее это должен быть выход из программы....
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            //com.barracuda.bot.Main.main(new String[0]);
        }
    }

    @Override
    protected SocketThread getSocketThread(){
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
