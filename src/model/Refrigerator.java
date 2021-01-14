package model;

public class Refrigerator extends Product{
    private double volume;

    public Refrigerator() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Refrigerator{" +
                "volume=" + volume +
                '}';
    }
}
