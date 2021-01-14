package model;

public class WashingMachine {
    private double volume;
    //rotation per minute
    private int rpm;

    public WashingMachine() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "WashingMachine{" +
                "volume=" + volume +
                ", rpm=" + rpm +
                '}';
    }
}
