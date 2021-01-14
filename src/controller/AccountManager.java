package controller;

import model.FileWriteReader;
import model.account.Account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    List<Account> accountList = new ArrayList<>();
    private final String USER_ACCOUNT_DATA = "src/model/Storage/userData.dat";

    public void writeAccount(Account account) {
        accountList = FileWriteReader.fileReader(USER_ACCOUNT_DATA);
        accountList.add(account);
        FileWriteReader.fileWriter(accountList, USER_ACCOUNT_DATA);
    }

    public List<Account> readAccountData() {
        return FileWriteReader.fileReader(USER_ACCOUNT_DATA);
    }
}
