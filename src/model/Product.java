package model;

import java.io.Serializable;

public class Product  implements Serializable, WarehouseManagement {
    private String productId;
    private String productName;
    private String maker;
    private String colour;
    private String detailInfo;
    private Warehouse warehouse;

    public Product(String productId, String productName, String maker, String colour, String detailInfo) {
        this.productId = productId;
        this.productName = productName;
        this.maker = maker;
        this.colour = colour;
        this.detailInfo = detailInfo;
    }

    public Product() {
    }

    public Product withProductId(String id) {
        this.productId = id;
        return this;
    }

    public Product withProductName(String name) {
        this.productName = name;
        return this;
    }


    public Product withProductMaker(String maker) {
        this.maker = maker;
        return this;
    }

    public Product withProductColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Product withProductDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
        return this;
    }

    public Product builder() {
        return this;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }


    public String getMaker() {
        return maker;
    }

    public String getColour() {
        return colour;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public int checkInventory() {
        return (this.warehouse.getTotalNumber() - this.warehouse.getNumberOfSold());
    }

    @Override
    public double totalSoldMoney() {
        double sold = this.warehouse.getNumberOfSold() *this.warehouse.getSalePrice();
        return sold;
    }


    @Override
    public double checkInterest() {

        return (this.totalSoldMoney()-(this.checkInventory()*this.warehouse.getImportPrice()));

    }



    @Override
    public String toString() {
        return  "Warehouse{" +
                "importPrice=" + warehouse.getImportPrice() +
                ", salePrice=" + warehouse.getSalePrice() +
                ", totalAmount=" + warehouse.getTotalNumber() +
                ", amountOfSold=" + warehouse.getNumberOfSold() +
                ", likeLevel=" + warehouse.getLikeLevel() +
                ", buyTimes=" + warehouse.getBuyTimes()+
                '}' +
                "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", maker='" + maker + '\'' +
                ", colour='" + colour + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                '}';
    }

}

