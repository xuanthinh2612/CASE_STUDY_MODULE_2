package model;

public class Refrigerator extends Product{
    private double volume;

    public Refrigerator() {
    }

    public Refrigerator(String productId, String productName, String maker, String colour, String detailInfo, double volume) {
        super(productId, productName, maker, colour, detailInfo);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+"Refrigerator{" +
                "volume=" + volume +
                '}';
    }
}
