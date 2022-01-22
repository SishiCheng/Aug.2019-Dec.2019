/**
 * DNAApp.java:
 * Prompt the user for a file containing DNA and pick protein
 *
 * @author Sishi Cheng
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *Define a new class called DNAApp
 */

public class DNAApp {

    /** main program Prompt the user for a file containing DNA
     *  and then call method in FindProtein class to find protein
     */
    public static void main( String[] args ) {
        System.out.println( "Please enter the full path to the fasta file." );

        //Create a Scanner variable to read the user's input
        Scanner keyboard = new Scanner( System.in );

        //Create a file variable to read the user's input
        File file = new File( keyboard.nextLine() );

        //Create a string variable to save the DNA strands
        String input = "";

        //Create a FinaProtein to use the method in it
        FindProtein f = new FindProtein();

        //Create a string variable to save the temporary string
        String test = "xxx";

        try
        {
            //Create a Scanner variable to read the file's input
            Scanner fileScanner = new Scanner( file );

            while ( fileScanner.hasNextLine() )
            {
                while ( fileScanner.hasNextLine() && !test.equals("") && test.charAt( 0 ) != '>' )
                {
                    test = fileScanner.nextLine();
                }
                System.out.println( test );

                input = "";
                test = "xxx";

                while ( fileScanner.hasNextLine() && !test.equals("") && test.charAt( 0 ) != '>')
                {
                    test = fileScanner.nextLine();
                    if (!test.equals("") && test.charAt( 0 ) != '>') input += test;
                }

                f.pickProtein( input );
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
