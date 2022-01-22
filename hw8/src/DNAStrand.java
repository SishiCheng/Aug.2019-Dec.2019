/**
 * DNAStrand.java:
 * This class represents a DNA strand
 *
 * @author Sishi Cheng
 */
import java.util.ArrayList;

/**
 *Define a new class called DNAStrand
 */

public class DNAStrand
{
    private String dna; //The dna strand represented as text

    //The arraylist that save the protein coding region
    ArrayList<String> pcrs = new ArrayList<>();

    /**
     * One argument constructor, initializes the class with the dna string
     *
     * @param dna The dna strand the class is representing
     */
    public DNAStrand( String dna )
    {
        this.dna = dna;
        this.scrubDNA();

        //Need to handle situation where a DNA strand does not evenly slice
        if( this.dna.length() % 3 != 0 )
        {
            if( this.dna.length() % 3 == 1 )
            {
                this.dna += "AA";
            }
            else if( this.dna.length() %3 == 2 )
            {
                this.dna += "A";
            }
        }
    }

    /**
     * Cleans up the DNA, removing X's and N's
     *
     * (Note: I forgot to mention the Ns in the last spec...if you left them in you will not loose points)
     */
    private void scrubDNA()
    {
        this.dna = this.dna.replaceAll( "X", "A" );
        this.dna = this.dna.replaceAll( "N", "A" );
    }

    /**
     * Finds the protein coding regions and prints them to the screen
     */
    public void findPCRs()
    {
        //Create a boolean variable to check whether the codon is in sequences
        boolean inSeq = false;

        //Create a String variable named protein
        String protein = "";

        for( int i = 0; i < this.dna.length(); i += 3 )
        {
            char c1 = this.dna.charAt( i );
            char c2 = this.dna.charAt( i + 1 );
            char c3 = this.dna.charAt( i + 2 );

            //Creat a String variable to combine the codon
            String codon = new Character( c1 ).toString() + c2 + c3;

            if( codon.equals( "ATG" ) )
            {
                protein += codon;
                inSeq = true;
            }
            else if( inSeq && ( codon.equals( "TAA" ) || codon.equals( "TAG" ) || codon.equals( "TGA" ) ) )
            {
                protein += codon;
                pcrs.add( protein );
                protein = "";
                inSeq = false;
            }
            else if( inSeq )
            {
                protein += codon;
            }
        }

        /*
        Need to shut a sequence if we finish the parse and we are still in a sequence.  Most likely biologists would
        not agree with just sticking a TGA on the end of an incomplete coding region, but I am going to do it anyway.
        */
        if( inSeq )
        {
            protein += "TGA";
            pcrs.add( protein );
            protein = "";
        }

    }
}