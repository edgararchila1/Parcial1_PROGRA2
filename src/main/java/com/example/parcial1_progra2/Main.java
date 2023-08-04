package com.example.parcial1_progra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static Stage currentStage;

    @Override
    public void start(Stage primarystage) throws IOException {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 240);
        primarystage.setTitle("INGRESA TU USUARIO");
        primarystage.setScene(scene);
        primarystage.show();
    }

    public void closeWindows(Stage stage){
        stage.close();
    }

    public static void main(String[] args) {
        launch();
    }
}