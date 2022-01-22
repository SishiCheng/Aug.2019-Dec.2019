/**
 * View.java:
 * Main class for my homework 10
 *
 * @author Sishi Cheng
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 *Define a new class called Application
 */

public class View extends Application {

    //Create a radiobutton for user to select pizza small size
    private RadioButton smallButton;

    //Create a radiobutton for user to select pizza medium size
    private RadioButton mediumButton;

    //Create a radiobutton for user to select pizza large size
    private RadioButton largeButton;

    //Create five checkbox for different veggies toppings
    CheckBox peppersCheckBox, onionsCheckBox, mushroomsCheckBox, olivesCheckBox, bananaPeppersCheckBox;

    //Create five checkbox for different meat toppings
    CheckBox hamCheckBox,  pepperoniCheckBox, sausageCheckBox,  salamiCheckBox, chickenCheckBox, steakCheckBox;

    //Create an arraylist to collect pizza in the cart
    ArrayList< Model > pizzaincart = new ArrayList<>();

    /**
     * Function start create the board
     *
     * @param primaryStage The window
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Creat a lable variable name size
        Label size = new Label( "Size:" );

        //initialize the smallButton
        smallButton = new RadioButton( "Small $10.00" );

        //initialize the mediumButton
        mediumButton = new RadioButton( "Medium $11.00" );

        //initialize the largeButton
        largeButton = new RadioButton( "Large $12.00" );

        smallButton.setSelected( true );

        //Creat a togglegroup variable to group the radiobuttons
        ToggleGroup radioGroup = new ToggleGroup();
        smallButton.setToggleGroup( radioGroup );
        mediumButton.setToggleGroup( radioGroup );
        largeButton.setToggleGroup( radioGroup );

        //Creat a lable variable name veggies
        Label veggies = new Label( "Veggies:");

        //initialize the peppersCheckBox
        peppersCheckBox = new CheckBox( "Peppers" );

        //initialize the onionsCheckBox
        onionsCheckBox = new CheckBox( "Onions" );

        //initialize the mushroomsCheckBox
        mushroomsCheckBox = new CheckBox( "Mushrooms" );

        //initialize the olivesCheckBox
        olivesCheckBox = new CheckBox( "Olives" );

        //initialize the bananaPeppersCheckBox
        bananaPeppersCheckBox = new CheckBox( "Banana Peppers" );

        //Creat a label to show prompt of the veggies toppings price
        Label noticeVeggies = new Label( "Each veggie topping is $0.50 extra.");

        //Creat a label named meats
        Label meats = new Label( "Meats:");

        //initialize the hamCheckBox
        hamCheckBox = new CheckBox( "Ham" );

        //initialize the pepperoniCheckBox
        pepperoniCheckBox = new CheckBox( "Pepperoni" );

        //initialize the sausageCheckBox
        sausageCheckBox = new CheckBox( "Sausage" );

        //initialize the salamiCheckBox
        salamiCheckBox = new CheckBox( "Salami" );

        //initialize the chickenCheckBox
        chickenCheckBox = new CheckBox( "Chicken" );

        //initialize the steakCheckBox
        steakCheckBox = new CheckBox( "Steak" );

        //Creat a label to show prompt of the meat toppings price
        Label noticeMeat = new Label("Each meat is $2.00 each, if the user selects more than two, they are $1.50 each.");

        //Creat a Button to add the specific pizza in the pizzaincart arraylist
        Button addToCart = new Button( "Add to Cart");
        addToCart.setOnAction( new addToCartButtonHandler() );

        //Creat a Button to print the bill
        Button done = new Button( "Done");
        done.setOnAction( new doneButtonHandler() );

        //Creat a HBox to let radio button in a horizontal line
        HBox radioBox = new HBox( 10, smallButton, mediumButton, largeButton );

        //Creat a HBox to let veggies' checkbox in a horizontal line
        HBox veggiesBox1 = new HBox( 10, peppersCheckBox, onionsCheckBox, mushroomsCheckBox );

        //Creat a HBox to let veggies' checkbox in a horizontal line
        HBox veggiesBox2 = new HBox( 10, olivesCheckBox, bananaPeppersCheckBox );

        //Creat a HBox to let meats' checkbox in a horizontal line
        HBox meatsBox1 = new HBox( 10, hamCheckBox,  pepperoniCheckBox, sausageCheckBox );

        //Creat a HBox to let meats' checkbox in a horizontal line
        HBox meatsBox2 = new HBox( 10, salamiCheckBox, chickenCheckBox, steakCheckBox );

        //Creat a HBox to let buttons in a horizontal line
        HBox buttonBox = new HBox( 10, addToCart, done );

        //Creat a VBox to let size and veggies toppings part in a vertical line
        VBox upperBox = new VBox( 10, size, radioBox, veggies, veggiesBox1, veggiesBox2, noticeVeggies);

        //Creat a VBox to let meats and button part in a vertical line
        VBox lowerBox = new VBox( 10, meats, meatsBox1, meatsBox2, noticeMeat, buttonBox );

        //Creat a VBox to combine upperBox and lowerBox
        VBox mainBox = new VBox( 10, upperBox, lowerBox );

        mainBox.setAlignment( Pos.CENTER );
        mainBox.setPadding( new Insets( 10 ) );

        //Create a scene to control the objects in GUI
        Scene scene = new Scene( mainBox );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "View" );
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
     *Define a listener class for addToCart button
     */
    private class addToCartButtonHandler implements EventHandler<ActionEvent>
    {

