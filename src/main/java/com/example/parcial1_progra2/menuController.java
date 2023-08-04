package com.example.parcial1_progra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController extends Application {
    Stage productStage = new Stage();

    public void callMenuPrincipal(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("principalWindow.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 300);
            productStage.setTitle("Menu Principal");
            productStage.setScene(scene);
            productStage.show();
        } catch (javafx.fxml.LoadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void callProducts()
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("productsForm.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            productStage.setTitle("INGRESO / ACTUALIZACIÓN DE PRODCUCTOS.");
            productStage.setScene(scene);
            productStage.show();
        } catch (javafx.fxml.LoadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void callCostumers() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("usersForm.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            productStage.setTitle("INGRESO / ACTUALIZACIÓN DE CLIENTES.");
            productStage.setScene(scene);
            productStage.show();
        } catch (javafx.fxml.LoadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public static void main(String[] args) {
        launch(menuController.class, args);
    }
}

