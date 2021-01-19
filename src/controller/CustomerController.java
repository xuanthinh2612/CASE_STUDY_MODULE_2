package controller;

import model.Product;
import model.Warehouse;

import java.util.List;

public class CustomerController {
    ProductManager productManager = new ProductManager();
    List<Product> productList = productManager.getAllProductList();

    public void buyProduct(String productID, int number) {
        for (Product product : productList) {
            if (product.getProductId().equals(productID)) {
                Warehouse warehouse = product.getWarehouse();
                warehouse.setNumberOfSold(product.getWarehouse().getNumberOfSold() + number);
                product.setWarehouse(warehouse);
                productManager.editProduct(product);
                System.out.println("Success! " + "Total money: " + product.getWarehouse().getSalePrice() * number);
                return;
            }
        }
    }

    public void showAllProductName() {
        for (Product product : productList) {
            if (product.checkInventory() > 0) {
                System.out.println("Name: " + product.getProductName() + " ID: " + product.getProductId() + " remain " + product.checkInventory() + " vote " + product.getWarehouse().getLikeLevel());
            }
        }

//            for (Product product : productList){
//                product.setLikeLevel(0);
//                productManager.editProduct(product);
//
//            }

    }

    public void vote(String productID, int vote) {
        for (Product product : productList) {
            if (product.getProductId().equals(productID)) {
                int buyTimes = product.getWarehouse().getBuyTimes();
                double like;
                if (buyTimes == 0) {
                    like = vote;
                } else {
                    like = (((product.getWarehouse().getLikeLevel() * (buyTimes)) + vote) / (buyTimes + 1));

                }
                product.getWarehouse().setBuyTimes(buyTimes + 1);
                product.getWarehouse().setLikeLevel(like);
                productManager.editProduct(product);
                System.out.println("Thank you!");
                return;
            }
        }

    }
}
