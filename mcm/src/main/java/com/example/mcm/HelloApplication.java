package com.example.mcm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class HelloApplication extends Application {
    private static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage=stage;
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(600);
        stage.setMinWidth(800);


    }
    public static Stage getStage()
    {
        return primaryStage;
    }

    public static void main(String[] args) {

        launch(args);


    }
}