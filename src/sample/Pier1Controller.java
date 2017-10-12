package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

//For Pier1

public class Pier1Controller implements Initializable {
    public Label test_btn; // the temporary output place to know whether ang button na gi clicked kay correct or not
    public Button btn_atm; // for the ATM Button
    public Button btn_CPA; // for the CPA Office Button
    public Button btn_toilet; // for the Toilets Button
    public Button btn_feeBooth; // for the Fee Booth Button
    public Button btn_canteen; // for the Canteen Button
    public Button btn_waitingArea; // for the Waiting Area Button
    public Button btn_inspec; // for the Inspection Area Button
    public Button btn_preDept; // for the Pre-Departure Button
    public Button btn_pageSys; // for the Paging System Button
    public Button btn_prayerRoom; // for the Prayer Room Button
    public Button btn_breastFeeding; // for the Breast Feeding Button
    public Button btn_clinic; // for the Clinic Button
    public Button btn_eatArea; // for the Eating Area Button
    public Button btn_entrance; // for the Entrance Button
    public Button btn_fireExit; // for the Fire Exit Button

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("This should be loadingg the map ...");
    }

    // upon clicking a button, do something
    public void handleButtonAction(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if(source instanceof Button) {
            Button clickedBtn = (Button) source;
            test_btn.setText("Click a Button:");
            test_btn.setText(test_btn.getText() + " You clicked " + clickedBtn.getText());
        }
    }
}
