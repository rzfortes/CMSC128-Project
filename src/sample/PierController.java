package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

//For Pier 1 and 3:

public class PierController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("This should be loading the map ...");
        //already placed map in an imageloader object in fxml.
    }
}