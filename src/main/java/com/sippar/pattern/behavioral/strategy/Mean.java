package com.sippar.pattern.behavioral.strategy;

public class Mean implements Statistic{

    @Override
    public double calculate(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
