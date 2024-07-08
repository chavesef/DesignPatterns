package com.sippar.pattern.creational.builder;

public class Assembler {
    private Builder builder;

    public Assembler(Builder builder) {
        this.builder = builder;
    }

    public Setup mount() {
        builder.reset();
        builder.buildKeyboard();
        builder.buildMouse();
        builder.buildScreen();

        return builder.getResult();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
