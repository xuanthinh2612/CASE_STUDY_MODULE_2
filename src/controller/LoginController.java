package controller;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.account.Account;

import java.io.IOException;
import java.util.List;


public class LoginController {
    private final String LOGIN_DATA = "/model/userData.dat";
    @FXML
    private TextField username, password;

    @FXML
    public void checkAccount(ActionEvent event) {

        int adminAcc = 1;
        int customerAcc = -1;
        int notAUserAcc = 0;
        String usernameIn = username.getText();
        String passwordIn = password.getText();
        List<Account> list;
        list = (new AccountManager()).readAccountData();

        int checker = 0;
        if (usernameIn.equals("") | passwordIn.equals("")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Lỗi đăng nhập");
            alert.setHeaderText("Thông báo");
            alert.setContentText("Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu");
            alert.show();
            return;
        }
        for (Account account : list) {
            checker = LoginAccountController.checkAccount(usernameIn, passwordIn, account);
            if (checker==adminAcc||checker==customerAcc) {
                break;
            }
        }
        if (checker == adminAcc) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/view/productManagementScene.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else if (checker == customerAcc) {
            // Scene for customer
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("khach hang");
            alert.setHeaderText("Thông báo");
            alert.setContentText("ban la khach hang");
            alert.show();


        } else if (checker == notAUserAcc) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Lỗi đăng nhập");
            alert.setHeaderText("Thông báo");
            alert.setContentText("Tài khoản hoặc mật khẩu nhập vào không đúng");
            alert.show();
        }


    }

    public void cancelClose(ActionEvent event) {
        Platform.exit();
    }

    public void logout(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("/view/login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}



