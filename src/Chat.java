import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Chat implements Serializable {
    static String globalName = "чат";
    private String name;
    private int id;
    private static int generalIdCount = 0;
    public Chat(){
        this.id = generalIdCount;
        generalIdCount++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static void chat01school(){
        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Хе-хе... А тебе нравится учиться чему-то новому?");
            Thread.sleep(600);
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Очень-очень-очень долго тебя ждать...");
        }
    }

    public static void chat002music(){
        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Я люблю музыку. При том очень разную. А тебе какая музыка нравится?");
            Thread.sleep(600);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answerWhatMusic = bufferedReader.readLine();
            if(answerWhatMusic.contains("рэп")){
                ConsoleHelper.writeMessage("О! Круто! А какие рэп-исполнители тебе нравятся? Я имею ввиду российских рэперов!");
            }
            else if(answerWhatMusic.contains("рок")){
                ConsoleHelper.writeMessage("О! Круто! А какие рок-исполнители тебе нравятся? Я имею ввиду российских рокеров!");
            }
            else if(answerWhatMusic.contains("поп")){
                ConsoleHelper.writeMessage("О! Круто! А какие поп-исполнители тебе нравятся? Я имею ввиду российских исполнителей!");
            }
            else if(answerWhatMusic.contains("метал")||answerWhatMusic.contains("metal")||answerWhatMusic.contains("dark")||answerWhatMusic.contains("black")||answerWhatMusic.contains("doom")){
                ConsoleHelper.writeMessage("О! Круто! А какие металлические коллективы тебе нравятся?");
            }else{
                ConsoleHelper.writeMessage("Ой! я такого не знаю...");
            }

        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Очень-очень-очень долго тебя ждать...");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Это еще одна ошибка ввода-вывода в chat002music()");
        }
    }

    public static void chat003english(){
        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("О! Я люблю английский язык! Давай поиграем с тобой в английские слова?");
            Thread.sleep(2500);
            ConsoleHelper.writeMessage("Я пишу слово на английском, а ты переводишь его на русский и пишешь мне!");
            Thread.sleep(2000);
            ConsoleHelper.writeMessage("Если перевод правильный - ты получаешь один балл!");
            Thread.sleep(2000);
            ConsoleHelper.writeMessage("Если неправильный - ты получаешь МИНУС один балл...");
            Thread.sleep(2500);
            ConsoleHelper.writeMessage("Если в итоге ты набираешь +3 баллов - твоя победа! Если набираешь минус 3 баллов - моя!");
            Thread.sleep(1000);
            ConsoleHelper.writeMessage("Ну что, поиграем?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answer = bufferedReader.readLine();
            answer = answer.toLowerCase();

            Test.exit(answer);//выход, если напишет exit и т.п.

            if(Test.yesNo(answer)){
                //запускаем игру в англ слова - отдельный метод.
                gameEngWords2();
            }
            else{
                //не запускаем игру и возвращаемся в чат
                Test.chat00();
            }
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Очень-очень-очень долго тебя ждать...");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Это еще одна ошибка ввода-вывода в chat002music()");
        }
    }
    public static void gameEngWords(){
        try {
            //создаем словарь слов
            ArrayList<String> listOfEngWords = new ArrayList<>();
            Map<String, String> mapOfWords = new HashMap<>();

            mapOfWords.put("please", "пожалуйста");
            mapOfWords.put("small", "маленький");
            mapOfWords.put("little", "маленький");
            mapOfWords.put("large", "большой");
            mapOfWords.put("tall", "высокий");
            mapOfWords.put("short", "короткий");
            mapOfWords.put("new", "новый");
            mapOfWords.put("young", "молодой");
            mapOfWords.put("happy", "счастливый");
            mapOfWords.put("sad", "грустный");
            mapOfWords.put("beautiful", "красивый");
            mapOfWords.put("ugly", "уродливый");
            mapOfWords.put("fat", "толстый");
            mapOfWords.put("thick", "толстый");
            mapOfWords.put("thin", "худой");
            mapOfWords.put("strong", "сильный");
            mapOfWords.put("weak", "слабый");
            mapOfWords.put("good", "хороший");
            mapOfWords.put("month", "месяц");
            mapOfWords.put("nice", "милый");
            mapOfWords.put("glad", "счастливый");
            mapOfWords.put("hungry", "голодный");
            mapOfWords.put("dark", "темный");
            mapOfWords.put("bright", "яркий");
            mapOfWords.put("long", "длинный");
            mapOfWords.put("black", "черный");
            mapOfWords.put("white", "белый");
            mapOfWords.put("red", "красный");
            mapOfWords.put("yellow", "желтый");
            mapOfWords.put("green", "зеленый");
            mapOfWords.put("pink", "розовый");
            mapOfWords.put("orange", "оранжевый");
            mapOfWords.put("violet", "фиолетовый");
            mapOfWords.put("hot", "жаркий");
            mapOfWords.put("cold", "холодный");
            mapOfWords.put("cool", "прохладный");
            mapOfWords.put("warm", "теплый");
            mapOfWords.put("cloudy", "облачный");
            mapOfWords.put("rainy", "дождливый");
            mapOfWords.put("sunny", "солнечный");
            mapOfWords.put("interesting", "интересный");
            mapOfWords.put("wonderful", "чудесный");
            mapOfWords.put("mother", "мама");
            mapOfWords.put("father", "папа");
            mapOfWords.put("sister", "сестра");
            mapOfWords.put("brother", "брат");
            mapOfWords.put("grandmother", "бабушка");
            mapOfWords.put("grandfather", "дедушка");
            mapOfWords.put("son", "сын");
            mapOfWords.put("daughter", "дочка");
            mapOfWords.put("uncle", "дядя");
            mapOfWords.put("aunt", "тетя");
            mapOfWords.put("man", "мужчина");
            mapOfWords.put("men", "мужчины");
            mapOfWords.put("woman", "женщина");
            mapOfWords.put("women", "женщины");
            mapOfWords.put("child", "ребенок");
            mapOfWords.put("children", "дети");
            mapOfWords.put("to answer", "отвечать");
            mapOfWords.put("to go to bed", "идти спать");
            mapOfWords.put("to blow", "дуть");
            mapOfWords.put("to bring", "приносить");
            mapOfWords.put("to call", "звонить");
            mapOfWords.put("to catch", "ловить");
            mapOfWords.put("to clean", "чистить");
            mapOfWords.put("to come", "приходить");
            mapOfWords.put("to come in", "входить");
            mapOfWords.put("to copy", "копировать");
            mapOfWords.put("to cry", "плакать");
            mapOfWords.put("to dance", "танцевать");
            mapOfWords.put("to do", "делать");
            mapOfWords.put("to dream", "мечтать");
            mapOfWords.put("to dress", "одеваться");
            mapOfWords.put("to drink", "пить");
            mapOfWords.put("to eat", "кушать");
            mapOfWords.put("to fall", "падать");
            mapOfWords.put("to forget", "забывать");
            mapOfWords.put("to have fun", "веселиться");
            mapOfWords.put("to get", "получать");
            mapOfWords.put("to get up", "вставать");
            mapOfWords.put("to go", "идти");
            mapOfWords.put("to have", "иметь");
            mapOfWords.put("to help", "помогать");
            mapOfWords.put("to invite", "приглашать");
            mapOfWords.put("to join", "присоединяться");
            mapOfWords.put("to jump", "прыгать");
            mapOfWords.put("to learn", "учить");
            mapOfWords.put("to like", "нравиться");
            mapOfWords.put("to live", "жить");
            mapOfWords.put("to look", "смотреть");
            mapOfWords.put("to love", "любить");
            mapOfWords.put("to make", "делать");
            mapOfWords.put("to meet", "встречаться");
            mapOfWords.put("to need", "нуждаться");
            mapOfWords.put("to open", "открывать");
            mapOfWords.put("to paint", "красить");
            mapOfWords.put("to pass", "передавать");
            mapOfWords.put("to pick up", "собирать");
            mapOfWords.put("to plant", "сажать");
            mapOfWords.put("to practice", "практиковать");
            mapOfWords.put("to remember", "вспоминать");
            mapOfWords.put("to see", "смотреть");

            int countWords = 0;             //создаем счетчик количества загаданных слов.
            int countWrightAnswers = 0;     //счетчик количества правильных ответов
            boolean wantMore = true;


            if(countWrightAnswers < 5 || countWrightAnswers > -5) {

                while (wantMore) {
                    //здесь мы все ключи из мапы записываем в ArrayList, чтобы оттуда потом рандомно их брать...
                    for (Map.Entry<String, String> pair : mapOfWords.entrySet()) {
                        String key01 = pair.getKey();                      //ключ
                        listOfEngWords.add(key01);
                    }

                    //генерируем слово для вопроса (для перевода на русский)
                    int r = Test.randomize100();
                    String key = listOfEngWords.get(r);

                    //получаем по этому слову (ключу) значение из мапы:
                    String value = "";
                    for (Map.Entry<String, String> pair : mapOfWords.entrySet()) {

                        String key01 = pair.getKey();                      //ключ
                        String value01 = pair.getValue();
                        if (key.equals(key01)) {
                            value = value01;
                        }
                    }

                    switch (countWords) {
                        case 0: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Начали. Переводи первое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 1: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи второе слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 2: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи третье слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 3: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи четвертое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 4: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи пятое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 5: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи шестое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        default: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи " + (countWords + 1) + " слово:");
                            Thread.sleep(600);
                            break;
                        }
                    } //хорошо. переводи 1-е, 2-е ... слово.

                    ConsoleHelper.writeMessage(key);
                    countWords++;

                    //пользователь вводит свой ответ
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String answer = bufferedReader.readLine();
                    answer = answer.toLowerCase();

                    //сравниваем ответ:
                    if (answer.equals(value)) {
                        Thread.sleep(600);


                        int random = Test.randomize();
                        switch (random) {
                            case 0: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ура! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Всё верно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Правильно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Умница! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты мой золотой! Всё правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Да! Да! Все правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ух-ты! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Точно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Всё верно! Умничка!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Ты правильно перевел!");
                                Thread.sleep(1000);
                                break;
                            }
                        }          //Ура! Правильно!


                        countWrightAnswers++;
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                        Thread.sleep(600);

                        if(countWrightAnswers == 5){
                            gameEngWordsWin();
                            break;
                        }
                        if(countWrightAnswers == -5){
                            gameEngWordsLoose();
                            break;
                        }

                    } else {

                        int ran = Test.randomize();
                        switch (ran) {
                            case 0: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет... не правильно. Минус очко тебе");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, это неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты не прав.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты неправильно перевел.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, нет, нет. Этот перевод никуда не годится.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, ты не прав. У этого слова другое значение.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ответ неправильный.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, всё совсем не так. Неправильно.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет. Не то ты написал.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты меня разочаровал. Неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                        }                //Нет... не правильно. Минус очко тебе


                        countWrightAnswers--;
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);

                        if(countWrightAnswers == 5){
                            gameEngWordsWin();
                            break;
                        }
                        if(countWrightAnswers == -5){
                            gameEngWordsLoose();
                            break;
                        }

                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Еще попытку хочешь? Да или нет?");
                        Thread.sleep(600);
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();
                        if (Test.yesNo(answerYesNo)) {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("переведи слово: " + key);
                            Thread.sleep(600);
                            String answer2 = bufferedReader.readLine();
                            if (answer2.equals(value)) {
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Ура! Теперь правильно!");
                                countWrightAnswers++;
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                                Thread.sleep(600);

                                if(countWrightAnswers == 5){
                                    gameEngWordsWin();
                                    break;
                                }
                                if(countWrightAnswers == -5){
                                    gameEngWordsLoose();
                                    break;
                                }

                            } else {
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Нет. Не то. Еще минус одно очко.");
                                countWrightAnswers--;
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Правильный ответ вот такой: " + value);
                                Thread.sleep(600);

                                if(countWrightAnswers == 5){
                                    gameEngWordsWin();
                                    break;
                                }
                                if(countWrightAnswers == -5){
                                    gameEngWordsLoose();
                                    break;
                                }
                            }
                        } else {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ: " + value);
                            Thread.sleep(600);
                        }
                    }

                    //это раздражает. Постоянный вопрос. Игра есть игра. 5 слов задаем, не спрашивая. Пока выключаю.
/*                    if(countWrightAnswers!=5 || countWrightAnswers !=-5) {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Ну что, хочешь еще одно слово перевести?");
                        Thread.sleep(600);
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();
                        if (Test.yesNo(answerYesNo)) {
                            wantMore = true;
                        } else {
                            wantMore = false;
                        }
                    }*/
/*                    if(countWrightAnswers == 5){
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Поздравляю. Я проиграл. Ты - победитель.");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
                        Thread.sleep(600);
                        BufferedReader bufferedReader01 = new BufferedReader(new InputStreamReader(System.in));
                        String answerYesNo01 = bufferedReader01.readLine();
                        answerYesNo01 = answerYesNo01.toLowerCase();
                        if (Test.yesNo(answerYesNo01)) {
                            gameEngWords();
                        } else {
                            Test.chat00();
                        }
                    }

                    if(countWrightAnswers == -5){
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
                        Thread.sleep(600);
                        BufferedReader bufferedReader02 = new BufferedReader(new InputStreamReader(System.in));
                        String answerYesNo02 = bufferedReader02.readLine();
                        answerYesNo02 = answerYesNo02.toLowerCase();
                        if (Test.yesNo(answerYesNo02)) {
                            gameEngWords();
                        } else {
                            Test.chat00();
                        }

                    }*/
                }
            }
