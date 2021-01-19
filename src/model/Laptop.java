package model;

public class Laptop extends Product     {
    private int ram;
    private String chipset;
    private double displayScreenSize;
    private String systemOS;

    public Laptop() {
    }

    public Laptop(String productId, String productName, String maker, String colour, String detailInfo, int ram, String chipset, double displayScreenSize, String systemOS) {
        super(productId, productName, maker, colour, detailInfo);
        this.ram = ram;
        this.chipset = chipset;
        this.displayScreenSize = displayScreenSize;
        this.systemOS = systemOS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public double getDisplayScreenSize() {
        return displayScreenSize;
    }

    public void setDisplayScreenSize(double displayScreenSize) {
        this.displayScreenSize = displayScreenSize;
    }

    public String getSystemOS() {
        return systemOS;
    }

    public void setSystemOS(String systemOS) {
        this.systemOS = systemOS;
    }

    @Override
    public String toString() {
        return super.toString()+"Laptop{" +
                "ram=" + ram +
                ", chipset='" + chipset + '\'' +
                ", displayScreen=" + displayScreenSize +
                ", systemOS='" + systemOS + '\'' +
                '}';
    }
}
