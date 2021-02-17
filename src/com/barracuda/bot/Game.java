package com.barracuda.bot;

import com.barracuda.ConsoleHelper;

import java.io.IOException;

public class Game {
    public static void game001() throws IOException, InterruptedException{
        ConsoleHelper.writeMessage("загадай любое целое число.");
        Thread.sleep(1000);
        ConsoleHelper.writeMessage("Введи это число с клавиатуры. Нажми ENTER.");
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(ConsoleHelper.readString());
        int y = x + 2;
        ConsoleHelper.writeMessage("мда... А я загадал число " + y + " !");
        ConsoleHelper.writeMessage("Тебе все ясно? В цифрах мне нет равных. Тут я всегда... ПОБЕДЮ.");
    }

    public static void game000() throws IOException, InterruptedException{
        Thread.sleep(2000);
        ConsoleHelper.writeMessage("Сейчас я угадаю год твоего рождения.");
        Thread.sleep(1000);
        ConsoleHelper.writeMessage("79 кружек пива...");
        Thread.sleep(2000);
        ConsoleHelper.writeMessage("...минус твой возраст. Самостоятельно считай.");
        Thread.sleep(3000);
        ConsoleHelper.writeMessage("Не все же мне за тебя считать...");
        Thread.sleep(2000);
        ConsoleHelper.writeMessage("К этому числу прибавь 40!");
        Thread.sleep(3000);
        ConsoleHelper.writeMessage("Ну вот. И получился твой год рождения!!!");
        Thread.sleep(600);
        ConsoleHelper.writeMessage("Проверь еще раз...");
    }
}
