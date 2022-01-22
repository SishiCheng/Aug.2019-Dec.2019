/**
 * Program8.java:
 * Main class for my homework 8
 *
 * @author Sishi Cheng
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Define a new class called Program8
 */

public class Program8
{
    /**
     * Function main begins with program execution
     *
     * @param args Command line arguments (not used here)
     */
    public static void main(String[] args)
    {
        //Create a Scanner variable to read the user's input of the file path
        Scanner scan = new Scanner(System.in);

        System.out.println( "Please enter the full path to the fasta file." );

        //Create a String variable to save the user's input
        String filepath = scan.nextLine();

        //Create a file variable
        File dnaFile = new File( filepath );

        //Create a Scanner variable to read the file
        Scanner fileScan = null;

        //Attempt to open a connection to the file
        try
        {
            //Create a Scanner variable to read the file
            fileScan = new Scanner( dnaFile );
        }
        catch ( FileNotFoundException fnfe )
        {
            System.out.println( "The file could not be found, shutting down" );
            System.exit( 1 );
        }

        //Create a Scanner variable to read the user's input
        Scanner keyboard = new Scanner( System.in );

        //Create a String variable to save the user's choice
        String input = "0";

        while ( !input.equals( "1" ) && !input.equals( "2" ) && !input.equals( "3" ))
        {
            System.out.print( "What kind of output you want: " );

            input = keyboard.nextLine();

            if ( !input.equals( "1" ) && !input.equals( "2" ) && !input.equals( "3" ) )
            {
                System.out.print( "INVALID! Please input again. " );
            }

        }

        //This is just more memory efficient, if you just used a String don't worry that is acceptable too
        StringBuilder dna = new StringBuilder();

        //Create a ProteinCodingRegion to use the method in it
        ProteinCodingRegion p = new ProteinCodingRegion();

        while( fileScan.hasNextLine() )
        {
            //Create a String variable to save the file input
            String line = fileScan.nextLine().trim();

            //If we encounter the >, then we are at a new strand
            if( line.length() > 0 && line.charAt( 0 ) == '>' )
            {
                DNAStrand strand = new DNAStrand( dna.toString() );

                strand.findPCRs();

                if( input.equals( "1" ) )
                {
                    for( int i = 0; i < strand.pcrs.size(); i++)
                    {
                        System.out.println(strand.pcrs.get(i));
                        System.out.println();
                    }

                }
                else if( input.equals( "2" ))
                {
                    for( int i = 0; i < strand.pcrs.size(); i++)
                    {
                        p.mRNA(strand.pcrs.get( i ));
                        System.out.println();
                    }
                }
                else {
                    for( int i = 0; i < strand.pcrs.size(); i++)
                    {
                        p.aminoAcid(strand.pcrs.get( i ));
                        System.out.println();
                        System.out.println();
                    }
                }

                System.out.println();
                System.out.println( line );

                dna = new StringBuilder();
            }
            //If we get a line with one character ignore it
            else if( line.length() == 1 )
            {
                //do nothing
            }
            //Otherwise the line is part of the DNA strand
            else
            {
                dna.append( line );
            }
        }

        //There will be one last DNA strand that is not printed out, this will print it out
        DNAStrand strand = new DNAStrand( dna.toString() );

        strand.findPCRs();

        if( input.equals( "1" ) )
        {
            for( int i = 0; i < strand.pcrs.size(); i++)
            {
                System.out.println(strand.pcrs.get(i));
            }
        }
        else if( input.equals( "2" ))
        {
            for( int i = 0; i < strand.pcrs.size(); i++)
            {
                p.mRNA(strand.pcrs.get( i ));
            }
        }
        else {
            for( int i = 0; i < strand.pcrs.size(); i++)
            {
                p.aminoAcid(strand.pcrs.get( i ));
                System.out.println();
            }
        }
    }
}
