package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import Client.Client;

public class Server {
    private static int PORT = 4500;

    public Server(int port, String name) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("等待客户端连接");
            while (true) {
                Socket socket = serverSocket.accept();
                new Client(name, socket);
            }
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        new Server(PORT, "服务端");
    }

}
