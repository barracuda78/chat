package com.barracuda.bot;

import com.barracuda.ConsoleHelper;
import com.barracuda.client.Client;

import java.io.*;
import java.util.ArrayList;
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
//      ArrayList<User> oldUsersList = new ArrayList<>();
//      //ArrayList oldUsersList = new ArrayList();
//        ArrayList<EngWords> list = new ArrayList<>();
//
//        EngWords word001 = new EngWords();
//        word001.setEngWord1("friend");
//        word001.setEngWord2("fellow");
//        word001.setEngWord3("-empty-");
//        word001.setEngWord4("-empty-");
//        word001.setEngWordPlural1("friends");
//        word001.setEngWordPlural2("fellows");
//        word001.setEngSinonim1("-empty-");
//        word001.setEngEtymology1("нет этимологии на английском");
//        word001.setRusWord1("друг");
//        word001.setRusWord2("приятель");
//        word001.setRusWord3("-empty-");
//        word001.setRusWord4("товарищ");
//        word001.setRusWordPlural1("друзья");
//        word001.setRusWordPlural2("приятели");
//        word001.setRusSinonim1("бро");
//        word001.setRusEtymology1("нет этимологии на русском");
//        list.add(word001);
//
//        user.setUsersListOfUnknownWords(list);
//        user.setAge(111);
//        user.setName("Курдалы");
//        user.setLogin("111");
//        user.setPassword("111");
//        oldUsersList.add(user);
//        try {
//                File file = new File("users01.bin");
//                FileOutputStream fos = new FileOutputStream(file, false);
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                oos.writeObject(oldUsersList);                              // пишем в файл объект список юзеров
//                oos.flush();
//                fos.close();
//                oos.close();
//            ConsoleHelper.writeMessage("Список пользователей oldUsersList с одним пользователем  " + user.toString() + " записан в файл.");
//            ////////////////запишем в другой файл usersCount001.bin кол-во пользователей = 1
//            File file02 = new File("usersCount001.bin");
//            FileOutputStream fosCount = new FileOutputStream(file02, false);
//            ObjectOutputStream oosCount = new ObjectOutputStream(fosCount);     // пишем в файл кол-во юзеров
//            int countUsers = 1; //Запишем единичку в файл подсчета пользователей, т.к. до этого мы записала в файл одного (первого) пользователя
//            oosCount.writeInt(countUsers);   //запишем в файл количество пользователей = 1.
//            ConsoleHelper.writeMessage("кол-во юзеров записано в файл.");
//            oosCount.flush();
//            oosCount.close();
//            fosCount.close();
//
//
//            ConsoleHelper.writeMessage("проверим, какие слова записались пользователю в список неизвестных слов:");
//
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ArrayList<User> oldUsersListDeserialized = null;
//            System.out.println("вытаскиваем: ");
//            Object o = ois.readObject();
//            System.out.println("вытащили в Object o");
//            oldUsersListDeserialized = (ArrayList<User>) o;
//
//            ConsoleHelper.writeMessage("Вытащили из файла список юзеров с одним юзером Курдалы.");
//
//            ArrayList<EngWords> listOfUnknownWordsOld = new ArrayList<>();
//            for(User userSerialized : oldUsersListDeserialized){
//                if(user.getName().equals(userSerialized.getName()) & user.getAge() == (userSerialized.getAge())){
//                    listOfUnknownWordsOld = userSerialized.getUsersListOfUnknownWords();
//                    ConsoleHelper.writeMessage("записали список слов нашего юзера в переменную listOfUnknownWordsOld");
//                    ConsoleHelper.writeMessage("выведем прочитанный из файла список пользователей на экран: ");
//                    ConsoleHelper.writeMessage(userSerialized.toString());
//                }
//
//                ConsoleHelper.writeMessage("Выведем слова из списка слов юзера на экран: ");
//                for(EngWords word : userSerialized.getUsersListOfUnknownWords()){
//                    ConsoleHelper.writeMessage(word.toString());
//                }
//            }
//
//            ois.close();
//            fis.close();
//
//         }
//        catch(FileNotFoundException fnf){
//            com.barracuda.ConsoleHelper.writeMessage("Файл не найден. Идем далее.");
//        }
//        catch (IOException ioe) {
//            com.barracuda.ConsoleHelper.writeMessage("Ошибка ввода-вывода");
//            ioe.printStackTrace();
//        }
//        catch(ClassNotFoundException cnf){
//            com.barracuda.ConsoleHelper.writeMessage("Ошибка ClassNotFoundException в тестовой записи пользователя в main");
//            System.out.println(cnf.getMessage());
//            cnf.printStackTrace();
//        }
///////////////////////////Конец тестовой записи юзера и числа юзеров в файлы.

        //Greeting.whatIsYourName();
        try {
            Greeting.greeting(user);
            Deal.dealer();
            Util.exit("exit"); //по идее это должен быть выход из программы....
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
