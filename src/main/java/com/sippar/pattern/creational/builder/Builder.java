package com.sippar.pattern.creational.builder;

public interface Builder {
    public void reset();
    public void buildScreen();
    public void buildKeyboard();
    public void buildMouse();
    public Setup getResult();
}
