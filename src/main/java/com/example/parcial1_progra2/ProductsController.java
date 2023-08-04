package com.example.parcial1_progra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductsController extends Application
{

    @Override
    public void start(Stage primarystage) throws Exception {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Main.class.getResource("productsForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 240);
        primarystage.setTitle("AGREGA PRODUCTOS");
        primarystage.setScene(scene);
        primarystage.show();
    }
}
