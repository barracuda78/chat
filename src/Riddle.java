import java.io.*;
import java.util.Scanner;

public class Riddle implements Serializable {
    public static int globalCount; //счетчик добавления новых загадок в лист. Используется в методе riddleNew() в Test
    public int count;              //счетчик количества загаданной конкретной загадки при неправильном ответе. Не более трех раз. Тогда сообщаем правильный ответ юзеру.
    public final static String NAME = "загадку";
    String path;
    private String path2;
    private String answer;
    private String answerEng;
    private String finalAnswer;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;

    public  void setPath2(String path2){
        this.path2 = path2;
    }
    public String getPath2() {
        return path2;
    }

    public void setFinalAnswer(String finalAnswer) {
        this.finalAnswer = finalAnswer;
    }
    public String getFinalAnswer() {
        return finalAnswer;
    }
    public void setAnswerEng(String answerEng){
        this.answerEng = answerEng;
    }
    public String getAnswerEng(){
        return answerEng;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public String getAnswer(){
        return answer;
    }
    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }
    public void setOne(String one){
        this.one = one;
    }
    public void setTwo(String two){
        this.two = two;
    }
    public void setThree(String three){
        this.three = three;
    }
    public void setFour(String four){
        this.four = four;
    }
    public void setFive(String five){
        this.five = five;
    }

    public Riddle(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }
    public String getName(){ return NAME;}

