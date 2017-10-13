package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

//For Pier 1 and 3:

public class PierController implements Initializable {

    public Button btn_atm;
    public Button btn_brfeed;
    public Button btn_canteen;
    public Button btn_clinic;
    public Button btn_cpa;
    public Button btn_eating;
    public Button btn_entrance;
    public Button btn_fireExits;
    public Button btn_pageSys;
    public Button btn_prayer;
    public Button btn_preDepart;
    public Button btn_inspect;
    public Button btn_toilets;
    public Button btn_terminalFee;
    public Button btn_waitingArea;
    public Button btn_gate1;
    public Tooltip g1_tooltip;
    public Button btn_gate2;
    public Button btn_gate3;
    public Button btn_gate4;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("This should be loading the map ...");
        //already placed map in an imageloader object in fxml.
    }

    // tooltip


    // how event handling in buttons would look like.
    // You can assign separate event handling for each buttons :)
    public void handleButtonAction(ActionEvent actionEvent) {
        Object source = actionEvent.getSource(); // gets which button was clicked
        if(source instanceof Button) {
            Button clickedBtn = (Button) source; // gets the name of the clicked button
            System.out.println("You clicked " + clickedBtn.getText());

        }
    }
}