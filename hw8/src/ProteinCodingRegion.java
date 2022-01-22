/**
 * ProteinCodingRegion.java:
 * This class print the mRNA and amino acid
 *
 * @author Sishi Cheng
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *Define a new class called ProteinCodingRegion
 */

public class ProteinCodingRegion {

    /**
     * Represent the mRNA of the protein that passed
     *
     * @param s The protein of the DNA
     */
    public void mRNA( String s)
    {
        s = s.replace( "A", "U");
        s = s.replace( "T", "A");
        s = s.replace( "C", "N");
        s = s.replace( "G", "C");
        s = s.replace( "N", "G");

        System.out.println( s );
    }

    /**
     * Represent the amino acid of the protein that passed
     *
     * @param s The protein of the DNA
     */
    public void aminoAcid( String s )
    {
        //Create a Hashmap called table
        HashMap<String, String> table = new HashMap<> ();

        table.put ("TTT", "F");
        table.put ("TTC", "F");
        table.put ("TTA", "L");
        table.put ("TTG", "L");
        table.put ("TCT", "S");
        table.put ("TCC", "S");
        table.put ("TCA", "S");
        table.put ("TCG", "S");
        table.put ("TAT", "Y");
        table.put ("TAC", "Y");
        table.put( "TAA", "STOP");
        table.put( "TAG", "STOP");
        table.put ("TGT", "C");
        table.put ("TGC", "C");
        table.put( "TGA", "STOP");
        table.put ("TGG", "W");
        table.put ("CTT", "L");
        table.put ("CTC", "L");
        table.put ("CTA", "L");
        table.put ("CTG", "L");
        table.put ("CCT", "P");
        table.put ("CCC", "P");
        table.put ("CCA", "P");
        table.put ("CCG", "P");
        table.put ("CAT", "H");
        table.put ("CAC", "H");
        table.put ("CAA", "Q");
        table.put ("CAG", "Q");
        table.put ("CGT", "R");
        table.put ("CGC", "R");
        table.put ("CGA", "R");
        table.put ("CGG", "R");
        table.put ("ATT", "I");
        table.put ("ATC", "I");
        table.put ("ATA", "I");
        table.put ("ATG", "M");
        table.put ("ACT", "T");
        table.put ("ACC", "T");
        table.put ("ACA", "T");
        table.put ("ACG", "T");
        table.put ("AAT", "N");
        table.put ("AAC", "N");
        table.put ("AAA", "K");
        table.put ("AAG", "K");
        table.put ("AGT", "S");
        table.put ("AGC", "S");
        table.put ("AGA", "R");
        table.put ("AGG", "R");
        table.put ("GTT", "V");
        table.put ("GTC", "V");
        table.put ("GTA", "V");
        table.put ("GTG", "V");
        table.put ("GCT", "A");
        table.put ("GCC", "A");
        table.put ("GCA", "A");
        table.put ("GCG", "A");
        table.put ("GAT", "D");
        table.put ("GAC", "D");
        table.put ("GAA", "E");
        table.put ("GAG", "E");
        table.put ("GGT", "G");
        table.put ("GGC", "G");
        table.put ("GGA", "G");
        table.put ("GGG", "G");

        //Create an arraylist to save codons
        ArrayList<String> codons = new ArrayList<>();

        for (int i = 0; i < s.length(); i+=3)
        {
            //Create a String variable to save the triplet
            String triplet = s.substring( i, i+3 );
            codons.add( triplet );
        }

        //Create an Iterator called itr
        Iterator<String> itr = codons.iterator();

        while ( itr.hasNext() )
        {
            //Create a String variable that save the acid
            String acid = table.get( itr.next() );

            if(acid == null)
            {
                System.out.print(  "<INVALID>" );
            }
            else {
                System.out.print( acid );
            }
        }
    }
}
