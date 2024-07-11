package com.sippar.pattern.behavioral.chain;

public class Currency {
    private int amount;

    public Currency(int amount){
        this.amount=amount;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
