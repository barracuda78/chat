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

}
