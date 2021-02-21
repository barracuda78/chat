package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.Server;
import com.barracuda.client.BarracudaBotClient;
import com.barracuda.client.Client;

import java.io.IOException;

public class Game {
    public static void game001(Client client) throws IOException, InterruptedException{
        ConsoleHelper.writeMessage("загадай любое целое число.");
        client.sendTextMessage("загадай любое целое число.");
        Thread.sleep(600);
        ConsoleHelper.writeMessage("Введи это число с клавиатуры. Нажми ENTER.");
        client.sendTextMessage("Введи это число с клавиатуры. Нажми ENTER.");
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String deal = null;
        String number = null;
        while (deal == null) {
            number = BarracudaBotClient.messagesQueue.take();
            number = number.replaceAll("[^0-9]", "");
        }

        int x = 0;
        if(number != null)
            x = Integer.parseInt(number);
        int delta = (int)(Math.random()*10) + 1;
        int y = x + delta;
        ConsoleHelper.writeMessage("мда... А я загадал число " + y + " !");
        client.sendTextMessage("мда... А я загадал число " + y + " !");
        ConsoleHelper.writeMessage("Тебе все ясно? В цифрах мне нет равных. Тут я всегда... ПОБЕДЮ.");
        client.sendTextMessage("Тебе все ясно? В цифрах мне нет равных. Тут я всегда... ПОБЕДЮ.");
    }

    public static void game000(Client client) throws IOException, InterruptedException{
        Thread.sleep(1000);
        ConsoleHelper.writeMessage("Сейчас я угадаю год твоего рождения.");
        client.sendTextMessage("Сейчас я угадаю год твоего рождения.");

        Thread.sleep(800);
        ConsoleHelper.writeMessage("80 кружек пива...");
        client.sendTextMessage("80 кружек пива...");

        Thread.sleep(1000);
        ConsoleHelper.writeMessage("...минус твой возраст. Самостоятельно считай.");
        client.sendTextMessage("...минус твой возраст. Самостоятельно считай.");

        Thread.sleep(1000);
        ConsoleHelper.writeMessage("Не все же мне за тебя считать...");
        client.sendTextMessage("Не все же мне за тебя считать...");

        Thread.sleep(1000);
        ConsoleHelper.writeMessage("К этому числу прибавь 40!");
        client.sendTextMessage("К этому числу прибавь 40!");

        Thread.sleep(1000);
        ConsoleHelper.writeMessage("Ну вот. И получился твой год рождения!!!");
        client.sendTextMessage("Ну вот. И получился твой год рождения!!!");

        Thread.sleep(600);
        ConsoleHelper.writeMessage("Проверь еще раз...");
        client.sendTextMessage("Проверь еще раз...");
    }
}
