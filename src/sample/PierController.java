package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

//For Pier 1 and 3:

public class PierController implements Initializable {

    //pier 3
    public Button btn_bstFeed3;
    public Button btn_canteen3;
    public Button btn_chkIn3;
    public Button btn_clinic3;
    public Button btn_cof3;
    public Button btn_entrance3;
    public Button btn_frmDep3;
    public Button btn_fireExits3;
    public Button btn_hldArea3;
    public Button btn_hmnTra3;
    public Button btn_kdsCorner3;
    public Button btn_msgArea3;
    public Button btn_prayRm3;
    public Button btn_preDep3;
    public Button btn_preIns3;
    public Button btn_toilets3;
    public Button btn_wait3;
    public Button btn_gate1;
    public Tooltip g1_tooltip1;
    public Button btn_gate2;
    public Button btn_gate3;
    public Button btn_gate4;

    //pier 1
    public Button btn_atm;
    public Button btn_bstFeed1;
    public Button btn_canteen1;
    public Button btn_clinic1;
    public Button btn_cpaOf1;
    public Button btn_eat1;
    public Button btn_entrance1;
    public Button btn_fireExits1;
    public Button btn_pageSys1;
    public Button btn_prayRm1;
    public Button btn_preDep1;
    public Button btn_preIns1;
    public Button btn_termFee1;
    public Button btn_toilets1;
    public Button btn_wait1;
    public Button btn_gate11;
    public Tooltip g1_tooltip2;
    public Button btn_gate21;
    public Button btn_gate31;
    public Button btn_gate41;

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