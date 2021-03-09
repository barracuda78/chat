package com.barracuda.client;

import com.barracuda.ConsoleHelper;
import com.barracuda.Message;
import com.barracuda.MessageType;
import com.barracuda.bot.*;

import java.io.IOException;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BarracudaBotClient extends Client {

    public static volatile BlockingQueue<String> messagesQueue = new ArrayBlockingQueue<String>(100);
    public static volatile Stack<String> stack = new Stack<>();

    public class BarraSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException{
            //sendTextMessage("Привет всем. Я бот. Умею болтать на любые темы.");
            //super.clientMainLoop();
            botMainLoop();
        }

        //мой метод
        protected void botMainLoop() throws IOException, ClassNotFoundException{
            while(true) {
                Message messageFromServer = connection.receive();
                if (messageFromServer.getType() == MessageType.TEXT) {
                    try {
                        String text = messageFromServer.getData();
                        messagesQueue.put(text);
                        ConsoleHelper.writeMessage("в очередь добавлено: " + text + " из класса Client, нить: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        ConsoleHelper.writeMessage("Не удалось поместить сообщение в очередь бота.");
                        e.printStackTrace();
                    }
                    processIncomingMessage(messageFromServer.getData());
                    // processIncomingMessage(message);
                } else if (messageFromServer.getType() == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(messageFromServer.getData());
                } else if (messageFromServer.getType() == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(messageFromServer.getData());
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        @Override
        public void processIncomingMessage(String message) {

            //моя добавочка---для бота
            //String message = messageFromServer.getData();
            ConsoleHelper.writeMessage(message);
            stack.push(message); //запихали месседж в стек.



            String[] nameAndTextArray = message.split(": ");
            String name = null;
            String text = null;
            if (nameAndTextArray.length > 1) {
                name = nameAndTextArray[0];
                text = nameAndTextArray[1];
            }

            //глубина вхождения в методы...для интерпретации - к какому методу относится ответ пользователя.
            switch(stack.size()){
                case 1:
                    try {
                        Deal.dealer(BarracudaBotClient.this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    ///
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
            }

//            if(text != null && name.equals("Andrey")) {          //<======= пока костыль, расхардкодить имя и заменить на client.getName();
//                try {
//                    BarracudaBotClient.messagesQueue.put(message);   //<========добавляем message, разделенный двоеточием с именем клиента!
//                } catch (InterruptedException e) {
//                    ConsoleHelper.writeMessage("Не удалось поместить сообщение в очередь бота.");
//                    e.printStackTrace();
//                }
//                ConsoleHelper.writeMessage("в очередь добавлено: " + text + " из класса Client, нить: " + Thread.currentThread().getName());
//            }
            //конец добавочки.

//            Greeting.whatIsYourName(BarracudaBotClient.this);
//            try {
//                // Greeting.greeting(user);
//                Deal.dealer(BarracudaBotClient.this);
//                Util.exit("exit"); //по идее это должен быть выход из программы....
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }

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
