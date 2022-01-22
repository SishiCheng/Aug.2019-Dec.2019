/*
    Button 4 times the number in the label itself
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Week9Lab extends Application
{

    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Button decrement = new Button( "-");
        decrement.setOnAction( new decreaseButtonHandler() );
        this.resultLabel = new Label( "0" );
        resultLabel.setAlignment( Pos.CENTER );
        resultLabel.setMinWidth( 40 );
        Button increment = new Button( "+");
        increment.setOnAction( new increaseButtonHandler() );
        Button timesItself = new Button( "Random");
        timesItself.setOnAction( new timesButtonHandler() );

        HBox hBox = new HBox( 10, decrement, resultLabel, increment);
        VBox vBox = new VBox( 10, hBox, timesItself );
        hBox.setAlignment( Pos.CENTER );
        vBox.setAlignment( Pos.CENTER );

        Scene scene = new Scene( vBox, 200, 200 );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "Week 9 Lab" );
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch( args );
    }

    class decreaseButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event) {
            int num = new Integer( resultLabel.getText() )-1;
            resultLabel.setText( new Integer( num ).toString() );
        }
    }

    class increaseButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event) {
            int num = new Integer( resultLabel.getText() )+1;
            resultLabel.setText( new Integer( num ).toString() );
        }
    }

    class timesButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event) {
            int num = new Integer( resultLabel.getText() )*new Integer( resultLabel.getText() );
            resultLabel.setText( new Integer( num ).toString() );
        }
    }
}
