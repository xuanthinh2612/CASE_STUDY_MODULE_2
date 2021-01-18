package model;

import java.io.Serializable;

public abstract class Warehouse implements WarehouseManagement, Serializable {
    private double importPrice;
    private double salePrice;
    private int totalNumber;
    private int numberOfSold = 0;
    private double likeLevel = 0;
    private int buyTimes = 0;

    public int getBuyTimes() {
        return buyTimes;
    }

    public void setBuyTimes(int buyTimes) {
        this.buyTimes = buyTimes;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }

    public void setLikeLevel(double likeLevel) {
        this.likeLevel = likeLevel;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public double getLikeLevel() {
        return likeLevel;
    }


    @Override
    public int checkInventory() {
        return (this.totalNumber - this.numberOfSold);
    }

    @Override
    public double totalSoldMoney() {
        double sold = this.numberOfSold *this.salePrice;
        return sold;
    }


    @Override
    public double checkInterest() {

        return (this.totalSoldMoney()-(this.checkInventory()*this.importPrice));

    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "importPrice=" + importPrice +
                ", salePrice=" + salePrice +
                ", totalAmount=" + totalNumber +
                ", amountOfSold=" + numberOfSold +
                ", likeLevel=" + likeLevel +
                ", buyTimes=" + buyTimes+
                '}';
    }
}
