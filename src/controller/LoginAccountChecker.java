package controller;

import model.account.Account;
import model.account.Admin;
import model.account.Customers;

public class LoginAccountController {
    public static int checkAccount(String usernameIn, String passwordIn, Account account){

        if (usernameIn.equals(account.getId()) && passwordIn.equals(account.getPassword())&&(account instanceof Admin)) {
            return 1;
        }
        if (usernameIn.equals(account.getId()) && passwordIn.equals(account.getPassword())&&(account instanceof Customers)) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
