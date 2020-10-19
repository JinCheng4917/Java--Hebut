package Entity;

import Function.SellTicket;

public class Person extends Thread{

    String name;
    static SellTicket sellTicket = new SellTicket();

    public Person(String name) {
        this.name = name;
    }
    public void run() {
        //同步方法
        synchronized (sellTicket) {
            if (this.name.equals("赵")) sellTicket.sell(2,20);
            else if (this.name.equals("钱")) sellTicket.sell(1,20);
            else if (this.name.equals("孙")) sellTicket.sell(1,10);
            else if (this.name.equals("李")) sellTicket.sell(2,10);
            else if (this.name.equals("周")) sellTicket.sell(1,5);
        }
    }
}
