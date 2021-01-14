package model;

import java.io.Serializable;

public  class Product extends Warehouse implements Serializable {
    private String productId;
    private String productName;
    private String productImage;
    private String maker;
    private String colour;
    private String detailInfo;


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

    public Product withProductImage(String image) {
        this.productImage = image;
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

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productImage='" + productImage + '\'' +
                ", maker='" + maker + '\'' +
                ", colour='" + colour + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                '}';
    }
}
