package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Load login.fxml from the application package
            Parent loginRoot = FXMLLoader.load(getClass().getResource("login.fxml"));
            
            // Set the initial scene to login.fxml
            Scene loginScene = new Scene(loginRoot);
            loginScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            
            // Set the stage to display the login scene
            primaryStage.setScene(loginScene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
