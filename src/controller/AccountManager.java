package controller;

import model.account.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    static List<Account> accountList = new ArrayList<>();
   static private final String USER_ACCOUNT_DATA = "src/model/Storage/userData.dat";

    public static int writeAccount(Account account) {
        int success = 1;
        int addedFalse = -1;

        accountList = FileWriterReader.fileReader(USER_ACCOUNT_DATA);
        for (Account a : accountList){
            if (a.getId().equals(account.getId())){
                return addedFalse;
            }
        }
        accountList.add(account);
        FileWriterReader.fileWriter(accountList, USER_ACCOUNT_DATA);
        return success;
    }
    public static int deleteAccount(String accountID) {
        int success = 1;
        int fail = -1;

        accountList = FileWriterReader.fileReader(USER_ACCOUNT_DATA);
        for (Account a : accountList){
            if (a.getId().equals(accountID)){
                accountList.remove(a);
                FileWriterReader.fileWriter(accountList, USER_ACCOUNT_DATA);
                return success;


            }
        }
        return fail;
    }

    public static List<Account> readAccountData() {
        return FileWriterReader.fileReader(USER_ACCOUNT_DATA);
    }
}
