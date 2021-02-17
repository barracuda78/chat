package com.barracuda;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.net.SocketAddress;


public class Connection implements Closeable {
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }


    public void send(Message message) throws IOException{
        synchronized (out){
            out.writeObject(message);
        }
    }


    public Message receive() throws IOException, ClassNotFoundException{
        Message message;
        synchronized (in) {
            message = (Message) in.readObject();
        }
        return message;
    }

    //    Метод SocketAddress getRemoteSocketAddress(), возвращающий удаленный адрес сокетного соединения.
    public SocketAddress getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress();
    }


    @Override
    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
