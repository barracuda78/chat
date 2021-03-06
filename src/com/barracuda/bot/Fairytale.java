package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.client.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Fairytale implements Serializable {
    private final static String NAME = "сказку";
    String path;

    public Fairytale(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }
    public String getName(){ return NAME;}

    public static void fairytaleNew(Client client){
        ArrayList<Fairytale> listOfFairytales = new ArrayList<>();
        Fairytale fairytale001 = new Fairytale("bin/fairytale001");
        listOfFairytales.add(0, fairytale001);
        Fairytale fairytale002 = new Fairytale("bin/fairytale002");
        listOfFairytales.add(0, fairytale002);
        Fairytale fairytale003 = new Fairytale("bin/fairytale003");
        listOfFairytales.add(0, fairytale003);
        Fairytale fairytale004 = new Fairytale("bin/fairytale004");
        listOfFairytales.add(0, fairytale004);
        Fairytale fairytale005 = new Fairytale("bin/fairytale005");
        listOfFairytales.add(0, fairytale005);
        Fairytale fairytale006 = new Fairytale("bin/fairytale006");
        listOfFairytales.add(0, fairytale006);
        Fairytale fairytale007 = new Fairytale("bin/fairytale007");
        listOfFairytales.add(0, fairytale007);
        Fairytale fairytale008 = new Fairytale("bin/fairytale008");
        listOfFairytales.add(0, fairytale008);
        Fairytale fairytale009 = new Fairytale("bin/fairytale009");
        listOfFairytales.add(0, fairytale009);
        Fairytale fairytale010 = new Fairytale("bin/fairytale010");
        listOfFairytales.add(0, fairytale010);

        ArrayList<Integer> listOfRandoms = new ArrayList<>(); //для сбора уже выскакивавших рандомных значений.

        try {

            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Давай расскажу тебе сказку!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что? Рассказать сказку? Да как нечего делать. Лови!");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Рассказать сказку? Хорошо!");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну ладно, давай расскажу тебе сказку.");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Так и быть, расскажу сказку.");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что ж... давай расскажу тебе сказку!");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хорошо, я расскажу. Расскажу тебе сказку!");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хорошо, расскажу. Слушай. Специально для тебя!");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ладно. Рассказываю сказку. Слушай внимательно!");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ладно, ладно. Давай расскажу.");
                    Thread.sleep(1000);
                    break;
                }
            }

            for(int j = 0; j < listOfFairytales.size(); j++) {
                //это цикл для того, чтобы рассказать все сказки. 10 Или сколько их будет в аррейлисте.
                int rr = Util.randomize();

                //сказки удаляются по одной, с каждым разом их всё меньше 10. А рандомное число может быть и 9, и тогда IndexOutOfBoundsException. А так - нет.
                if(rr >= listOfFairytales.size()){
                    rr = listOfFairytales.size() - 1;
                }
                else{
                    rr = rr; //просто так)))
                }


                boolean rAlreadyWas = listOfRandoms.contains(rr);
                if(rAlreadyWas){
                    continue;
                }
                else{
                    listOfRandoms.add(rr);                                       //добавить r  в список.
                    listOfFairytales.get(rr).readFromFile(listOfFairytales.get(rr));   //рассказать сказку.

                    //Спросить, хочет ли еще сказку
                    if (Fairytale.wantMore(client)) {
                        fairytaleNew(client);           //здесь ошибка. Он не учитывает загаданную загадку и может загадать ту же. Нужно удалять загаданную загадку из массива. Массив загадок создавать в другом методе.
                    } else {
                        Deal.dealer(client);
                    }
                    listOfFairytales.remove(rr);                                 //удалисть из списка б/у-шную сказку.
                }
            }

        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Это было слишком... слишком долго, дружок!");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода. Но мы продолжаем.");
        }



    }

    public void readFromFile(Fairytale fairytale){
        File file = new File(fairytale.getPath());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                ConsoleHelper.writeMessage(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            ConsoleHelper.writeMessage("Закончились мои сказочки, детка...");        }
    }

    public String toString(){
        return "Сказка: путь: " + this.path +"имя: " + NAME + "";
    }

    public static boolean wantMore(Client client){
        try {
            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, еще хочешь сказочку?");
                    Thread.sleep(1000);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ещё сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Что, ещё сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, хочешь еще разок сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Еще будешь читать сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, давай еще разочек расскажу сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Как ты смотришь на то, чтобы повторить? Еще раз сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хочешь еще сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, давай-ка ещё разок сказочку, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну, что скажешь? Еще разок сказочку рассказать?");
                    Thread.sleep(1000);
                    break;
                }
            }

            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answer = ConsoleHelper.readString();
            answer = answer.trim().toLowerCase();
            if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай") || answer.equals("погнали")||answer.equals("сказку")||answer.equals("сказочку")) {
                return true;
            } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
                return true;
            } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")||answer.equals("сказку")||answer.equals("сказочк")||answer.equals("сказк")) {
                return true;
            } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")) {
                return true;
            } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.equals("неа") || answer.equals("достал") || answer.equals("надоел") || answer.equals("задолбал") || answer.equals("скучно")) {
                return false;
            } else if (answer.contains("не надо") || answer.contains("не хочу") || answer.contains("неа") || answer.contains("достал") || answer.contains("надоел") || answer.contains("задолбал") || answer.contains("скучно")) {
                return false;
            } else if (answer.contains("анекдот") || answer.contains("funn") || answer.contains("анегдот")) {
                Anecdot.anecdoteNew(client);
            } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
                Riddle.riddleNew(client);
            } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
                Fairytale.exit();
            } else return false;
        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Слишком уж долго тебя ждать...");
        }
//        catch(IOException io){
//            ConsoleHelper.writeMessage("Мне тут говорят, что ошибка ввода-вывода какая-то... Но мы продолжаем!");
//        }
        return false; ////////////////////////////////////////вот если ретерн фолс убрать, то это может быть поможет...
    }

    public static void exit(){
        Util.exit("exit");
        return;
    }
}
