package model;

import java.io.Serializable;

public class Product extends Warehouse implements Serializable, Comparable {
    private String productId;
    private String productName;
    private String maker;
    private String colour;
    private String detailInfo;

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


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", maker='" + maker + '\'' +
                ", colour='" + colour + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        if (p.getNumberOfSold() > this.getNumberOfSold()) {
            return 1;
        } else if (p.getNumberOfSold() < this.getNumberOfSold()) {
            return -1;
        } else {
            return 0;
        }
    }
}
