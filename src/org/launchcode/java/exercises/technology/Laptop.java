package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {

    private int batteryLife;
    private int screenSize;

    public Laptop(String operatingSystem, String cpu, int batteryLife, int screenSize) {
        super(operatingSystem, cpu, true);
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
