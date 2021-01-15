package controller;

import model.FileWriterReader;
import model.account.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    List<Account> accountList = new ArrayList<>();
    private final String USER_ACCOUNT_DATA = "src/model/Storage/userData.dat";

    public void writeAccount(Account account) {
        accountList = FileWriterReader.fileReader(USER_ACCOUNT_DATA);
        accountList.add(account);
        FileWriterReader.fileWriter(accountList, USER_ACCOUNT_DATA);
    }

    public List<Account> readAccountData() {
        return FileWriterReader.fileReader(USER_ACCOUNT_DATA);
    }
}
