package com.barracuda.bot;

import com.barracuda.ConsoleHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Greeting {

    public static void greeting000(){
        ConsoleHelper.writeMessage("О! Человек!");
        ConsoleHelper.writeMessage("Привет, человек! Как тебя зовут?");
    }

    public static void greeting001(){
        ConsoleHelper.writeMessage("Привет!");
        ConsoleHelper.writeMessage("Напиши свое имя.");
    }

    public static void greeting002(){
        ConsoleHelper.writeMessage("Здравствуй!");
        ConsoleHelper.writeMessage("Напиши, пожалуйста, свое имя.");
    }

    public static void greeting003(){
        ConsoleHelper.writeMessage("О! Тут кто-то есть!");
        ConsoleHelper.writeMessage("Напиши, пожалуйста, как тебя зовут!");
    }

    public static void greeting004(){
        ConsoleHelper.writeMessage("Доброго времени суток!");
        ConsoleHelper.writeMessage("Как тебя зовут?");
    }

    public static void greeting005(){
        ConsoleHelper.writeMessage("Доброго здоровья.");
        ConsoleHelper.writeMessage("Как твое имя?");
    }

    public static void greeting006(){
        ConsoleHelper.writeMessage("Приветствую!!!");
        ConsoleHelper.writeMessage("Зовут? Тебя? Как? В смысле, как тебя зовут?");
    }

    public static void greeting007(){
        ConsoleHelper.writeMessage("Приветики.");
        ConsoleHelper.writeMessage("Ну и как тебя звать?");
    }

    public static void greeting008(){
        ConsoleHelper.writeMessage("Рад видеть. Привет.");
        ConsoleHelper.writeMessage("Назвои свое имя, пожалуйста!");
    }

    public static void greeting009(){
        ConsoleHelper.writeMessage("Наконец-то. Кто-то пришел.");
        ConsoleHelper.writeMessage("Привет, дружище! Как твое имя?");
    }

    public static void greeting(User user){
        try{
            //com.barracuda.bot.User user = new com.barracuda.bot.User();
            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = ConsoleHelper.readString();

            //инициализировали юзеру поле name
            Main.user.setName(Util.createGoodName(name));

            //инициализировали юзеру поле usersListOfUnknownWords
            ArrayList<EngWords> list = new ArrayList<>();
            EngWords word001 = new EngWords();
            word001.setEngWord1("friend");
            word001.setEngWord2("fellow");
            word001.setEngWord3("-empty-");
            word001.setEngWord4("-empty-");
            word001.setEngWordPlural1("friends");
            word001.setEngWordPlural2("fellows");
            word001.setEngSinonim1("-empty-");
            word001.setEngEtymology1("нет этимологии на английском");
            word001.setRusWord1("друг");
            word001.setRusWord2("приятель");
            word001.setRusWord3("-empty-");
            word001.setRusWord4("товарищ");
            word001.setRusWordPlural1("друзья");
            word001.setRusWordPlural2("приятели");
            word001.setRusSinonim1("бро");
            word001.setRusEtymology1("нет этимологии на русском");
            list.add(word001);
            Main.user.setUsersListOfUnknownWords(list);


            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(600);
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброй ночи!!!");
                        //com.barracuda.ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго утра!!!");
                        //com.barracuda.ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго утра!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго дня!!!");
                        //com.barracuda.ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго дня!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго вечера!!!");
                        //com.barracuda.ConsoleHelper.writeMessage("Привет, " + user.getName() + ", доброго вечера!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Скажи мне, а сколько тебе лет, а?");
                    //com.barracuda.ConsoleHelper.writeMessage("Скажи мне, а сколько тебе лет, а?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("И чтобы без обмана! Введи целое число с клавиатуры:");
                    ConsoleHelper.writeMessage("И чтобы без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 1: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброго утра!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброго дня!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброго вечера!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Скажи-ка, а сколько тебе лет?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Не обманывать! Введи целое число с клавиатуры");
                    break;
                }
                case 2: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Привет-привет, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Привет-привет, " + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Привет-привет, " + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Привет-привет, " + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Слушай-ка, а сколько тебе лет, а?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Чур не обманывать! Введи целое число с клавиатуры");
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Рад видеть, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Рад видеть, " + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Рад видеть, " + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Рад видеть, " + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Скажи мне, сколько тебе лет, а?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("И давай-ка без обмана! Введи целое число с клавиатуры");
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("" + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("" + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("" + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("" + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Скажи-ка, пожалуйста, сколько тебе лет?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("И, пожалуйста, почестнее! Введи целое число с клавиатуры");
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Хэллоу, " + user.getName() + ", доброй ночи!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Хэллоу, " + user.getName() + ", доброе утро!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Хэллоу, " + user.getName() + ", добрый день!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Хэллоу, " + user.getName() + ", добрый вечер!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Скажи-ка мне, пожалуйста, сколько тебе годиков?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("И, пожалуйста, без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Хэлло, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Хэлло, " + user.getName() + ", доброе утро!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Хэлло, " + user.getName() + ", добрый день!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Хэлло, " + user.getName() + ", добрый вечер!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Будь добр, назови свой возраст!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Только без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("Здравствуй, " + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Пожалуйста, напиши, сколько тебе лет!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Только по-чесноку! Введи целое число с клавиатуры:");
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("О, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("О, " + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("О, " + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("О, " + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Прошу, скажи мне, сколько тебе лет!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Только по-честному!!! Введи целое число с клавиатуры:");
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //com.barracuda.ConsoleHelper.writeMessage(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        ConsoleHelper.writeMessage("" + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        ConsoleHelper.writeMessage("" + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        ConsoleHelper.writeMessage("" + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        ConsoleHelper.writeMessage("" + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    ConsoleHelper.writeMessage("Расскажи-ка мне, сколько тебе годков, а?!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Только честно! Не обманывать! Введи целое число с клавиатуры:");
                    break;
                }
            }

            String ageOfUser = ConsoleHelper.readString();


            int age = Util.createGoodAge(ageOfUser);      // метод createGoodAge() отсекает все символы кроме цифр из введеннных пользователем.
            Main.user.setAge(age);      //присваиваем юзеру его возраст.

            ArrayList<User> oldUsersList = new ArrayList<>();

            //в этом блоке кода читаем количество юзеров из файла usersCount001.bin
            File file = new File("usersCount001.bin");
            FileInputStream fisCount = new FileInputStream(file);
            ObjectInputStream oisCount = new ObjectInputStream(fisCount);
            int countUsers = oisCount.readInt();
            oisCount.close();
            fisCount.close();

            //в этом блоке кода читаем самих юзеров (объекты) из файла users01.bin.
            File file01 = new File("users01.bin");
            FileInputStream fis = new FileInputStream(file01);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //в циклое добавляем этих юзеров из файла в  oldUsersList

/*            for(int i = 0; i < countUsers; i++){
                com.barracuda.bot.User user001 = (com.barracuda.bot.User) ois.readObject();
                oldUsersList.add(user001);
            }*/

            oldUsersList = (ArrayList<User>) ois.readObject();

            ois.close();
            fis.close();

            //здесь - цикл сравнения нового юзера со старыми юзерами из ArrayList oldUsersList
            boolean newUser = false;
            int countNotNew = 0;
            for(int i = 0; i < oldUsersList.size(); i++){
                User userOld = oldUsersList.get(i);
                if(userOld.getName().equals(Main.user.getName()) & userOld.getAge() == Main.user.getAge()){
                    //юзер совпадает. И булеан переменная newUser остается false. Она и была.
                    countNotNew++;
                }
                else{
                    //юзер не совпадает. Он новый.
                }
            }

            if(countNotNew>0){
                newUser=false;
            }
            else{
                newUser = true;
/*            //    seria(user); // теперь сериализацию нового юзера делаем только если юзера не было до этого.
                //раньше мы просто сериализовывали юзера. Теперь нужно добавить юзера в массив и сериализовать весь массив.
                oldUsersList.add(com.barracuda.bot.Main.user); // добавили юзера в массив.

                seria(oldUsersList); //серииализовали новый массив с новым пользователем. ЗАТЕРЕВ СТАРЫЙ МАССИВ!*/
            }

            Util.ageProof(age);

            if(!newUser){

                int rr = Util.randomize();
                switch (rr) {
                    case 0: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Так-так...");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage( user.getName() + ", а я тебя, кажется, знаю!");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Мы с тобой недавно общались...  Что ж, приятно снова увидеться! ");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Слу-у-у-ушай!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + ", а Мы с тобой, кажется, недавно общались!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Приятно снова увидеться!");
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Стой-стой!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + ", а мы с тобой разве недавно уже не переписывались?");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Приятно видеть тебя в чате снова!");
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Стоп! Стоп! Стоп!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , мы, кажется, с тобой недавно уже виделись в чате!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад тебя видеть снова!");
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Тааааак...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , а мы ведь недавно с тобой переписывались!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Я рад тебя снова приветствовать в моём чате!");
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Подожди-ка...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , а я тебя уже знаю!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад снова приветствовать тебя в моём чате!");
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Опаньки!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , а я тебя, кажется, знаю!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад видеть тебя снова!");
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Тааааак.... Погоди-ка!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , кажется я тебя уже видел тут в чате недавно!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад попереписываться с тобой снова!");
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Слушай, а я тебя вспомнил!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , мы же с тобой тут чатились недавно? Точно!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад початиться с тобой снова!");
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Слушай, а ведь тебя знаю!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage(user.getName() + " , мы с тобой недавно переписывались.");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Рад снова с тобой пообщаться!");
                        break;
                    }
                }
                ////////////////новый код с логином и паролем///////////////
                for(int i = 3; i > 0; i-- ) {
                    ConsoleHelper.writeMessage("Введи свой логин:");
                    String login = ConsoleHelper.readString();
                    ConsoleHelper.writeMessage("Теперь пароль, пожалуйста:");
                    String password = ConsoleHelper.readString();

                    File fileLogin = new File("users01.bin");
                    FileInputStream fisLogin = new FileInputStream(fileLogin);
                    ObjectInputStream oisLogin = new ObjectInputStream(fisLogin);
                    ArrayList<User> userLoginList = (ArrayList<User>)oisLogin.readObject();
                    User oldUser = new User();
                    for(User user2 : userLoginList){
                        if(user2.getName().equals(Main.user.getName()) & user2.getAge() == Main.user.getAge()){
                            oldUser = user2;
                        }
                    }

                    if (oldUser.getLogin().equals(login) & oldUser.getPassword().equals(password)) { //тут выскакивает ошибка. т.к. сперва тут нужно сделать десериализацию юзера и брать у него логин и пароль и сравнивать с ними.
                        ConsoleHelper.writeMessage("ОК. Ты прошел проверку на безопасность.");
                        break;
                    } else {
                        ConsoleHelper.writeMessage("Неправильный логин или пароль. Осталось попыток: " + i);
                        if(i > 1) {
                            ConsoleHelper.writeMessage("Давай еще раз.");
                        }
                        else{
                            ConsoleHelper.writeMessage("Извините, не могу Вас идентифицировать.");
                            ConsoleHelper.writeMessage("На этом наш разговор окончен.");
                            System.exit(0);
                        }
                    }
                }
                ///////////////конец нового кода с логином и паролем/////////


            }
            else {

                int rrr = Util.randomize();
                switch(rrr){
                    case 0: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне 8 лет! Да, я старый ноутбук.");
                        Thread.sleep(600);
                        break;
                    }
                    case 1:{
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне уже 8 лет! Да, я старая железяка.");
                        Thread.sleep(600);
                        break;
                    }
                    case 2:{
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А вот мне - 8 годков! Да, я просто ведро с гвоздями.");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Ну а мне 8 лет уже. Я старый и немного глуховатый компьютер.");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне 8 лет. Для ноутбука это много.");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне целых 8 годиков! Некоторые ноутбуки не доживают до моего возраста.");
                        Thread.sleep(600);
                        break;
                    }
                    case 6: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне 8!! Представляешь? 8 лет!!! Я еще даже бы в институт не ходил, если бы был человеком.");
                        Thread.sleep(600);
                        break;
                    }
                    case 7: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне 8 лет, прикинь! Я старый, и из меня песок сыпется.");
                        Thread.sleep(600);
                        break;
                    }
                    case 8: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне вчера стукнуло 8 лет, прикинь! Я старый и вредный компьютер.");
                        Thread.sleep(600);
                        break;
                    }
                    case 9: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А мне 8 лет! Многие ноутбуки столько не живут. Вдумайся.");
                        Thread.sleep(600);
                        break;
                    }
                }

                //////////////////////////////////новый  код с придумыванием пароля////////////////////////////////
                ConsoleHelper.writeMessage("Придумайте себе имя пользователя (login), чтобы в следующий раз его использовать для входа в чат:");
                String newLogin = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("Теперь придумайте пароль:");
                String newPassword = ConsoleHelper.readString();
                Main.user.setLogin(newLogin);
                Main.user.setPassword(newPassword);
                ConsoleHelper.writeMessage("Спасибо!");


                //    seria(user); // теперь сериализацию нового юзера делаем только если юзера не было до этого.
                //раньше мы просто сериализовывали юзера. Теперь нужно добавить юзера в массив и сериализовать весь массив.
                oldUsersList.add(Main.user); // добавили юзера в массив.

                Util.seria(oldUsersList); //серииализовали новый массив с новым пользователем. ЗАТЕРЕВ СТАРЫЙ МАССИВ!
                //////////////////////////////////конец нового кода с придумыванием пароля////////////////////////////////

            }
            Thread.sleep(600);

            int rrr = Util.randomize();
            switch(rrr){
                case 0: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чем ты хочешь сейчас заняться?");
                    Thread.sleep(600);
                    break;
                }
                case 1:{
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чем займемся?");
                    Thread.sleep(600);
                    break;
                }
                case 2:{
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Что будем делать?");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Как будем развлекаться?");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чего ты хочешь поделать?");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чем с тобой займемся?");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Что будем делать? Чем заниматься?");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Ну, что поделаем?");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чем хочешь заняться?");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Чем будем с тобой заниматься?");
                    Thread.sleep(600);
                    break;
                }
            }

            int rrrr = Util.randomize();
            switch(rrrr){
                case 0: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Мы можем, например, поиграть, или позагадывать загадки, или я могу рассказать тебе анекдот... или даже сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 1:{
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Хочешь, например, поиграть, или позагадывать загадки, или хочешь анекдот... или может быть сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 2:{
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Можем поиграть, или  поболтать, позагадывать загадки, я могу рассказать анекдот... Да хоть сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Можно поиграть, или  потрещать, позагадывать загадки, я могу рассказать тебе анекдот... или сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Выбирай, что хочешь: Могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Можешь выбрать, что ты хочешь: я могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Выбирай, что тебе больше по-душе: я могу рассказать анекдот или сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Выбирай, что нравится: я могу загадать загадку, могу рассказать анекдот или сказку... Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Ты можешь выбрать любую тему, что тебе больше нравится: я могу загадать загадку, могу рассказать анекдот или сказку... Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }

            }
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Вау. Это реально долго было.");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибочка. Вводика-выводика. Так мне сказали. Но мы идем дальше!");
            io.printStackTrace();
        }
        catch(ClassNotFoundException cnf){
            ConsoleHelper.writeMessage("Опа... нет такого класса line412 seriaFromFile() method! Но мы продолжаем.");
        }
        catch(NullPointerException npe){
            ConsoleHelper.writeMessage("Опа... NullPointerException в методе greeting()! Но мы продолжаем.");
            npe.printStackTrace();
        }

    }

    public static void whatIsYourName(){
        int r = Util.randomize();
        if(r == 0){
            Greeting.greeting000();
        } else if(r == 1){
            Greeting.greeting001();
        }  else if(r == 2){
            Greeting.greeting002();
        } else if(r == 3){
            Greeting.greeting003();
        } else if(r == 4){
            Greeting.greeting004();
        } else if(r == 5){
            Greeting.greeting005();
        } else if(r == 6){
            Greeting.greeting006();
        } else if(r == 7){
            Greeting.greeting007();
        } else if(r == 8){
            Greeting.greeting008();
        } else if(r == 9){
            Greeting.greeting009();
        } else {
            Greeting.greeting009();
        }
    }
}
