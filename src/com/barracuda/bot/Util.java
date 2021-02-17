package com.barracuda.bot;

import com.barracuda.ConsoleHelper;

import java.io.*;
import java.util.ArrayList;

public class Util {

    public static String createGoodName(String name){
        name = name.toLowerCase();
        name = name.replaceAll("меня", "");
        name = name.replaceAll("зовут", "");
        name = name.replaceAll("мое", "");
        name = name.replaceAll("моё", "");
        name = name.replaceAll("имя", "");
        name = name.replaceAll("моя", "");
        name = name.replaceAll("фамилия", "");
        name = name.replaceAll("my ", "");
        name = name.replaceAll("name ", "");
        name = name.replaceAll("is ", "");
        name = name.replaceAll(" ", "");
        name = name.replaceAll("\\.", "");
        name = name.replaceAll("!", "");
        name = name.replaceAll("-", "");
        name = name.replaceAll("я ", "");
        name = name.replaceAll("привет", "");
        name = name.replaceAll("[,\\.!?@#$%^&*()_+=\\-']+", "");

        //make first letter Capital:
        return firstUpperCase(name);
    }

    public static int createGoodAge(String ageString){
        String numberOnly = ageString.replaceAll("[^0-9]", "");
        int age = Integer.parseInt(numberOnly);
        return age;
    }

