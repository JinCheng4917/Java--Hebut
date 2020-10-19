package function;

import entity.Student;
import studentInterface.Average;

import java.util.ArrayList;

public class FirstGetAverage implements Average {
    double javaScore = 0.0;
    double allJavaScore;
    double javaScoreAverage;

    @Override
    public double getAverage(int number, ArrayList<Double> javaScores) {
        javaScores.forEach( oneJavaScore -> {
            javaScore += oneJavaScore;
        });
        allJavaScore = javaScore;
        javaScoreAverage = allJavaScore/number;
        return javaScoreAverage;
    }
}
