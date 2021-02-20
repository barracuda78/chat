package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.Server;
import com.barracuda.client.BarracudaBotClient;
import com.barracuda.client.Client;

import java.io.IOException;

public class Deal {
    public static void dealer(Client client) throws IOException, InterruptedException{
        ConsoleHelper.writeMessage("Выбирай, чем займемся?");
        client.sendTextMessage("Выбирай, чем займемся?");


        //String deal = ConsoleHelper.readString(); //----------------------------------------------->раскомментить!!!

       String deal = null;
        ConsoleHelper.writeMessage("прошли в deal() String deal = null;");

        ConsoleHelper.writeMessage("messagesQueue содержимое: " + BarracudaBotClient.messagesQueue.toString());

        while(true){
            if(!BarracudaBotClient.messagesQueue.isEmpty()){
                deal = BarracudaBotClient.messagesQueue.take();
                break;
            }
        }

        ConsoleHelper.writeMessage("В методе deal() добрались до места после while!");
        client.sendTextMessage("В методе deal() добрались до места после while!");


        deal = deal.trim().toLowerCase();
        if (deal.contains("спать")){
            Thread.sleep(600);
            client.sendTextMessage("Тогда выключай компьютер, спокойной ночи!");
            Thread.sleep(600);
            client.sendTextMessage("Или...");
            dealer(client);
        }
        else if(deal.contains("есть") || deal.contains("кушать")  || deal.contains("жрать") || deal.contains("мороженого") || deal.contains("мороженое")){
            Thread.sleep(600);
            client.sendTextMessage("Тогда приятного аппетита!");
            Thread.sleep(600);
            client.sendTextMessage("Или...");
            dealer(client);
        }
        else if(deal.contains("играть") || deal.contains("игру") || deal.contains("игрой") || deal.contains("игры") || deal.contains("игр")){
            Thread.sleep(600);
            client.sendTextMessage("О! Круто! Давай поиграем!");
            Game.game001(client);
            client.sendTextMessage("Так и быть. Еще игра: ");
            Game.game000(client);
            dealer(client);
        }
        else if(deal.contains("анекдот") || deal.contains("анегдот") || deal.contains("анигдот") || deal.contains("аникдот")|| deal.contains("анек")) {
            Anecdot.anecdoteNew(client);
        }
        else if(deal.contains("сказку") || deal.contains("сказки") || deal.contains("сказка") || deal.contains("сказкой")){
            Fairytale.fairytaleNew(client);
        }
        else if(deal.contains("загадку") || deal.contains("загадки") || deal.contains("загадка") || deal.contains("загадкой") || deal.contains("Загадку") || deal.contains("Загадки") || deal.contains("Загадка") || deal.contains("Загадкой")){
            Thread.sleep(600);
            client.sendTextMessage("Давай тогда я загадаю тебе одну: ");
            Thread.sleep(600);

            Riddle.riddleNew(client);
        }
        else if(deal.contains("не знаю") || deal.contains("не решил") || deal.contains("пофиг") || deal.contains("фиг")){
            Thread.sleep(600);
            client.sendTextMessage("Хорошо, раз ты не в курсе, я загадаю загадку!");

            Riddle.riddleNew(client);
        }
        else if(deal.contains("болтать") || deal.contains("чат") || deal.contains("разговор") || deal.contains("говорить")|| deal.contains("поболтать") || deal.contains("поговорим") || deal.contains("початимся")|| deal.contains("поболтаем")|| deal.contains("переписываемся")|| deal.contains("переписываться")){
            Thread.sleep(600);
            client.sendTextMessage("Хорошо. Давай немного поговорим...");
            Chat.chat00(client);

        }
        else if (deal.contains("англ") || deal.contains("engl")||deal.contains("ингл")){
            Chat.chat003english(client);
        }
        else if(deal.contains("exit") || deal.contains("выключ") || deal.contains("выход") || deal.contains("надоел")){
            Util.exit("deal");
            return;
        }
        else{
            client.sendTextMessage("Я на этой планете недавно. Не все понимаю. Напиши что-нибудь другое, пожалуйста!");
            dealer(client);
        }
    }
}