    public static void ageProof(int age){
        try {

            if (age < 7 & age > 0) {
                ConsoleHelper.writeMessage("О, да ты еще , наверное, в детский садик ходишь!");
            } else if (age >= 7 & age <= 18) {


                int r = Util.randomize();
                switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("О! Ты, видимо, учишься в школе! Это здорово!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("В школу ходишь... Молодец...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Что ж... Видимо, ты любишь учиться. В школе. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("О! Да ты, видать, в школу ходишь? Совсем большой. Похвально.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Мдас... Думаю, ты ходишь в школу. Как и я... Шутка!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Да уж. В школу ходишь, наверное. Молодец.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("О, так ты в самом расцвете сил, как Карлсон! Точнее нет. Как Малыш! В школу уже ходишь!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Хе-хе... Юный возраст, юные проблемы: Школа... Двойки... Ремень по-вечерам... Мне это знакомо.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Ясно. Наверное, ты уже в школу ходишь. Знания получаешь. Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Хе-хе. В школу ходишь, наверное! Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                }


            } else if (age >= 19 & age <= 23) {
                ConsoleHelper.writeMessage("Ясно! Ты, видимо, учишься в институте? Или в колледже? Или в армии служишь??? Это здорово!");
            } else if (age >= 24 & age <= 64) {

                int r = Util.randomize();
                switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Сочувствую... Тебе, наверное, приходится много работать. Как и мне...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Значит, ты, наверное, уже на работу ходишь. Молодец...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Что ж... Видимо, ты тоже много работаешь. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("О! Да ты, видать, уже на работу ходишь? Совсем большой. Похвально.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Мдас... Думаю, ты много работаешь. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Да уж. На работу ходишь, наверное. Молодец.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("О, так ты в самом расцвете сил, как Карлсон! НА работу уже ходишь!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Хе-хе... Зрелый возраст, взрослые проблемы: Работа... Ипотека... Жилье... Мне это знакомо.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Ясно. Наверное, ты уже работаешь. Деньги зарабатываешь. Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Хе-хе. На работу ходишь, наверное, трудяга! Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                }


            } else if (age >= 65 & age <= 100) {
                ConsoleHelper.writeMessage("Самый веселый возраст: ты - пенсионер!!!");
            } else if (age > 100) {
                ConsoleHelper.writeMessage("Мда... ноутбуки столько не живут...");
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Пройди-ка дополнительный квест: ");
                Thread.sleep(600);
                ConsoleHelper.writeMessage("В каком году правил Царь Горох???");
                Thread.sleep(800);
                ConsoleHelper.writeMessage("Шутка. Я и сам не знаю. Меня тогда еще не было )))");

            } else if (age == 0) {
                ConsoleHelper.writeMessage("О! Ты только что родился! Поздравляю! Ори громче, чтобы мама от тебя компьютер убрала подальне. Еще написаешь не меня, щенок!");
            } else {
                ConsoleHelper.writeMessage("Ну такое даже я не могу себе представить. Фантазер, блин.");
            }
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Интерраптед ошибка в методе ageProof(int age). Но мы продолжаем...");
        }
    }

    //make first letter Capital:
    /**
     * Creates a new {@code String} first letter of which is capital letter.
     * @author Andrey Ruzaev
     * @param s
     *        initial String.
     * @return
     *        a new {@code String} first letter of which is capital letter.
     */
    private static String firstUpperCase(String s){
        String firstLetter = s.substring(0, 1);
        return firstLetter.toUpperCase() + s.substring(1);
    }

    public static void seria(ArrayList<User> oldUsersList){ //записываем юзера в файл//умеет записывать, не стирая предыдущие обхекты из файла благодаря конструктору FileOutputStream(File file, boolean append) с append

        try {

            //считываем кол-во юзеров из файла (вместо метода usersCountFromFile())
            int countUsers = 0;

            File file = new File("usersCount001.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            countUsers = ois.readInt();
            ois.close();
            fis.close();

            //юзер новый. Нужно записать его в файл.
            //Сначала запишем в файл новое количество ользователей, увеличенное на один.
            FileOutputStream fosCount = new FileOutputStream(file, false);
            ObjectOutputStream oosCount = new ObjectOutputStream(fosCount);     // пишем в файл кол-во юзеров
            countUsers = 1 + countUsers; //сосчитаем количество пользователей в файле. Добавим единичку - нового пользователя
            oosCount.writeInt(countUsers);   //сначала запишем в файл количество пользователей.
            oosCount.close();
            fosCount.close();

            //Здесь запишем в файл самого пользователя
            File file02 = new File("users01.bin");
            FileOutputStream fos = new FileOutputStream(file02, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);     // пишем в файл объект юзера
            oos.writeObject(oldUsersList);
            oos.close();
            fos.close();

        }
        catch(FileNotFoundException fnf){
            ConsoleHelper.writeMessage("Файл не найден. Идем далее.");
        }
        catch (IOException ioe) {
            ConsoleHelper.writeMessage("Ошибка ввода-вывода");
        }

    }

    public static int randomize(){
        //получаем целое произвольное число от 0 до 9
        int b = 10;
        int randomNumber = (int)(b*Math.random());
        return randomNumber;
    }

    public static int randomize100(){
        //получаем целое произвольное число от 0 до 9
        int b = 100;
        int randomNumber = (int)(b*Math.random());
        return randomNumber;
    }

    public static boolean yesNo(String answer){

        if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай")|| answer.equals("без базара")|| answer.contains("валяй")|| answer.equals("еще")|| answer.equals("ещё")|| answer.equals("еще бы")|| answer.contains("угумс")) {
            return true;
        } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
            return true;
        } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")|| answer.contains("поиграем")) {
            return true;
        } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")) {
            return true;
        } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.contains("достал") || answer.contains("задолбал") || answer.contains("надоел") || answer.contains("заткнись")) {
            return false;
        } else if (answer.contains("сказку") || answer.contains("сказк") || answer.contains("сказочк") || answer.contains("сказание") || answer.equals("fairytale") || answer.equals("tsle") ) {
            Fairytale.fairytaleNew();
        } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
            Riddle.riddleNew();
        } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
            Anecdot.exit();
        } else if (answer.contains("анекдот") || answer.contains("funn") || answer.contains("анегдот")) {
            Main.anecdoteNew();
        } else return false;
        return false;
    }

    public static void exit(String answer){
        try {
            if (answer.contains("exit") || answer.contains("выключ") || answer.contains("выход") || answer.contains("надоел")) {
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Всё, всё. Пора заканчивать разговор. Пока!");
                System.exit(0);
            }
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Это InterruptedException в методе exit(String answer). Но мы идем дальше.");
        }
    }

    public static int randomize2(){
        //получаем целое произвольное число от 0 до 9
        int b = 10;
        int randomNumber = (int)(b*Math.random());
        //получаем либо 0, либо 1.
        randomNumber = randomNumber%2;
        return randomNumber;
    }

    //этот метод - для проверки данных о пользователях записанных в файл.
    public static void usersToString(String filePath){

        try {
            ArrayList<User> oldUsersList = new ArrayList<>();
            //цикл десериализации старых юзеров и записи их в ArrayList oldUsersList.
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            while (ois.available() > 0) {
                oldUsersList.add((User)ois.readObject());

            }
            ois.close();

            for(User user : oldUsersList){
                ConsoleHelper.writeMessage(user.toString());
            }

        }
        catch(FileNotFoundException f){
            ConsoleHelper.writeMessage("Файл не найден.");
            f.printStackTrace();
        }
        catch(IOException ioex){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода");
            ioex.printStackTrace();
        }
        catch(ClassNotFoundException c){
            ConsoleHelper.writeMessage("Нет такого класса");
            c.printStackTrace();
        }
    }

    //этот метод не использую. Код есть в методе greeting();
    public static ArrayList<User> seriaFromFile(String filePath) throws ClassNotFoundException, IOException{

        ArrayList<User> oldUsersList = new ArrayList<>();
        //цикл десериализации старых юзеров и записи их в ArrayList oldUsersList.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        while(ois.available() > 0){
            User user = new User();
            user = (User)ois.readObject();
            oldUsersList.add(user);
        }
        ois.close();

        return oldUsersList;
    }

    //метод читает количество пользователей из файла. Пока не использую его, т.к. пока не пишу кол-во пользователей в файл.
    public static int usersCountFromFile(){
        int countUsers = 0;

        try {
            File file = new File("usersCount001.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            countUsers = ois.readInt();
            ois.close();
            fis.close();

            //return countUsers;
        }
        catch(FileNotFoundException f){
            ConsoleHelper.writeMessage("Файл не найден в usersCountFromFile(). А мы идем дальше.");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в usersCountFromFile(). А мы идем дальше.");
            io.printStackTrace();
        }

        return countUsers;
    }

}
