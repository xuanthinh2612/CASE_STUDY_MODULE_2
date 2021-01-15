package model;

public abstract class Warehouse implements WarehouseManagement {
    private double importPrice;
    private double salePrice;
    private int total;
    private int numberOfSold;
    private double likeLevel;

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public int getTotal() {
        return total;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public double getLikeLevel() {
        return likeLevel;
    }


    @Override
    public int checkInventory() {
        return (this.total - this.numberOfSold);
    }

    @Override
    public double totalSoldMoney() {
        double sold = this.numberOfSold *this.salePrice;
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
                ", totalAmount=" + total +
                ", amountOfSold=" + numberOfSold +
                ", likeLevel=" + likeLevel +
                '}';
    }
}
