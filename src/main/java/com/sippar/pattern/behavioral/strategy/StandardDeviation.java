package com.sippar.pattern.behavioral.strategy;

public class StandardDeviation implements Statistic{

    @Override
    public double calculate(double[] values) {
        double variance = new Variance().calculate(values);
        return Math.sqrt(variance);
    }
}
