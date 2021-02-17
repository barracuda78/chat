package com.barracuda.bot;

import com.barracuda.ConsoleHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Riddle implements Serializable {
    public static int globalCount; //счетчик добавления новых загадок в лист. Используется в методе riddleNew() в com.barracuda.bot.Main
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
                int r = Util.randomize();

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
            ConsoleHelper.writeMessage("ошибка InterruptedException в методе riddleNew(). Но мы можем продолжать!");
        }

    }

    public void readFromFile(Riddle riddle){

        int r = Util.randomize();
        r = r%2;
        switch(r){
            case 0: {
                try {
                    File file = new File(riddle.getPath());
                    Scanner scanner = new Scanner(file);
                    while(scanner.hasNextLine()){
                        ConsoleHelper.writeMessage(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    ConsoleHelper.writeMessage("Закончились мои загадки, детка...");        }
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
                        ConsoleHelper.writeMessage(scanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    ConsoleHelper.writeMessage("Все, детка... Кина не будет. Электричество кончилось.");        }
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

            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String riddleAnswer = ConsoleHelper.readString();
            riddleAnswer = riddleAnswer.trim().toLowerCase();
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
                riddleNew();           //здесь ошибка. Он не учитывает загаданную загадку и может загадать ту же. Нужно удалять загаданную загадку из массива. Массив загадок создавать в другом методе.
            } else {
                Main.dealer();
            }

        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Ну вот. Говорят, ошибка ввода-вывода. Идем дальше, пофиг.");
        }
        catch(InterruptedException ie){
            ConsoleHelper.writeMessage("Слишком долго. Это слишком долго, дружок!");
        }


    }


    public void correct001(){

        try {

            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Молодчинка! Правильно!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("что ж...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("хм...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ДААА!!! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("домустим...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Да не домустим. А все правильно! ДА! Правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...а-ха-ха!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...о-хо-хо!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хотя, ничего смешного. Просто твой ответ - самый правильный из всех ответов!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Да, ты угадал. Это правильно.");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("я не хочу тебя расстраивать...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("И не буду! Ведь твой ответ - ПРАВИЛЬНЫЙ!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да что ж ты будешь делать?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну, повезло тебе. Повезло. ПРАВИЛЬНО!");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...и еще раз ... ДА!!! ЭТО ПРАВИЛЬНО!!!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("хе-хе");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("кхе-кхе...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Угадал ты. Молодец. Правильно!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну, знаешь...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("это уж слишком!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ты угадал! Молодец! Правильно!");
                    Thread.sleep(600);
                    break;
                }

            }

        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Слишком, слишком долго я тебя ждал!!!");
        }
    }
    public void correct002(){

        try {

            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("эээ...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("мммм...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Oh! You speak English! Ты говоришь на английском! Круто!\n Твой ответ - правильный, молодец!");
                    Thread.sleep(600);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("что ж...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("англичанин...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ДААА!!! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Oh yes!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ДА!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ти давать очинь правильний ответ! Маладэс!");
                    Thread.sleep(600);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...а-ха-ха!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...о-хо-хо!!!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Английский знаешь? Хорошо! И ответ твой - правильный!");
                    Thread.sleep(600);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("инглишь");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("это гуд...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ответ - правильный. Принимается.");
                    Thread.sleep(600);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("я не хочу тебя расстраивать...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Но твой английский - просто супер! И ответ - правильный!");
                    Thread.sleep(600);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да что ж ты будешь делать?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Английский? Молодец. И с ответом - тоже МОЛОДЕЦ! Правильный! )");
                    Thread.sleep(600);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("да...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("...и еще раз ... YES!!! ЭТО ПРАВИЛЬНО!!! Кстати, отдельное спасибо за английский!");
                    Thread.sleep(600);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Oh yes!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("My baby!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("This is correct! Это правильный ответ!");
                    Thread.sleep(600);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну, знаешь, мой френд...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("это уж ту матч!");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ты и английский знаешь!!! Молодец! Правильно!");
                    Thread.sleep(600);
                    break;
                }

            }

        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Очень долго. Все это оооочень долго...");
        }
    }
    public void uncorrect() {


        try {
            int r = Util.randomize();
                 switch (r) {
                    case 0: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("что ж...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Знаешь что..?");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Хе-хе... Твой ответ - неправильный!");
                        Thread.sleep(600);
                        break;
                    }
                    case 1: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("А вот и не угадал! Твой ответ - неправильный!");
                        Thread.sleep(600);
                        break;
                    }
                    case 2: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Нет, дружище!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Так не пойдет...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("И знаешь, почему? Потому что это неправильный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 3: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...а-ха-ха!!!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...о-хо-хо!!!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Нет. Нет. И еще раз: нет! Это неправильно!");
                        Thread.sleep(600);
                        break;
                    }
                    case 4: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("А вот и не угадал!");
                        Thread.sleep(600);
                        break;
                    }
                    case 5: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("ну...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("я не хочу тебя расстраивать...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Но у меня тут записан совсем другой ответ...");
                        Thread.sleep(600);
                        break;
                    }
                    case 6: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("да что ж ты будешь делать?");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Ну не везет тебе, и все тут! Неправильно!");
                        Thread.sleep(600);
                        break;
                    }
                    case 7: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("да...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("да...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("...и еще раз ... НЕТ! Потому что это неправильный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 8: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("хе-хе");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("кхе-кхе...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("а вот и не угадал! Это неверный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                    case 9: {
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("ну, знаешь...");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("это уж слишком!");
                        Thread.sleep(1000);
                        ConsoleHelper.writeMessage("Я от тебя такого не ожидал! Это неверный ответ!");
                        Thread.sleep(600);
                        break;
                    }
                 }
            }
        catch(InterruptedException i){
                ConsoleHelper.writeMessage("Слишком долго тебя ждать...");
        }

    }
    public void giveCorrectAnswer(){
        try {
            Thread.sleep(1000);
            ConsoleHelper.writeMessage(this.getFinalAnswer());
        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Почему тебя так дого ждать?");
        }
    }
    public void oneMoreTime(){

        try {

            int r = Util.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("что ж...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Знаешь что..?");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Попробуй-ка еще разок то же самое: ");
                    this.readFromFile(this);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну вот...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("У меня просто нет слов...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Давай-ка еще разок то же самое тебе задам: ");
                    this.readFromFile(this);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("нет...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Так дело не пойдет...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну давай, напряги мозги. В последний раз! А?");
                    this.readFromFile(this);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что ж ты будешь делать...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хоть джигу пляши от таких ответов...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Даю тебе еще один шанс: отвечай правильно!");
                    this.readFromFile(this);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("вот напасть-то...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("не ожидал от тебя такого...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Подумай еще раз и отвечай:");
                    this.readFromFile(this);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("не... совсем не то...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Загадаю еще раз, слушай внимательно:");
                    this.readFromFile(this);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Нет. Не то. Попробуй еще разок:");
                    this.readFromFile(this);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("я не согласен с твоим ответом.");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Да и никто бы не согласился. Давай еще раз, а?");
                    this.readFromFile(this);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Совсем не то. Давай, отвечай по-нормальному! Еще раз загадаю то же самое:");
                    this.readFromFile(this);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну вот... Приехали...");
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Попробуй, пожалуйста, еще разочек отгадать!");
                    this.readFromFile(this);
                    break;
                }
            }
        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Слишком долго я тебя ждал, друг...");
        }

    }
    public static boolean wantMore(){
    try {
        int r = Util.randomize();
        switch (r) {
            case 0: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ну что, еще хочешь?");
                Thread.sleep(1000);
                break;
            }
            case 1: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ещё?");
                Thread.sleep(1000);
                break;
            }
            case 2: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Что, ещё?");
                Thread.sleep(1000);
                break;
            }
            case 3: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ну что, хочешь еще разок?");
                Thread.sleep(1000);
                break;
            }
            case 4: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Еще будешь?");
                Thread.sleep(1000);
                break;
            }
            case 5: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ну что, давай еще разочек?");
                Thread.sleep(1000);
                break;
            }
            case 6: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Как ты смотришь на то, чтобы повторить? Еще раз?");
                Thread.sleep(1000);
                break;
            }
            case 7: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Будешь еще?");
                Thread.sleep(1000);
                break;
            }
            case 8: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ну что, давай-ка ещё разок, а?");
                Thread.sleep(1000);
                break;
            }
            case 9: {
                Thread.sleep(1000);
                ConsoleHelper.writeMessage("Ну, что скажешь? Еще разок?");
                Thread.sleep(1000);
                break;
            }
        }

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = ConsoleHelper.readString();
        answer = answer.trim().toLowerCase();
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
            Main.anecdoteNew();
        } else if (answer.contains("сказк") || answer.contains("fairytale") || answer.contains("сказочк")) {
            Main.fairytaleNew();
        } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
            Riddle.exit();
        } else return false;
    }
    catch(InterruptedException i){
        ConsoleHelper.writeMessage("Слишком уж долго тебя ждать...");
    }
