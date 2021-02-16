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

public class Test implements Serializable {
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

        Test.user.setUsersListOfUnknownWords(list);
        Test.user.setAge(111);
        Test.user.setName("Курдалы");
        Test.user.setLogin("111");
        Test.user.setPassword("111");
        oldUsersList.add(Test.user);
        try {
                File file = new File("users01.bin");
                FileOutputStream fos = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(oldUsersList);                              // пишем в файл объект список юзеров
                fos.close();
                oos.close();
            System.out.println("Список пользователей oldUsersList с одним пользователем  " + Test.user.toString() + " записан в файл.");
            ////////////////запишем в другой файл usersCount001.bin кол-во пользователей = 1
            File file02 = new File("usersCount001.bin");
            FileOutputStream fosCount = new FileOutputStream(file02, false);
            ObjectOutputStream oosCount = new ObjectOutputStream(fosCount);     // пишем в файл кол-во юзеров
            int countUsers = 1; //Запишем единичку в файл подсчета пользователей, т.к. до этого мы записала в файл одного (первого) пользователя
            oosCount.writeInt(countUsers);   //запишем в файл количество пользователей = 1.
            System.out.println("кол-во юзеров записано в файл.");
            oosCount.close();
            fosCount.close();


            System.out.println("проверим, какие слова записались пользователю в список неизвестных слов:");

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> oldUsersListDeserialized = (ArrayList<User>)ois.readObject();
            System.out.println("Вытащили из файла список юзеров с одним юзером Курдалы.");

            ArrayList<EngWords> listOfUnknownWordsOld = new ArrayList<>();
            for(User userSerialized : oldUsersListDeserialized){
                if(Test.user.getName().equals(userSerialized.getName()) & Test.user.getAge() == (userSerialized.getAge())){
                    listOfUnknownWordsOld = userSerialized.getUsersListOfUnknownWords();
                    System.out.println("записали список слов нашего юзера в переменную listOfUnknownWordsOld");
                    System.out.println("выведем прочитанный из файла список пользователей на экран: ");
                    System.out.println(userSerialized.toString());
                }

                System.out.println("Выведем слова из списка слов юзера на экран: ");
                for(EngWords word : userSerialized.getUsersListOfUnknownWords()){
                    System.out.println(word.toString());
                }
            }


            ois.close();
            fis.close();

         }
        catch(FileNotFoundException fnf){
            System.out.println("Файл не найден. Идем далее.");
        }
        catch (IOException ioe) {
            System.out.println("Ошибка ввода-вывода");
            ioe.printStackTrace();
        }
        catch(ClassNotFoundException cnf){
            System.out.println("Ошибка ClassNotFoundException в тестовой записи пользователя в main");
        }*/
///////////////////////////Конец тестовой записи юзера и числа юзеров в файлы.


