import java.io.*;
import java.util.Scanner;

public class Fairytale implements Serializable {
    private final static String NAME = "сказку";
    String path;
    public Fairytale(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }
    public String getName(){ return NAME;}

    public void readFromFile(Fairytale fairytale){
        File file = new File(fairytale.getPath());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                ConsoleHelper.writeMessage(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            ConsoleHelper.writeMessage("Закончились мои сказочки, детка...");        }
    }

    public String toString(){
        return "Сказка: путь: " + this.path +"имя: " + NAME + "";
    }

    public static boolean wantMore(){
        try {
            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, еще хочешь сказочку?");
                    Thread.sleep(1000);
                    break;
                }
                case 1: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ещё сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Что, ещё сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, хочешь еще разок сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Еще будешь читать сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, давай еще разочек расскажу сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Как ты смотришь на то, чтобы повторить? Еще раз сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Хочешь еще сказку?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну что, давай-ка ещё разок сказочку, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    ConsoleHelper.writeMessage("Ну, что скажешь? Еще разок сказочку рассказать?");
                    Thread.sleep(1000);
                    break;
                }
            }

            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answer = ConsoleHelper.readString();
            answer = answer.trim().toLowerCase();
            if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай") || answer.equals("погнали")||answer.equals("сказку")||answer.equals("сказочку")) {
                return true;
            } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
                return true;
            } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")||answer.equals("сказку")||answer.equals("сказочк")||answer.equals("сказк")) {
                return true;
            } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")) {
                return true;
            } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.equals("неа") || answer.equals("достал") || answer.equals("надоел") || answer.equals("задолбал") || answer.equals("скучно")) {
                return false;
            } else if (answer.contains("не надо") || answer.contains("не хочу") || answer.contains("неа") || answer.contains("достал") || answer.contains("надоел") || answer.contains("задолбал") || answer.contains("скучно")) {
                return false;
            } else if (answer.contains("анекдот") || answer.contains("funn") || answer.contains("анегдот")) {
                Test.anecdoteNew();
            } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
                Test.riddleNew();
            } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
                Fairytale.exit();
            } else return false;
        }
        catch(InterruptedException i){
            ConsoleHelper.writeMessage("Слишком уж долго тебя ждать...");
        }
        catch(IOException io){
            ConsoleHelper.writeMessage("Мне тут говорят, что ошибка ввода-вывода какая-то... Но мы продолжаем!");
        }
        return false; ////////////////////////////////////////вот если ретерн фолс убрать, то это может быть поможет...
    }

    public static void exit(){
        Test.exit("exit");
        return;
    }
}
