package sample;

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
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
    public AnchorPane apane;

    //pier 1
    public Button btn_atm;
    public Button btn_bstFeed1;
    public Button btn_canteen1;
    public Button btn_clinic1;
    public Button btn_cpaOf1;
    public Button btn_eat1;
    public Button btn_fireExits1;
    public Button btn_pageSys1;
    public Button btn_prayRm1;
    public Button btn_preDep1;
    public Button btn_preIns1;
    public Button btn_termFee1;
    public Button btn_toilets1;
    public Button btn_gate11;
    public Tooltip g1_tooltip2;
    public Button btn_gate21;
    public Button btn_gate31;
    public Button btn_gate41;
    public Button btn_gate51;
    public Button btn_gate61;
    public Button btn_gate71;
    public Button btn_gate81;
    public AnchorPane apane1;

    public double x1, x3; //x1 is for pier 1, x3 is for pier 3
    public double y1, y3;

    public ImageView loc; //for pier 1 na pointer
    public ImageView loc3; //for pier 3 na pointer
    public Path path = new Path();
    public PathTransition trans = new PathTransition();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        apane1.getChildren().add(path);
        apane.getChildren().add(path);
        x1 = loc.getLayoutX() + loc.getLayoutBounds().getWidth() / 2;
        y1 = (loc.getLayoutY() + loc.getLayoutBounds().getHeight() / 2) + 5;
        x3 = loc3.getLayoutX() + loc3.getLayoutBounds().getWidth() / 2;
        y3 = (loc3.getLayoutY() + loc3.getLayoutBounds().getHeight() / 2) + 5;


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
        if (source instanceof Button) {
            Button clickedBtn = (Button) source; // gets the name of the clicked button
            System.out.println("You clicked " + clickedBtn.getText());

        }

        //pier 1 atm
        if (source == btn_atm) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 225, y1));
            path.getElements().add(new LineTo(x1 + 225, y1 + 65));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 breastfeeding area
        if (source == btn_bstFeed1) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1 - 20));
            path.getElements().add(new LineTo(x1 + 1190 , y1 -20));

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 canteen
        if (source == btn_canteen1) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 250, y1));
            path.getElements().add(new LineTo(x1 + 250, y1 - 25));

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 clinic
        if (source == btn_clinic1) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 cpa office
        if (source == btn_cpaOf1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1+10, y1));
            path.getElements().add(new LineTo(x1 + 10, y1 - 25));

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(1));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 eating area
        if (source == btn_eat1) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 830, y1+30));
            path.getElements().add(new LineTo(x1 + 830, y1-30));
            path.getElements().add(new LineTo(x1 + 830, y1));

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 fire exits
        if (source == btn_fireExits1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 360, y1));
            path.getElements().add(new LineTo(x1 + 360, y1 - 65));
            path.getElements().add(new LineTo(x1 + 360, y1 + 65));
            path.getElements().add(new LineTo(x1 + 360, y1));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 paging system
        if (source == btn_pageSys1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 130, y1));
            path.getElements().add(new LineTo(x1 + 130, y1 + 25));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 prayer room
        if (source == btn_prayRm1) {
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1));
            path.getElements().add(new LineTo(x1 + 1180 , y1 - 45));
            path.getElements().add(new LineTo(x1 + 1190 , y1 - 45));

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 pre-departure area
        if (source == btn_preDep1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 618, y1));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 pre-inspection area
        if (source == btn_preIns1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 360, y1));
            path.getElements().add(new LineTo(x1 + 360, y1 - 40));
            path.getElements().add(new LineTo(x1 + 400, y1 - 40));
            path.getElements().add(new MoveTo(x1 + 360, y1));
            path.getElements().add(new LineTo(x1 + 360, y1 + 40));
            path.getElements().add(new LineTo(x1 + 400, y1 + 40));
            path.getElements().add(new LineTo(x1 + 360, y1+40));
            path.getElements().add(new LineTo(x1 + 360, y1));


            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(5));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }

        //pier 1 terminal fee
        if (source == btn_termFee1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 275, y1));
            path.getElements().add(new LineTo(x1 + 275, y1 + 25));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 toilets
        if (source == btn_toilets1) {
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 + 145, y1));
            path.getElements().add(new LineTo(x1 + 145, y1 - 25));
            path.getElements().add(new LineTo(x1 + 145, y1));
            path.getElements().add(new LineTo(x1 + 315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 45));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 840, y1));
            path.getElements().add(new LineTo(x1 + 890, y1 - 45));
            path.getElements().add(new LineTo(x1 + 840, y1));
            path.getElements().add(new LineTo(x1 + 845, y1 + 40));
            path.getElements().add(new LineTo(x1 + 840, y1));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //PIER THREE BUTTONS
        //pier 3 toilet
        if(source == btn_toilets3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+255, y3-15));
            path.getElements().add(new LineTo(x3+255, y3+15));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+470, y3));
            path.getElements().add(new LineTo(x3+780, y3));
            path.getElements().add(new LineTo(x3+780, y3-5));
            path.getElements().add(new LineTo(x3+780, y3+5));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(4));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //holding area
        if(source == btn_wait3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+50, y3));
            path.getElements().add(new LineTo(x3+50, y3-10));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //firearm deposit
        if(source == btn_frmDep3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+320, y3));
            path.getElements().add(new LineTo(x3+320, y3-40));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //preinspection
        if(source == btn_preIns3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+320, y3));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+330, y3-20));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //human trafficking
        if(source == btn_hmnTra3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+320, y3));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+360, y3-20));
            path.getElements().add(new LineTo(x3+360, y3-35));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }


        //holding area
        if(source == btn_hldArea3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+320, y3));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+400, y3-20));
            path.getElements().add(new LineTo(x3+400, y3-35));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //check in
        if(source == btn_chkIn3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+320, y3));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+430, y3-20));
            path.getElements().add(new LineTo(x3+430, y3+10));
            path.getElements().add(new LineTo(x3+470, y3+10));
            path.getElements().add(new LineTo(x3+470, y3-45));
            path.getElements().add(new LineTo(x3+470, y3+45));
            path.getElements().add(new LineTo(x3+470, y3+10));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(4));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //Predeparture
        if(source == btn_preDep3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+650, y3));
            path.getElements().add(new LineTo(x3+650, y3-5));
            path.getElements().add(new LineTo(x3+650, y3+5));


            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(4));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //canteen
        if(source == btn_canteen3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1180, y3));
            path.getElements().add(new LineTo(x3+1180, y3+15));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //massage area
        if(source == btn_msgArea3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1180, y3));
            path.getElements().add(new LineTo(x3+1180, y3-40));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }


        //prayer room
        if(source == btn_prayRm3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1200, y3));
            path.getElements().add(new LineTo(x3+1200, y3-45));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //clinic
        if(source == btn_clinic3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1198, y3));
            path.getElements().add(new LineTo(x3+1198, y3-40));
            path.getElements().add(new LineTo(x3+1205, y3-40));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //breastfeed
        if(source == btn_bstFeed3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1195, y3));
            path.getElements().add(new LineTo(x3+1195, y3-5));
            path.getElements().add(new LineTo(x3+1205, y3-5));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //cafe
        if(source == btn_cof3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+255, y3));
            path.getElements().add(new LineTo(x3+300, y3));
            path.getElements().add(new LineTo(x3+300, y3-20));
            path.getElements().add(new LineTo(x3+320, y3-20));
            path.getElements().add(new LineTo(x3+390, y3-20));
            path.getElements().add(new LineTo(x3+390, y3));
            path.getElements().add(new LineTo(x3+1150, y3));
            path.getElements().add(new LineTo(x3+1150, y3-15));
            path.getElements().add(new LineTo(x3+1150, y3+15));
            path.getElements().add(new LineTo(x3+1150, y3+5));



            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(5));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }
        
        //Pier 1 gate1
        if(source == btn_gate11){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 570, y1));
            path.getElements().add(new LineTo(x1 + 570, y1+50));
            path.getElements().add(new LineTo(x1 + 580, y1+50));
