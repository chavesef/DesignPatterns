package com.sippar.pattern.behavioral.strategy;

public class App {
    public static void main(String[] args) {
        double[] elements = new double[100];
        for (int i = 0; i < 100; i++) {
            elements[i] = Math.random();
        }
        DataSet dataSet = new DataSet(elements, new Mean());
        System.out.println("Calculating mean: " + dataSet.analysis());
        dataSet.setStatistic(new Variance());
        System.out.println("Calculating variance: " + dataSet.analysis());
        dataSet.setStatistic(new StandardDeviation());
        System.out.println("Calculating standard deviation: " + dataSet.analysis());
    }
}
