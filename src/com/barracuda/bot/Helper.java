package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private Client client;

    public Helper(Client client){
        this.client = client;
    }

    public Client getClient(Client client){
        return  client;
    }

    public void writeMessage(String message) {
        System.out.println(message);
        client.sendTextMessage(message);

    }

    public String readString(){
        String s = null;
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            return readString();
        }
        return s;
    }

    public int readInt(){
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
