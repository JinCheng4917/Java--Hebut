package Main;

import Trace.FirstThread;
import Trace.SecondThread;

public class ProjectFiveOne {

    public static void main(String[] args) {
        System.out.println("程序开始运行");
        FirstThread firstThread = new FirstThread();
        Thread theFirstThread = new Thread(firstThread);
        SecondThread secondThread = new SecondThread();
        Thread theSecondThread = new Thread(secondThread);
        //奇数
        theFirstThread.start();
        //偶数
        theSecondThread.start();
    }
}
