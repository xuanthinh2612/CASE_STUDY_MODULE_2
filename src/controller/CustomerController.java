package controller;

import model.Product;

import java.util.List;

public class CustomerController {
    ProductManager productManager = new ProductManager();
    List<Product> productList = productManager.getAllProductList();
        public void buyProduct(String productID, int number){
            for (Product product:productList){
                if (product.getProductId().equals(productID)){
                    product.setNumberOfSold(product.getNumberOfSold()+number);
                    productManager.editProduct(product);
                    System.out.println("Success! "+ "Total money: "+ product.getSalePrice()*number);
                    return;
                }
            }
        }
        public void showAllProductName(){
            for (Product product: productList){
                if (product.checkInventory()>0){
                    System.out.println("Name: "+ product.getProductName()+" ID: "+ product.getProductId());
                }
            }

        }
        public void vote(String productID, int vote){
            for (Product product:productList){
                if (product.getProductId().equals(productID)){
                    int buyTimes = product.getBuyTimes();
                    double like = (((product.getLikeLevel()*(buyTimes))+vote)/buyTimes);
                    product.setBuyTimes(buyTimes+1);
                    product.setLikeLevel(like);
                    productManager.editProduct(product);
                    System.out.println("Thank you!");
                    return;
                }
            }

        }
}
