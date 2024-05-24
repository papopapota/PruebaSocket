package com.cibertec;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int PORT = 13;
    public Server(){
       try (ServerSocket serverSocket = new ServerSocket(PORT);) {
            System.out.println("1|Server started on port " + PORT);
            while (true) {
                System.out.println("2|Waiting for client connection: " );
                Socket clienSocket = serverSocket.accept();
                System.out.println("3|New client connected: " + clienSocket.getInetAddress().getHostAddress());
                
                System.out.println("4|Client Complete");
                clienSocket.close();
                System.out.println("5|Client disconnected");
            }
        } catch (IOException e) {
        // TODO: handle exception
            e.printStackTrace();
        } 
    }
    public static void main(String[] args) {
        new Server();
    }
}
