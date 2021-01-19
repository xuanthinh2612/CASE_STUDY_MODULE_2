package model;

import java.io.Serializable;

public  class Warehouse implements Serializable  {
    private double importPrice = 0;
    private double salePrice = 0;
    private int totalNumber = 0;
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



}