    public void readFromFile(Riddle riddle){

        int r = Test.randomize();
        r = r%2;
        switch(r){
            case 0: {
                try {
                    File file = new File(riddle.getPath());
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        System.out.println(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("Закончились мои загадки, детка...");        }
                catch (NullPointerException n){
                    n.printStackTrace();
                }
                break;
            }
            case 1: {
                File file = new File(riddle.getPath2());
                try {
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        System.out.println(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("Все, детка... Кина не будет. Электричество кончилось.");        }
                break;
            }
        }
    }

    public void otgadka(Riddle riddle) {

        try {

            if (riddle.count == 3) {
                riddle.count = 0;
                return;
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String riddleAnswer = bufferedReader.readLine();
            riddleAnswer = riddleAnswer.toLowerCase();
////////////////////////приведение ответов riddleAnswer////////////////////////////////////////////////
            if (riddleAnswer.contains("пять") || riddleAnswer.contains("5") || riddleAnswer.contains("пятак") || riddleAnswer.contains("пятерка")) {
                riddleAnswer = "5";

            } else if (riddleAnswer.contains("five") || riddleAnswer.contains("fife")) {
                riddleAnswer = "five";
            } else if (riddleAnswer.contains("хлеб") || riddleAnswer.contains("булка") || riddleAnswer.contains("батон")) {
                riddleAnswer = "хлеб";
            } else if (riddleAnswer.contains("bread") || riddleAnswer.contains("loaf")) {
                riddleAnswer = "bread";

            } else if (riddleAnswer.contains("ю") || riddleAnswer.contains("буква ю") || riddleAnswer.contains("букваю") || riddleAnswer.contains("юбуква") || riddleAnswer.contains("ю буква")) {
                riddleAnswer = "ю";
            } else if (riddleAnswer.contains("перец") || riddleAnswer.contains("перчик") || riddleAnswer.contains("переч")) {
                riddleAnswer = "перец";
            } else if (riddleAnswer.contains("peper") || riddleAnswer.contains("pepper")) {
                riddleAnswer = "pepper";

            } else if (riddleAnswer.contains("чай") || riddleAnswer.contains("чаек") || riddleAnswer.contains("чаёк") || riddleAnswer.contains("чаи")) {
                riddleAnswer = "чай";
            } else if (riddleAnswer.contains("tea")) {
                riddleAnswer = "tea";

            } else if (riddleAnswer.contains("сырник") || riddleAnswer.contains("творожник") || riddleAnswer.contains("сырнички") || riddleAnswer.contains("сырничек") || riddleAnswer.contains("cheasecake")) {
                riddleAnswer = "сырник";
            } else if (riddleAnswer.contains("бутер") || riddleAnswer.contains("бутерброд") || riddleAnswer.contains("сэндвич") || riddleAnswer.contains("бутик")) {
                riddleAnswer = "бутерброд";
            } else if (riddleAnswer.contains("sandwich")) {
                riddleAnswer = "sandwich";

            } else if (riddleAnswer.contains("масло") || riddleAnswer.contains("сливочное") || riddleAnswer.contains("маслице") || riddleAnswer.contains("маслицо")) {
                riddleAnswer = "масло";
            } else if (riddleAnswer.contains("buter") || riddleAnswer.contains("butter")) {
                riddleAnswer = "butter";

            } else if (riddleAnswer.contains("мед") || riddleAnswer.contains("мёд") || riddleAnswer.contains("медок") || riddleAnswer.contains("пчелиный")) {
                riddleAnswer = "мед";
            } else if (riddleAnswer.contains("honey")) {
                riddleAnswer = "honey";
            } else if (riddleAnswer.contains("пельмени") || riddleAnswer.contains("пельмень") || riddleAnswer.contains("пельмешки") || riddleAnswer.contains("пельмешек") || riddleAnswer.contains("пель")) {
                riddleAnswer = "пельмени";
            }
            /////////////////////////////////////////////////////////////////////////
            if ((riddle.getAnswer()).equals(riddleAnswer)) {
                riddle.correct001();
                riddle.wasEasy();
            } else if (this.getAnswerEng().equals(riddleAnswer)) {
                riddle.correct002();
                riddle.wasEasy();
            } else {
                uncorrect();
                riddle.oneMoreTime();              //тут дать попробовать еще раз (два раза).

                //  while(riddle.count < 3) {
                riddle.count++;
                otgadka(riddle);

                //  }
                riddle.giveCorrectAnswer();         //потом дать правильный ответ
                riddle.wasEasy();
            }
            //потом спросить, хочет ли еще загадку.
            if (wantMore()) {
                Test.riddleNew();           //здесь ошибка. Он не учитывает загаданную загадку и может загадать ту же. Нужно удалять загаданную загадку из массива. Массив загадок создавать в другом методе.
            } else {
                Test.dealer();
            }

        }
        catch(IOException io){
            System.out.println("Ну вот. Говорят, ошибка ввода-вывода. Идем дальше, пофиг.");
        }
        catch(InterruptedException ie){
            System.out.println("Слишком долго. Это слишком долго, дружок!");
        }


    }


    public void correct001(){

        try {

            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("Молодчинка! Правильно!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    System.out.println("что ж...");
                    Thread.sleep(1000);
                    System.out.println("хм...");
                    Thread.sleep(1000);
                    System.out.println("ДААА!!! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    System.out.println("ну...");
                    Thread.sleep(1000);
                    System.out.println("домустим...");
                    Thread.sleep(1000);
                    System.out.println("Да не домустим. А все правильно! ДА! Правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    System.out.println("...а-ха-ха!!!");
                    Thread.sleep(1000);
                    System.out.println("...о-хо-хо!!!");
                    Thread.sleep(1000);
                    System.out.println("Хотя, ничего смешного. Просто твой ответ - самый правильный из всех ответов!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("Да, ты угадал. Это правильно.");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("ну...");
                    Thread.sleep(1000);
                    System.out.println("я не хочу тебя расстраивать...");
                    Thread.sleep(1000);
                    System.out.println("И не буду! Ведь твой ответ - ПРАВИЛЬНЫЙ!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("да что ж ты будешь делать?");
                    Thread.sleep(1000);
                    System.out.println("Ну, повезло тебе. Повезло. ПРАВИЛЬНО!");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("да...");
                    Thread.sleep(1000);
                    System.out.println("да...");
                    Thread.sleep(1000);
                    System.out.println("...и еще раз ... ДА!!! ЭТО ПРАВИЛЬНО!!!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("хе-хе");
                    Thread.sleep(1000);
                    System.out.println("кхе-кхе...");
                    Thread.sleep(1000);
                    System.out.println("Угадал ты. Молодец. Правильно!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("ну, знаешь...");
                    Thread.sleep(1000);
                    System.out.println("это уж слишком!");
                    Thread.sleep(1000);
                    System.out.println("Ты угадал! Молодец! Правильно!");
                    Thread.sleep(600);
                    break;
                }

            }

        }
        catch(InterruptedException i){
            System.out.println("Слишком, слишком долго я тебя ждал!!!");
        }
    }
    public void correct002(){

        try {

            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    System.out.println("эээ...");
                    Thread.sleep(1000);
                    System.out.println("мммм...");
                    Thread.sleep(1000);
                    System.out.println("Oh! You speak English! Ты говоришь на английском! Круто!\n Твой ответ - правильный, молодец!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    System.out.println("что ж...");
                    Thread.sleep(1000);
                    System.out.println("англичанин...");
                    Thread.sleep(1000);
                    System.out.println("ДААА!!! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    System.out.println("Oh yes!!!");
                    Thread.sleep(1000);
                    System.out.println("ДА!!!");
                    Thread.sleep(1000);
                    System.out.println("Ти давать очинь правильний ответ! Маладэс!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    System.out.println("...а-ха-ха!!!");
                    Thread.sleep(1000);
                    System.out.println("...о-хо-хо!!!");
                    Thread.sleep(1000);
                    System.out.println("Английский знаешь? Хорошо! И ответ твой - правильный!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("инглишь");
                    Thread.sleep(1000);
                    System.out.println("это гуд...");
                    Thread.sleep(1000);
                    System.out.println("Ответ - правильный. Принимается.");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("ну...");
                    Thread.sleep(1000);
                    System.out.println("я не хочу тебя расстраивать...");
                    Thread.sleep(1000);
                    System.out.println("Но твой английский - просто супер! И ответ - правильный!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("...");
                    Thread.sleep(1000);
                    System.out.println("да что ж ты будешь делать?");
                    Thread.sleep(1000);
                    System.out.println("Английский? Молодец. И с ответом - тоже МОЛОДЕЦ! Правильный! )");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("да...");
                    Thread.sleep(1000);
                    System.out.println("да...");
                    Thread.sleep(1000);
                    System.out.println("...и еще раз ... YES!!! ЭТО ПРАВИЛЬНО!!! Кстати, отдельное спасибо за английский!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("Oh yes!");
                    Thread.sleep(1000);
                    System.out.println("My baby!");
                    Thread.sleep(1000);
                    System.out.println("This is correct! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("ну, знаешь, мой френд...");
                    Thread.sleep(1000);
                    System.out.println("это уж ту матч!");
                    Thread.sleep(1000);
                    System.out.println("Ты и английский знаешь!!! Молодец! Правильно!");
                    Thread.sleep(600);
                    break;
                }

            }

        }
        catch(InterruptedException i){
            System.out.println("Очень долго. Все это оооочень долго...");
        }
    }
    public void uncorrect() {


        try {
            int r = Test.randomize();
                 switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        System.out.println("что ж...");
                        Thread.sleep(1000);
                        System.out.println("Знаешь что..?");
                        Thread.sleep(1000);
                        System.out.println("Хе-хе... Твой ответ - неправильный!");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("А вот и не угадал! Твой ответ - неправильный!");
                        Thread.sleep(600);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        System.out.println("Нет, дружище!");
                        Thread.sleep(1000);
                        System.out.println("Так не пойдет...");
                        Thread.sleep(1000);
                        System.out.println("И знаешь, почему? Потому что это неправильный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        System.out.println("...а-ха-ха!!!");
                        Thread.sleep(1000);
                        System.out.println("...о-хо-хо!!!");
                        Thread.sleep(1000);
                        System.out.println("Нет. Нет. И еще раз: нет! Это неправильно!");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("А вот и не угадал!");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        System.out.println("ну...");
                        Thread.sleep(1000);
                        System.out.println("я не хочу тебя расстраивать...");
                        Thread.sleep(1000);
                        System.out.println("Но у меня тут записан совсем другой ответ...");
                        Thread.sleep(600);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("да что ж ты будешь делать?");
                        Thread.sleep(1000);
                        System.out.println("Ну не везет тебе, и все тут! Неправильно!");
                        Thread.sleep(600);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        System.out.println("да...");
                        Thread.sleep(1000);
                        System.out.println("да...");
                        Thread.sleep(1000);
                        System.out.println("...и еще раз ... НЕТ! Потому что это неправильный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        System.out.println("хе-хе");
                        Thread.sleep(1000);
                        System.out.println("кхе-кхе...");
                        Thread.sleep(1000);
                        System.out.println("а вот и не угадал! Это неверный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        System.out.println("ну, знаешь...");
                        Thread.sleep(1000);
                        System.out.println("это уж слишком!");
                        Thread.sleep(1000);
                        System.out.println("Я от тебя такого не ожидал! Это неверный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                 }
            }
        catch(InterruptedException i){
                System.out.println("Слишком долго тебя ждать...");
        }

    }
    public void giveCorrectAnswer(){
        try {
            Thread.sleep(1000);
            System.out.println(this.getFinalAnswer());
        }
        catch(InterruptedException i){
            System.out.println("Почему тебя так дого ждать?");
        }
    }
    public void oneMoreTime(){

        try {

            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    System.out.println("что ж...");
                    Thread.sleep(1000);
                    System.out.println("Знаешь что..?");
                    Thread.sleep(1000);
                    System.out.println("Попробуй-ка еще разок то же самое: ");
                    this.readFromFile(this);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    System.out.println("ну вот...");
                    Thread.sleep(1000);
                    System.out.println("У меня просто нет слов...");
                    Thread.sleep(1000);
                    System.out.println("Давай-ка еще разок то же самое тебе задам: ");
                    this.readFromFile(this);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    System.out.println("нет...");
                    Thread.sleep(1000);
                    System.out.println("Так дело не пойдет...");
                    Thread.sleep(1000);
                    System.out.println("Ну давай, напряги мозги. В последний раз! А?");
                    this.readFromFile(this);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    System.out.println("Ну что ж ты будешь делать...");
                    Thread.sleep(1000);
                    System.out.println("Хоть джигу пляши от таких ответов...");
                    Thread.sleep(1000);
                    System.out.println("Даю тебе еще один шанс: отвечай правильно!");
                    this.readFromFile(this);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("вот напасть-то...");
                    Thread.sleep(1000);
                    System.out.println("не ожидал от тебя такого...");
                    Thread.sleep(1000);
                    System.out.println("Подумай еще раз и отвечай:");
                    this.readFromFile(this);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("не... совсем не то...");
                    Thread.sleep(1000);
                    System.out.println("Загадаю еще раз, слушай внимательно:");
                    this.readFromFile(this);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("Нет. Не то. Попробуй еще разок:");
                    this.readFromFile(this);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("я не согласен с твоим ответом.");
                    Thread.sleep(1000);
                    System.out.println("Да и никто бы не согласился. Давай еще раз, а?");
                    this.readFromFile(this);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("Совсем не то. Давай, отвечай по-нормальному! Еще раз загадаю то же самое:");
                    this.readFromFile(this);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("ну вот... Приехали...");
                    Thread.sleep(1000);
                    System.out.println("Попробуй, пожалуйста, еще разочек отгадать!");
                    this.readFromFile(this);
                    break;
                }
            }
        }
        catch(InterruptedException i){
            System.out.println("Слишком долго я тебя ждал, друг...");
        }

    }
    public static boolean wantMore(){
    try {
        int r = Test.randomize();
        switch (r) {
            case 0: {
                Thread.sleep(1000);
                System.out.println("Ну что, еще хочешь?");
                Thread.sleep(1000);
                break;
            }
            case 1: {
                Thread.sleep(1000);
                System.out.println("Ещё?");
                Thread.sleep(1000);
                break;
            }
            case 2: {
                Thread.sleep(1000);
                System.out.println("Что, ещё?");
                Thread.sleep(1000);
                break;
            }
            case 3: {
                Thread.sleep(1000);
                System.out.println("Ну что, хочешь еще разок?");
                Thread.sleep(1000);
                break;
            }
            case 4: {
                Thread.sleep(1000);
                System.out.println("Еще будешь?");
                Thread.sleep(1000);
                break;
            }
            case 5: {
                Thread.sleep(1000);
                System.out.println("Ну что, давай еще разочек?");
                Thread.sleep(1000);
                break;
            }
            case 6: {
                Thread.sleep(1000);
                System.out.println("Как ты смотришь на то, чтобы повторить? Еще раз?");
                Thread.sleep(1000);
                break;
            }
            case 7: {
                Thread.sleep(1000);
                System.out.println("Будешь еще?");
                Thread.sleep(1000);
                break;
            }
            case 8: {
                Thread.sleep(1000);
                System.out.println("Ну что, давай-ка ещё разок, а?");
                Thread.sleep(1000);
                break;
            }
            case 9: {
                Thread.sleep(1000);
                System.out.println("Ну, что скажешь? Еще разок?");
                Thread.sleep(1000);
                break;
            }
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = bufferedReader.readLine();
        if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай") || answer.equals("погнали")|| answer.equals("загадку")|| answer.equals("загадочку")) {
            return true;
        } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
            return true;
        } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")) {
            return true;
        } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")|| answer.contains("загадк")) {
            return true;
        } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.equals("неа") || answer.equals("достал") || answer.equals("надоел") || answer.equals("задолбал") || answer.equals("скучно")) {
            return false;
        } else if (answer.contains("не надо") || answer.contains("не хочу") || answer.contains("неа") || answer.contains("достал") || answer.contains("надоел") || answer.contains("задолбал") || answer.contains("скучно")) {
            return false;
        } else if (answer.contains("анекдот") || answer.contains("funn") || answer.contains("анегдот")) {
            Test.anecdoteNew();
        } else if (answer.contains("сказк") || answer.contains("fairytale") || answer.contains("сказочк")) {
            Test.fairytaleNew();
        } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
            Riddle.exit();
        } else return false;
    }
    catch(InterruptedException i){
        System.out.println("Слишком уж долго тебя ждать...");
    }
    catch(IOException io){
        System.out.println("Мне тут говорят, что ошибка ввода-вывода какая-то... Но мы продолжаем!");
    }
        return false; ////////////////////////////////////////вот если ретерн фолс убрать, то это может быть поможет...
    }
    public void wasEasy(){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            int r = Test.randomize();
            switch(r){
                case 0: {
                    Thread.sleep(1000);
                    System.out.println("что ж... Это было легко, правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 1:{
                    Thread.sleep(1000);
                    System.out.println("ну что? Легкотня?");
                    Thread.sleep(1000);
                    break;
                }
                case 2:{
                    Thread.sleep(1000);
                    System.out.println("Для детского садика? Не очень сложно, да?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    System.out.println("Я такие в детском садике разгадывал. Легкотня, правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("Даже ребенок бы решил. Правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("Загадочка - просто детский лепет. Правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("Согласись, легкотня на постном масле?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("Такие бы загадки на ЕГЭ загадывали, да? Легкотня ведь?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("Эта была совсем простая, согласись!?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("Таких простых загадок тебе еще в жизни не загадывали, да?");
                    Thread.sleep(1000);
                    break;
                }
            }

            String itWasEasy = bufferedReader.readLine();
            itWasEasy = itWasEasy.toLowerCase();
            if (itWasEasy.contains("не") || itWasEasy.contains("нет") || itWasEasy.contains("Не") || itWasEasy.contains("Нет") || itWasEasy.contains("неочень") || itWasEasy.contains("Неочень") || itWasEasy.contains("No") || itWasEasy.contains("no")) {
                Thread.sleep(600);
                System.out.println(this.getTwo());
                Thread.sleep(600);
            } else if (itWasEasy.contains("правда") || itWasEasy.contains("легко") || itWasEasy.contains("да") || itWasEasy.contains("точно")) {
                Thread.sleep(600);
                System.out.println(this.getOne());
                Thread.sleep(600);

            } else {
                Thread.sleep(600);
                System.out.println(this.getThree());
                Thread.sleep(600);
            }
        }catch(IOException i){
            i.printStackTrace();
        }
        catch(InterruptedException in){
            in.printStackTrace();
        }

    }

public String toString(){
        return "Ответ: \n" + this.getAnswer() + "условие один: \n" + this.getOne() + "первый путь: \n" + this.getPath()+ "второй путь: \n" + this.getPath2();
}

public static void exit(){
        Test.exit("exit");
        return;
    }
}
