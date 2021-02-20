package com.barracuda.bot;

import com.barracuda.ConsoleHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WindowHelper extends ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage(String message) {
        System.out.println(message);
        //sendTextMessage();

    }

    public static String readString(){
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            return readString();
        }
        return s;
    }

    public static int readInt(){
        int a = 0;
        try {
            a = Integer.valueOf(readString());
        }catch (NumberFormatException e){
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            return Integer.valueOf(readString());
        }
        return a;
    }
}
