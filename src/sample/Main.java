package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage mainWindow) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        mainWindow.setTitle("CPA Passenger Assistance Directory - prototype version 0.0.0.1");
        mainWindow.setScene(new Scene(root, 1024, 768));
        mainWindow.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
