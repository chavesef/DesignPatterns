package com.sippar.pattern.creational.builder;

public class Domestic implements Builder{
    private Setup result;

    @Override
    public void reset() {
        result = new Setup();
    }

    @Override
    public void buildScreen() {
        result.setScreenBrightness(5);
        result.setScreenSize(16);
        result.setScreenRefreshRate(60);
    }

    @Override
    public void buildKeyboard() {
        result.setKeyboardBrand("Logitech");
        result.setKeyboardColor("Black");
    }

    @Override
    public void buildMouse() {
        result.setMouseBrand("Logitech");
        result.setMouseColor("Silver");
        result.setMouseWireless(true);
    }

    public Setup getResult() {
        return result;
    }
}
