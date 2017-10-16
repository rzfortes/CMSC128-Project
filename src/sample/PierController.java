package sample;

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
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
        x1 = loc.getLayoutX()+loc.getLayoutBounds().getWidth()/2;
        y1 = loc.getLayoutY()+loc.getLayoutBounds().getHeight()/2;
        x3 = loc3.getLayoutX()+loc3.getLayoutBounds().getWidth()/2;
        y3 = loc3.getLayoutY()+loc3.getLayoutBounds().getHeight()/2;
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
        //pier 1 toilet
        if(source == btn_toilets1){
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(5);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x1,y1));
            path.getElements().add(new LineTo(x1+145, y1));
            path.getElements().add(new LineTo(x1+145, y1-25));

            loc.setLayoutX(0);
            loc.setLayoutY(-15);

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //pier 3 toilet
        if(source == btn_toilets3){
            apane.getChildren().remove(path);
            path = new Path();
            apane.getChildren().add(path);
            path.setStrokeWidth(5);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x3,y3));
            path.getElements().add(new LineTo(x3+145, y3));
            path.getElements().add(new LineTo(x3+145, y3-25));

            loc3.setLayoutX(0);
            loc3.setLayoutY(-15);

            trans.setNode(loc3);
            trans.setDuration(Duration.seconds(2));
            trans.setPath(path);
            trans.setCycleCount(1);
            trans.play();
        }

        //pier 1 canteen
        if(source == btn_canteen1){
            apane1.getChildren().remove(path);
            path = new Path();
            apane1.getChildren().add(path);
            path.setStrokeWidth(5);
            path.setStroke(Color.YELLOW);
            path.getElements().add(new MoveTo(x1,y1));
            path.getElements().add(new LineTo(x1+250, y1));
            path.getElements().add(new LineTo(x1+250, y1-25));

            loc.setLayoutX(0);
            loc.setLayoutY(-15);

            trans.setNode(loc);
            trans.setDuration(Duration.seconds(2));
            trans.setCycleCount(1);
            trans.setPath(path);
            trans.play();
        }



    }


}