package controller;

import model.Product;
import model.account.Account;
import model.account.Admin;
import model.account.Customers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AdminController {
    ProductManager productManager = new ProductManager();
    int success = 1;


    public void addProduct(Product product) {

        int check = productManager.addNewProduct(product);
        if (check == -1) {
            System.out.println("Product already exist");
        } else if (check == success) {
            System.out.println("Added success!");
        } else {
            System.out.println("Added fail!");
        }

    }


    public void deleteProduct(String productID) {
        int check = productManager.deleteProduct(productID);

        if (check == success) {
            System.out.println("Deleted success!");
        } else {
            System.out.println("Deleted fail!");

        }

    }


    public void showAllProduct() {
        List<Product> list = productManager.getAllProductList();
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public void showAllProductName() {
        List<Product> list = productManager.getAllProductList();
        for (Product p : list) {
            System.out.println(p.getProductName());
        }
    }

    public void findProductByID(String productID) {
        List<Product> list = productManager.getAllProductList();
        for (Product p : list) {
            if (p.getProductId().equals(productID))
                System.out.println(p);
            return;
        }
        System.out.println("Not found!");
    }

    public void sortBySoldNumber() {
        List<Product> list = productManager.getAllProductList();
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getWarehouse().getNumberOfSold() > o2.getWarehouse().getNumberOfSold()) {
                    return 1;
                } else if (o1.getWarehouse().getNumberOfSold() < o2.getWarehouse().getNumberOfSold()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });

        showAllProduct();

    }
//    public void sortByInventoryNumber(){
//        List<Product> list = productManager.showAllProduct();
//        list.sort(Product::compareTo);
//        for (Product product : list){
//            System.out.println(list);
//        }
//    }


    public void showInventory() {
        List<Product> productList = productManager.getAllProductList();
        for (Product product : productList) {
            if (product.checkInventory()>0){
                System.out.println("ID: "+product.getProductId()+" name: "+product.getProductName()+" remain:  " + product.checkInventory());
            }
        }
    }

    public void showInterest() {
        List<Product> productList = productManager.getAllProductList();

        for (Product product : productList) {
            if (product.checkInventory()>0){
                System.out.println("ID: "+ product.getProductId()+" name: "+product.getProductName()+" interest:  " + product.checkInterest());
            }
        }
    }

    public void showTotalSoldMoney() {
        List<Product> productList = productManager.getAllProductList();

        for (Product product : productList) {

                System.out.println("ID: "+ product.getProductId()+" name: "+product.getProductName()+" sold number: "+product.getWarehouse().getNumberOfSold()+" total money:  " + product.totalSoldMoney());
            }
        }




    public void editProduct(Product product) {
        int check = productManager.editProduct(product);
        if (check == success) {
            System.out.println("Edited success!");
        } else {
            System.out.println("Edited fail!");

        }

    }

    public void addAccount(Account account) {

        int addAccount = AccountManager.writeAccount(account);
        if (addAccount == 1) System.out.println("Successful added!");
        if (addAccount == -1) System.out.println("Added false!");

    }

    public void deleteAccount(String accountID) {
        int check = AccountManager.deleteAccount(accountID);
        if (check == success) {
            System.out.println("Deleted success!");
        } else {
            System.out.println("Deleted fail!");

        }

    }


    public void showCustomerInfo() {
        List<Account> accountList = AccountManager.readAccountData();
        for (Account account : accountList) {
            if (account instanceof Admin) {
                System.out.println(account);
            }
        }
        for (Account account : accountList) {
            if (account instanceof Customers) {
                System.out.println(account);
            }
        }
    }


}
