/**
 * BugDriver.java:
 * Puts a Bug through its paces.
 * 
 * @author Professor Rossi
 */

import wheelsunh.users.*;
import java.awt.Color;

public class BugDriver
{ 
    //---------------- instance variables ------------------------------
    private Bug myBug;
    private TextBox label,  colorLabel, locStartLabel, locEndLabel;   
    
    //--------------- constructor --------------------------------------
    /**
     * 
     *  Construct a Bug and then test it.
     *  TextBox objects are displayed  to show results.
     */
    public BugDriver()
    {
        label = new TextBox( 270, 40 );
        label.setSize( 290, 100 );
        label.setText( "No parameter Constructor" );

        myBug = new Bug();
        
        Utilities.sleep( 2000 );
        
        label.setText( "Two parameter Constructor\n ( 20,200 )" );
        Utilities.sleep( 1000 );
        myBug = new Bug( 20, 200 );
        
        Utilities.sleep( 2000 );
        
        label.setText( "One parameter Constructor\n (ORANGE)" );
        Utilities.sleep( 1000 );
        myBug = new Bug( Color.ORANGE );
        
        Utilities.sleep( 2000 );
        
        label.setText( "SetLocation ( 40, 350 ) " );
        Utilities.sleep( 1000 );
        myBug.setLocation( 40, 350 );
        
        Utilities.sleep( 2000 );
        label.setText( "SetColor (PINK) " );
        Utilities.sleep( 1000 );
        myBug.setColor( Color.pink );
        
        
        Utilities.sleep( 2000 );
        colorLabel = new TextBox( 270, 140 );
        colorLabel.setSize( 290, 100 );
        
        colorLabel.setText( "getColor =  " + myBug.getColor() +
                           "\n ( 225, 175, 175 )" );
        
        Utilities.sleep( 2000 );
        
        locStartLabel = new TextBox( 270, 240 );
        locStartLabel.setSize( 290, 100 );      
        locStartLabel.setText( "Start Location" +
                              "\ngetXlocation =  " +
                              myBug.getXLocation() +
                              "\ngetYLocation = " + 
                              myBug.getYLocation() +
                              "\n (40, 350)\n" );     
        Utilities.sleep( 1000 );
        
        label.setText( "moveDown " );
        Utilities.sleep( 1000 );
        
        for( int i = 0; i < 60; i++ )
        {
            myBug.moveDown( 5 );
            Utilities.sleep( 20 );
        }
        
        locEndLabel = new TextBox( 270, 340 );
        locEndLabel.setSize( 290, 100 ); 
        locEndLabel.setText( "End Location" +
                            "\ngetXlocation = " +
                            myBug.getXLocation() +
                            "\ngetYLocation = " + 
                            myBug.getYLocation());
    }
    
    //-------------------- main ----------------------------------------
    /**
     * Just create a BugDriver object.
     * @param args String
     */
    public static void main( String[] args )
    {
        new Frame();
        new BugDriver();
    }
}
