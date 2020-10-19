package Mypackage;										//声明存放类的包
import java.util.*;										//引用java.util包
public class Test_YMD {
    private int year,mouth,day;
    public static void main(String args[]) {

    }
    public Test_YMD(int y,int m,int d) {
        year=y;
        mouth=(((m>=1)&(m<=12))?m:1);
        day=(((d>=1)&(d<=31))?d:1);
    }
    public Test_YMD() {
        this(0,0,0);
    }
    public static int thisyear() {
        return Calendar.getInstance().get(Calendar.YEAR);//返回当年年份
    }
    public int year() {
        return year;
    }
    public String toString() {
        return year+"-"+mouth+"-"+day;//返回转化为字符串的年-月-日
    }
}