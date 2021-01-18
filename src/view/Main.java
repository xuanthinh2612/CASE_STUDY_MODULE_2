package view;

import controller.*;
import model.*;
import model.account.Account;
import model.account.Admin;
import model.account.Customers;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    int loginNumber = login();
                    if (loginNumber == 1) {
                        System.out.println("you are admin");
                        adminRole();

                    } else if (loginNumber == -1) {
                        System.out.println("Welcome to our store");
                        customerRole();
                    }
                    break;
                case 2:
                    AdminController adminController = new AdminController();
                    Account customer = createCustomer();
                    adminController.addAccount(customer);
                    break;
                case 0:
                    System.exit(0);
            }
            menu();
            choice = Integer.parseInt(scanner.next());

        }

//        List<Account> list;
//        list = (new AccountManager()).readAccountData();
//        for (Account a:list){
//            System.out.println(a);
//        }


    }

    public static void menu() {
        System.out.println("Welcome to our electrical store");
        System.out.println("1. Enter your user name and password");
        System.out.println("2. Sign up now");
        System.out.println("0. Exit");

    }

    public static void showMenuForAdmin() {
        System.out.println("Menu");
        System.out.println("1. Add new product");
        System.out.println("2. Delete product");
        System.out.println("3. Edit/Update");
        System.out.println("4. Show all product");
        System.out.println("5. Delete account");
        System.out.println("6. Add admin account");
        System.out.println("7. Add customer account");
        System.out.println("8. Show All account information");
        System.out.println("9. Show All product name");
        System.out.println("10. Find product by ID");
        System.out.println("11. Sort by sold number");
        System.out.println("12. Show inventory");
        System.out.println("13. Show interest");
        System.out.println("14. Show total sold money");
        System.out.println("15. logout");
        System.out.println("0. Exit");

    }

    public static void showMenuForCustomer() {
        System.out.println("Menu");
        System.out.println("1. Show all product");
        System.out.println("2. Buy");
        System.out.println("3. logout");
        System.out.println("0. Exit");

    }

    public static int login() {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();
        return LoginController.login(username, password);

    }

    public static Account createCustomer() {
        System.out.print("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Email: ");
        scanner.nextLine();
        String mail = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        Account customer = new Customers(username, password, name, age, address, mail);
        return customer;

    }

    public static Account createAdmin() {
        System.out.print("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Email: ");
        scanner.nextLine();
        String mail = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Staff ID: ");
        String staffID = scanner.nextLine();
        Account admin = new Admin(username, password, name, age, address, mail, staffID);
        return admin;
    }

    public static Product addPhone() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();
        System.out.println("Display screen size: ");
        double displayScreenSize = scanner.nextDouble();
        System.out.println("Battery: ");
        int battery = scanner.nextInt();
        System.out.println("Connect 4G/5G: ");
        scanner.nextLine();
        String connectAbility = scanner.nextLine();
        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();

        Product mobilePhone = new MobilePhone(productID, productName, maker, colour, detailInfo, displayScreenSize, battery, connectAbility);
        mobilePhone.setTotalNumber(totalNumber);
        mobilePhone.setSalePrice(salePrice);
        mobilePhone.setImportPrice(importPrice);
        return mobilePhone;

    }

    public static Product addTablet() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();
        System.out.println("Display screen size: ");
        double displayScreenSize = scanner.nextDouble();
        System.out.println("Battery: ");
        int battery = scanner.nextInt();
        System.out.println("Connect 4G/5G: ");
        scanner.nextLine();
        String connectAbility = scanner.nextLine();
        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();

        Product tablet = new Tablet(productID, productName, maker, colour, detailInfo, displayScreenSize, battery, connectAbility);
        tablet.setTotalNumber(totalNumber);
        tablet.setSalePrice(salePrice);
        tablet.setImportPrice(importPrice);

        return tablet;
    }

    public static Product addLaptop() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();
        System.out.println("RAM (Gb): ");
        int ram = scanner.nextInt();
        System.out.println("Chipset: ");
        scanner.nextLine();

        String chipset = scanner.nextLine();
        System.out.println("Display screen size: ");
        double displayScreenSize = scanner.nextDouble();
        System.out.println("System OS: ");
        scanner.nextLine();
        String systemOS = scanner.nextLine();
        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();

        Product latop = new Laptop(productID, productName, maker, colour, detailInfo, ram, chipset, displayScreenSize, systemOS);
        latop.setTotalNumber(totalNumber);
        latop.setSalePrice(salePrice);
        latop.setImportPrice(importPrice);

        ProductManager manager = new ProductManager();
        return latop;
    }

    public static Product addTelevision() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();

        System.out.println("Display screen size: ");
        double displayScreenSize = scanner.nextDouble();
        System.out.println("Display technology: ");
        scanner.nextLine();
        String displayTech = scanner.nextLine();
        System.out.println("System OS: ");
        String systemOS = scanner.nextLine();

        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();
        Product television = new Television(productID, productName, maker, colour, detailInfo, displayScreenSize, displayTech, systemOS);
        television.setTotalNumber(totalNumber);
        television.setSalePrice(salePrice);
        television.setImportPrice(importPrice);

        return television;
    }

    public static Product addRefrigerator() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();
        System.out.println("Volume: ");
        double volume = scanner.nextDouble();

        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();
        Product refrigerator = new Refrigerator(productID, productName, maker, colour, detailInfo, volume);
        refrigerator.setTotalNumber(totalNumber);
        refrigerator.setSalePrice(salePrice);
        refrigerator.setImportPrice(importPrice);

        return refrigerator;
    }

    public static Product addWashingMachine() {
        System.out.println("Product ID");
        scanner.nextLine();
        String productID = scanner.nextLine();
        System.out.println("Product name");
        String productName = scanner.nextLine();
        System.out.print("Maker: ");
        String maker = scanner.nextLine();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();
        System.out.println("Detail information: ");
        String detailInfo = scanner.nextLine();
        System.out.println("Volume: ");
        double volume = scanner.nextDouble();
        System.out.println("Revolutions per minute");
        int rpm = scanner.nextInt();


        System.out.println("Import price: ");
        double importPrice = scanner.nextDouble();
        System.out.println("Sale Price: ");
        double salePrice = scanner.nextDouble();
        System.out.println("Total number: ");
        int totalNumber = scanner.nextInt();


        Product washingMachine = new WashingMachine(productID, productName, maker, colour, detailInfo, volume, rpm);
        washingMachine.setTotalNumber(totalNumber);
        washingMachine.setSalePrice(salePrice);
        washingMachine.setImportPrice(importPrice);

        return washingMachine;
    }

    public static Product choseProduct() {
        System.out.println("Select Product you want to work with: ");
        System.out.println("1. Phone ");
        System.out.println("2. Tablet ");
        System.out.println("3. Laptop");
        System.out.println("4. Television");
        System.out.println("5. Refrigerator");
        System.out.println("6. WashingMachine");
        System.out.println("0. Cancel");

        int choice = scanner.nextInt();
        Product product = null;
        switch (choice) {
            case 1:
                product = addPhone();
                break;
            case 2:
                product = addTablet();
                break;
            case 3:
                product = addLaptop();
                break;
            case 4:
                product = addTelevision();
                break;
            case 5:
                product = addRefrigerator();
                break;
            case 6:
                product = addWashingMachine();
                break;
            case 0:
        }
        return product;
    }


    public static void adminRole() {
        AdminController adminController = new AdminController();
        Product product = null;
        showMenuForAdmin();

        scanner.nextInt();
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    product = choseProduct();
                    adminController.addProduct(product);
                    break;
                case 2:
                    System.out.println("Enter product ID to delete");
                    scanner.nextLine();
                    String productID = scanner.nextLine();
                    adminController.deleteProduct(productID);
                    break;
                case 3:
                    product = choseProduct();
                    adminController.editProduct(product);
                    break;
                case 4:
                    adminController.showAllProduct();
                    break;
                case 5:
                    System.out.println("Enter username");
                    String accountID = scanner.next();
                    adminController.deleteAccount(accountID);
                    break;
                case 6:
                    Account admin = createAdmin();
                    adminController.addAccount(admin);
                    break;
                case 7:
                    Account customer = createCustomer();
                    adminController.addAccount(customer);
                    break;
                case 8:
                    adminController.showCustomerInfo();
                    break;
                case 9:
                    adminController.showAllProductName();
                    break;
                case 10:
                    System.out.println("Enter product ID");
                    String productID1 = scanner.next();
                    adminController.findProductByID(productID1);
                    break;
                case 11:
                    adminController.sortBySoldNumber();
                    break;
                case 12:
                    adminController.showInventory();
                    break;
                case 13:
                    adminController.showInterest();
                    break;
                case 14:
                    adminController.showTotalSoldMoney();
                    break;
                case 15:
                    return;
                case 0:
                    System.exit(0);

            }
            showMenuForAdmin();
            choice = scanner.nextInt();

        }
    }

    public static void customerRole() {
        CustomerController customerController = new CustomerController();
        showMenuForCustomer();

        int choice = scanner.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    customerController.showAllProductName();
                    break;
                case 2:
                    System.out.println("Enter product ID ");
                    scanner.nextLine();
                    String productID = scanner.nextLine();

                    System.out.println("Enter number that you want to buy ");
                    int number = scanner.nextInt();

                    customerController.buyProduct(productID, number);

                    System.out.println("Do you like us? (1-5) ");
                    int vote = scanner.nextInt();

                    customerController.vote(productID, vote);
                    break;
                case 3:
                    return;
                case 0:
                    System.exit(0);
            }
            showMenuForCustomer();
            choice = scanner.nextInt();

        }

    }

}
