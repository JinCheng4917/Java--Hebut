package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;

import javax.swing.*;


public class Client extends JFrame implements ActionListener, Runnable {
    private static int PORT = 4500;
    private String name;
    private JTextArea textArea;
    private JTextField textField;
    private PrintWriter printWriter;
    private JButton[] buttons;
    private Socket socket;

    public Client(String name, Socket socket) throws IOException {
        super("通讯窗口 " + name + InetAddress.getLocalHost() + ":" + socket.getLocalPort());
        this.setBounds(320, 240, 400, 240);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.textArea = new JTextArea();
        this.textArea.setEditable(false);
        this.getContentPane().add(new JScrollPane(this.textArea));

        JToolBar toolBar = new JToolBar();
        this.getContentPane().add(toolBar, "South");
        toolBar.add(this.textField = new JTextField(30));
        String[] buttonStr = {"发送", "离线"};
        buttons = new JButton[buttonStr.length];
        for (int i = 0; i < buttonStr.length; i++) {
            toolBar.add(buttons[i] = new JButton(buttonStr[i]));
            buttons[i].addActionListener(this);
        }
        this.setVisible(true);
        this.name = name;
        this.socket = socket;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            this.printWriter = new PrintWriter(socket.getOutputStream(), true);
            this.printWriter.println(name);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "连接" + bufferedReader.readLine() + "成功";
            while (line != null && !line.endsWith("Bye")) {
                textArea.append(line + "\r\n");
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            this.printWriter.close();
            socket.close();
            buttons[0].setEnabled(false);
            buttons[1].setEnabled(false);
        } catch (IOException e) {

        }
    }

    public Client(String name, String host, int port) throws IOException {
        this(name, new Socket(host, port));
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("发送")) ;
        {
            this.printWriter.println(name + "说： " + textField.getText());
            this.textArea.append("向服务端发送：" + textField.getText() + "\n");
            textField.setText("");
        }
        if (actionEvent.getActionCommand().equals("离线")) {
            this.textArea.append("本机离线\n");
            this.printWriter.println(name + "离线\n" + "Bye\n");
            buttons[0].setEnabled(false);
            buttons[1].setEnabled(false);
        }
    }

    public static void main(String[] args) {
        try {
            new Client("客户端" + new Random().nextInt(), "127.0.0.1", PORT);
            new Client("客户端" + new Random().nextInt(), "127.0.0.1", PORT);
            new Client("客户端" + new Random().nextInt(), "127.0.0.1", PORT);
        } catch (IOException e) {

        }
    }
}
