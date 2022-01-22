import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DNAConvert extends Application {
    private RadioButton c1A = new RadioButton( "A");
    private RadioButton c1T = new RadioButton( "T");
    private RadioButton c1G = new RadioButton( "G");
    private RadioButton c1C = new RadioButton( "C");
    ToggleGroup radioGroup1 = new ToggleGroup();

    private RadioButton c2A = new RadioButton( "A");
    private RadioButton c2T = new RadioButton( "T");
    private RadioButton c2G = new RadioButton( "G");
    private RadioButton c2C = new RadioButton( "C");
    ToggleGroup radioGroup2 = new ToggleGroup();

    private RadioButton c3A = new RadioButton( "A");
    private RadioButton c3T = new RadioButton( "T");
    private RadioButton c3G = new RadioButton( "G");
    private RadioButton c3C = new RadioButton( "C");
    ToggleGroup radioGroup3 = new ToggleGroup();

    private Label label = new Label( "" );

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button( "Compute");
        button.setOnAction( new buttonHandler() );

        c1A.setToggleGroup( radioGroup1 );
        c1T.setToggleGroup( radioGroup1 );
        c1G.setToggleGroup( radioGroup1 );
        c1C.setToggleGroup( radioGroup1 );

        c2A.setToggleGroup( radioGroup2 );
        c2T.setToggleGroup( radioGroup2 );
        c2G.setToggleGroup( radioGroup2 );
        c2C.setToggleGroup( radioGroup2 );

        c3A.setToggleGroup( radioGroup3 );
        c3T.setToggleGroup( radioGroup3 );
        c3G.setToggleGroup( radioGroup3 );
        c3C.setToggleGroup( radioGroup3 );

        VBox c1 = new VBox( 10, c1A, c1T, c1G, c1C );
        VBox c2 = new VBox( 10, c2A, c2T, c2G, c2C );
        VBox c3 = new VBox( 10, c3A, c3T, c3G, c3C );
        HBox allC = new HBox( 10, c1, c2, c3 );
        VBox mainBox = new VBox( 10, allC, button, label );
        mainBox.setAlignment( Pos.CENTER );

        Scene scene = new Scene( mainBox );
        primaryStage.setScene( scene );
        primaryStage.setTitle( "DNA Converter" );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch( args );
    }

    private class buttonHandler implements EventHandler< ActionEvent >
    {
        @Override
        public void handle(ActionEvent event) {
            String first = ((RadioButton)radioGroup1.getSelectedToggle()).getText();
            String second = ((RadioButton)radioGroup2.getSelectedToggle()).getText();
            String third = ((RadioButton)radioGroup3.getSelectedToggle()).getText();
            String dna = first + second + third;
            CodonTable temp = new CodonTable();
            label.setText(temp.getAminoAcidSequence( dna ));
        }
    }
}
