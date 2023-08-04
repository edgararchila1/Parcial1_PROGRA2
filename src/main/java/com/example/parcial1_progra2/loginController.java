package com.example.parcial1_progra2;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class loginController
{

    public Button btnAccess;
    public PasswordField txtPassword;
    public TextField txtUser;
    String UserTxt, PasswordTxt;

    public void clicEntrar(ActionEvent actionEvent) throws Exception {
        UserTxt = txtUser.getText();
        PasswordTxt = txtPassword.getText();
        Stage stage = new Stage();

        if ((Objects.equals(UserTxt, "admin")) && (Objects.equals(PasswordTxt, "12345")))
        {
            Alert messageWindows = new Alert(Alert.AlertType.INFORMATION);
            messageWindows.setTitle("Bienvenido al Sistema");
            messageWindows.setHeaderText("");
            messageWindows.setContentText("Bienvenido a Nuestro Sistema: JAJA");
            messageWindows.showAndWait();
            menuController menu = new menuController();
            menu.callMenuPrincipal();
        }
        else
        {
            Alert messageWindows = new Alert(Alert.AlertType.INFORMATION);
            messageWindows.setTitle("ERROR DE ACCESO");
            messageWindows.setHeaderText("");
            messageWindows.setContentText("USUARIO Y/O CONTRASEÑA -*INCORRECTOS*-");
            messageWindows.showAndWait();
        }
    }
}
