package model;

public class MobilePhone extends Product{
        private double displayScreenSize;
        private int battery;
        private String connectAbility;

    public MobilePhone() {
    }

    public MobilePhone(String productId, String productName, String maker, String colour, String detailInfo, double displayScreenSize, int battery, String connectAbility) {
        super(productId, productName, maker, colour, detailInfo);
        this.displayScreenSize = displayScreenSize;
        this.battery = battery;
        this.connectAbility = connectAbility;
    }

    public double getDisplayScreenSize() {
        return displayScreenSize;
    }

    public void setDisplayScreenSize(double displayScreenSize) {
        this.displayScreenSize = displayScreenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getConnectAbility() {
        return connectAbility;
    }

    public void setConnectAbility(String connectAbility) {
        this.connectAbility = connectAbility;
    }

    @Override
    public String toString() {

        return super.toString()+"\n"+ "MobiPhone{" +
                "displayScreen=" + displayScreenSize +
                ", battery=" + battery +
                ", connectAbility='" + connectAbility + '\'' +
                '}';
    }
}
