package controller;

import model.FileWriterReader;
import model.Product;

import java.util.List;

public class ProductManager {
    private final String DATA_FILE_PATH = "src/model/Storage/data.dat";
    List<Product> productList = FileWriterReader.fileReader(DATA_FILE_PATH);

    public int addNewProduct(Product product) {

        for (Product p : productList) {
            if (p.getProductId().equals(product.getProductId())) {
                return -1;
            }
        }
        productList.add(product);
        FileWriterReader.fileWriter(productList, DATA_FILE_PATH);
        return 1;
    }

    public void editProduct(Product product, String productID) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(productID)) {
                productList.set(i, product);
                break;
            }
        }
        FileWriterReader.fileWriter(productList, DATA_FILE_PATH);

    }

    public List<Product> showAllProduct() {
        return productList;

    }

    public void deleteProduct(String productID) {
        for (Product p : productList){
            if (p.getProductId().equals(productID)){
                productList.remove(p);
            }
        }
    }
}
