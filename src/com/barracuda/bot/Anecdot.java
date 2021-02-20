package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.client.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Anecdot implements Serializable {
    private final static String NAME = "анекдот";
    String path;

    public Anecdot(String path){
        this.path = path;
    }

    public static void anecdoteNew(Client client){

        try {
            ArrayList<Anecdot> listOfAnecdots = new ArrayList<>();
            Anecdot anecdot01 = new Anecdot("bin/anecdot001");
            listOfAnecdots.add(0, anecdot01);
            Anecdot anecdot02 = new Anecdot("bin/anecdot002");
            listOfAnecdots.add(1, anecdot02);
            Anecdot anecdot03 = new Anecdot("bin/anecdot003");
            listOfAnecdots.add(2, anecdot03);
            Anecdot anecdot04 = new Anecdot("bin/anecdot004");
            listOfAnecdots.add(3, anecdot04);
            Anecdot anecdot05 = new Anecdot("bin/anecdot005");
            listOfAnecdots.add(4, anecdot05);
            Anecdot anecdot06 = new Anecdot("bin/anecdot006");
            listOfAnecdots.add(5, anecdot06);
            Anecdot anecdot07 = new Anecdot("bin/anecdot007");
            listOfAnecdots.add(6, anecdot07);
            Anecdot anecdot08 = new Anecdot("bin/anecdot008");
            listOfAnecdots.add(7, anecdot08);
            Anecdot anecdot09 = new Anecdot("bin/anecdot009");
            listOfAnecdots.add(8, anecdot09);
            Anecdot anecdot10 = new Anecdot("bin/anecdot010");
            listOfAnecdots.add(9, anecdot10);
            Anecdot anecdot11 = new Anecdot("bin/anecdot011");
            listOfAnecdots.add(10, anecdot11);


            ArrayList<Integer> listOfRandoms = new ArrayList<>(); //для сбора уже выскакивавших рандомных значений.

            Thread.sleep(600);
            ConsoleHelper.writeMessage("Давай расскажу анекдот!!!");
            Thread.sleep(600);

            for (int j = 0; j < listOfAnecdots.size(); j++) {
                //это цикл для того, чтобы рассказать все 11 анекдотов. Или сколько их будет в аррейлисте.
                int r = Util.randomize();

                boolean rAlreadyWas = listOfRandoms.contains(r);

                if (rAlreadyWas) {
                    continue;
                } else {
                    listOfRandoms.add(r);                   //добавить r  в список
                    listOfAnecdots.get(r).readFromFile();   //рассказать анекдот
                    //узнать хочет ли еще анекдот.
                    String yN = Anecdot.wantMoreAnecdot(client);
                    if (yN.equals("нет")) {
                        Deal.dealer(client);
                    } else {

                        int ran = Util.randomize();
                        switch (ran) {
                            case 0: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Как скажешь!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Хорошо!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ладно");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Всё для тебя!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Будь по-твоему");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ну так и быть!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ладно, ладно. Держи!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Тогда слушай!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Тогда лови!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Хорошо. Как скажешь.");
                                Thread.sleep(1000);
                                break;
                            }
                        }

                    }
                }
            }
            //anecdoteNew();
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в методе anecdoteNew(). Но мы можем продолжать...");
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Интерраптед ексепшн в методе anecdoteNew(), но мы можем идти дальше...");
        }

    }   //анекдотики

    public String getPath(){
        return path;
    }
    public String getName(){ return NAME;}

    public void readFromFile(){
        File file = new File(getPath());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                ConsoleHelper.writeMessage(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            ConsoleHelper.writeMessage("Закончились мои анекдоты, детка...");        }
    }

    public static String wantMoreAnecdot(Client client){

        try {

            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(3000);
                    ConsoleHelper.writeMessage("Ну что, анекдот еще хочешь?");
                    Thread.sleep(1000);
                    break;
                }
                case 1: {
                    Thread.sleep(3000);
                    ConsoleHelper.writeMessage("Ну что? Рассказать еще анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(3000);
                    ConsoleHelper.writeMessage("давай еще анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(3000);
                    ConsoleHelper.writeMessage("Рассказать еще один анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хочешь, еще один анекдот расскажу?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Давай еще один анекдот, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, еще хочешь анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Давай еще анекдот расскажу, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Рассказать еще один анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Рассказать тебе ещё анекдот, а?");
                    Thread.sleep(1000);
                    break;
                }
            }


            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //String answer = bufferedReader.readLine();
            String answer = ConsoleHelper.readString();

            if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай")|| answer.equals("без базара")|| answer.equals("анекдот")|| answer.equals("еще")|| answer.equals("ещё")|| answer.equals("анегдот")|| answer.contains("анек")) {
                return "да";
            } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
                return "да";
            } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")) {
                return "да";
            } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")) {
                return "да";
            } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.contains("достал") || answer.contains("задолбал") || answer.contains("надоел") || answer.contains("заткнись")) {
                return "нет";
            } else if (answer.contains("сказку") || answer.contains("сказк") || answer.contains("сказочк") || answer.contains("сказание") || answer.equals("fairytale") || answer.equals("tsle") ) {
                Fairytale.fairytaleNew(client);
            } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
                Riddle.riddleNew(client);
            } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
                Anecdot.exit();
            } else return "нет";

        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Я ждал, ждал... и не дождался!");
        }
//        catch(IOException io){
//            ConsoleHelper.writeMessage("Ошибочка. Ввода-вывода. Что делать. А мы дальше работаем.");
//        }

        return "нет"; //Вот убрать это и убрать try-catch - и тогда все заработает!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public static void exit(){
        Util.exit("exit");
        return;
    }

}
