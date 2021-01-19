package model;

public class Television extends Product {
    private double displayScreenSize;
    private String displayTech;
    private String systemOS;

    public Television() {
    }

    public Television(String productId, String productName, String maker, String colour, String detailInfo, double displayScreenSize, String displayTech, String systemOS) {
        super(productId, productName, maker, colour, detailInfo);
        this.displayScreenSize = displayScreenSize;
        this.displayTech = displayTech;
        this.systemOS = systemOS;
    }

    public double getDisplayScreenSize() {
        return displayScreenSize;
    }

    public void setDisplayScreenSize(double displayScreenSize) {
        this.displayScreenSize = displayScreenSize;
    }

    public String getDisplayTech() {
        return displayTech;
    }

    public void setDisplayTech(String displayTech) {
        this.displayTech = displayTech;
    }

    public String getSystemOS() {
        return systemOS;
    }

    public void setSystemOS(String systemOS) {
        this.systemOS = systemOS;
    }

    @Override
    public String toString() {
        return super.toString()+ "Television{" +
                "displayScreenSize=" + displayScreenSize +
                ", displayTech='" + displayTech + '\'' +
                ", systemOS='" + systemOS + '\'' +
                '}';
    }
}
