package com.sippar.pattern.creational.builder;

public class Gamer implements Builder{
    private Setup result;

    @Override
    public void reset() {
        result = new Setup();
    }

    @Override
    public void buildScreen() {
        result.setScreenBrightness(12);
        result.setScreenSize(32);
        result.setScreenRefreshRate(120);
    }

    @Override
    public void buildKeyboard() {
        result.setKeyboardBrand("Razer");
        result.setKeyboardColor("RGB");
    }

    @Override
    public void buildMouse() {
        result.setMouseBrand("Razer");
        result.setMouseColor("RGB");
        result.setMouseWireless(false);
    }

    public Setup getResult() {
        return result;
    }
}
