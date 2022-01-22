import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Week8Lab
{
    public void run()
    {
        Scanner scanner = new Scanner( System.in );
        CodonTable codonTable = new CodonTable();

        System.out.println( "Please enter a codon sequence" );
        String codon = scanner.nextLine();

        while( !codon.equalsIgnoreCase("quit") )
        {
            ArrayList<String> codons = new ArrayList<>();

            for (int i = 0; i < codon.length(); i+=3)
            {
                String triplet = codon.substring( i, i+3 );
                codons.add( triplet );
            }

            Iterator<String> itr = codons.iterator();

            while ( itr.hasNext() )
            {
                String acid = codonTable.getAminoAcidSequence( itr.next() );

                if(acid == null)
                {
                    System.out.print(  "<INVALID>" );
                }
                else {
                    System.out.print( acid );
                }
            }
            System.out.println();
            System.out.println( "Please enter a codon sequence" );
            codon = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Week8Lab lab = new Week8Lab();
        lab.run();
    }
}
