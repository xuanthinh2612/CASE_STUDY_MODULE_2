package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        showMenu();
        System.out.println("");



    }
    public static void  showMenu() {
        System.out.println("Menu");
        System.out.println("1. Add new product");
        System.out.println("2. Delete product");
        System.out.println("3. Edit");
        System.out.println("4. Show all");
        System.out.println("0. Exit");

    }
}