        //Creat a Model variable named pizza
        Model pizza;
        @Override
        public void handle(ActionEvent event) {

            //Initialize the pizza variable by constructor
            pizza = new Model();
            if( mediumButton.isSelected() ) {
                pizza.setSize( "Medium" );
            }
            else if( largeButton.isSelected() ){
                pizza.setSize( "Large" );
            }
            else{
                pizza.setSize( "Small");
            }

            if ( peppersCheckBox.isSelected() )
            {
                pizza.setPeppers();
            }
            if ( onionsCheckBox.isSelected() )
            {
                pizza.setOnions();
            }
            if ( mushroomsCheckBox.isSelected() )
            {
                pizza.setMushrooms();
            }
            if ( olivesCheckBox.isSelected() )
            {
                pizza.setOlives();
            }
            if ( bananaPeppersCheckBox.isSelected() )
            {
                pizza.setBananaPeppers();
            }

            if ( hamCheckBox.isSelected() )
            {
                pizza.setHam();
            }
            if ( pepperoniCheckBox.isSelected() )
            {
                pizza.setPepperoni();
            }
            if ( sausageCheckBox.isSelected() )
            {
                pizza.setSausage();
            }
            if ( salamiCheckBox.isSelected() )
            {
                pizza.setSalami();
            }
            if ( chickenCheckBox.isSelected() )
            {
                pizza.setChicken();
            }
            if ( steakCheckBox.isSelected() )
            {
                pizza.setSteak();
            }

            pizzaincart.add( pizza );

            smallButton.setSelected( true );
            peppersCheckBox.setSelected( false );
            onionsCheckBox.setSelected( false );
            mushroomsCheckBox.setSelected( false );
            peppersCheckBox.setSelected( false );
            olivesCheckBox.setSelected( false );
            bananaPeppersCheckBox.setSelected( false );

            hamCheckBox.setSelected( false );
            pepperoniCheckBox.setSelected( false );
            sausageCheckBox.setSelected( false );
            salamiCheckBox.setSelected( false );
            chickenCheckBox.setSelected( false );
            steakCheckBox.setSelected( false );
        }
    }

    /**
     *Define a listener class for done button
     */
    private class doneButtonHandler implements EventHandler< ActionEvent >
    {

        //Create a double variable named total to count the food total
        double total = 0.00;
        @Override
        public void handle(ActionEvent event) {
            for( int i = 0; i < pizzaincart.size(); i++ )
            {
                System.out.println("1 " + pizzaincart.get(i).getSize()+ " pizza");
                if( pizzaincart.get(i).getPeppers())
                {
                    System.out.println( "     Add Peppers");
                }
                if( pizzaincart.get(i).getOnions())
                {
                    System.out.println( "     Add Onions");
                }
                if( pizzaincart.get(i).getMushrooms())
                {
                    System.out.println( "     Add Mushrooms");
                }
                if( pizzaincart.get(i).getOlives())
                {
                    System.out.println( "     Add Olives");
                }
                if( pizzaincart.get(i).getBananaPeppers())
                {
                    System.out.println( "     Add Banana Peppers");
                }

                if( pizzaincart.get(i).getHam())
                {
                    System.out.println( "     Add Ham");
                }
                if( pizzaincart.get(i).getPepperoni())
                {
                    System.out.println( "     Add Pepperoni");
                }
                if( pizzaincart.get(i).getSausage())
                {
                    System.out.println( "     Add Sausage");
                }
                if( pizzaincart.get(i).getSalami())
                {
                    System.out.println( "     Add Salami");
                }
                if( pizzaincart.get(i).getChicken())
                {
                    System.out.println( "     Add Chicken");
                }
                if( pizzaincart.get(i).getSteak())
                {
                    System.out.println( "     Add Steak");
                }

                total += pizzaincart.get( i ).getPrice();
            }

            //Create a double variable named tax to calculate the tax
            double tax = 0.06 * total;

            //Create a double variable named finaltotal to calculate the total price
            double finalTotal = total + tax;
            System.out.println( "Food Total: $" + String.format( "%,.2f", total ) );
            System.out.println( "Tax:   $" + String.format( "%,.2f", tax ));
            System.out.println();
            System.out.println( "Final Total: $" + String.format( "%,.2f", finalTotal ) );

            System.exit( 0 );
        }
    }
}
