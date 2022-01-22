package edu.psu.bd.cs.smc6823.jdbchw.main;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;
import java.util.ArrayList;

/**
 * main.java:
 * Main class for my homework 13
 *
 * @author Sishi Cheng
 */

public class main extends Application {

    //Create a textfield for user to input the country name
    private TextField searchName;

    //Create a textfield for user to input the country code
    private TextField searchCode;

    //Create a textfield for user to change the country name
    private TextField nameTextField;

    //Create a textfield for user to change the country code
    private TextField codeTextField;

    //Create a textfield for user to change the head of state
    private TextField headOfStateTextField;

    //Create a label named languageSpoken
    private Label languageSpoken;

    //Create a label named allCities
    private Label allCities;

    //Create a button named searchButton
    private Button searchButton;

    //Create a button named previousButton
    private Button previousButton;

    //Create a button named nextButton
    private Button nextButton;

    //Create a connection named c
    private Connection c;

    //Create an arraylist to store the countries which from the result
    ArrayList< Operation > anyCountries = new ArrayList<Operation>();

    //Create a listview named languages
    ListView < String > languages = new ListView<String>();

    //Create a listview named cities
    ListView < String > cities = new ListView<String>() ;

    //Create an int variable named count
    private int count = 0;

    /**
     * Function start create the board
     *
     * @param primaryStage The window
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //create a label to prompt
        Label promptLabel1 = new Label( "Country name: " );

        //initialize the searchName variable
        this.searchName = new TextField();
        searchName.setMinWidth( 200 );

        //create a label to prompt
        Label promptLabel2 = new Label( "Country code: " );

        //initialize the searchCode variable
        this.searchCode = new TextField();

        //initialize the searchButton variable
        this.searchButton = new Button( "Search" );
        searchButton.setOnAction( new SearchButtonHandler() );

        //Create a label named countryName
        Label countryName = new Label( "Country Name: " );

        //initialize the nameTextField variable
        this.nameTextField = new TextField();
        nameTextField.setMinWidth( 200 );

        //Create a label named countryCode
        Label countryCode = new Label( "Country Code: " );

        //initialize the codeTextField variable
        this.codeTextField = new TextField();

        //Create a label named headOfState
        Label headOfState = new Label( "Head Of State: " );

        //initialize the headOfStateTextField variable
        this.headOfStateTextField = new TextField();
        headOfStateTextField.setMinWidth( 200 );

        //initialize the languageSpoken variable
        this.languageSpoken = new Label( "List of Languages Spoken: " );

        //initialize the allCities variable
        this.allCities = new Label( "List of All Cities: " );

        //initialize the previousButton variable
        previousButton = new Button( "Previous" );
        previousButton.setOnAction( new PreviousButtonHandler() );

        //initialize the nextButton variable
        nextButton = new Button( "Next" );
        nextButton.setOnAction( new NextButtonHandler() );

        //Creat a HBox to let the promptLabel1 and searchName textfield in a horizontal line
        HBox promptBox1 = new HBox( 10, promptLabel1, this.searchName );

        //Creat a HBox to let the promptLabel2 and searchCode textfield in a horizontal line
        HBox promptBox2 = new HBox( 10, promptLabel2, this.searchCode );

        //Creat a VBox to let the promptBoxs in a vertical line
        VBox topSection = new VBox( 10, promptBox1, promptBox2, searchButton );

        //Creat a HBox to let the countryName label and nameTextField in a horizontal line
        HBox nameBox = new HBox( 10, countryName, this.nameTextField );

        //Creat a HBox to let the countryCode label and codeTextField in a horizontal line
        HBox codeBox = new HBox( 10, countryCode, codeTextField );

        //Creat a HBox to let the  headOfState label and headOdStateTextField in a horizontal line
        HBox headOfStateBox = new HBox( 10, headOfState, headOfStateTextField );

        //Creat a HBox to let the previous button and next button in a horizontal line
        HBox buttonBox = new HBox( 10, previousButton, nextButton );

        //Creat a HBox to let the botton section in a vertical line
        VBox bottonSection = new VBox( 10, nameBox, codeBox, headOfStateBox,  languageSpoken, languages, allCities, cities, buttonBox );

        //Creat a HBox to combine the top and botton sections
        VBox mainVBox = new VBox( 10, topSection, bottonSection );

        mainVBox.setAlignment( Pos.TOP_LEFT );

        mainVBox.setPadding( new Insets( 10 ) );

        //Create a scene to control the objects in GUI
        Scene scene = new Scene( mainVBox, 1200, 600 );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "Hw 13" );
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
     *Define a listener class for search button
     */
    private class SearchButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and fill the textfields
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle( ActionEvent event ) {
            nameTextField.setText("");
            codeTextField.setText("");
            headOfStateTextField.setText("");
            languages.getItems().clear();
            cities.getItems().clear();
            count = 0;
            anyCountries.clear();

            if (!searchName.getText().equals(""))
            {
                try
                {
                    c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Cici\\IdeaProjects\\jdbchw\\src\\main\\resources\\World");

                    //Create a sql string
                    String sql = "SELECT * FROM Country WHERE Name Like ?";

                    //Create a preparestatement variable to escape the characters in the query
                    PreparedStatement p = c.prepareStatement( sql );
                    p.setString(1, "%" + searchName.getText() + "%" );

                    //create a resultset variable to iterate over and get field
                    ResultSet r = p.executeQuery();
                    while ( r.next() )
                    {
                        //Create a Operation object called temp
                        Operation temp = new Operation();
                        temp.setCountryName( r.getString( "Name" ));
                        temp.setCountryCode( "" );
                        anyCountries.add( temp );
                    }
                    r.close();

                    if( anyCountries.size() > 0 )
                    {
                        nameTextField.setText( anyCountries.get(count).getCountryName());
                        codeTextField.setText( anyCountries.get(count).getCountryCode());
                        headOfStateTextField.setText( anyCountries.get(count).getHeadOfState());

                        //Create a ObervableList named languageList
                        ObservableList<String> languageList = FXCollections.observableArrayList( anyCountries.get( count ).getLanguages() );
                        languages.getItems().addAll( languageList );

                        //Create a ObervableList named cityList
                        ObservableList<String> cityList = FXCollections.observableArrayList( anyCountries.get( count ).getCities() );
                        cities.getItems().addAll( cityList );
                    }

                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            else if( !searchCode.getText().equals("") )
            {
                try
                {
                    c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Cici\\IdeaProjects\\jdbchw\\src\\main\\resources\\World");
                    //Create a sql string
                    String sql = "SELECT * FROM Country WHERE Code = ?";

                    //Create a preparestatement variable to escape the characters in the query
                    PreparedStatement p = c.prepareStatement( sql );
                    p.setString(1, searchCode.getText() );

                    //create a resultset variable to iterate over and get fields
                    ResultSet r = p.executeQuery();

                    if(!r.isClosed())
                    {
                        //Create a Operation object called temp
                        Operation temp = new Operation();
                        temp.setCountryCode( r.getString( "Code"));
                        temp.setCountryName( "" );
                        anyCountries.add( temp );

                        nameTextField.setText( temp.getCountryName() );
                        codeTextField.setText( temp.getCountryCode() );
                        headOfStateTextField.setText( temp.getHeadOfState() );

                        //Create a ObervableList named languageList
                        ObservableList<String> languageList = FXCollections.observableArrayList( temp.getLanguages() );
                        languages.getItems().addAll( languageList );

                        //Create a ObervableList named cityList
                        ObservableList<String> cityList = FXCollections.observableArrayList( temp.getCities() );
                        cities.getItems().addAll( cityList );
                    }

                    r.close();


                }
                catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *Define a listener class for previous button
     */
    private class PreviousButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and move to the previous record
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle( ActionEvent event ) {
            try {
                update();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if( !searchName.equals("") && count > 0 )
            {

                count -= 1;
                try {
                    previousandNext();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *Define a listener class for previous button
     */
    private class NextButtonHandler implements EventHandler< ActionEvent >
    {

        /**
         * override the handle method and move to the next record
         *
         * @param event the action event we need to handle
         */
        @Override
        public void handle( ActionEvent event ) {
            try {
                update();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if( !searchName.equals("") && count < anyCountries.size()-1 )
            {
                count += 1;
                try {
                    previousandNext();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * change the textfield's content
     *
     */
    public void previousandNext() throws SQLException {
        try {
            nameTextField.setText( anyCountries.get(count).getCountryName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            codeTextField.setText( anyCountries.get(count).getCountryCode());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            headOfStateTextField.setText( anyCountries.get(count).getHeadOfState());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ObservableList<String> languageList = FXCollections.observableArrayList( anyCountries.get( count ).getLanguages() );
        languages.getItems().clear();
        languages.getItems().addAll( languageList );

        ObservableList<String> cityList = FXCollections.observableArrayList( anyCountries.get( count ).getCities() );
        cities.getItems().clear();
        cities.getItems().addAll( cityList );

    }

    /**
     * update the code, name or head of state from the database
     *
     */
    public void update() throws SQLException {
        anyCountries.get( count ).updateCode( codeTextField.getText() );
        anyCountries.get( count ).updateName( nameTextField.getText() );
        anyCountries.get( count ).updateHead( headOfStateTextField.getText() );
    }
}

