import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CPADirectoryMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainWindow) throws Exception {
        mainWindow.setTitle("CPA Passenger Assistance Directory - prototype version 0.0.0.1");
        //declaration of the main/root layout
        BorderPane mainLayout;

        // Create the Text Nodes, buttons can also be created in this section
        Text centerText = new Text("Center");
        Text topText = new Text("Top");
        Text rightText = new Text("Right");
        Text bottomText = new Text("Bottom");
        Text leftText = new Text("Left");

        // Set the alignment of the Top Text to Center
        BorderPane.setAlignment(topText, Pos.CENTER);
        // Set the alignment of the Bottom Text to Center
        BorderPane.setAlignment(bottomText,Pos.BOTTOM_CENTER);
        // Set the alignment of the Left Text to Center
        BorderPane.setAlignment(leftText,Pos.CENTER_LEFT);
        // Set the alignment of the Right Text to Center
        BorderPane.setAlignment(rightText,Pos.CENTER_RIGHT);

        // Create a BorderPane with a Text node in each of the five regions
        mainLayout = new BorderPane(centerText, topText, rightText, bottomText, leftText);

        // Set the Size of the VBox
        mainLayout.setPrefSize(400, 400);
        // Set the Style-properties of the BorderPane
        //TODO: study CSS to design the page easier
        mainLayout.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Scene mainContent = new Scene(mainLayout, 1024, 768);
        mainWindow.setScene(mainContent);
        mainWindow.show();
    }

}