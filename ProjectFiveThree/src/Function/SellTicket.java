package Function;

public class SellTicket {
   private static int  Five = 1,  Ten = 0, Twenty = 0;
   private int count, wealth;

    /**
     * 判断是否进行售票
     * @param count 票的张数
     * @param wealth 钱数
     */
   public synchronized void sell(int count, int wealth) {
       if (wealth == 20 && count == 2) {
           Twenty++;//先收下钱
           if(Ten<1)
           {
               try {
                   System.out.println("赵等待");
                   wait();
               } catch (InterruptedException e) {}
           }
           Ten--;//把钱找给他
           notify();//唤醒
           System.out.println("找给赵1张10元，赵结束"+"   此时售票员手中的票为:5元有" + Five + "张,10元有："+ Ten +"张，20元有："+ Twenty + "张");
       }
       else  if (wealth == 20 && count == 1) {
           Twenty++;//先收下钱
           if(Ten<1 || Five < 1)
           {
               try {
                   System.out.println("钱等待");
                   wait();
               } catch (InterruptedException e) {}
           }
           Ten--;//把钱找给他
           Five--;
           notify();//唤醒
           System.out.println("找给钱1张10元，1张5元，钱结束"+"   此时售票员手中的票为:5元有" + Five + "张,10元有："+ Ten +"张，20元有："+ Twenty + "张");
       }
       else  if (wealth == 10 && count == 1) {
           Ten++;//先收下钱
           if(Five < 1)
           {
               try {
                   System.out.println("孙等待");
                   wait();
               } catch (InterruptedException e) {}
           }
           Five--;
           notify();//唤醒
           System.out.println("找给孙1张5元，孙结束"+"   此时售票员手中的票为:5元有" + Five + "张,10元有："+ Ten +"张，20元有："+ Twenty + "张");
       }
       else  if (wealth == 10 && count == 2) {
           Ten++;
           System.out.println("李结束"+"   此时售票员手中的票为:5元有" + Five + "张,10元有："+ Ten +"张，20元有："+ Twenty + "张");
           notify();
       }
       else  if (wealth == 5 && count == 1) {
           Five++;
           System.out.println("周结束"+"   此时售票员手中的票为:5元有" + Five + "张,10元有："+ Ten +"张，20元有："+ Twenty + "张");
           notify();
       }
   }
}
