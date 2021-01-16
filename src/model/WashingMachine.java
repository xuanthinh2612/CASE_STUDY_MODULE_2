package model;

public class WashingMachine  extends Product{
    private double volume;
    //rotation per minute
    private int rpm;

    public WashingMachine() {
    }

    public WashingMachine(String productId, String productName, String maker, String colour, String detailInfo, double volume, int rpm) {
        super(productId, productName, maker, colour, detailInfo);
        this.volume = volume;
        this.rpm = rpm;
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