//    catch(IOException io){
//        ConsoleHelper.writeMessage("Мне тут говорят, что ошибка ввода-вывода какая-то... Но мы продолжаем!");
//    }
        return false; ////////////////////////////////////////вот если ретерн фолс убрать, то это может быть поможет...
    }
    public void wasEasy(){

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {

            int r = Util.randomize();
            switch(r){
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("что ж... Это было легко, правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 1:{
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("ну что? Легкотня?");
                    Thread.sleep(1000);
                    break;
                }
                case 2:{
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Для детского садика? Не очень сложно, да?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Я такие в детском садике разгадывал. Легкотня, правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Даже ребенок бы решил. Правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Загадочка - просто детский лепет. Правда?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Согласись, легкотня на постном масле?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Такие бы загадки на ЕГЭ загадывали, да? Легкотня ведь?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Эта была совсем простая, согласись!?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Таких простых загадок тебе еще в жизни не загадывали, да?");
                    Thread.sleep(1000);
                    break;
                }
            }

            String itWasEasy = ConsoleHelper.readString();
            itWasEasy = itWasEasy.trim().toLowerCase();
            if (itWasEasy.contains("не") || itWasEasy.contains("нет") || itWasEasy.contains("Не") || itWasEasy.contains("Нет") || itWasEasy.contains("неочень") || itWasEasy.contains("Неочень") || itWasEasy.contains("No") || itWasEasy.contains("no")) {
                Thread.sleep(600);
                ConsoleHelper.writeMessage(this.getTwo());
                Thread.sleep(600);
            } else if (itWasEasy.contains("правда") || itWasEasy.contains("легко") || itWasEasy.contains("да") || itWasEasy.contains("точно")) {
                Thread.sleep(600);
                ConsoleHelper.writeMessage(this.getOne());
                Thread.sleep(600);

            } else {
                Thread.sleep(600);
                ConsoleHelper.writeMessage(this.getThree());
                Thread.sleep(600);
            }
//        }catch(IOException i){
//            i.printStackTrace();
        }
        catch(InterruptedException in){
            in.printStackTrace();
        }

    }

public String toString(){
        return "Ответ: \n" + this.getAnswer() + "условие один: \n" + this.getOne() + "первый путь: \n" + this.getPath()+ "второй путь: \n" + this.getPath2();
}

public static void exit(){
        Main.exit("exit");
        return;
    }
}
