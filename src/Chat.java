import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
            System.out.println("Хе-хе... А тебе нравится учиться чему-то новому?");
            Thread.sleep(600);
        }
        catch(InterruptedException ie){
            System.out.println("Очень-очень-очень долго тебя ждать...");
        }
    }

    public static void chat002music(){
        try {
            Thread.sleep(600);
            System.out.println("Я люблю музыку. При том очень разную. А тебе какая музыка нравится?");
            Thread.sleep(600);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answerWhatMusic = bufferedReader.readLine();
            if(answerWhatMusic.contains("рэп")){
                System.out.println("О! Круто! А какие рэп-исполнители тебе нравятся? Я имею ввиду российских рэперов!");
            }
            else if(answerWhatMusic.contains("рок")){
                System.out.println("О! Круто! А какие рок-исполнители тебе нравятся? Я имею ввиду российских рокеров!");
            }
            else if(answerWhatMusic.contains("поп")){
                System.out.println("О! Круто! А какие поп-исполнители тебе нравятся? Я имею ввиду российских исполнителей!");
            }
            else if(answerWhatMusic.contains("метал")||answerWhatMusic.contains("metal")||answerWhatMusic.contains("dark")||answerWhatMusic.contains("black")||answerWhatMusic.contains("doom")){
                System.out.println("О! Круто! А какие металлические коллективы тебе нравятся?");
            }
        }
        catch(InterruptedException ie){
            System.out.println("Очень-очень-очень долго тебя ждать...");
        }
        catch(IOException io){
            System.out.println("Это еще одна ошибка ввода-вывода в chat002music()");
        }
    }

    public static void chat003english(){
        try {
            Thread.sleep(600);
            System.out.println("О! Я люблю английский язык! Давай поиграем с тобой в английские слова?");
            Thread.sleep(2500);
            System.out.println("Я пишу слово на английском, а ты переводишь его на русский и пишешь мне!");
            Thread.sleep(2000);
            System.out.println("Если перевод правильный - ты получаешь один балл!");
            Thread.sleep(2000);
            System.out.println("Если неправильный - ты получаешь МИНУС один балл...");
            Thread.sleep(2500);
            System.out.println("Если в итоге ты набираешь +5 баллов - твоя победа! Если набираешь минус 5 баллов - моя!");
            Thread.sleep(1000);
            System.out.println("Ну что, поиграем?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answer = bufferedReader.readLine();

            if(Test.yesNo(answer)){
                //запускаем игру в англ слова - отдельный метод.
                gameEngWords();
            }
            else{
                //не запускаем игру и возвращаемся в чат
                Test.chat00();
            }
        }
        catch(InterruptedException ie){
            System.out.println("Очень-очень-очень долго тебя ждать...");
        }
        catch(IOException io){
            System.out.println("Это еще одна ошибка ввода-вывода в chat002music()");
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
                            System.out.println("Хорошо. Начали. Переводи первое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 1: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи второе слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 2: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи третье слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 3: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи четвертое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 4: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи пятое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        case 5: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи шестое слово:");
                            Thread.sleep(600);
                            break;
                        }
                        default: {
                            Thread.sleep(600);
                            System.out.println("Хорошо. Переводи " + (countWords + 1) + " слово:");
                            Thread.sleep(600);
                            break;
                        }
                    } //хорошо. переводи 1-е, 2-е ... слово.

                    System.out.println(key);
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
                                System.out.println("Ура! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                System.out.println("Да! Всё верно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                System.out.println("Правильно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                System.out.println("Умница! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                System.out.println("Ты мой золотой! Всё правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                System.out.println("Да! Да! Да! Все правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                System.out.println("Ух-ты! Правильно!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                System.out.println("Точно! Молодец!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                System.out.println("Всё верно! Умничка!");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                System.out.println("Да! Ты правильно перевел!");
                                Thread.sleep(1000);
                                break;
                            }
                        }          //Ура! Правильно!


                        countWrightAnswers++;
                        Thread.sleep(600);
                        System.out.println("Количество твоих очков = " + countWrightAnswers);
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
                                System.out.println("Нет... не правильно. Минус очко тебе");
                                Thread.sleep(1000);
                                break;
                            }
                            case 1: {
                                Thread.sleep(1000);
                                System.out.println("Нет, это неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 2: {
                                Thread.sleep(1000);
                                System.out.println("Ты не прав.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 3: {
                                Thread.sleep(1000);
                                System.out.println("Ты неправильно перевел.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 4: {
                                Thread.sleep(1000);
                                System.out.println("Нет, нет, нет. Этот перевод никуда не годится.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 5: {
                                Thread.sleep(1000);
                                System.out.println("Нет, ты не прав. У этого слова другое значение.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 6: {
                                Thread.sleep(1000);
                                System.out.println("Ответ неправильный.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 7: {
                                Thread.sleep(1000);
                                System.out.println("Нет, всё совсем не так. Неправильно.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 8: {
                                Thread.sleep(1000);
                                System.out.println("Нет. Не то ты написал.");
                                Thread.sleep(1000);
                                break;
                            }
                            case 9: {
                                Thread.sleep(1000);
                                System.out.println("Ты меня разочаровал. Неправильный ответ.");
                                Thread.sleep(1000);
                                break;
                            }
                        }                //Нет... не правильно. Минус очко тебе


                        countWrightAnswers--;
                        Thread.sleep(600);
                        System.out.println("Количество твоих очков = " + countWrightAnswers);

                        if(countWrightAnswers == 5){
                            gameEngWordsWin();
                            break;
                        }
                        if(countWrightAnswers == -5){
                            gameEngWordsLoose();
                            break;
                        }

                        Thread.sleep(600);
                        System.out.println("Еще попытку хочешь? Да или нет?");
                        Thread.sleep(600);
                        String answerYesNo = bufferedReader.readLine();
                        answerYesNo = answerYesNo.toLowerCase();
                        if (Test.yesNo(answerYesNo)) {
                            Thread.sleep(600);
                            System.out.println("переведи слово: " + key);
                            Thread.sleep(600);
                            String answer2 = bufferedReader.readLine();
                            if (answer2.equals(value)) {
                                Thread.sleep(600);
                                System.out.println("Ура! Теперь правильно!");
                                countWrightAnswers++;
                                Thread.sleep(600);
                                System.out.println("Количество твоих очков = " + countWrightAnswers);
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
                                System.out.println("Нет. Не то. Еще минус одно очко.");
                                countWrightAnswers--;
                                Thread.sleep(600);
                                System.out.println("Количество твоих очков = " + countWrightAnswers);
                                Thread.sleep(600);
                                System.out.println("Правильный ответ вот такой: " + value);
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
                            System.out.println("Правильный ответ: " + value);
                            Thread.sleep(600);
                        }
                    }

                    //это раздражает. Постоянный вопрос. Игра есть игра. 5 слов задаем, не спрашивая. Пока выключаю.
/*                    if(countWrightAnswers!=5 || countWrightAnswers !=-5) {
                        Thread.sleep(600);
                        System.out.println("Ну что, хочешь еще одно слово перевести?");
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
                        System.out.println("Поздравляю. Я проиграл. Ты - победитель.");
                        Thread.sleep(600);
                        System.out.println("Хочешь еще попробовать в эту же игру?");
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
                        System.out.println("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
                        Thread.sleep(600);
                        System.out.println("Хочешь еще попробовать в эту же игру?");
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
                System.out.println("Поздравляю. Я проиграл. Ты - победитель.");
                Thread.sleep(600);
                System.out.println("Хочешь еще попробовать в эту же игру?");
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
                System.out.println("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
                Thread.sleep(600);
                System.out.println("Хочешь еще попробовать в эту же игру?");
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
                System.out.println("Что-то мне надоело играть...");
                Test.chat00();
            }

            Test.chat00(); //если вышли из цикла while , то переходим в самый верхний чат.

        }
        catch(InterruptedException ie){
            System.out.println("Интерраптед ошибочка в методе gameEngWords(). Но мы идем далее.");
        }
        catch(IOException io){
            System.out.println("Ошибка ввода-вывода в методе gameEngWords(). Но мы идем далее.");
        }
    }

    public static void gameEngWordsWin(){

        try {
            Thread.sleep(600);
            System.out.println("Поздравляю. Я проиграл. Ты - победитель.");
            Thread.sleep(600);
            System.out.println("Хочешь еще попробовать в эту же игру?");
            Thread.sleep(600);
            BufferedReader bufferedReader01 = new BufferedReader(new InputStreamReader(System.in));
            String answerYesNo01 = bufferedReader01.readLine();
            answerYesNo01 = answerYesNo01.toLowerCase();
            if (Test.yesNo(answerYesNo01)) {
                gameEngWords();
            } else {
                System.out.println("Ладно. Тогда...");
                Test.chat00();
            }
        }
        catch(InterruptedException intex){
            System.out.println("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }
        catch(IOException ioe){
            System.out.println("Здесь у нас ошибка ввода вывода в методе gameEngWordsWin(), но мы продолжаем.");
        }

    }

    public static void gameEngWordsLoose(){
        try {
            Thread.sleep(600);
            System.out.println("Поздравь меня. Я победил. Тебе нужно подучить английские слова!");
            Thread.sleep(600);
            System.out.println("Хочешь еще попробовать в эту же игру?");
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
        catch(InterruptedException intex){
            System.out.println("Это InterruptedException в методе gameEngWordsWin(), но мы продолжаем.");
        }
        catch(IOException ioe){
            System.out.println("Здесь у нас ошибка ввода вывода в методе gameEngWordsWin(), но мы продолжаем.");
        }
    }

}
