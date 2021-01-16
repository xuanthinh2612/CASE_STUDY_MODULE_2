package controller;


import model.account.Account;

import java.util.List;


public class LoginController {
    static public int login(String usernameIn, String passwordIn) {

        int adminAcc = 1;
        int customerAcc = -1;
        int notFound = 0;
        List<Account> list;
        list = (new AccountManager()).readAccountData();

        int accountChecker = 0;
        if (usernameIn.equals("") | passwordIn.equals("")) {
            System.out.println("username or password can not be empty");
            return 0;
        }
        for (Account account : list) {
            accountChecker = LoginAccountChecker.checkAccount(usernameIn, passwordIn, account);
            if (accountChecker == adminAcc || accountChecker == customerAcc) {
                break;
            }
        }
        if (accountChecker == adminAcc || accountChecker == customerAcc) {
            return accountChecker;
        } else {
            System.out.println("your username or password is incorrect");
            return notFound;
        }


    }

}



