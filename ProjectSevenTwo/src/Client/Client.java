package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static int port = 4500;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", port);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("客户端连接成功");
            String clientInput;
            Scanner scanner = new Scanner(System.in);
            do {
                clientInput = bufferedReader.readLine();
                System.out.println("接收到服务端消息");
                System.out.println(clientInput);
                System.out.println("向服务端发送消息");
                printWriter.println(scanner.nextLine());
            }while (!clientInput.equals("send"));
            bufferedReader.close();
            printWriter.close();
            socket.close();

        }catch (IOException e) {

        }
    }

}
