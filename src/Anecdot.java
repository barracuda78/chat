import java.io.*;
import java.util.Scanner;

public class Anecdot implements Serializable {
    private final static String NAME = "анекдот";
    String path;
    public Anecdot(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }
    public String getName(){ return NAME;}

    public void readFromFile(){
        File file = new File(getPath());
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Закончились мои анекдоты, детка...");        }
    }

    public static String wantMoreAnecdot(){

        try {

            int r = Test.randomize();
            switch (r) {
                case 0: {
                    Thread.sleep(3000);
                    System.out.println("Ну что, анекдот еще хочешь?");
                    Thread.sleep(1000);
                    break;
                }
                case 1: {
                    Thread.sleep(3000);
                    System.out.println("Ну что? Рассказать еще анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 2: {
                    Thread.sleep(3000);
                    System.out.println("давай еще анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 3: {
                    Thread.sleep(3000);
                    System.out.println("Рассказать еще один анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 4: {
                    Thread.sleep(1000);
                    System.out.println("Хочешь, еще один анекдот расскажу?");
                    Thread.sleep(1000);
                    break;
                }
                case 5: {
                    Thread.sleep(1000);
                    System.out.println("Давай еще один анекдот, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 6: {
                    Thread.sleep(1000);
                    System.out.println("Ну что, еще хочешь анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 7: {
                    Thread.sleep(1000);
                    System.out.println("Давай еще анекдот расскажу, а?");
                    Thread.sleep(1000);
                    break;
                }
                case 8: {
                    Thread.sleep(1000);
                    System.out.println("Рассказать еще один анекдот?");
                    Thread.sleep(1000);
                    break;
                }
                case 9: {
                    Thread.sleep(1000);
                    System.out.println("Рассказать тебе ещё анекдот, а?");
                    Thread.sleep(1000);
                    break;
                }
            }


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String answer = bufferedReader.readLine();
            if (answer.equals("да") || answer.equals("ага") || answer.equals("угу") || answer.equals("конечно") || answer.equals("давай")|| answer.equals("без базара")|| answer.equals("анекдот")|| answer.equals("еще")|| answer.equals("ещё")|| answer.equals("анегдот")|| answer.contains("анек")) {
                return "да";
            } else if (answer.equals("yes") || answer.equals("yeah") || answer.equals("yep")) {
                return "да";
            } else if (answer.contains("yes") || answer.contains("yeah") || answer.contains("yep")) {
                return "да";
            } else if (answer.contains("да") || answer.contains("ага") || answer.contains("угу") || answer.contains("конечно")) {
                return "да";
            } else if (answer.contains("no") || answer.contains("not") || answer.contains("nop") || answer.contains("не") || answer.equals("не надо") || answer.equals("не хочу") || answer.contains("достал") || answer.contains("задолбал") || answer.contains("надоел") || answer.contains("заткнись")) {
                return "нет";
            } else if (answer.contains("сказку") || answer.contains("сказк") || answer.contains("сказочк") || answer.contains("сказание") || answer.equals("fairytale") || answer.equals("tsle") ) {
                Test.fairytaleNew();
            } else if (answer.contains("загадк") || answer.contains("загадочк") || answer.contains("riddle") || answer.equals("загадку") || answer.equals("загадочку") ) {
                Test.riddleNew();
            } else if (answer.contains("выход") || answer.contains("exit") || answer.contains("выйти")) {
                Anecdot.exit();
            } else return "нет";

        }
        catch(InterruptedException ie){
            System.out.println("Я ждал, ждал... и не дождался!");
        }
        catch(IOException io){
            System.out.println("Ошибочка. Ввода-вывода. Что делать. А мы дальше работаем.");
        }

        return "нет"; //Вот убрать это и убрать try-catch - и тогда все заработает!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public static void exit(){
        Test.exit();
        return;
    }

}
