package model;

public class Television extends Product {
    private double displayScreenSize;
    private String displayTech;
    private String systemOS;

    public Television() {
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
        return super.toString()+"\n"+"Television{" +
                "displayScreenSize=" + displayScreenSize +
                ", displayTech='" + displayTech + '\'' +
                ", systemOS='" + systemOS + '\'' +
                '}';
    }
}
