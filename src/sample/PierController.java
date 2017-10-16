package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;


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
    public Button btn_toilets1;
    public Button btn_terminalFee;
    public Button btn_waitingArea;
    public Button btn_gate1;
    public Tooltip g1_tooltip;
    public Button btn_gate2;
    public Button btn_gate3;
    public Button btn_gate4;
    public ImageView loc;
    public Path path = new Path();
    public PathTransition trans = new PathTransition();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
 /*       btn_gate1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hovered");
            }
        });
     Incase tooltip don't work (hover manual w/ pop-up)   : Option
*/
    }



    // how event handling in buttons would look like.
    // You can assign separate event handling for each buttons :)
    public void handleButtonAction(ActionEvent actionEvent) {
        Object source = actionEvent.getSource(); // gets which button was clicked
        if(source instanceof Button) {
            Button clickedBtn = (Button) source; // gets the name of the clicked button
            System.out.println("You clicked " + clickedBtn.getText());

        }

        if(source == btn_toilets1){
            path.setStrokeWidth(10);
            path.setStroke(Color.BLACK);
            path.getElements().add(new MoveTo(0, 0));
            path.getElements().add(new LineTo(155, 0));
            path.getElements().add(new LineTo(155, -35));

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();

        }



    }


}