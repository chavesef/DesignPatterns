package com.sippar.pattern.creational.builder;

public class Setup {
    private float screenSize;
    private int screenRefreshRate;
    private float screenBrightness;

    private String keyboardBrand;
    private String keyboardColor;

    private String mouseBrand;
    private String mouseColor;
    private boolean mouseWireless;

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public void setScreenRefreshRate(int screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public float getScreenBrightness() {
        return screenBrightness;
    }

    public void setScreenBrightness(float screenBrightness) {
        this.screenBrightness = screenBrightness;
    }

    public String getKeyboardBrand() {
        return keyboardBrand;
    }

    public void setKeyboardBrand(String keyboardBrand) {
        this.keyboardBrand = keyboardBrand;
    }

    public String getKeyboardColor() {
        return keyboardColor;
    }

    public void setKeyboardColor(String keyboardColor) {
        this.keyboardColor = keyboardColor;
    }

    public String getMouseBrand() {
        return mouseBrand;
    }

    public void setMouseBrand(String mouseBrand) {
        this.mouseBrand = mouseBrand;
    }

    public String getMouseColor() {
        return mouseColor;
    }

    public void setMouseColor(String mouseColor) {
        this.mouseColor = mouseColor;
    }

    public boolean isMouseWireless() {
        return mouseWireless;
    }

    public void setMouseWireless(boolean mouseWireless) {
        this.mouseWireless = mouseWireless;
    }

    @Override
    public String toString() {
        return "Setup{" +
                "screenSize=" + screenSize +
                ", screenRefreshRate=" + screenRefreshRate +
                ", screenBrightness=" + screenBrightness +
                ", keyboardBrand='" + keyboardBrand + '\'' +
                ", keyboardColor='" + keyboardColor + '\'' +
                ", mouseBrand='" + mouseBrand + '\'' +
                ", mouseColor='" + mouseColor + '\'' +
                ", mouseWireless=" + mouseWireless +
                '}';
    }
}
