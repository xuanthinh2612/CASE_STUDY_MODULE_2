package model;

public class Laptop extends Product     {
    private int ram;
    private String chipset;
    private double displayScreenSize;
    private String systemOS;

    public Laptop() {
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
        return super.toString()+"\n"+"Laptop{" +
                "ram=" + ram +
                ", chipset='" + chipset + '\'' +
                ", displayScreen=" + displayScreenSize +
                ", systemOS='" + systemOS + '\'' +
                '}';
    }
}
