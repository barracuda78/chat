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
//                if (messageFromServer.getType() == MessageType.TEXT) {
//                    try {
//                        String text = messageFromServer.getData();
//                        messagesQueue.put(text);
//                        ConsoleHelper.writeMessage("в очередь добавлено: " + text + " из класса Client, нить: " + Thread.currentThread().getName());
//                    } catch (InterruptedException e) {
//                        ConsoleHelper.writeMessage("Не удалось поместить сообщение в очередь бота.");
//                        e.printStackTrace();
//                    }
//
//                    // processIncomingMessage(message);
//                } else if (messageFromServer.getType() == MessageType.USER_ADDED) {
//                    informAboutAddingNewUser(messageFromServer.getData());
//                } else if (messageFromServer.getType() == MessageType.USER_REMOVED) {
//                    informAboutDeletingNewUser(messageFromServer.getData());
//                } else {
//                    throw new IOException("Unexpected MessageType");
//                }
                processIncomingMessage(messageFromServer.getData());
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
            //добавлять в стек строки - слова в зависимости от контекста. Возможно, LinkedHashMap вместо стека использовать.
            //Чтобы определять в каком мы методе.

            String s = stack.pop();
            //тут привести строку к одному слову типа "игра", "анекдот", "загадка" и прочим. Завести для этого приватный метод:
            //по сути этот метод - заменитель Dealer.deal();
            Mode mode = null;

            try {
                mode = stringConverter(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //тут в свитче в зависимости от значения mode - вызывать нужные методы.
            //далее внутри каждого case добавить еще по одному switch - на степерь вложенности вопросов-ответов в каждой ветке.
            //для этого создать мапу или стэк, подумать...

            switch(mode){
                case SLEEP:
                    try {
                        Deal.dealer(BarracudaBotClient.this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case GAME:

                    String st = stack.pop();
                    switch(st){
                        case "1":
                            //
                            break;
                        case "2":
                            //
                            break;
                        case "3":
                            //
                            break;
                        case "4":
                            //
                            break;
                    }
                    try {
                        Game.game001(BarracudaBotClient.this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case FAIRYTALE:
                    //
                    break;
                case RIDDLE:
                    //
                    break;
                case EAT:
                    //
                    break;
                case ANECDOTE:
                    //
                    break;
                case CHAT:
                    //
                    break;
                case ENG:
                    //
                    break;
                case AGAIN:
                    //
                    break;
                case EXIT:
                    //
                    break;

                    //    ANECDOTE,
                //    CHAT,
                //    ENG,
                //    AGAIN,
                //    EXIT
            }
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

    private Mode stringConverter(String s) throws InterruptedException, IOException{
        ConsoleHelper.writeMessage("Выбирай, чем займемся?");
        this.sendTextMessage("Выбирай, чем займемся?");

        s = s.trim().toLowerCase();

        if (s.contains("спать")){
            return Mode.SLEEP;
        }
        else if(s.contains("есть") || s.contains("кушать")  || s.contains("жрать") || s.contains("мороженого") || s.contains("мороженое")){
            return Mode.EAT;
        }
        else if(s.contains("играть") || s.contains("игру") || s.contains("игрой") || s.contains("игры") || s.contains("игр")){
            return Mode.GAME;
        }
        else if(s.contains("анекдот") || s.contains("анегдот") || s.contains("анигдот") || s.contains("аникдот")|| s.contains("анек")) {
            return Mode.ANECDOTE;
        }
        else if(s.contains("сказку") || s.contains("сказки") || s.contains("сказка") || s.contains("сказкой")){
            return Mode.FAIRYTALE;
        }
        else if(s.contains("загадку") || s.contains("загадки") || s.contains("загадка") || s.contains("загадкой") || s.contains("Загадку") || s.contains("Загадки") || s.contains("Загадка") || s.contains("Загадкой")){
            return Mode.RIDDLE;
        }
        else if(s.contains("не знаю") || s.contains("не решил") || s.contains("пофиг") || s.contains("фиг")){
            return Mode.RIDDLE;
        }
        else if(s.contains("болтать") || s.contains("чат") || s.contains("разговор") || s.contains("говорить")|| s.contains("поболтать") || s.contains("поговорим") || s.contains("початимся")|| s.contains("поболтаем")|| s.contains("переписываемся")|| s.contains("переписываться")){
            return Mode.CHAT;
        }
        else if (s.contains("англ") || s.contains("engl")||s.contains("ингл")){
            return Mode.ENG;
        }
        else if(s.contains("exit") || s.contains("выключ") || s.contains("выход") || s.contains("надоел")){
            return Mode.EXIT;
        }
        else{
            return Mode.AGAIN;
        }
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
