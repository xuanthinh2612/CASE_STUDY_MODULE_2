package model;

public class Tablet {
    private double displayScreenSize;
    private int battery;
    private String connectAbility;

    public Tablet() {
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }




    public double getDisplayScreenSize() {
        return displayScreenSize;
    }

    public void setDisplayScreenSize(double displayScreenSize) {
        this.displayScreenSize = displayScreenSize;
    }

    public String getConnectAbility() {
        return connectAbility;
    }

    public void setConnectAbility(String connectAbility) {
        this.connectAbility = connectAbility;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Tablet{" +
                "displayScreenSize=" + displayScreenSize +
                ", connectAbility='" + connectAbility + '\'' +
                '}';
    }
}