//            path.getElements().add(new LineTo(x1 + 830, y1));
//            path.getElements().add(new LineTo(x1 + 875, y1+30));
//            path.getElements().add(new LineTo(x1 + 915, y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

        //Pier 1 gate2
        if(source == btn_gate21){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 735, y1));
            path.getElements().add(new LineTo(x1 + 735, y1+50));
            path.getElements().add(new LineTo(x1 + 745, y1+50));
//            path.getElements().add(new LineTo(x1 + 830, y1));
//            path.getElements().add(new LineTo(x1 + 875, y1+30));
//            path.getElements().add(new LineTo(x1 + 915, y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate3
        if(source == btn_gate31){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 960, y1));
            path.getElements().add(new LineTo(x1 + 960, y1+50));
            path.getElements().add(new LineTo(x1 + 975, y1+50));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate4
        if(source == btn_gate41){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 1110 , y1));
            path.getElements().add(new LineTo(x1 + 1110, y1+50));
            path.getElements().add(new LineTo(x1 + 1115, y1+50));

//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate5
        if(source == btn_gate51){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 1110 , y1));
            path.getElements().add(new LineTo(x1 + 1110, y1-50));
            path.getElements().add(new LineTo(x1 + 1105, y1-50));

//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate6
        if(source == btn_gate61){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 830, y1));
            path.getElements().add(new LineTo(x1 + 875, y1+30));
            path.getElements().add(new LineTo(x1 + 915, y1));
            path.getElements().add(new LineTo(x1 + 960, y1));
            path.getElements().add(new LineTo(x1 + 960, y1-50));
            path.getElements().add(new LineTo(x1 + 975, y1-50));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate7
        if(source == btn_gate71){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 735, y1));
            path.getElements().add(new LineTo(x1 + 735, y1-50));
            path.getElements().add(new LineTo(x1 + 745, y1-50));
//            path.getElements().add(new LineTo(x1 + 830, y1));
//            path.getElements().add(new LineTo(x1 + 875, y1+30));
//            path.getElements().add(new LineTo(x1 + 915, y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }
        //Pier 1 gate8
        if(source == btn_gate81){
            trans.pause();
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(3);
            path.setStroke(Color.YELLOW);

            loc.setLayoutX(0);
            loc.setLayoutY(-10);

            path.getElements().add(new MoveTo(x1, y1));
            path.getElements().add(new LineTo(x1 +  315, y1));
            path.getElements().add(new LineTo(x1 + 415, y1 + 40));
            path.getElements().add(new LineTo(x1 + 525, y1));
            path.getElements().add(new LineTo(x1 + 570, y1));
            path.getElements().add(new LineTo(x1 + 570, y1-50));
            path.getElements().add(new LineTo(x1 + 580, y1-50));
//            path.getElements().add(new LineTo(x1 + 830, y1));
//            path.getElements().add(new LineTo(x1 + 875, y1+30));
//            path.getElements().add(new LineTo(x1 + 915, y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1));
//            path.getElements().add(new LineTo(x1 + 1180 , y1 + 10));
//            path.getElements().add(new LineTo(x1 + 1190 , y1 + 10));

            trans.setPath(path);
            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));

            trans.setCycleCount(1);
            trans.play();
        }

    }
}
