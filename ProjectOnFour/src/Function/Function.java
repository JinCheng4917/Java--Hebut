package Function;

public class Function {
    private int  returnNumber;
    public int getNumber(int number){
        int result=0; //定义因子变量和，初始值0
        for(int j=1;j<number;j++){
            if(number%j==0){
                result+=j;
            }
        }//内层循环结束；
        if(result==number){
            this.returnNumber = number;
        }
        return returnNumber;
    }
}