/*            else if(countWrightAnswers == 5)
            {
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Поздравляю. Я проиграл. Ты - победитель.");
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
                Thread.sleep(600);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String answerYesNo = bufferedReader.readLine();
                answerYesNo = answerYesNo.toLowerCase();
                if (Test.yesNo(answerYesNo)) {
                    gameEngWords();
                } else {
                    Test.chat00();
                }
            }
            else if(countWrightAnswers == -5){
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
                Thread.sleep(600);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String answerYesNo = bufferedReader.readLine();
                answerYesNo = answerYesNo.toLowerCase();
                if (Test.yesNo(answerYesNo)) {
                    gameEngWords();
                } else {
                    Test.chat00();
                }
            }*/
            else{
                ConsoleHelper.writeMessage("Что-то мне надоело играть...");
                Test.chat00();
            }

            Test.chat00(); //если вышли из цикла while , то переходим в самый верхний чат.

        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Интерраптед ошибочка в методе gameEngWords(). Но мы идем далее.");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в методе gameEngWords(). Но мы идем далее.");
        }
    } //старый метод, вместо него использую gameEngWords2()

    public static void gameEngWords2(){
        try {

            ArrayList<EngWords> listOfEngWords = new ArrayList<>();

            ArrayList<EngWords> listOfUnknownWords = new ArrayList<>();

            int countWords = 0;             //создаем счетчик количества загаданных слов.
            int countWrightAnswers = 0;     //счетчик количества правильных ответов
            boolean wantMore = true;

            EngWords word001 = new EngWords();
            word001.setEngWord1("animal");
            word001.setEngWord2("-empty-");
            word001.setEngWord3("-empty-");
            word001.setEngWord4("-empty-");
            word001.setEngWordPlural1("animals");
            word001.setEngWordPlural2("-empty-");
            word001.setEngSinonim1("beast");
            word001.setEngEtymology1("from Latin animale \"living being, being which breathes,\" - из латыни animale - \"живое существо, которое дышит\"");
            word001.setRusWord1("животное");
            word001.setRusWord2("зверь");
            word001.setRusWord3("-empty-");
            word001.setRusWord4("-empty-");
            word001.setRusWordPlural1("животные");
            word001.setRusWordPlural2("звери");
            word001.setRusSinonim1("четвероногое");
            word001.setRusEtymology1("Живо́тное. Заимствование из старославянского, где животьно произведено от живот — «жизнь»; таким образом, исходное значение этого слова — «живое существо.");
            listOfEngWords.add(word001);

            EngWords word002 = new EngWords();
            word002.setEngWord1("friend");
            word002.setEngWord2("companion");
            word002.setEngWord3("buddy");
            word002.setEngWord4("fellow");
            word002.setEngWordPlural1("friends");
            word002.setEngWordPlural2("companions");
            word002.setEngSinonim1("mate");
            word002.setEngEtymology1("Старо-английское freond, из Германского *frijōjands \"любовник, друг\" , произошло от *priy-ont-, \"любящий\" форма слова от корня *pri- \"любить\"");
            word002.setRusWord1("друг");
            word002.setRusWord2("приятель");
            word002.setRusWord3("товарищ");
            word002.setRusWord4("дружок");
            word002.setRusWordPlural1("друзья");
            word002.setRusWordPlural2("приятели");
            word002.setRusSinonim1("кореш");
            word002.setRusEtymology1("Друг. Общеславянское слово, имеющее соответствия в ряде европейских языков (литовское draugas — «товарищ», латышское draugs с тем же значением, древнегерманское trucht — «отряд воинов»). Исходное значение — «сражающийся вместе».");
            listOfEngWords.add(word002);


            EngWords word003 = new EngWords();
            word003.setEngWord1("book");
            word003.setEngWord2("paper");
            word003.setEngWord3("tome");
            word003.setEngWord4("liber");
            word003.setEngWordPlural1("books");
            word003.setEngWordPlural2("volumes");
            word003.setEngSinonim1("volume");
            word003.setEngEtymology1("Старо-английское слово boc \"книга, письменность, письменный документ\" ссылается на (несмотря на сложности произношения) к Германскому *bōk(ō)-, происходит от *bokiz \"Бук — род широколиственных деревьев семейства Буковые.\" (так же источником является немецкое слово Buch \"книга\"");
            word003.setRusWord1("книга");
            word003.setRusWord2("книжка");
            word003.setRusWord3("книжечка");
            word003.setRusWord4("справочник");
            word003.setRusWordPlural1("книги");
            word003.setRusWordPlural2("книжки");
            word003.setRusSinonim1("сборник");
            word003.setRusEtymology1("Кни́га. Происхождение точно не установлено. Наиболее предпочтительным является объяснение слова как праславянского заимствования из др.-тюрк. яз., где булгарск. küinig — уменьшит.-ласкат. суф. производное от küin (ср. уйгурск. kuin «книга»), передающее кит. küen «свиток». Книга была первоначально в виде свитка.");
            listOfEngWords.add(word003);


            EngWords word004 = new EngWords();
            word004.setEngWord1("student");
            word004.setEngWord2("pupil");
            word004.setEngWord3("learner");
            word004.setEngWord4("scholar");
            word004.setEngWordPlural1("students");
            word004.setEngWordPlural2("pupils");
            word004.setEngSinonim1("trainee");
            word004.setEngEtymology1("Заимствование из немецкого, в котором Student восходит к латинскому studens — «учащийся». Отметим родственные: студия, штудировать.");
            word004.setRusWord1("студент");
            word004.setRusWord2("ученик");
            word004.setRusWord3("школьник");
            word004.setRusWord4("слушатель");
            word004.setRusWordPlural1("студенты");
            word004.setRusWordPlural2("школьники");
            word004.setRusSinonim1("курсант");
            word004.setRusEtymology1("Студе́нт. Заимствование из немецкого, в котором Student восходит к латинскому studens — «учащийся». Отметим родственные: студия, штудировать.");
            listOfEngWords.add(word004);

            EngWords word005 = new EngWords();
            word005.setEngWord1("body");
            word005.setEngWord2("person");
            word005.setEngWord3("individual");
            word005.setEngWord4("corpse");
            word005.setEngWordPlural1("bodies");
            word005.setEngWordPlural2("persons");
            word005.setEngSinonim1("torso");
            word005.setEngEtymology1("Старо-английское слово bodig \"туловище человека или животного, физическая структура человека или животного; материальное состояние человека; основная часть чего-либо\" соотносится со старо-германским botah");
            word005.setRusWord1("тело");
            word005.setRusWord2("организм");
            word005.setRusWord3("торс");
            word005.setRusWord4("плоть");
            word005.setRusWordPlural1("тела");
            word005.setRusWordPlural2("организмы");
            word005.setRusSinonim1("труп");
            word005.setRusEtymology1("Общеслав. Происхождение неясно. Наиболее привлекательным представляется объяснение слова как суф. производного (суф. -lo) от той же основы (tait-), что тесто, тискать, тесный.");
            listOfEngWords.add(word005);

            EngWords word006 = new EngWords();
            word006.setEngWord1("mother");
            word006.setEngWord2("mom");
            word006.setEngWord3("mum");
            word006.setEngWord4("mama");
            word006.setEngWordPlural1("mother");
            word006.setEngWordPlural2("moms");
            word006.setEngSinonim1("mommy");
            word006.setEngEtymology1("Мать (род. п. матери). Общеслав. индоевроп. характера (ср. нем. Mutter, англ. mother, др.-инд. mātár-, тохарск. A mācar и т. д.). Суф. производное (суф. -ter-) от детского ma, ср. мама.");
            word006.setRusWord1("мать");
            word006.setRusWord2("мама");
            word006.setRusWord3("матушка");
            word006.setRusWord4("мамаша");
            word006.setRusWordPlural1("матери");
            word006.setRusWordPlural2("мамы");
            word006.setRusSinonim1("родительница");
            word006.setRusEtymology1("Ма́ма. Одно из многих слов, попавших во взрослый язык из детского; слово мама образовано удвоением возникшего из детского лепета ма (по такому же принципу образованы слова дядя, папа). Отметим также, что это слово имеет индоевропейскую природу: в литовском находим mama, в немецком — Mama, в греческом — mamme.");
            listOfEngWords.add(word006);

            EngWords word007 = new EngWords();
            word007.setEngWord1("day");
            word007.setEngWord2("afternoon");
            word007.setEngWord3("-empty-");
            word007.setEngWord4("-empty-");
            word007.setEngWordPlural1("days");
            word007.setEngWordPlural2("afternoons");
            word007.setEngSinonim1("daytime");
            word007.setEngEtymology1("Старо-английское слово dæg \"время, когда солнце над горизонтом,\" также \"жизненное время, время жизни,\" из Германского *dages- \"день\"");
            word007.setRusWord1("день");
            word007.setRusWord2("денёк");
            word007.setRusWord3("время");
            word007.setRusWord4("денек");
            word007.setRusWordPlural1("дни");
            word007.setRusWordPlural2("денёчки");
            word007.setRusSinonim1("сутки");
            word007.setRusEtymology1("День. Общеслав. индоевроп. характера (ср. др.-инд. dinam «день», лит. dienà — тж., этрусск. tin — тж., лат. nundinae «базарный день» и т. д.). Суф. производное (суф. -н-) от той же основы, что и лат. dies «бог ясного неба». День буквально — «время ясного неба».");
            listOfEngWords.add(word007);

            EngWordsVerb word008 = new EngWordsVerb();
            word008.setEngWord1("to read");
            word008.setEngWord2("read");
            word008.setEngWord3("scan");
            word008.setEngWord4("peruse");
            word008.setEngWordPlural1("-empty-");
            word008.setEngWordPlural2("-empty-");
            word008.setSecondForm("red");
            word008.setThirdForm("red");
            word008.setEngSinonim1("interpret");
            word008.setEngEtymology1("Старо-английское слово rædan (Западная Саксония), redan (Английское) \"советовать, обсудить, объяснить; \" (связано с ræd, red \"советовать\"), из старо-Германского *redan");
            word008.setRusWord1("читать");
            word008.setRusWord2("прочитать");
            word008.setRusWord3("прочесть");
            word008.setRusWord4("прочитывать");
            word008.setRusWordPlural1("читал");
            word008.setRusWordPlural2("прочитал");
            word008.setRusSinonim1("догадываться");
            word008.setRusEtymology1("чи́тать I «чинить сети», новгор. (Даль), см. чи́кать II чи́тать II «моросить», от чит «изморось» чита́ть а́ю, почита́ть, счита́ть, причита́ть, укр. чита́ти, болг. почи́там «почитаю», сербохорв. чѝтȃм, чѝтати «читать», чеш. роčítаti «считать», слвц. čítаt᾽ «читать, считать», польск. сzуtаć «читать», в.-луж. čitać — то же, н.-луж. суtаś. Связано чередованием гласных с čьtǫ, čisti «считать, ценить»; см. Бернекер I, 174; см. также ниже, чту.");
            listOfEngWords.add(word008);

            EngWordsVerb word009 = new EngWordsVerb();
            word009.setEngWord1("to write");
            word009.setEngWord2("write");
            word009.setEngWord3("spell");
            word009.setEngWord4("mark");
            word009.setEngWordPlural1("-empty-");
            word009.setEngWordPlural2("-empty-");
            word009.setSecondForm("wrote");
            word009.setThirdForm("written");
            word009.setEngSinonim1("inscribe");
            word009.setEngEtymology1("Старо-английский writan \"вывести, нарисовать фигуру,\" позже \"установить в письменном виде\", из старо-Германского *writan");
            word009.setRusWord1("писать");
            word009.setRusWord2("написать");
            word009.setRusWord3("сочинять");
            word009.setRusWord4("записывать");
            word009.setRusWordPlural1("wrote");
            word009.setRusWordPlural2("written");
            word009.setRusSinonim1("записать");
            word009.setRusEtymology1("Писа́ть. По происхождению близко к «пестрый» (см.). Сначала значило: покрывать узором, пестрить (художники и сейчас говорят не «рисовать красками», а «писать красками», а на Украине еще недавно «писанками» назывались пестро раскрашенные пасхальные яйца). Сравните также слово «расписной» — «пестрый».");
            listOfEngWords.add(word009);

            EngWordsVerb word010 = new EngWordsVerb();       ////////тут ошибка. Потом создаем массив из EngWords, а это EngWordsVerb и он не влезет в массив.
            word010.setEngWord1("to speak");
            word010.setEngWord2("speak");
            word010.setEngWord3("say");
            word010.setEngWord4("tell");
            word010.setEngWordPlural1("-empty-");
            word010.setEngWordPlural2("-empty-");
            word010.setSecondForm("spoke");
            word010.setThirdForm("spoken");
            word010.setEngSinonim1("talk");
            word010.setEngEtymology1("Старо-английское слово specan, вариант слова sprecan \"говорить, произносить слова, произносить речь; дискутировать)\" , из старо-Германского *sprekanan");
            word010.setRusWord1("говорить");
            word010.setRusWord2("сказать");
            word010.setRusWord3("разговаривать");
            word010.setRusWord4("поговорить");
            word010.setRusWordPlural1("говорил");
            word010.setRusWordPlural2("сказал");
            word010.setRusSinonim1("произносить");
            word010.setRusEtymology1("Говори́ть. Общеславянское слово, образованное от говоръ — «шум, крик», произведенного от звукоподражательного гов. Эта звукоподражательная основа имеется во многих словах разных индоевропейских языков: в латышском gaura — «болтовня», в литовском gauti — «выть».");
            listOfEngWords.add(word010);

            //шаблон для новых слов
/*            EngWords word010 = new EngWords();
            word010.setEngWord1("");
            word010.setEngWord2("");
            word010.setEngWord3("");
            word010.setEngWord4("");
            word010.setEngWordPlural1("");
            word010.setEngWordPlural2("");
            word010.setEngSinonim1("");
            word010.setEngEtymology1("");
            word010.setRusWord1("");
            word010.setRusWord2("");
            word010.setRusWord3("");
            word010.setRusWord4("");
            word010.setRusWordPlural1("");
            word010.setRusWordPlural2("");
            word010.setRusSinonim1("");
            word010.setRusEtymology1("");
            listOfEngWords.add(word010);*/
/////////////////////////это десериализация списка юзеров и забор списка слов конкретного юзера//////////////////////////
            File file = new File("users01.bin");

            //проверим, какие слова записались пользователю в список неизвестных слов:

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<User> oldUsersListDeserialized = (ArrayList<User>)ois.readObject();
            //Вытащили из файла список юзеров

            //Создадим тестовое слово, чтобы не было NullPointerException в следующем блоке, добавим просто так одно слово.
/*
            EngWords wordTest = new EngWords();
            word001.setEngWord1("test001");
            word001.setEngWord2("-empty-");
            word001.setEngWord3("-empty-");
            word001.setEngWord4("-empty-");
            word001.setEngWordPlural1("-empty-");
            word001.setEngWordPlural2("-empty-s");
            word001.setEngSinonim1("-empty-");
            word001.setEngEtymology1("-empty-");
            word001.setRusWord1("test001");
            word001.setRusWord2("-empty-");
            word001.setRusWord3("-empty-");
            word001.setRusWord4("-empty-");
            word001.setRusWordPlural1("-empty-");
            word001.setRusWordPlural2("-empty-");
            word001.setRusSinonim1("-empty-");
            word001.setRusEtymology1("-empty-");
*/

            ArrayList<EngWords> listOfUnknownWordsOld = new ArrayList<>();

            //listOfUnknownWordsOld.add(wordTest); //чтобы не было NullPointerException , добавим просто так одно слово.

            User userSerialized01 = new User(); //создадим нового юзера, чтобы записать в него юзера из сериализованного файла.

            //проитерируемся по списку десериализованных юзеров, чтобы сравнить с текущим юзером и если совпал, записать его в переменную userSerialized01
            for(User userSerialized : oldUsersListDeserialized){
                if(Test.user.getName().equals(userSerialized.getName()) & Test.user.getAge() == (userSerialized.getAge())){
                    userSerialized01 = userSerialized;
                }
            }

            //вытащим у этого десериализованного юзера список слов и проитерируемся по нему.
            for(EngWords ew : userSerialized01.getUsersListOfUnknownWords()){
                //добавим каждое слово из списка слов десериализованного юзера в список listOfUnknownWordsOld
                listOfUnknownWordsOld.add(ew);
            }


            ois.close();
            fis.close();
/////////////////////////конец  десериализации списка юзеров с забором списка слов конкретного юзера//////////////////////////

                //проверка: если в этот список попало хоть одно слово (кроме тестового, которое добавили ранее)
            if(listOfUnknownWordsOld.size() > 1){

                //тут удалим наше тестовое слово из списка, чтобы оно не выдавалось пользователю в игре:
/*                for(int iter = 0; iter < listOfUnknownWordsOld.size(); iter++){
                    if (listOfUnknownWordsOld.get(iter).getEngWord1().equals("test001")){
                        listOfUnknownWordsOld.remove(iter);
                    }
                }*/

                Thread.sleep(600);
                ConsoleHelper.writeMessage("Давай сначала повторим слова, которые ты не назвал правильно в прошлый раз");
                Thread.sleep(600);
                wordsGuess2(listOfUnknownWordsOld);

                ConsoleHelper.writeMessage("Хорошо, повторили. Теперь поиграем в слова с полным списком слов!");
                Thread.sleep(600);
                listOfUnknownWords = wordsGuess(listOfEngWords);
            }
            else{
                listOfUnknownWords = wordsGuess(listOfEngWords);
            }


/////////////////////////начало старого кода, без метода wordsGuess();
/*
                while (wantMore) {
                    int r = Test.randomize(); //получаем рандомное число для выбора английского слова из ArrayList<EngWords> listOfEngWords.
                    //ConsoleHelper.writeMessage("рандомное число = " + r); // это проверка, что за рандомное число мы получаем.

                    //этот блок кода нужен чтобы не было ArrayOutOfBounds Exception.
                    if (r >= listOfEngWords.size()) {
                        r = listOfEngWords.size() - 1;
                    }

                    EngWords word = listOfEngWords.get(r); //достаем из ArrayList произвольно одно слово.



                    switch (countWords) {
                        case 0: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Начали. Переводи первое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 1: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи второе слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 2: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи третье слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 3: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи четвертое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 4: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи пятое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 5: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи шестое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        default: {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Хорошо. Переводи " + (countWords + 1) + " слово:");
                            Thread.sleep(600);
                            break;
                        }
                    } //хорошо. переводи 1-е, 2-е ... слово.


                    ConsoleHelper.writeMessage(word.getEngWord1()); //выводим на экран в качестве вопроса английский вариант номер 1 этого произвольного слова.
                    countWords++;

                    //пользователь вводит свой ответ
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String answer = bufferedReader.readLine();
                    answer = answer.toLowerCase();

                    Test.exit(answer);//выход, если напишет exit и т.п.

                    //сравниваем ответ:
                    if (answer.equals(word.getRusWord1()) || answer.equals(word.getRusWord2()) || answer.equals(word.getRusWord3()) || answer.equals(word.getRusWord4()) || answer.equals(word.getRusWordPlural1()) || answer.equals(word.getRusWordPlural2()) || answer.equals(word.getRusSinonim1()) || answer.contains(word.getRusWord1()) || answer.contains(word.getRusWord2()) || answer.contains(word.getRusWord3()) || answer.contains(word.getRusWord4()) || answer.contains(word.getRusWordPlural1()) || answer.contains(word.getRusWordPlural2()) || answer.contains(word.getRusSinonim1())) {
                        Thread.sleep(600);


                        int random = Test.randomize();
                        switch (random) {                                    //говорим пользователю Ура! Правильно!
                            case 0: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ура! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Всё верно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Правильно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Умница! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты мой золотой! Всё правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Да! Да! Все правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ух-ты! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Точно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Всё верно! Умничка!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Да! Ты правильно перевел!");
                                Thread.sleep(1000);
                                break;
                            }
                        }          //Ура! Правильно!

                        countWrightAnswers++;
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                        Thread.sleep(600);

                        if (countWrightAnswers == 3) {
                            gameEngWordsWin();
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                            String answerYesNo = bufferedReader.readLine();
                            answerYesNo = answerYesNo.toLowerCase();

                            Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                            if (Test.yesNo(answerYesNo)) {
                                learnUnknownWords(listOfUnknownWords);
                            }
                            break;
                        }
                        if (countWrightAnswers == -3) {
                            gameEngWordsLoose();
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                            String answerYesNo = bufferedReader.readLine();
                            answerYesNo = answerYesNo.toLowerCase();

                            Test.exit(answerYesNo);//выход, если напишет exit и т.п.


                            if (Test.yesNo(answerYesNo)) {
                                learnUnknownWords(listOfUnknownWords);
                            }

                            break;
                        }

                    } else {

                        int ran = Test.randomize();
                        switch (ran) {                   //говорим пользователю: Нет... не правильно. Минус очко тебе
                            case 0: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет... не правильно. Минус очко тебе");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, это неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты не прав.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты неправильно перевел.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, нет, нет. Этот перевод никуда не годится.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, ты не прав. У этого слова другое значение.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ответ неправильный.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет, всё совсем не так. Неправильно.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Нет. Не то ты написал.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                ConsoleHelper.writeMessage("Ты меня разочаровал. Неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                        }                //Нет... не правильно. Минус очко тебе


                        countWrightAnswers--;
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);

                        if (countWrightAnswers == 3) {
                            gameEngWordsWin();
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                            String answerYesNo = bufferedReader.readLine();
                            answerYesNo = answerYesNo.toLowerCase();

                            Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                            if (Test.yesNo(answerYesNo)) {
                                learnUnknownWords(listOfUnknownWords);
                            }
                            break;
                        }
                        if (countWrightAnswers == -3) {
                            gameEngWordsLoose();
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                            String answerYesNo = bufferedReader.readLine();
                            answerYesNo = answerYesNo.toLowerCase();

                            Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                            if (Test.yesNo(answerYesNo)) {
                                learnUnknownWords(listOfUnknownWords);
                            }
                            break;
                        }

                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Еще попытку хочешь? Да или нет?");
                        Thread.sleep(600);
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();

                        Test.exit(answerYesNo);//выход, если напишет exit и т.п.


                        if (Test.yesNo(answerYesNo)) {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("переведи слово: " + word.getEngWord1());
                            Thread.sleep(600);
                            String answer2 = bufferedReader.readLine();
                            answer2 = answer2.toLowerCase();
                            if (answer2.equals(word.getRusWord1()) || answer2.equals(word.getRusWord2()) || answer2.equals(word.getRusWord3()) || answer2.equals(word.getRusWord4()) || answer2.equals(word.getRusWordPlural1()) || answer2.equals(word.getRusWordPlural2()) || answer2.equals(word.getRusSinonim1()) || answer2.contains(word.getRusWord1()) || answer2.contains(word.getRusWord2()) || answer2.contains(word.getRusWord3()) || answer2.contains(word.getRusWord4()) || answer2.contains(word.getRusWordPlural1()) || answer2.contains(word.getRusWordPlural2()) || answer2.contains(word.getRusSinonim1())) {
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Ура! Теперь правильно!");
                                countWrightAnswers++;
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                                Thread.sleep(600);

                                if (countWrightAnswers == 3) {
                                    gameEngWordsWin();
                                    Thread.sleep(600);
                                    ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                                    String answer3 = bufferedReader.readLine();
                                    answer3 = answer3.toLowerCase();

                                    if (Test.yesNo(answer3)) {
                                        learnUnknownWords(listOfUnknownWords);
                                    }
                                    break;
                                }
                                if (countWrightAnswers == -3) {
                                    gameEngWordsLoose();
                                    Thread.sleep(600);
                                    ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                    String answer4 = bufferedReader.readLine();
                                    answer4 = answer4.toLowerCase();

                                    if (Test.yesNo(answer4)) {
                                        learnUnknownWords(listOfUnknownWords);
                                    }
                                    break;
                                }

                            } else {
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Нет. Не то. Еще минус одно очко.");
                                countWrightAnswers--;
                                listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                                Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Правильный ответ вот такой: " + word.getRusWord1());
                                Thread.sleep(600);

                                if (countWrightAnswers == 3) {
                                    gameEngWordsWin();
                                    Thread.sleep(600);
                                    ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                    String answer5 = bufferedReader.readLine();
                                    answer5 = answer5.toLowerCase();

                                    Test.exit(answer5);//выход, если напишет exit и т.п.

                                    if (Test.yesNo(answer5)) {
                                        learnUnknownWords(listOfUnknownWords);
                                    }
                                    break;
                                }
                                if (countWrightAnswers == -3) {
                                    gameEngWordsLoose();
                                    Thread.sleep(600);
                                    ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                    String answer6 = bufferedReader.readLine();
                                    answer6 = answer6.toLowerCase();

                                    Test.exit(answer6);//выход, если напишет exit и т.п.


                                    if (Test.yesNo(answer6)) {
                                        learnUnknownWords(listOfUnknownWords);
                                    }
                                    break;
                                }
                            }
                        } else {
                            if (word instanceof EngWordsVerb) {

                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Три формы глагола: " + word.getEngWord1() + ", " + ((EngWordsVerb) word).getSecondForm() + ", " + ((EngWordsVerb) word).getThirdForm());
                                listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                                Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                                Thread.sleep(600);
                            } else {
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                                listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                                Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                                Thread.sleep(600);
                            }

                        }
                    }


                }
            }
            */
/////////////////////////конец старого кода, без метода wordsGuess();

            Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.

//////////////////////////////////////!!!!!!!!!!!!Тут нужно добавить сериализацию!!!!!!!!!!!!!!!!!!!!!!!!!!!
//1. Вытащить из файла list юзеров.
            File fileUsers01= new File("users01.bin");
            FileInputStream fis2 = new FileInputStream(fileUsers01);
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            ArrayList<User> oldUsersList = (ArrayList<User>)ois2.readObject();

//2. Удалить из этого листа нашего юзера.
            for(int i = 0; i < oldUsersList.size(); i++){
                User tempUser = oldUsersList.get(i);
                if(tempUser.getName().equals(Test.user.getName()) & tempUser.getAge() == Test.user.getAge()){
                    oldUsersList.remove(i);
                }
            }

//3. Добавить в этот лист нашего юзера с обновленным полем usersListOfUnknownWords
            oldUsersList.add(Test.user);

//4. Обновленный лист сериализовать в файл , затерев старый список юзеров.
            FileOutputStream fos = new FileOutputStream(fileUsers01, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(oldUsersList);                              // пишем в файл объект список юзеров
            fos.close();
            oos.close();

/////////////////////////////////////!!!!конец сериализации////////////////////////////////////////////////
            Test.chat00(); //если вышли из цикла while , то переходим в самый верхний чат.

        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Ошибочка. InterruptedException в методе gameEngWords2(). Но мы идем дальше.");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в методе gameEngWords2(). Но мы идем дальше.");
        }
        catch(ClassNotFoundException cnf){
            ConsoleHelper.writeMessage("Ошибка ClassNotFoundException в методе gameEngWords2(). Но мы идем дальше.");
        }
    }

    public static void gameEngWordsWin(){

        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Поздравляю. Я проиграл. Ты - победитель.");
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
            Thread.sleep(600);
            BufferedReader bufferedReader01 = new BufferedReader(new InputStreamReader(System.in));
            String answerYesNo01 = bufferedReader01.readLine();
            answerYesNo01 = answerYesNo01.toLowerCase();
            if (Test.yesNo(answerYesNo01)) {
                gameEngWords2();
            } else {
                ConsoleHelper.writeMessage("Ладно. Тогда...");
                //Test.chat00();
                return;
            }
        }
        catch(InterruptedException intex){
            ConsoleHelper.writeMessage("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }
        catch(IOException ioe){
            ConsoleHelper.writeMessage("Здесь у нас ошибка ввода вывода в методе gameEngWordsWin(), но мы продолжаем.");
        }

    }

    public static void gameEngWordsLoose(){
        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Хочешь еще попробовать в эту же игру?");
            Thread.sleep(600);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answerYesNo = bufferedReader.readLine();
            answerYesNo = answerYesNo.toLowerCase();
            if (Test.yesNo(answerYesNo)) {
                gameEngWords2();
            } else {
                //Test.chat00();
                return;
            }
        }
        catch(InterruptedException intex){
            ConsoleHelper.writeMessage("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }
        catch(IOException ioe){
            ConsoleHelper.writeMessage("Здесь у нас ошибка ввода вывода в методе gameEngWordsWin(), но мы продолжаем.");
        }
    }

    public static void learnUnknownWords(ArrayList<EngWords> listOfUnknownWords){
        try {
            int countOfWords = 0;
            Thread.sleep(800);
            ConsoleHelper.writeMessage("хорошо. Теперь я буду писать тебе английское слово, ");
            Thread.sleep(1000);
            ConsoleHelper.writeMessage("а потом буду сообщать тебе его перевод на русский язык. ");
            Thread.sleep(1200);
            ConsoleHelper.writeMessage("И буду писать тебе этимологию (то есть происхождение) этого английского слова. Если найду её в Интернете, конечно.");
            Thread.sleep(1000);
            ConsoleHelper.writeMessage("А ты просто запоминай.");
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Итак, начнем!");
            if(listOfUnknownWords.size() > 0) {
                for (EngWords word : listOfUnknownWords) {

                    if(word instanceof EngWordsVerb){
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Английское слово ");
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("-----------------");
                    ConsoleHelper.writeMessage(word.getEngWord1() + ", " + ((EngWordsVerb) word).getSecondForm() + ", " + ((EngWordsVerb) word).getThirdForm());
                    ConsoleHelper.writeMessage("-----------------");
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("означает: ");
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("-----------------");
                    ConsoleHelper.writeMessage(word.getRusWord1());
                    ConsoleHelper.writeMessage("-----------------");
                    Thread.sleep(600);
                        ConsoleHelper.writeMessage("Происхождение этого слова:");
                        ConsoleHelper.writeMessage(word.getEngEtymology1());

                    }
                    else{
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Английское слово ");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("-----------------");
                        ConsoleHelper.writeMessage(word.getEngWord1());
                        ConsoleHelper.writeMessage("-----------------");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("означает: ");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("-----------------");
                        ConsoleHelper.writeMessage(word.getRusWord1());
                        ConsoleHelper.writeMessage("-----------------");
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Происхождение у этого слова такое:");
                        ConsoleHelper.writeMessage(word.getEngEtymology1());
                    }

                    countOfWords++;

                    if(countOfWords < listOfUnknownWords.size()) {
                        ConsoleHelper.writeMessage("Еще слово?");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                        String answer = bufferedReader.readLine();
                        answer = answer.toLowerCase();
                        if (Test.yesNo(answer)) {
                            continue;                                               //может быть тут ошибка?
                        } else {

                            break;
                        }
                    }

                }
                Thread.sleep(600);
                ConsoleHelper.writeMessage("Ну что, позагадывать тебе еще английские слова?");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String answer = bufferedReader.readLine();
                answer = answer.toLowerCase();
                if(Test.yesNo(answer)){
                    gameEngWords2();
                }
                else{
                    ConsoleHelper.writeMessage("Ну тогда...");
                    Test.chat00();
                }
            }
            else{
                ConsoleHelper.writeMessage("Слушай... Оказывается, нет таких слов, которые ты неправильно перевел! Ты крутой!");
            }
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Это InterruptedException в методе learnUnknownWords(), но мы идем дальше.");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Это ошибка ввода-вывода в методе learnUnknownWords(). А мы идем дальше.");
        }
    }

    //вообще этот метод не нужен. т.к список таких слов для каждого юзера будет храниться в поле самого юзера. И сериализация юзера сохранит нам этот список в нужный файл с пользователями.
    //вообще нужно тут сериализовать список списков слов (для каждого юзера свой). И добавлять туда как-то id юзера, чтобы списки идентифицировать.
    public static void seriaUsersUnknownWords(ArrayList<User> usersListOfUnknownWords){ //записываем юзера в файл//умеет записывать, не стирая предыдущие обхекты из файла благодаря конструктору FileOutputStream(File file, boolean append) с append

        try {
            //Здесь запишем в файл list слов, неправильно угаданных пользователем.
            File file02 = new File("usersUnknownWords001.bin");
            FileOutputStream fos = new FileOutputStream(file02, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);     // пишем в файл объект юзера
            oos.writeObject(usersListOfUnknownWords);
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

    /////////////////////////начало отдельного метода по словам.
    public static ArrayList<EngWords> wordsGuess(ArrayList<EngWords> listOfEngWords){
        try {

            ArrayList<EngWords> listOfUnknownWords = new ArrayList<>();
            int countWords = 0;             //создаем счетчик количества загаданных слов.
            int countWrightAnswers = 0;     //счетчик количества правильных ответов
            boolean wantMore = true;
            while (wantMore) {
                int r = Test.randomize(); //получаем рандомное число для выбора английского слова из ArrayList<EngWords> listOfEngWords.

                //этот блок кода нужен чтобы не было ArrayOutOfBounds Exception.
                if (r >= listOfEngWords.size()) {
                    r = listOfEngWords.size() - 1;
                }

                EngWords word = listOfEngWords.get(r); //достаем из ArrayList произвольно одно слово.


                switch (countWords) {
                    case 0: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Начали. Переводи первое слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи второе слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 2: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи третье слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи четвертое слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи пятое слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи шестое слово:");
                        Thread.sleep(600);
                        break;
                    }
                    default: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи " + (countWords + 1) + " слово:");
                        Thread.sleep(600);
                        break;
                    }
                } //хорошо. переводи 1-е, 2-е ... слово.


                ConsoleHelper.writeMessage(word.getEngWord1()); //выводим на экран в качестве вопроса английский вариант номер 1 этого произвольного слова.
                countWords++;

                //пользователь вводит свой ответ
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String answer = bufferedReader.readLine();
                answer = answer.toLowerCase();

                Test.exit(answer);//выход, если напишет exit и т.п.

                //сравниваем ответ:
                if (answer.equals(word.getRusWord1()) || answer.equals(word.getRusWord2()) || answer.equals(word.getRusWord3()) || answer.equals(word.getRusWord4()) || answer.equals(word.getRusWordPlural1()) || answer.equals(word.getRusWordPlural2()) || answer.equals(word.getRusSinonim1()) || answer.contains(word.getRusWord1()) || answer.contains(word.getRusWord2()) || answer.contains(word.getRusWord3()) || answer.contains(word.getRusWord4()) || answer.contains(word.getRusWordPlural1()) || answer.contains(word.getRusWordPlural2()) || answer.contains(word.getRusSinonim1())) {
                    Thread.sleep(600);


                    int random = Test.randomize();
                    switch (random) {                                    //говорим пользователю Ура! Правильно!
                        case 0: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ура! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 1: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Всё верно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 2: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Правильно! Молодец!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 3: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Умница! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 4: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты мой золотой! Всё правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 5: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Да! Да! Все правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 6: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ух-ты! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 7: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Точно! Молодец!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 8: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Всё верно! Умничка!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 9: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Ты правильно перевел!");
                            Thread.sleep(1000);
                            break;
                        }
                    }          //Ура! Правильно!

                    countWrightAnswers++;
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                    Thread.sleep(600);

                    if (countWrightAnswers == 3) {
                        gameEngWordsWin();
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();

                        Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                        if (Test.yesNo(answerYesNo)) {
                            learnUnknownWords(listOfUnknownWords);
                        }
                        break;
                    }
                    if (countWrightAnswers == -3) {
                        gameEngWordsLoose();
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();

                        Test.exit(answerYesNo);//выход, если напишет exit и т.п.


                        if (Test.yesNo(answerYesNo)) {
                            learnUnknownWords(listOfUnknownWords);
                        }

                        break;
                    }

                } else {

                    int ran = Test.randomize();
                    switch (ran) {                   //говорим пользователю: Нет... не правильно. Минус очко тебе
                        case 0: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет... не правильно. Минус очко тебе");
                            Thread.sleep(1000);
                            break;
                        }
                        case 1: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, это неправильный ответ.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 2: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты не прав.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 3: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты неправильно перевел.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 4: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, нет, нет. Этот перевод никуда не годится.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 5: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, ты не прав. У этого слова другое значение.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 6: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ответ неправильный.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 7: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, всё совсем не так. Неправильно.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 8: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет. Не то ты написал.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 9: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты меня разочаровал. Неправильный ответ.");
                            Thread.sleep(1000);
                            break;
                        }
                    }                //Нет... не правильно. Минус очко тебе


                    countWrightAnswers--;
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                    listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                    Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.


                    if (countWrightAnswers == 3) {
                        gameEngWordsWin();
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();

                        Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                        if (Test.yesNo(answerYesNo)) {
                            learnUnknownWords(listOfUnknownWords);
                        }
                        break;
                    }
                    if (countWrightAnswers == -3) {
                        gameEngWordsLoose();
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();

                        Test.exit(answerYesNo);//выход, если напишет exit и т.п.

                        if (Test.yesNo(answerYesNo)) {
                            learnUnknownWords(listOfUnknownWords);
                        }
                        break;
                    }

                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Еще попытку хочешь? Да или нет?");
                    Thread.sleep(600);
                    String answerYesNo = bufferedReader.readLine();
                    answerYesNo = answerYesNo.toLowerCase();

                    Test.exit(answerYesNo);//выход, если напишет exit и т.п.


                    if (Test.yesNo(answerYesNo)) {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("переведи слово: " + word.getEngWord1());
                        Thread.sleep(600);
                        String answer2 = bufferedReader.readLine();
                        answer2 = answer2.toLowerCase();
                        if (answer2.equals(word.getRusWord1()) || answer2.equals(word.getRusWord2()) || answer2.equals(word.getRusWord3()) || answer2.equals(word.getRusWord4()) || answer2.equals(word.getRusWordPlural1()) || answer2.equals(word.getRusWordPlural2()) || answer2.equals(word.getRusSinonim1()) || answer2.contains(word.getRusWord1()) || answer2.contains(word.getRusWord2()) || answer2.contains(word.getRusWord3()) || answer2.contains(word.getRusWord4()) || answer2.contains(word.getRusWordPlural1()) || answer2.contains(word.getRusWordPlural2()) || answer2.contains(word.getRusSinonim1())) {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Ура! Теперь правильно!");
                            countWrightAnswers++;
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                            Thread.sleep(600);

                            if (countWrightAnswers == 3) {
                                gameEngWordsWin();
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно? Если такие были, конечно...");
                                String answer3 = bufferedReader.readLine();
                                answer3 = answer3.toLowerCase();

                                if (Test.yesNo(answer3)) {
                                    learnUnknownWords(listOfUnknownWords);
                                }
                                break;
                            }
                            if (countWrightAnswers == -3) {
                                gameEngWordsLoose();
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                String answer4 = bufferedReader.readLine();
                                answer4 = answer4.toLowerCase();

                                if (Test.yesNo(answer4)) {
                                    learnUnknownWords(listOfUnknownWords);
                                }
                                break;
                            }

                        } else {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Нет. Не то. Еще минус одно очко.");
                            countWrightAnswers--;
                            listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                            Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ вот такой: " + word.getRusWord1());
                            Thread.sleep(600);

                            if (countWrightAnswers == 3) {
                                gameEngWordsWin();
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                String answer5 = bufferedReader.readLine();
                                answer5 = answer5.toLowerCase();

                                Test.exit(answer5);//выход, если напишет exit и т.п.

                                if (Test.yesNo(answer5)) {
                                    learnUnknownWords(listOfUnknownWords);
                                }
                                break;
                            }
                            if (countWrightAnswers == -3) {
                                gameEngWordsLoose();
                                Thread.sleep(600);
                                ConsoleHelper.writeMessage("А давай повторим слова, которые ты не перевел правильно?");
                                String answer6 = bufferedReader.readLine();
                                answer6 = answer6.toLowerCase();

                                Test.exit(answer6);//выход, если напишет exit и т.п.


                                if (Test.yesNo(answer6)) {
                                    learnUnknownWords(listOfUnknownWords);
                                }
                                break;
                            }
                        }
                    } else {
                        if (word instanceof EngWordsVerb) {

                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Три формы глагола: " + word.getEngWord1() + ", " + ((EngWordsVerb) word).getSecondForm() + ", " + ((EngWordsVerb) word).getThirdForm());
                            listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                            Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                            Thread.sleep(600);
                        } else {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                            listOfUnknownWords.add(word); //- добавляем слово в список незнакомых слов для дальнейшего изучения пользователем
                            Test.user.setUsersListOfUnknownWords(listOfUnknownWords); //здесь мы записали в поле юзера список его незнакомых слов.
                            Thread.sleep(600);
                        }

                    }
                }


            }
            return listOfUnknownWords;
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Ошибка InterruptedException в методе wordsGuess() , но мы идем далее.");
        }
        catch (IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в методе wordsGuess() , но мы идем далее.");
        }
        return new ArrayList<EngWords>();    //можеет быть тут кроется ошибка. Возвращаем пустой список.
    }
    /////////////////////////конец отдельного метода по словам.

    //метод для слов из конкретного списка этого юзера.
    public static ArrayList<EngWords> wordsGuess2(ArrayList<EngWords> listOfEngWords){
        try {

            ArrayList<EngWords> listOfUnknownWords = new ArrayList<>();
            int countWords = 0;             //создаем счетчик количества загаданных слов.
            int countWrightAnswers = 0;     //счетчик количества правильных ответов
            boolean wantMore = true;
            while (wantMore) {
                int r = Test.randomize(); //получаем рандомное число для выбора английского слова из ArrayList<EngWords> listOfEngWords.

                //этот блок кода нужен чтобы не было ArrayOutOfBounds Exception.
                if (r >= listOfEngWords.size()) {
                    r = listOfEngWords.size() - 1;
                }

                EngWords word = listOfEngWords.get(r); //достаем из ArrayList произвольно одно слово.


                switch (countWords) {
                    case 0: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Начали. Переводи слово:");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи еще:");
                        Thread.sleep(600);
                        break;
                    }
                    case 2: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи снова:");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи опять:");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Снова переводи:");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи еще слово:");
                        Thread.sleep(600);
                        break;
                    }
                    default: {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("Хорошо. Переводи опять");
                        Thread.sleep(600);
                        break;
                    }
                } //хорошо. переводи 1-е, 2-е ... слово.


                ConsoleHelper.writeMessage(word.getEngWord1()); //выводим на экран в качестве вопроса английский вариант номер 1 этого произвольного слова.
                countWords++;

                //пользователь вводит свой ответ
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String answer = bufferedReader.readLine();
                answer = answer.toLowerCase();

                Test.exit(answer);//выход, если напишет exit и т.п.

                //сравниваем ответ:
                if (answer.equals(word.getRusWord1()) || answer.equals(word.getRusWord2()) || answer.equals(word.getRusWord3()) || answer.equals(word.getRusWord4()) || answer.equals(word.getRusWordPlural1()) || answer.equals(word.getRusWordPlural2()) || answer.equals(word.getRusSinonim1()) || answer.contains(word.getRusWord1()) || answer.contains(word.getRusWord2()) || answer.contains(word.getRusWord3()) || answer.contains(word.getRusWord4()) || answer.contains(word.getRusWordPlural1()) || answer.contains(word.getRusWordPlural2()) || answer.contains(word.getRusSinonim1())) {



                    int random = Test.randomize();
                    switch (random) {                                    //говорим пользователю Ура! Правильно!
                        case 0: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ура! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 1: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Всё верно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 2: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Правильно! Молодец!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 3: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Умница! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 4: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты мой золотой! Всё правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 5: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Да! Да! Все правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 6: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ух-ты! Правильно!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 7: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Точно! Молодец!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 8: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Всё верно! Умничка!");
                            Thread.sleep(1000);
                            break;
                        }
                        case 9: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Да! Ты правильно перевел!");
                            Thread.sleep(1000);
                            break;
                        }
                    }          //Ура! Правильно!

                    countWrightAnswers++;
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                    Thread.sleep(600);

                    if (countWrightAnswers == 3) {
                        gameEngWordsWin2();                            //создать такой же метод без ЕЩЕ РАЗ?

                         break;
                    }
                    if (countWrightAnswers == -3) {
                        gameEngWordsLoose2();                          //создать такой же метод без ЕЩЕ РАЗ?

                        break;
                    }

                } else {

                    int ran = Test.randomize();
                    switch (ran) {                   //говорим пользователю: Нет... не правильно. Минус очко тебе
                        case 0: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет... не правильно. Минус очко тебе");
                            Thread.sleep(1000);
                            break;
                        }
                        case 1: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, это неправильный ответ.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 2: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты не прав.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 3: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты неправильно перевел.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 4: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, нет, нет. Этот перевод никуда не годится.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 5: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, ты не прав. У этого слова другое значение.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 6: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ответ неправильный.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 7: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет, всё совсем не так. Неправильно.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 8: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Нет. Не то ты написал.");
                            Thread.sleep(1000);
                            break;
                        }
                        case 9: {
                            Thread.sleep(1000);
                            ConsoleHelper.writeMessage("Ты меня разочаровал. Неправильный ответ.");
                            Thread.sleep(1000);
                            break;
                        }
                    }                //Нет... не правильно. Минус очко тебе


                    countWrightAnswers--;
                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);

                    if (countWrightAnswers == 3) {
                        gameEngWordsWin2();                                         //создать такой же метод без ЕЩЕ РАЗ?
                                 break;
                    }
                    if (countWrightAnswers == -3) {
                        gameEngWordsLoose2();                                     //создать такой же метод без ЕЩЕ РАЗ?
                        Thread.sleep(600);
                         break;
                    }

                    Thread.sleep(600);
                    ConsoleHelper.writeMessage("Еще попытку хочешь? Да или нет?");
                    Thread.sleep(600);
                    String answerYesNo = bufferedReader.readLine();
                    answerYesNo = answerYesNo.toLowerCase();

                    Test.exit(answerYesNo);//выход, если напишет exit и т.п.


                    if (Test.yesNo(answerYesNo)) {
                        Thread.sleep(600);
                        ConsoleHelper.writeMessage("переведи слово: " + word.getEngWord1());
                        Thread.sleep(600);
                        String answer2 = bufferedReader.readLine();
                        answer2 = answer2.toLowerCase();
                        if (answer2.equals(word.getRusWord1()) || answer2.equals(word.getRusWord2()) || answer2.equals(word.getRusWord3()) || answer2.equals(word.getRusWord4()) || answer2.equals(word.getRusWordPlural1()) || answer2.equals(word.getRusWordPlural2()) || answer2.equals(word.getRusSinonim1()) || answer2.contains(word.getRusWord1()) || answer2.contains(word.getRusWord2()) || answer2.contains(word.getRusWord3()) || answer2.contains(word.getRusWord4()) || answer2.contains(word.getRusWordPlural1()) || answer2.contains(word.getRusWordPlural2()) || answer2.contains(word.getRusSinonim1())) {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Ура! Теперь правильно!");
                            countWrightAnswers++;
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                            Thread.sleep(600);

                            if (countWrightAnswers == 3) {
                                gameEngWordsWin2();                               //создать такой же метод без ЕЩЕ РАЗ?
                             break;
                            }
                            if (countWrightAnswers == -3) {
                                gameEngWordsLoose2();                            //создать такой же метод без ЕЩЕ РАЗ?
                                  break;
                            }

                        } else {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Нет. Не то. Еще минус одно очко.");
                            countWrightAnswers--;
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Количество твоих очков = " + countWrightAnswers);
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ вот такой: " + word.getRusWord1());
                            Thread.sleep(600);

                            if (countWrightAnswers == 3) {
                                gameEngWordsWin2();                          //создать такой же метод без ЕЩЕ РАЗ?
                              break;
                            }
                            if (countWrightAnswers == -3) {
                                gameEngWordsLoose2();                          //создать такой же метод без ЕЩЕ РАЗ?
                                  break;
                            }
                        }
                    } else {
                        if (word instanceof EngWordsVerb) {

                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Три формы глагола: " + word.getEngWord1() + ", " + ((EngWordsVerb) word).getSecondForm() + ", " + ((EngWordsVerb) word).getThirdForm());
                              Thread.sleep(600);
                        } else {
                            Thread.sleep(600);
                            ConsoleHelper.writeMessage("Правильный ответ: " + word.getRusWord1());
                            Thread.sleep(600);
                        }

                    }
                }


            }
            return listOfUnknownWords;      //а это нужно вообще в этом дублированном методе?
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Ошибка InterruptedException в методе wordsGuess() , но мы идем далее.");
        }
        catch (IOException io){
            ConsoleHelper.writeMessage("Ошибка ввода-вывода в методе wordsGuess() , но мы идем далее.");
        }
        return new ArrayList<EngWords>();    //можеет быть тут кроется ошибка. Возвращаем пустой список.
    }


    public static void gameEngWordsWin2(){

        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Поздравляю. Я проиграл. Ты - победитель.");
            Thread.sleep(600);

        }
        catch(InterruptedException intex){
            ConsoleHelper.writeMessage("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }

    }

    public static void gameEngWordsLoose2(){
        try {
            Thread.sleep(600);
            ConsoleHelper.writeMessage("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
            Thread.sleep(600);

        }
        catch(InterruptedException intex){
            ConsoleHelper.writeMessage("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }
    }

}
