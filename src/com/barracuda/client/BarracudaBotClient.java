package com.barracuda.client;

import java.io.IOException;

public class BarracudaBotClient extends Client {


    public class BarraSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            sendTextMessage("Привет всем. Я бот. Умею болтать на любые темы.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            com.barracuda.bot.Main.main(new String[0]);
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
