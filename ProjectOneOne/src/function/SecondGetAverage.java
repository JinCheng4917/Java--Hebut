package function;

import studentInterface.Average;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondGetAverage implements Average {

    double theJavaScore = 0.0;
    double allJavaScore;
    double javaScoreAverage;
    ArrayList<Double> getJavaScore;
    @Override
    public double getAverage(int number, ArrayList<Double> javaScore) {
        this.getJavaScore = javaScore;
        Collections.sort(getJavaScore);
        if (number > 2){
            getJavaScore.remove(0);
            getJavaScore.remove(number-2);
            getJavaScore.forEach( oneJavaScore -> {
                theJavaScore += oneJavaScore;
            });
            allJavaScore = theJavaScore;
            javaScoreAverage = allJavaScore/(number -2);
        } else {
            System.out.println("输入的人数不大于2，故方法二(去掉一个最高分和一个最低分后，再将总分求平均)不能正常执行，采用方法一进行处理");
            getJavaScore.forEach( oneJavaScore -> {
                theJavaScore += oneJavaScore;
            });
            allJavaScore = theJavaScore;
            javaScoreAverage = allJavaScore/number;
        }

        return javaScoreAverage;
    }
}
