package Trace;

public class SecondThread implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i%2 == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间偶数个数为： " + count);
    }
}
