import wheelsunh.users.*;
import java.util.*;
import java.awt.event.*;
import java.util.Scanner;

/**--------------------------------------------------------
 * KeyboardApp.java:
  * Pig Latin Translator
  * 
  * 
  * @author txr185
  */

public class KeyboardApp 
{
    //--------------------------------------------------------
    /** Creates a Frame and a KeyBoardApp. 
      *
      * @param args String[]
      */
    public static void main( String args[] )
    {
        StringUtilities s = new StringUtilities();
        String input;
        Scanner keyboard = new Scanner( System.in );

        while( true ) {
            input = keyboard.nextLine();
            if(input.equals("quit")) {
                return;
            }
            else {
                System.out.println( input + " : " + s.translate( input ) );
            }
        }
    }
}