        whatIsYourName();
        try {
            greeting();
            dealer();
            exit("exit"); //по идее это должен быть выход из программы....
            return;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void whatIsYourName(){
        int r = randomize();
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

    public static void greeting(){
        try{
            //User user = new User();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();

            //инициализировали юзеру поле name
            Test.user.setName(createGoodName(name));

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
            Test.user.setUsersListOfUnknownWords(list);


            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(600);
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Привет, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Привет, " + user.getName() + ", доброго утра!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Привет, " + user.getName() + ", доброго дня!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Привет, " + user.getName() + ", доброго вечера!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    System.out.println("Скажи мне, а сколько тебе лет, а?");
                    Thread.sleep(1000);
                    System.out.println("И чтобы без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 1: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Здравствуй, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Здравствуй, " + user.getName() + ", доброго утра!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Здравствуй, " + user.getName() + ", доброго дня!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Здравствуй, " + user.getName() + ", доброго вечера!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    System.out.println("Скажи-ка, а сколько тебе лет?");
                    Thread.sleep(1000);
                    System.out.println("Не обманывать! Введи целое число с клавиатуры");
                    break;
                }
                case 2: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Привет-привет, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Привет-привет, " + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Привет-привет, " + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Привет-привет, " + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    System.out.println("Слушай-ка, а сколько тебе лет, а?");
                    Thread.sleep(1000);
                    System.out.println("Чур не обманывать! Введи целое число с клавиатуры");
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Рад видеть, " + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Рад видеть, " + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Рад видеть, " + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Рад видеть, " + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }
                    Thread.sleep(600);
                    System.out.println("Скажи мне, сколько тебе лет, а?");
                    Thread.sleep(1000);
                    System.out.println("И давай-ка без обмана! Введи целое число с клавиатуры");
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("" + user.getName() + ", доброй ночи!!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("" + user.getName() + ", доброе утро!!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("" + user.getName() + ", добрый день!!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("" + user.getName() + ", добрый вечер!!!");
                        Thread.sleep(600);
                    }

                    System.out.println("Скажи-ка, пожалуйста, сколько тебе лет?");
                    Thread.sleep(1000);
                    System.out.println("И, пожалуйста, почестнее! Введи целое число с клавиатуры");
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Хэллоу, " + user.getName() + ", доброй ночи!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Хэллоу, " + user.getName() + ", доброе утро!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Хэллоу, " + user.getName() + ", добрый день!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Хэллоу, " + user.getName() + ", добрый вечер!");
                        Thread.sleep(600);
                    }

                    System.out.println("Скажи-ка мне, пожалуйста, сколько тебе годиков?");
                    Thread.sleep(1000);
                    System.out.println("И, пожалуйста, без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Хэлло, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Хэлло, " + user.getName() + ", доброе утро!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Хэлло, " + user.getName() + ", добрый день!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Хэлло, " + user.getName() + ", добрый вечер!");
                        Thread.sleep(600);
                    }

                    System.out.println("Будь добр, назови свой возраст!");
                    Thread.sleep(1000);
                    System.out.println("Только без обмана! Введи целое число с клавиатуры:");
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("Здравствуй, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("Здравствуй, " + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("Здравствуй, " + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("Здравствуй, " + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    System.out.println("Пожалуйста, напиши, сколько тебе лет!");
                    Thread.sleep(1000);
                    System.out.println("Только по-чесноку! Введи целое число с клавиатуры:");
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("О, " + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("О, " + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("О, " + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("О, " + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    System.out.println("Прошу, скажи мне, сколько тебе лет!");
                    Thread.sleep(1000);
                    System.out.println("Только по-честному!!! Введи целое число с клавиатуры:");
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    DateFormat dateFormat = new SimpleDateFormat("H");
                    Date date = new Date();
                    //System.out.println(dateFormat.format(date));
                    String t = dateFormat.format(date);
                    int tt = Integer.parseInt(t);
                    if(tt >= 0 & tt <  6 ){
                        System.out.println("" + user.getName() + ", доброй ночи!!");
                        Thread.sleep(600);
                    } else if(tt >= 6 & tt <  11){
                        System.out.println("" + user.getName() + ", доброе утро!!");
                        Thread.sleep(600);
                    } else if(tt >= 11 & tt <  17){
                        System.out.println("" + user.getName() + ", добрый день!!");
                        Thread.sleep(600);
                    } else if(tt >= 17 & tt <=  23){
                        System.out.println("" + user.getName() + ", добрый вечер!!");
                        Thread.sleep(600);
                    }

                    System.out.println("Расскажи-ка мне, сколько тебе годков, а?!");
                    Thread.sleep(1000);
                    System.out.println("Только честно! Не обманывать! Введи целое число с клавиатуры:");
                    break;
                }
            }

            String ageOfUser = bufferedReader.readLine();


            int age = createGoodAge(ageOfUser);      // метод createGoodAge() отсекает все символы кроме цифр из введеннных пользователем.
            Test.user.setAge(age);      //присваиваем юзеру его возраст.

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
                User user001 = (User) ois.readObject();
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
                if(userOld.getName().equals(Test.user.getName()) & userOld.getAge() == Test.user.getAge()){
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
                oldUsersList.add(Test.user); // добавили юзера в массив.

                seria(oldUsersList); //серииализовали новый массив с новым пользователем. ЗАТЕРЕВ СТАРЫЙ МАССИВ!*/
            }

            ageProof(age);

            if(!newUser){

                int rr = Test.randomize();
                switch (rr) {
                    case 0: {
                        Thread.sleep(600);
                        System.out.println("Так-так...");
                        Thread.sleep(600);
                        System.out.println( user.getName() + ", а я тебя, кажется, знаю!");
                        Thread.sleep(600);
                        System.out.println("Мы с тобой недавно общались...  Что ж, приятно снова увидеться! ");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        System.out.println("Слу-у-у-ушай!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + ", а Мы с тобой, кажется, недавно общались!");
                        Thread.sleep(1000);
                        System.out.println("Приятно снова увидеться!");
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        System.out.println("Стой-стой!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + ", а мы с тобой разве недавно уже не переписывались?");
                        Thread.sleep(1000);
                        System.out.println("Приятно видеть тебя в чате снова!");
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        System.out.println("Стоп! Стоп! Стоп!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , мы, кажется, с тобой недавно уже виделись в чате!");
                        Thread.sleep(1000);
                        System.out.println("Рад тебя видеть снова!");
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        System.out.println("Тааааак...");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , а мы ведь недавно с тобой переписывались!");
                        Thread.sleep(1000);
                        System.out.println("Я рад тебя снова приветствовать в моём чате!");
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        System.out.println("Подожди-ка...");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , а я тебя уже знаю!");
                        Thread.sleep(1000);
                        System.out.println("Рад снова приветствовать тебя в моём чате!");
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        System.out.println("Опаньки!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , а я тебя, кажется, знаю!");
                        Thread.sleep(1000);
                        System.out.println("Рад видеть тебя снова!");
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        System.out.println("Тааааак.... Погоди-ка!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , кажется я тебя уже видел тут в чате недавно!");
                        Thread.sleep(1000);
                        System.out.println("Рад попереписываться с тобой снова!");
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        System.out.println("Слушай, а я тебя вспомнил!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , мы же с тобой тут чатились недавно? Точно!");
                        Thread.sleep(1000);
                        System.out.println("Рад початиться с тобой снова!");
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        System.out.println("Слушай, а ведь тебя знаю!");
                        Thread.sleep(1000);
                        System.out.println(user.getName() + " , мы с тобой недавно переписывались.");
                        Thread.sleep(1000);
                        System.out.println("Рад снова с тобой пообщаться!");
                        break;
                    }
                }
                ////////////////новый код с логином и паролем///////////////
                for(int i = 3; i > 0; i-- ) {
                    System.out.println("Введи свой логин:");
                    String login = bufferedReader.readLine();                     //может быть ошибка! А не создать ли отдельный bufferedreader?
                    System.out.println("Теперь пароль, пожалуйста:");
                    String password = bufferedReader.readLine();

                    File fileLogin = new File("users01.bin");
                    FileInputStream fisLogin = new FileInputStream(fileLogin);
                    ObjectInputStream oisLogin = new ObjectInputStream(fisLogin);
                    ArrayList<User> userLoginList = (ArrayList<User>)oisLogin.readObject();
                    User oldUser = new User();
                    for(User user2 : userLoginList){
                        if(user2.getName().equals(Test.user.getName()) & user2.getAge() == Test.user.getAge()){
                            oldUser = user2;
                        }
                    }

                    if (oldUser.getLogin().equals(login) & oldUser.getPassword().equals(password)) { //тут выскакивает ошибка. т.к. сперва тут нужно сделать десериализацию юзера и брать у него логин и пароль и сравнивать с ними.
                        System.out.println("ОК. Ты прошел проверку на безопасность.");
                        break;
                    } else {
                        System.out.println("Неправильный логин или пароль. Осталось попыток: " + i);
                        if(i > 1) {
                            System.out.println("Давай еще раз.");
                        }
                        else{
                            System.out.println("Извините, не могу Вас идентифицировать.");
                            System.out.println("На этом наш разговор окончен.");
                            System.exit(0);
                        }
                    }
                }
                ///////////////конец нового кода с логином и паролем/////////


            }
            else {

                int rrr = Test.randomize();
                switch(rrr){
                    case 0: {
                        Thread.sleep(600);
                        System.out.println("А мне 8 лет! Да, я старый ноутбук.");
                        Thread.sleep(600);
                        break;
                    }
                    case 1:{
                        Thread.sleep(600);
                        System.out.println("А мне уже 8 лет! Да, я старая железяка.");
                        Thread.sleep(600);
                        break;
                    }
                    case 2:{
                        Thread.sleep(600);
                        System.out.println("А вот мне - 8 годков! Да, я просто ведро с гвоздями.");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(600);
                        System.out.println("Ну а мне 8 лет уже. Я старый и немного глуховатый компьютер.");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(600);
                        System.out.println("А мне 8 лет. Для ноутбука это много.");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(600);
                        System.out.println("А мне целых 8 годиков! Некоторые ноутбуки не доживают до моего возраста.");
                        Thread.sleep(600);
                        break;
                    }
                    case 6: {
                        Thread.sleep(600);
                        System.out.println("А мне 8!! Представляешь? 8 лет!!! Я еще даже бы в институт не ходил, если бы был человеком.");
                        Thread.sleep(600);
                        break;
                    }
                    case 7: {
                        Thread.sleep(600);
                        System.out.println("А мне 8 лет, прикинь! Я старый, и из меня песок сыпется.");
                        Thread.sleep(600);
                        break;
                    }
                    case 8: {
                        Thread.sleep(600);
                        System.out.println("А мне вчера стукнуло 8 лет, прикинь! Я старый и вредный компьютер.");
                        Thread.sleep(600);
                        break;
                    }
                    case 9: {
                        Thread.sleep(600);
                        System.out.println("А мне 8 лет! Многие ноутбуки столько не живут. Вдумайся.");
                        Thread.sleep(600);
                        break;
                    }
                }

                //////////////////////////////////новый  код с придумыванием пароля////////////////////////////////
                System.out.println("Придумайте себе имя пользователя (login), чтобы в следующий раз его использовать для входа в чат:");
                String newLogin = bufferedReader.readLine();
                System.out.println("Теперь придумайте пароль:");
                String newPassword = bufferedReader.readLine();
                Test.user.setLogin(newLogin);
                Test.user.setPassword(newPassword);
                System.out.println("Спасибо!");


                //    seria(user); // теперь сериализацию нового юзера делаем только если юзера не было до этого.
                //раньше мы просто сериализовывали юзера. Теперь нужно добавить юзера в массив и сериализовать весь массив.
                oldUsersList.add(Test.user); // добавили юзера в массив.

                seria(oldUsersList); //серииализовали новый массив с новым пользователем. ЗАТЕРЕВ СТАРЫЙ МАССИВ!
                //////////////////////////////////конец нового кода с придумыванием пароля////////////////////////////////

            }
            Thread.sleep(600);

            int rrr = Test.randomize();
            switch(rrr){
                case 0: {
                    Thread.sleep(600);
                    System.out.println("Чем ты хочешь сейчас заняться?");
                    Thread.sleep(600);
                    break;
                }
                case 1:{
                    Thread.sleep(600);
                    System.out.println("Чем займемся?");
                    Thread.sleep(600);
                    break;
                }
                case 2:{
                    Thread.sleep(600);
                    System.out.println("Что будем делать?");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    System.out.println("Как будем развлекаться?");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    System.out.println("Чего ты хочешь поделать?");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    System.out.println("Чем с тобой займемся?");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    System.out.println("Что будем делать? Чем заниматься?");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    System.out.println("Ну, что поделаем?");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    System.out.println("Чем хочешь заняться?");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    System.out.println("Чем будем с тобой заниматься?");
                    Thread.sleep(600);
                    break;
                }
            }

            int rrrr = Test.randomize();
            switch(rrrr){
                case 0: {
                    Thread.sleep(600);
                    System.out.println("Мы можем, например, поиграть, или позагадывать загадки, или я могу рассказать тебе анекдот... или даже сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 1:{
                    Thread.sleep(600);
                    System.out.println("Хочешь, например, поиграть, или позагадывать загадки, или хочешь анекдот... или может быть сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 2:{
                    Thread.sleep(600);
                    System.out.println("Можем поиграть, или  поболтать, позагадывать загадки, я могу рассказать анекдот... Да хоть сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(600);
                    System.out.println("Можно поиграть, или  потрещать, позагадывать загадки, я могу рассказать тебе анекдот... или сказку! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(600);
                    System.out.println("Могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать! Выбирай!");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(600);
                    System.out.println("Выбирай, что хочешь: Могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(600);
                    System.out.println("Можешь выбрать, что ты хочешь: я могу рассказать анекдот, сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(600);
                    System.out.println("Выбирай, что тебе больше по-душе: я могу рассказать анекдот или сказку. Могу загадать загадку. Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(600);
                    System.out.println("Выбирай, что нравится: я могу загадать загадку, могу рассказать анекдот или сказку... Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(600);
                    System.out.println("Ты можешь выбрать любую тему, что тебе больше нравится: я могу загадать загадку, могу рассказать анекдот или сказку... Можем просто поболтать!");
                    Thread.sleep(600);
                    break;
                }

            }
        }
        catch(InterruptedException ie){
            System.out.println("Вау. Это реально долго было.");
        }
        catch(IOException io){
            System.out.println("Ошибочка. Вводика-выводика. Так мне сказали. Но мы идем дальше!");
            io.printStackTrace();
        }
        catch(ClassNotFoundException cnf){
            System.out.println("Опа... нет такого класса line412 seriaFromFile() method! Но мы продолжаем.");
        }
        catch(NullPointerException npe){
            System.out.println("Опа... NullPointerException в методе greeting()! Но мы продолжаем.");
            npe.printStackTrace();
        }

    }

    public static void dealer() throws IOException, InterruptedException{
        System.out.println("Выбирай, чем займемся?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String deal = bufferedReader.readLine();
        deal = deal.toLowerCase();
        if (deal.contains("спать")){
            Thread.sleep(600);
            System.out.println("Тогда выключай компьютер, спокойной ночи!");
            Thread.sleep(600);
            System.out.println("Или...");
            dealer();
        }
        else if(deal.contains("есть") || deal.contains("кушать")  || deal.contains("жрать") || deal.contains("мороженого") || deal.contains("мороженое")){
            Thread.sleep(600);
            System.out.println("Тогда приятного аппетита!");
            Thread.sleep(600);
            System.out.println("Или...");
            dealer();
        }
        else if(deal.contains("играть") || deal.contains("игру") || deal.contains("игрой") || deal.contains("игры") || deal.contains("игр")){
            Thread.sleep(600);
            System.out.println("О! Круто! Давай поиграем!");
            game001();
            System.out.println("Так и быть. Еще игра: ");
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
            System.out.println("Давай тогда я загадаю тебе одну: ");
            Thread.sleep(600);

            riddleNew();
        }
        else if(deal.contains("не знаю") || deal.contains("не решил") || deal.contains("пофиг") || deal.contains("фиг")){
            Thread.sleep(600);
            System.out.println("Хорошо, раз ты не в курсе, я загадаю загадку!");

            riddleNew();
        }
        else if(deal.contains("болтать") || deal.contains("чат") || deal.contains("разговор") || deal.contains("говорить")|| deal.contains("поболтать") || deal.contains("поговорим") || deal.contains("початимся")|| deal.contains("поболтаем")|| deal.contains("переписываемся")|| deal.contains("переписываться")){
            Thread.sleep(600);
            System.out.println("Хорошо. Давай немного поговорим...");
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
            System.out.println("Я на этой планете недавно. Не все понимаю. Напиши что-нибудь другое, пожалуйста!");
            dealer();
        }
    }

    public static int randomize(){
        //получаем целое произвольное число от 0 до 9
        int b = 10;
        int randomNumber = (int)(b*Math.random());
        return randomNumber;
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

    public static void ageProof(int age){
        try {

            if (age < 7 & age > 0) {
                System.out.println("О, да ты еще , наверное, в детский садик ходишь!");
            } else if (age >= 7 & age <= 18) {


                int r = Test.randomize();
                switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        System.out.println("О! Ты, видимо, учишься в школе! Это здорово!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        System.out.println("В школу ходишь... Молодец...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        System.out.println("Что ж... Видимо, ты любишь учиться. В школе. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        System.out.println("О! Да ты, видать, в школу ходишь? Совсем большой. Похвально.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        System.out.println("Мдас... Думаю, ты ходишь в школу. Как и я... Шутка!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        System.out.println("Да уж. В школу ходишь, наверное. Молодец.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        System.out.println("О, так ты в самом расцвете сил, как Карлсон! Точнее нет. Как Малыш! В школу уже ходишь!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        System.out.println("Хе-хе... Юный возраст, юные проблемы: Школа... Двойки... Ремень по-вечерам... Мне это знакомо.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        System.out.println("Ясно. Наверное, ты уже в школу ходишь. Знания получаешь. Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        System.out.println("Хе-хе. В школу ходишь, наверное! Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                }


            } else if (age >= 19 & age <= 23) {
                System.out.println("Ясно! Ты, видимо, учишься в институте? Или в колледже? Или в армии служишь??? Это здорово!");
            } else if (age >= 24 & age <= 64) {

                int r = Test.randomize();
                switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        System.out.println("Сочувствую... Тебе, наверное, приходится много работать. Как и мне...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        System.out.println("Значит, ты, наверное, уже на работу ходишь. Молодец...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        System.out.println("Что ж... Видимо, ты тоже много работаешь. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        System.out.println("О! Да ты, видать, уже на работу ходишь? Совсем большой. Похвально.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        System.out.println("Мдас... Думаю, ты много работаешь. Как и я...");
                        Thread.sleep(1000);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        System.out.println("Да уж. На работу ходишь, наверное. Молодец.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        System.out.println("О, так ты в самом расцвете сил, как Карлсон! НА работу уже ходишь!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        System.out.println("Хе-хе... Зрелый возраст, взрослые проблемы: Работа... Ипотека... Жилье... Мне это знакомо.");
                        Thread.sleep(1000);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        System.out.println("Ясно. Наверное, ты уже работаешь. Деньги зарабатываешь. Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        System.out.println("Хе-хе. На работу ходишь, наверное, трудяга! Молодец!");
                        Thread.sleep(1000);
                        break;
                    }
                }


            } else if (age >= 65 & age <= 100) {
                System.out.println("Самый веселый возраст: ты - пенсионер!!!");
            } else if (age > 100) {
                System.out.println("Мда... ноутбуки столько не живут...");
                Thread.sleep(1000);
                System.out.println("Пройди-ка дополнительный квест: ");
                Thread.sleep(600);
                System.out.println("В каком году правил Царь Горох???");
                Thread.sleep(800);
                System.out.println("Шутка. Я и сам не знаю. Меня тогда еще не было )))");

            } else if (age == 0) {
                System.out.println("О! Ты только что родился! Поздравляю! Ори громче, чтобы мама от тебя компьютер убрала подальне. Еще написаешь не меня, щенок!");
            } else {
                System.out.println("Ну такое даже я не могу себе представить. Фантазер, блин.");
            }
        }
        catch(InterruptedException ie){
            System.out.println("Интерраптед ошибка в методе ageProof(int age). Но мы продолжаем...");
        }
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
            System.out.println("Файл не найден. Идем далее.");
        }
        catch (IOException ioe) {
        System.out.println("Ошибка ввода-вывода");
        }

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

            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(600);
                    System.out.println("Давай расскажу тебе сказку!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    System.out.println("Ну что? Рассказать сказку? Да как нечего делать. Лови!");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    System.out.println("Рассказать сказку? Хорошо!");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    System.out.println("Ну ладно, давай расскажу тебе сказку.");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("Так и быть, расскажу сказку.");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("Ну что ж... давай расскажу тебе сказку!");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("Хорошо, я расскажу. Расскажу тебе сказку!");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("Хорошо, расскажу. Слушай. Специально для тебя!");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("Ладно. Рассказываю сказку. Слушай внимательно!");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("Ладно, ладно. Давай расскажу.");
                    Thread.sleep(1000);
                    break;
                }
            }

            for(int j = 0; j < listOfFairytales.size(); j++) {
                //это цикл для того, чтобы рассказать все сказки. 10 Или сколько их будет в аррейлисте.
                int rr = randomize();

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
            System.out.println("Это было слишком... слишком долго, дружок!");
        }
        catch(IOException io){
            System.out.println("Ошибка ввода-вывода. Но мы продолжаем.");
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
            System.out.println("Давай расскажу анекдот!!!");
            Thread.sleep(600);

            for (int j = 0; j < listOfAnecdots.size(); j++) {
                //это цикл для того, чтобы рассказать все 11 анекдотов. Или сколько их будет в аррейлисте.
                int r = randomize();

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

                        int ran = Test.randomize();
                        switch (ran) {
                            case 0: {
                                Thread.sleep(1000);
                                System.out.println("Как скажешь!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                System.out.println("Хорошо!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                System.out.println("Ладно");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                System.out.println("Всё для тебя!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                System.out.println("Будь по-твоему");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                System.out.println("Ну так и быть!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                System.out.println("Ладно, ладно. Держи!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                System.out.println("Тогда слушай!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                System.out.println("Тогда лови!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                System.out.println("Хорошо. Как скажешь.");
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
            System.out.println("Ошибка ввода-вывода в методе anecdoteNew(). Но мы можем продолжать...");
        }
        catch(InterruptedException ie){
            System.out.println("Интерраптед ексепшн в методе anecdoteNew(), но мы можем идти дальше...");
        }

    }   //анекдотики

    public static void riddleNew(){
        try {
            Riddle.globalCount++;
            ArrayList<Riddle> listOfRiddles = new ArrayList<>();
            if (Riddle.globalCount == 1) {

                Riddle riddle01 = new Riddle("riddle001");
                riddle01.setPath2("riddle001_02");
                riddle01.setAnswer("5");
                riddle01.setAnswerEng("five");
                riddle01.setFinalAnswer("Правильный ответ: ТРИ плюс ДВА равно ПЯТЬ!");
                riddle01.setOne("Ну ладно. А я таким вот образом попался в первый раз,\nкогда мне загадали эту загадку хакеры из звездной системы Альфа-Центавра. \nКстати, в Альфа-Центавре - три Солнца, вместо одного!!!");
                riddle01.setTwo("Хе-хе...\nА вот для меня - не легко, я сам так попался в первый раз,\nкогда мне загадали эту загадку хакеры из звездной системы Альфа-Центавра.\nКстати,я тебе уже говорил, что в Альфа-Центавре - три Солнца, вместо одного??? Нет? Ну так знай!");
                riddle01.setThree("Ладно, не обижайся. Проехали. Погнали дальше!");
                riddle01.setFour("");
                riddle01.setFive("");
                riddle01.count = 0;

                listOfRiddles.add(0, riddle01);

///////////////////////////////////////////////////////////////////////////////////////////////

                Riddle riddle02 = new Riddle("riddle002");
                riddle02.setPath2("riddle002");
                riddle02.setAnswer("хлеб");
                riddle02.setAnswerEng("bread");
                riddle02.setFinalAnswer("Правильный ответ: ХЛЕБ!");
                riddle02.setOne("Молодца... Что сказать! Супер!\nА я вот хлеб не ем. Мне, понимаешь, электроны подавай. Я их и с маслом могу, и без масла!"); // легко
                riddle02.setTwo("Ну ладно. Хлеб - всему голова!"); //не легко
                riddle02.setThree("Ладно, не обижайся на меня. Я всего лишь железяка. Ну и пластмасска тоже. Давай дальше!"); //не ясно легко или нет
                riddle02.setFour(""); //резерв
                riddle02.setFive(""); //резерв
                riddle02.count = 0;

                listOfRiddles.add(0, riddle02);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle03 = new Riddle("riddle003");
                riddle03.setPath2("riddle003");
                riddle03.setAnswer("ю");
                riddle03.setAnswerEng("u");
                riddle03.setFinalAnswer("Правильный ответ: БУКВА Ю");
                riddle03.setOne("А вот для меня - не легко, я сам еще пока что не очень разобрался в русском алфавите и всех этих буквах ЙУ или ЙО. Все время в Гугл подсматриваю )"); // легко
                riddle03.setTwo("Ну ладно. Я сам еще не очень хорошо знаю земной алфавит. Хотя на русском могу более или менее сносно писать."); //не легко
                riddle03.setThree("Понял, понял...  Я - старый, тупой компьютер... Давай дальше!"); //не ясно легко или нет
                riddle03.setFour(""); //резерв
                riddle03.setFive(""); //резерв
                riddle03.count = 0;

                listOfRiddles.add(0, riddle03);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle04 = new Riddle("riddle004");
                riddle04.setPath2("riddle004");
                riddle04.setAnswer("перец");
                riddle04.setAnswerEng("pepper");
                riddle04.setFinalAnswer("Правильный ответ: ПЕРЕЦ!");
                riddle04.setOne("Я в тебе не сомневался. Кстати, некоторые виды перца настолько жгучие,\nчто одно прикосновение к ним может повредить кожу или даже вызвать химический ожог."); // легко
                riddle04.setTwo("Да. В следующий раз не отгадаешь - заставлю тебя съесть 25 горошин перца. Шутка!"); //не легко
                riddle04.setThree("Да-да. Ты - умница, а я - ржавое ведро с гвоздями. Все ясно. Погнали дальше.!"); //не ясно легко или нет
                riddle04.setFour(""); //резерв
                riddle04.setFive(""); //резерв
                riddle04.count = 0;

                listOfRiddles.add(0, riddle04);

///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle05 = new Riddle("riddle005");
                riddle05.setPath2("riddle005");
                riddle05.setAnswer("чай");
                riddle05.setAnswerEng("tea");
                riddle05.setFinalAnswer("Правильный ответ: ЧАЙ!");
                riddle05.setOne("Ну значит ты - молодец!!!\n Кстати, после воды, чай является вторым самым употребляемым напитком в мире"); // легко
                riddle05.setTwo("И мне. Кстати, В США кофе остаётся более популярным напитком, чем чай.\n В целом американцы потребляют примерно в 25 раз меньше чая, чем кофе."); //не легко
                riddle05.setThree("Все. Все. Молчу-молчу. В тряпочку!"); //не ясно легко или нет
                riddle05.setFour(""); //резерв
                riddle05.setFive(""); //резерв
                riddle05.count = 0;

                listOfRiddles.add(0, riddle05);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle06 = new Riddle("riddle006");
                riddle06.setPath2("riddle006");
                riddle06.setAnswer("сырник");
                riddle06.setAnswerEng("cheesecake");
                riddle06.setFinalAnswer("Правильный ответ: СЫРНИК!");
                riddle06.setOne("Мне тоже\n Кстати, в Древней Руси вначале не было слова творог.\nИ в народе творог также называли «сир»"); // легко
                riddle06.setTwo("Да уж!!! Тут рецептуру нужно знать!\n И еще... Людям, следящим за своим весом, следует осторожно подходить к употреблению сырников!\n Но это я не про тебя, конечно..."); //не легко
                riddle06.setThree("Я громко хлопнул крышкой унитаза, поэтому, будем считать, не слышал этого твоего ответа..."); //не ясно легко или нет
                riddle06.setFour(""); //резерв
                riddle06.setFive(""); //резерв
                riddle06.count = 0;

                listOfRiddles.add(0, riddle06);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle07 = new Riddle("riddle007");
                riddle07.setPath2("riddle007");
                riddle07.setAnswer("бутерброд");
                riddle07.setAnswerEng("sandwich");
                riddle07.setFinalAnswer("Правильный ответ: БУТЕРБРОД!");
                riddle07.setOne("Ну ты - крутышка!!!\n Кстати, по правилу бутерброда, следующую загадку ты не отгадаешь."); // легко
                riddle07.setTwo("Да. И этот закон лучше бы не работал..."); //не легко
                riddle07.setThree("Даже не знаю, что и сказать!"); //не ясно легко или нет
                riddle07.setFour(""); //резерв
                riddle07.setFive(""); //резерв
                riddle07.count = 0;

                listOfRiddles.add(0, riddle07);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle08 = new Riddle("riddle008");
                riddle08.setPath2("riddle008");
                riddle08.setAnswer("масло");
                riddle08.setAnswerEng("butter");
                riddle08.setFinalAnswer("Правильный ответ: МАСЛО!");
                riddle08.setOne("Ну я просто рад за тебя!\n Кстати, при взбивании масла из сливок или сметаны образуется кисловатая жидкость – пахта.\n В древности это слово употребляли для обозначения процесса взбивания сливочного масла."); // легко
                riddle08.setTwo("Ну ладно, ладно. Так и быть. Эта - была сложной."); //не легко
                riddle08.setThree("Я аж чуть со стола не упал от таких ответов."); //не ясно легко или нет
                riddle08.setFour(""); //резерв
                riddle08.setFive(""); //резерв
                riddle08.count = 0;

                listOfRiddles.add(0, riddle08);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle09 = new Riddle("riddle009");
                riddle09.setPath2("riddle009");
                riddle09.setAnswer("мед");
                riddle09.setAnswerEng("honey");
                riddle09.setFinalAnswer("Правильный ответ: МЕД");
                riddle09.setOne("Ты золото моё!!!\n Кстати, натуральный мёд пчёл содержит практически все микроэлементы \nи по своему составу близок к плазме крови человека."); // легко
                riddle09.setTwo("Не, ну ты же не профессор!"); //не легко
                riddle09.setThree("Ладно. У меня уже клавиатура болит от твоих пальцев. Полегче там жми..."); //не ясно легко или нет
                riddle09.setFour(""); //резерв
                riddle09.setFive(""); //резерв
                riddle09.count = 0;

                listOfRiddles.add(0, riddle09);
///////////////////////////////////////////////////////////////////////////////////////////////
                Riddle riddle10 = new Riddle("riddle010");
                riddle10.setPath2("riddle010");
                riddle10.setAnswer("пельмени");
                riddle10.setAnswerEng("dumplings");
                riddle10.setFinalAnswer("Правильный ответ: ПЕЛЬМЕНИ!");
                riddle10.setOne("Это очень хорошо!\n Кстати, пельмени так называются потому, что имеют форму уха,\nв переводе с коми-пермяцкого «пэль» - это ухо, а «нянь» - хлеб."); // легко
                riddle10.setTwo("Кутузову тоже было нелегко..."); //не легко
                riddle10.setThree("Все ясно. Я тут лишний..."); //не ясно легко или нет
                riddle10.setFour(""); //резерв
                riddle10.setFive(""); //резерв
                riddle10.count = 0;

                listOfRiddles.add(0, riddle10);
//продолжить для всех моих загадок
            }
            ArrayList<Integer> listOfRandoms = new ArrayList<>(); //для сбора уже выскакивавших рандомных значений.
            Thread.sleep(600);

            for (int j = 0; j < listOfRiddles.size(); j++) {
                //это цикл для того, чтобы загадать все загадки. Или сколько их будет в аррейлисте.
                int r = randomize();

                //загадки удаляются по одной, с каждым разом их всё меньше 10. А рандомное число может быть и 9, и тогда IndexOutOfBoundsException. А так - нет.
                if (r >= listOfRiddles.size()) {
                    r = listOfRiddles.size() - 1;
                } else {
                    r = r;
                }


                boolean rAlreadyWas = listOfRandoms.contains(r);
                if (rAlreadyWas) {
                    continue;
                } else {
                    listOfRandoms.add(r);                                       //добавить r  в список.
                    listOfRiddles.get(r).readFromFile(listOfRiddles.get(r));   //загадать загадку.
                    listOfRiddles.get(r).otgadka(listOfRiddles.get(r));       //прочитать ответ. Оценить ответ. Если неправильно - дать правильнй ответ. Спросить, хочет ли еще загадку.
                    listOfRiddles.remove(r);                                 //удалисть из списка б/у-шную загадку.
                }
            }
            //riddleNew();
        }
        catch(InterruptedException ie){
            System.out.println("ошибка InterruptedException в методе riddleNew(). Но мы можем продолжать!");
        }

    }

    public static void game001() throws IOException, InterruptedException{
        System.out.println("загадай любое целое число.");
        Thread.sleep(1000);
        System.out.println("Введи это число с клавиатуры. Нажми ENTER.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        int y = x + 2;
        System.out.println("мда... А я загадал число " + y + " !");
        System.out.println("Тебе все ясно? В цифрах мне нет равных. Тут я всегда... ПОБЕДЮ.");
    }

    public static void game000() throws IOException, InterruptedException{
        Thread.sleep(2000);
        System.out.println("Сейчас я угадаю год твоего рождения.");
        Thread.sleep(1000);
        System.out.println("79 кружек пива...");
        Thread.sleep(2000);
        System.out.println("...минус твой возраст. Самостоятельно считай.");
        Thread.sleep(3000);
        System.out.println("Не все же мне за тебя считать...");
        Thread.sleep(2000);
        System.out.println("К этому числу прибавь 40!");
        Thread.sleep(3000);
        System.out.println("Ну вот. И получился твой год рождения!!!");
        Thread.sleep(600);
        System.out.println("Проверь еще раз...");
    }

    public static void chat00()throws IOException, InterruptedException{

        Chat chat = new Chat();
        //метод является входным для чата и далее вызывает chat001 chat002 chat003 и так далее в рандомном порядке.
        Thread.sleep(600);
        System.out.println("Задавай любую тему. Я, правда, не всё на свете знаю, но... Можем про учебу... Или про музыку... Или про отпуск!");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String chatTheme = bufferedReader.readLine();
        chatTheme = chatTheme.toLowerCase();

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
            Test.fairytaleNew();
        } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
            Test.riddleNew();
        } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
            Anecdot.exit();
        } else if (answer.contains("анекдот") || answer.contains("funn") || answer.contains("анегдот")) {
            Test.anecdoteNew();
        } else return false;
        return false;
    }

    public static String createGoodName(String name){
        name = name.replaceAll("меня", "");
        name = name.replaceAll("Меня", "");
        name = name.replaceAll("МЕНЯ", "");
        name = name.replaceAll("зовут", "");
        name = name.replaceAll("ЗОВУТ", "");
        name = name.replaceAll("мое", "");
        name = name.replaceAll("Мое", "");
        name = name.replaceAll("МОЕ", "");
        name = name.replaceAll("моё", "");
        name = name.replaceAll("МОЁ", "");
        name = name.replaceAll("Моё", "");
        name = name.replaceAll("имя", "");
        name = name.replaceAll("Имя", "");
        name = name.replaceAll("ИМЯ", "");
        name = name.replaceAll("моя", "");
        name = name.replaceAll("Моя", "");
        name = name.replaceAll("МОЯ", "");
        name = name.replaceAll("фамилия", "");
        name = name.replaceAll("Фамилия", "");
        name = name.replaceAll("ФАМИЛИЯ", "");
        name = name.replaceAll("My ", "");
        name = name.replaceAll("my ", "");
        name = name.replaceAll("MY ", "");
        name = name.replaceAll("Name ", "");
        name = name.replaceAll("name ", "");
        name = name.replaceAll("NAME ", "");
        name = name.replaceAll("is ", "");
        name = name.replaceAll("IS ", "");
        name = name.replaceAll("Is ", "");
        name = name.replaceAll(" ", "");
        name = name.replaceAll("\\.", "");
        name = name.replaceAll("!", "");
        name = name.replaceAll("-", "");
        name = name.replaceAll("Я ", "");
        name = name.replaceAll("я ", "");

        return name;
    }

    public static int createGoodAge(String ageString){
        String numberOnly = ageString.replaceAll("[^0-9]", "");
        int age = Integer.parseInt(numberOnly);
        return age;
    }

    public static void exit(String answer){
        try {
            if (answer.contains("exit") || answer.contains("выключ") || answer.contains("выход") || answer.contains("надоел")) {
                Thread.sleep(600);
                System.out.println("Всё, всё. Пора заканчивать разговор. Пока!");
                System.exit(0);
                return;
            }
        }
        catch(InterruptedException ie){
            System.out.println("Это InterruptedException в методе exit(String answer). Но мы идем дальше.");
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
                System.out.println(user.toString());
            }

        }
        catch(FileNotFoundException f){
            System.out.println("Файл не найден.");
            f.printStackTrace();
        }
        catch(IOException ioex){
            System.out.println("Ошибка ввода-вывода");
            ioex.printStackTrace();
        }
        catch(ClassNotFoundException c){
            System.out.println("Нет такого класса");
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
            System.out.println("Файл не найден в usersCountFromFile(). А мы идем дальше.");
        }
        catch(IOException io){
            System.out.println("Ошибка ввода-вывода в usersCountFromFile(). А мы идем дальше.");
            io.printStackTrace();
        }

        return countUsers;
    }
}
