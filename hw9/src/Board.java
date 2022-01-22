/**
 * Board.java:
 * Main class for my homework 9
 *
 * @author Sishi Cheng
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 *Define a new class called Board
 */

public class Board extends Application {

    //Create a 2D array which collect int
    int[][] record = new int[7][6];

    //Create an 2D arraylist which collect label
    ArrayList<ArrayList<Label>> spot = new ArrayList<>();

    //Create a variable named click to handle which turn
    private int click = 0;

    //Create a boolean variable to determine whether the game end
    private boolean whetherEnd = false;

    //Create a Label variable to show the game result
    private Label label;

    /**
     * Function start create the board
     *
     * @param primaryStage The window
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Create a Button variable to let the users select the column1
        Button c1 = new Button( "C1");

        //Create a Button variable to let the users select the column2
        Button c2 = new Button( "C2");

        //Create a Button variable to let the users select the column3
        Button c3 = new Button( "C3");

        //Create a Button variable to let the users select the column4
        Button c4 = new Button( "C4");

        //Create a Button variable to let the users select the column5
        Button c5 = new Button( "C5");

        //Create a Button variable to let the users select the column6
        Button c6 = new Button( "C6");

        //Create a Button variable to let the users select the column7
        Button c7 = new Button( "C7");

        c1.setOnAction( new c1ButtonHandler() );
        c2.setOnAction( new c2ButtonHandler() );
        c3.setOnAction( new c3ButtonHandler() );
        c4.setOnAction( new c4ButtonHandler() );
        c5.setOnAction( new c5ButtonHandler() );
        c6.setOnAction( new c6ButtonHandler() );
        c7.setOnAction( new c7ButtonHandler() );

        //Create a gridpane layout container for buttons
        GridPane gridPane1 = new GridPane();
        gridPane1.add( c1, 0, 0 );
        gridPane1.add( c2, 1, 0 );
        gridPane1.add( c3, 2, 0 );
        gridPane1.add( c4, 3, 0 );
        gridPane1.add( c5, 4, 0 );
        gridPane1.add( c6, 5, 0 );
        gridPane1.add( c7, 6, 0 );

        //Create a gridpane layout container for labels
        GridPane gridPane2 = new GridPane();

        for ( int i = 0; i < 7; i++ )
        {
            spot.add(new ArrayList<>());
            for ( int j = 0; j < 6; j++ )
            {
                record[i][j] = 2;
                Label temp = new Label( " " );
                spot.get(i).add( temp );
                gridPane2.add( spot.get(i).get(j), i, j );
            }
        }

        gridPane2.setGridLinesVisible( true );
        gridPane2.setAlignment(Pos.CENTER);

        //Create a Button variable to reset the game
        Button reset = new Button( "Reset");
        reset.setOnAction( new resetButtonHandler() );

        label = new Label( " ");

        //Create a vbox layout container
        VBox vbox = new VBox( 10, gridPane1, gridPane2, label, reset );
        vbox.setAlignment(Pos.CENTER);

        //Create a scene to control the objects in GUI
        Scene scene = new Scene( vbox );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "Week 9 HW" );
        primaryStage.show();
    }

    /**
     * Launch the application
     *
     * @param args Command line arguments (not used here)
     */
    public static void main(String[] args) {
        launch( args );
    }

    /**
     *Define a listener class for reset button
     */

    class resetButtonHandler implements EventHandler< ActionEvent >
    {
        /**
         * override the handle method and call the forreset method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {
            forReset();
        }
    }

    /**
     *Define a listener class for c1 button
     */

