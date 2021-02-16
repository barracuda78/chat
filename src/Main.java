import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//выяснить почему не все неотгаданные слова попадают в список слов для изучения.
//записывать в файл неправильно названные слова (МАССИВ). И при запуске проги сразу добавлять их в список . Сделать игру только из этих слов.
//юзеру сделать поле - список именно его неправильных слов. И для него формировать игру по угадыванию в первую очередь из этих слов.

//сославить подклассы ГЛАГОЛ, СУЩЕСТВИТЕЛЬНОЕ и так далее с особыми полями - три формы у глагола и так далее.
//написать универсальный exit
//написать чат.

public class Main implements Serializable {
    protected static User user = new User();
    public static void main(String[] args) {

///////////////////////////запишем тестового юзера в файл users01.bin, чтобы файл  был чем-то наполнен.
/*        ArrayList<User> oldUsersList = new ArrayList<>();
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
        Main.user.setAge(111);
        Main.user.setName("Курдалы");
        Main.user.setLogin("111");
        Main.user.setPassword("111");
        oldUsersList.add(Main.user);
        try {
                File file = new File("users01.bin");
                FileOutputStream fos = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(oldUsersList);                              // пишем в файл объект список юзеров
                fos.close();
                oos.close();
            ConsoleHelper.writeMessage("Список пользователей oldUsersList с одним пользователем  " + Main.user.toString() + " записан в файл.");
            ////////////////запишем в другой файл usersCount001.bin кол-во пользователей = 1
            File file02 = new File("usersCount001.bin");
            FileOutputStream fosCount = new FileOutputStream(file02, false);
            ObjectOutputStream oosCount = new ObjectOutputStream(fosCount);     // пишем в файл кол-во юзеров
            int countUsers = 1; //Запишем единичку в файл подсчета пользователей, т.к. до этого мы записала в файл одного (первого) пользователя
            oosCount.writeInt(countUsers);   //запишем в файл количество пользователей = 1.
            ConsoleHelper.writeMessage("кол-во юзеров записано в файл.");
            oosCount.close();
            fosCount.close();


            ConsoleHelper.writeMessage("проверим, какие слова записались пользователю в список неизвестных слов:");

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> oldUsersListDeserialized = (ArrayList<User>)ois.readObject();
            ConsoleHelper.writeMessage("Вытащили из файла список юзеров с одним юзером Курдалы.");

            ArrayList<EngWords> listOfUnknownWordsOld = new ArrayList<>();
            for(User userSerialized : oldUsersListDeserialized){
                if(Main.user.getName().equals(userSerialized.getName()) & Main.user.getAge() == (userSerialized.getAge())){
                    listOfUnknownWordsOld = userSerialized.getUsersListOfUnknownWords();
                    ConsoleHelper.writeMessage("записали список слов нашего юзера в переменную listOfUnknownWordsOld");
                    ConsoleHelper.writeMessage("выведем прочитанный из файла список пользователей на экран: ");
                    ConsoleHelper.writeMessage(userSerialized.toString());
                }

                ConsoleHelper.writeMessage("Выведем слова из списка слов юзера на экран: ");
                for(EngWords word : userSerialized.getUsersListOfUnknownWords()){
                    ConsoleHelper.writeMessage(word.toString());
                }
            }


            ois.close();
            fis.close();

         }
        catch(FileNotFoundException fnf){
            ConsoleHelper.writeMessage("Файл не найден. Идем далее.");
        }
        catch (IOException ioe) {
            ConsoleHelper.writeMessage("Ошибка ввода-вывода");
            ioe.printStackTrace();
        }
        catch(ClassNotFoundException cnf){
            ConsoleHelper.writeMessage("Ошибка ClassNotFoundException в тестовой записи пользователя в main");
        }*/
///////////////////////////Конец тестовой записи юзера и числа юзеров в файлы.


        Greeting.whatIsYourName();
        try {
            Greeting.greeting(user);
            dealer();
            exit("exit"); //по идее это должен быть выход из программы....
            return;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void dealer() throws IOException, InterruptedException{
        ConsoleHelper.writeMessage("Выбирай, чем займемся?");
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String deal = ConsoleHelper.readString();
        deal = deal.trim().toLowerCase();
        if (deal.contains("спать")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Тогда выключай компьютер, спокойной ночи!");
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Или...");
            dealer();
        }
        else if(deal.contains("есть") || deal.contains("кушать")  || deal.contains("жрать") || deal.contains("мороженого") || deal.contains("мороженое")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Тогда приятного аппетита!");
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Или...");
            dealer();
        }
        else if(deal.contains("играть") || deal.contains("игру") || deal.contains("игрой") || deal.contains("игры") || deal.contains("игр")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("О! Круто! Давай поиграем!");
            game001();
            ConsoleHelper.writeMessage("Так и быть. Еще игра: ");
            game000();
            dealer();
        }
        else if(deal.contains("анекдот") || deal.contains("анегдот") || deal.contains("анигдот") || deal.contains("аникдот")|| deal.contains("анек")) {
            anecdoteNew();
        }
        else if(deal.contains("сказку") || deal.contains("сказки") || deal.contains("сказка") || deal.contains("сказкой")){
            fairytaleNew();
        }
        else if(deal.contains("загадку") || deal.contains("загадки") || deal.contains("загадка") || deal.contains("загадкой") || deal.contains("Загадку") || deal.contains("Загадки") || deal.contains("Загадка") || deal.contains("Загадкой")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Давай тогда я загадаю тебе одну: ");
            Thread.sleep(600);

            Riddle.riddleNew();
        }
        else if(deal.contains("не знаю") || deal.contains("не решил") || deal.contains("пофиг") || deal.contains("фиг")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Хорошо, раз ты не в курсе, я загадаю загадку!");

            Riddle.riddleNew();
        }
        else if(deal.contains("болтать") || deal.contains("чат") || deal.contains("разговор") || deal.contains("говорить")|| deal.contains("поболтать") || deal.contains("поговорим") || deal.contains("початимся")|| deal.contains("поболтаем")|| deal.contains("переписываемся")|| deal.contains("переписываться")){
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Хорошо. Давай немного поговорим...");
            chat00();

        }
        else if (deal.contains("англ") || deal.contains("engl")||deal.contains("ингл")){
            Chat.chat003english();
        }
        else if(deal.contains("exit") || deal.contains("выключ") || deal.contains("выход") || deal.contains("надоел")){
            exit("deal");
            return;
        }
        else{
            ConsoleHelper.writeMessage("Я на этой планете недавно. Не все понимаю. Напиши что-нибудь другое, пожалуйста!");
            dealer();
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

    public static int randomize100(){
        //получаем целое произвольное число от 0 до 9
        int b = 100;
        int randomNumber = (int)(b*Math.random());
        return randomNumber;
    }

    public static void fairytaleNew(){
        ArrayList<Fairytale> listOfFairytales = new ArrayList<>();
        Fairytale fairytale001 = new Fairytale("fairytale001");
        listOfFairytales.add(0, fairytale001);
        Fairytale fairytale002 = new Fairytale("fairytale002");
        listOfFairytales.add(0, fairytale002);
        Fairytale fairytale003 = new Fairytale("fairytale003");
        listOfFairytales.add(0, fairytale003);
        Fairytale fairytale004 = new Fairytale("fairytale004");
        listOfFairytales.add(0, fairytale004);
        Fairytale fairytale005 = new Fairytale("fairytale005");
        listOfFairytales.add(0, fairytale005);
        Fairytale fairytale006 = new Fairytale("fairytale006");
        listOfFairytales.add(0, fairytale006);
        Fairytale fairytale007 = new Fairytale("fairytale007");
        listOfFairytales.add(0, fairytale007);
        Fairytale fairytale008 = new Fairytale("fairytale008");
        listOfFairytales.add(0, fairytale008);
        Fairytale fairytale009 = new Fairytale("fairytale009");
        listOfFairytales.add(0, fairytale009);
        Fairytale fairytale010 = new Fairytale("fairytale010");
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
                    if (Fairytale.wantMore()) {
                        fairytaleNew();           //здесь ошибка. Он не учитывает загаданную загадку и может загадать ту же. Нужно удалять загаданную загадку из массива. Массив загадок создавать в другом методе.
                    } else {
                        dealer();
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

    public static void anecdoteNew(){

        try {
            ArrayList<Anecdot> listOfAnecdots = new ArrayList<>();
            Anecdot anecdot01 = new Anecdot("anecdot001");
            listOfAnecdots.add(0, anecdot01);
            Anecdot anecdot02 = new Anecdot("anecdot002");
            listOfAnecdots.add(1, anecdot02);
            Anecdot anecdot03 = new Anecdot("anecdot003");
            listOfAnecdots.add(2, anecdot03);
            Anecdot anecdot04 = new Anecdot("anecdot004");
            listOfAnecdots.add(3, anecdot04);
            Anecdot anecdot05 = new Anecdot("anecdot005");
            listOfAnecdots.add(4, anecdot05);
            Anecdot anecdot06 = new Anecdot("anecdot006");
            listOfAnecdots.add(5, anecdot06);
            Anecdot anecdot07 = new Anecdot("anecdot007");
            listOfAnecdots.add(6, anecdot07);
            Anecdot anecdot08 = new Anecdot("anecdot008");
            listOfAnecdots.add(7, anecdot08);
            Anecdot anecdot09 = new Anecdot("anecdot009");
            listOfAnecdots.add(8, anecdot09);
            Anecdot anecdot10 = new Anecdot("anecdot010");
            listOfAnecdots.add(9, anecdot10);
            Anecdot anecdot11 = new Anecdot("anecdot011");
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
                    String yN = Anecdot.wantMoreAnecdot();
                    if (yN.equals("нет")) {
                        dealer();
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

    public static void chat00()throws IOException, InterruptedException{

        Chat chat = new Chat();
        //метод является входным для чата и далее вызывает chat001 chat002 chat003 и так далее в рандомном порядке.
        Thread.sleep(600);
        ConsoleHelper.writeMessage("Задавай любую тему. Я, правда, не всё на свете знаю, но... Можем про учебу... Или про музыку... Или про отпуск!");
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String chatTheme = ConsoleHelper.readString();
        chatTheme = chatTheme.trim().toLowerCase();

        exit(chatTheme); //выход, если напишет exit и тп.

        if(chatTheme.contains("учеб") || chatTheme.contains("школ")||chatTheme.contains("учеб")||chatTheme.contains("учит")||chatTheme.contains("инстит")){
            Chat.chat01school();
        } else if (chatTheme.contains("музык") || chatTheme.contains("music")||chatTheme.contains("песн")||chatTheme.contains("петь")||chatTheme.contains("пою")||chatTheme.contains("поёт")||chatTheme.contains("поет")){
            Chat.chat002music();
        }else if (chatTheme.contains("англ") || chatTheme.contains("engl")||chatTheme.contains("ингл")){
            Chat.chat003english();
        }
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
            Main.fairytaleNew();
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
