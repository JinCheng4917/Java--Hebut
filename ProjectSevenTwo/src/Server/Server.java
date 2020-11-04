package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static int port = 4500;
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket( port);
            System.out.println("等待客户端连接");
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("服务端连接成功");
            Scanner scanner = new Scanner(System.in);
            String serverInput;
            do {
                serverInput = bufferedReader.readLine();
                System.out.println("接收到客户端消息");
                if (!serverInput.equals("客户端连接成功")) {
                    System.out.println(serverInput);
                    System.out.println("向客户端发送消息");
                    printWriter.println(scanner.nextLine());
                }
            }while (!serverInput.equals("send"));
            bufferedReader.close();
            printWriter.close();
            socket.close();

        }catch (IOException e) {

        }
    }

}