    class c1ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if ( !whetherEnd )
            {
                if( record[ 0 ][ 0 ] == 2 )
                {
                    findSpot( 0 );
                }
            }

        }
    }

    /**
     *Define a listener class for c2 button
     */

    class c2ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if( !whetherEnd )
            {

                if( record[ 1 ][ 0 ] == 2)
                {
                    findSpot(  1);
                }
            }

        }
    }

    /**
     *Define a listener class for c3 button
     */

    class c3ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if( !whetherEnd )
            {

                if( record[ 2 ][ 0 ] == 2)
                {
                    findSpot( 2 );
                }
            }


        }
    }

    /**
     *Define a listener class for c4 button
     */

    class c4ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if( !whetherEnd )
            {

                if( record[ 3 ][ 0 ] == 2)
                {
                    findSpot(  3);
                }
            }

        }
    }

    /**
     *Define a listener class for c5 button
     */

    class c5ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if( !whetherEnd )
            {

                if( record[ 4 ][ 0 ] == 2)
                {
                    findSpot(  4);
                }
            }

        }
    }

    /**
     *Define a listener class for c6 button
     */

    class c6ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if ( !whetherEnd )
            {

                if( record[ 5 ][ 0 ] == 2 )
                {
                    findSpot(  5 );
                }
            }

        }
    }

    /**
     *Define a listener class for c7 button
     */

    class c7ButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and call the findspot method
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle(ActionEvent event) {

            if ( !whetherEnd )
            {

                if( record[ 6 ][ 0 ] == 2)
                {
                    findSpot( 6 );
                }
            }

        }
    }

    /**
     * Method find spot of that column to occupy
     *
     * @param columnNumber the column which the player choose
     */
    public void findSpot( int columnNumber )
    {
        click += 1;
        for ( int i = 5; i > -1; i-- )
        {
            if ( spot.get( columnNumber ).get(i).getText().equals( " " ) )
            {
                if ( click % 2 == 0 ) {
                    spot.get( columnNumber ).get(i).setText( " B " );
                    record[columnNumber][i] = 1;
                    break;
                }
                else {
                    spot.get( columnNumber ).get(i).setText( " R " );
                    record[columnNumber][i] = 0;
                    break;
                }
            }
        }
        whoWins( );
    }

    /**
     * Method forreset reset the game
     *
     */
    public void forReset()
    {
        whetherEnd = false;
        click = 0;
        for ( int i = 0; i < 7; i++ )
        {
            for ( int j = 0; j < 6; j++ )
            {
                record[ i ][ j ] = 2;
                spot.get(i).get(j).setText(" ");
            }
        }
        label.setText( " " );
    }

    /**
     * Method whoWins determine the winner or this is a tie
     *
     */
    public void whoWins()
    {

        for ( int i = 5; i >= 0; i -- )
        {
            for ( int j = 0; j < 4; j ++ )
            {
                if ( record[ j ][ i ] != 2) {
                    if (record[j][i] == record[j+1][i] && record[j+1][i] == record[j+2][i] && record[j+2][i] == record[j+3][i]) {
                        if (record[j][i] == 0) {
                            System.out.println( "Red Wins!" );
                            label.setText( " Red Wins! ");
                            whetherEnd = true;
                            return;
                        } else if (record[j][i] == 1) {
                            System.out.println( "Black Wins!" );
                            label.setText( " Black Wins! ");
                            whetherEnd = true;
                            return;
                        }
                    }
                }
            }
        }

        for ( int i = 0; i <7; i ++ )
        {
            for ( int j = 5; j > 2; j -- )
            {
                if ( record[ i ][ j ] != 2) {
                    if (record[i][j] == record[i][j-1] && record[i][j-1] == record[i][j-2] && record[i][j-2] == record[i][j-3]) {
                        if (record[i][j] == 0) {
                            System.out.println("Red Wins!");
                            label.setText( " Red Wins! ");
                            whetherEnd = true;
                            return;
                        } else if (record[i][j] == 1) {
                            System.out.println("Black Wins!");
                            label.setText( " Black Wins! ");
                            whetherEnd = true;
                            return;
                        }
                    }
                }
            }
        }

        for( int i = 2; i > -1; i -- )
        {
            for( int j = 0; j < 4; j++ )
            {
                if ( record[ j ][ i ] == record[ j + 1 ][ i + 1 ] && record[ j + 1 ][ i + 1 ] == record[ j + 2][ i + 2 ] && record[ j + 2][ i + 2] == record[ j + 3 ][ i + 3])
                {
                    if (record[j][i] == 0) {
                        System.out.println("Red Wins!");
                        label.setText( " Red Wins! ");
                        whetherEnd = true;
                        return;
                    } else if (record[j][i] == 1) {
                        System.out.println("Black Wins!");
                        label.setText( " Black Wins! ");
                        whetherEnd = true;
                        return;
                    }
                }
            }
        }

        for( int i = 2; i > -1; i -- )
        {
            for( int j = 4; j < 7; j++ )
            {
                if ( record[ j ][ i ] == record[ j - 1 ][ i + 1 ] && record[ j - 1 ][ i + 1 ] == record[ j - 2][ i + 2 ] && record[ j - 2][ i + 2] == record[ j - 3 ][ i + 3])
                {
                    if (record[j][i] == 0) {
                        System.out.println("Red Wins!");
                        label.setText( " Red Wins! ");
                        whetherEnd = true;
                        return;
                    } else if (record[j][i] == 1) {
                        System.out.println("Black Wins!");
                        label.setText( " Black Wins! ");
                        whetherEnd = true;
                        return;
                    }
                }
            }
        }

        for( int i = 3; i < 6; i ++ )
        {
            for( int j = 0; j < 4; j++ )
            {
                if ( record[ j ][ i ] == record[ j + 1 ][ i - 1 ] && record[ j + 1 ][ i - 1 ] == record[ j + 2][ i - 2 ] && record[ j + 2][ i - 2] == record[ j + 3 ][ i - 3])
                {
                    if (record[j][i] == 0) {
                        System.out.println("Red Wins!");
                        label.setText( " Red Wins! ");
                        whetherEnd = true;
                        return;
                    } else if (record[j][i] == 1) {
                        System.out.println("Black Wins!");
                        label.setText( " Black Wins! ");
                        whetherEnd = true;
                        return;
                    }
                }
            }
        }

        for( int i = 3; i < 6; i ++ )
        {
            for( int j = 4; j < 7; j++ )
            {
                if ( record[ j ][ i ] == record[ j - 1 ][ i - 1 ] && record[ j - 1 ][ i - 1 ] == record[ j - 2][ i - 2 ] && record[ j - 2][ i - 2] == record[ j - 3 ][ i - 3])
                {
                    if (record[j][i] == 0) {
                        System.out.println("Red Wins!");
                        label.setText( " Red Wins! ");
                        whetherEnd = true;
                        return;
                    } else if (record[j][i] == 1) {
                        System.out.println("Black Wins!");
                        label.setText( " Black Wins! ");
                        whetherEnd = true;
                        return;
                    }
                }
            }
        }

        if( record[ 0 ][ 0 ] != 2 && record[ 1 ][ 0 ] != 2 && record[ 2 ][ 0 ] != 2 && record[ 3 ][ 0 ] != 2
            && record[ 4 ][ 0 ] != 2 && record[ 5 ][ 0 ] != 2 && record[ 6 ][ 0 ] != 2)
        {
            System.out.println("This is a tie");
            label.setText( " This is a tie ");
            whetherEnd = true;
            return;
        }
    }
}
