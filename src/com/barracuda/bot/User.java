package com.barracuda.bot;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String name;
    private int id;
    private int age;
    private static int generalIdCount = 0;
    private ArrayList<EngWords> usersListOfUnknownWords;
    private String login;
    private String password;

    public User(){
        this.id = generalIdCount;
        generalIdCount++;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id++;

    }

    public String toString(){
        String usr = "Имя: " + this.name + ", Возраст: " + this.age + ", id: " +  this.id ;
        return usr;
    }

    public ArrayList<EngWords> getUsersListOfUnknownWords() {
        return usersListOfUnknownWords;
    }

    public void setUsersListOfUnknownWords(ArrayList<EngWords> usersListOfUnknownWords) {
        this.usersListOfUnknownWords = usersListOfUnknownWords;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
