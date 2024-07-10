package com.sippar.pattern.behavioral.strategy;

public class Variance implements Statistic{

    @Override
    public double calculate(double[] values) {
        double sum = 0;
        double mean = new Mean().calculate(values);
        for (double value : values) {
            sum += Math.pow(value - mean, 2);
        }
        return sum / values.length;
    }
}
