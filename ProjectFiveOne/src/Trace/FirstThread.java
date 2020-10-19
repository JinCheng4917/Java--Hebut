package Trace;

public class FirstThread implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i%2 == 1){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("1-100之间奇数个数为： " + count);
    }
}
