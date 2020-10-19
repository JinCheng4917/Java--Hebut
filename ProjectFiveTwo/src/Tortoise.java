public class Tortoise extends Thread{
    int sleepTime = 0, liveLength = 0;

    public Tortoise(String name, int sleepTime, int liveLength){
        this.sleepTime = sleepTime;
        this.liveLength = liveLength;
        this.setName(name);
    }

    public void run(){
        while (true){
            liveLength--;
            System.out.println("@_@");
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
            }
            if (liveLength <= 0){
                System.out.println(getName() + "进入死亡状态\n");
                break;
            }
        }
    }
}
