package controller;

import model.Product;

import java.util.List;

public class ProductManager {
    private static final String DATA_FILE_PATH = "src/model/Storage/data.dat";
     List<Product> productList = FileWriterReader.fileReader(DATA_FILE_PATH);

     int success = 1;
     int fail = -1;

    public int addNewProduct(Product product) {
        if (productList.isEmpty()){
            productList.add(product);
            FileWriterReader.fileWriter(productList, DATA_FILE_PATH);
            return success;
        }
        for (Product p : productList) {
            if (p.getProductId().equals(product.getProductId())) {

                return fail;
            }
        }
        productList.add(product);
        FileWriterReader.fileWriter(productList, DATA_FILE_PATH);
        return success;
    }

    public int editProduct(Product product) {

        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getProductId().equals(product.getProductId())) {
                productList.set(i, product);
                FileWriterReader.fileWriter(productList, DATA_FILE_PATH);
                return success;
            }
        }

            return fail;
    }

    public List<Product> getAllProductList() {
        return productList;

    }

    public int deleteProduct(String productID) {
        for (Product p : productList){
            if (p.getProductId().equals(productID)){
                productList.remove(p);
                FileWriterReader.fileWriter(productList, DATA_FILE_PATH);
                return success;
            }
        }
        return fail;
    }

}
