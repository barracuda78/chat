package com.barracuda;

import java.io.Serializable;

public class Message implements Serializable {


    private final MessageType type;
    private final String data;
    private final String senderName;

    public Message(MessageType type){
        this.type = type;
        data = null;
        senderName = null;
    }

    public Message(MessageType type, String data){
        this.type = type;
        this.data = data;
        senderName = null;
    }

    public Message(MessageType type, String data, String senderName){
        this.type = type;
        this.data = data;
        this.senderName = senderName;
    }


    public MessageType getType() {
        return type;
    }

    public String getData(){
        return data;
    }

    public String getSenderName(){
        return senderName;
    }

}
