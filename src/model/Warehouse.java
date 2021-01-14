package model;

public abstract class Warehouse implements WarehouseManagement {
    private double importPrice;
    private double salePrice;
    private int totalAmount;
    private int amountOfSold;
    private double likeLevel;

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAmountOfSold(int amountOfSold) {
        this.amountOfSold = amountOfSold;
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

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getAmountOfSold() {
        return amountOfSold;
    }

    public double getLikeLevel() {
        return likeLevel;
    }


    @Override
    public int checkInventory() {
        return (this.totalAmount - this.amountOfSold);
    }

    @Override
    public double totalSoldMoney() {
        double sold = this.amountOfSold*this.salePrice;
        return sold;
    }

    @Override
    public double checkInterest() {
        return (this.totalSoldMoney()-this.checkInventory()*this.importPrice);

    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "importPrice=" + importPrice +
                ", salePrice=" + salePrice +
                ", totalAmount=" + totalAmount +
                ", amountOfSold=" + amountOfSold +
                ", likeLevel=" + likeLevel +
                '}';
    }
}
