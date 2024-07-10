package com.sippar.pattern.behavioral.strategy;

public class DataSet {
    private double[] elements;
    private Statistic statistic;

    public DataSet(double[] elements, Statistic statistic) {
        this.elements = elements;
        this.statistic = statistic;
    }

    public double analysis(){
        if(statistic!=null){
            return statistic.calculate(elements);
        }
        return 0;
    }

    public double[] getElements() {
        return elements;
    }

    public void setElements(double[] elements) {
        this.elements = elements;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }
}
