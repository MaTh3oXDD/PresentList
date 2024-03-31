package com.example.mcm;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ZmianaSceny {
    public static void ChangeSceneLabel(Label label,String fxmlFile, String title)
    {
        label.setOnMouseClicked((MouseEvent e) -> {
            changeScene(fxmlFile,title);
        });;
    }
    public static void changeScene(String fxmlFile, String title) {
        try {
            Parent parent = FXMLLoader.load(ZmianaSceny.class.getResource(fxmlFile));
            Scene scene = new Scene(parent);
            Stage stage = HelloApplication.getStage();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
