/**
 * FindProtein.java:
 * Pick protein form the DNA strands
 *
 * @author Sishi Cheng
 */

/**
 *Define a new class called FindProtein
 */

public class FindProtein {

    /**
     * Replace any values that are not A, C, T, or G with an A.
     *
     * @param s The DNA strands that need to be process
     * @return s The DNA strands after process
     */

    public String replaceX( String s )
    {
        for( int i = 0; i < s.length(); i++ )
        {
            if( s.charAt( i ) != 'A' && s.charAt( i ) != 'C' && s.charAt( i ) != 'T' && s.charAt( i ) != 'G' )
            {
                s = s.replace( s.charAt( i ), 'A');
            }
        }
        return s;
    }

    /**
     * Add A’s at the end until the length of the coding region is evenly
     * divisible by 3.
     *
     * @param s The DNA strands that need to be process
     * @return s The DNA strands after process
     */

    public String divisible( String s )
    {
        s = replaceX( s );
        if ( s.length() % 3 == 2)
        {
            s += "A";
        }
        else if ( s.length() % 3 == 1 )
        {
            s +=  "AA";
        }

        return s;
    }

    /**
     * Pick the print the protein from the given DNA strands
     *
     * @param s The DNA strands that are given
     */

    public void pickProtein( String s )
    {
        s = divisible( s ) + "TGA";
        for ( int i = 0; i < s.length(); i += 3 ) {
            if( s.substring( i, i + 3 ).equals( "ATG" ) )
            {
                for ( int j = i+3; j < s.length(); j += 3 )
                {
                    if( s.substring( j, j + 3 ).equals( "TAA" ) || s.substring( j, j + 3 ).equals( "TGA" ) || s.substring( j, j + 3 ).equals( "TAG" ) )
                    {
                        System.out.println( s.substring( i, j+3 ) );
                        i = j;
                        break;
                    }
                }
            }
        }
    }
}
