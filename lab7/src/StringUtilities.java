import java.util.*;
import java.awt.event.*;

/**---------------------------------------------------------------------
  * StringUtilities.
  * 
  * @author txr185
  */
public class StringUtilities
{
    //-----------------------------------------------------------------
    /** return index of first vowel. 
      * returns -1 if the word has no vowels
      * @param word String
      * @return int the index of the first vowel.
      */
    public static int firstVowel( String word ) 
    {
        for (int i = 0; i < word.length() ; i++)
        {
            char c = word.charAt( i );

            if(StringUtilities.isVowel( new Character( c ).toString() ))
            {
                return i;
            }
        }

        return -1;
    }
    
    //-----------------------------------------------------------------
    /** returns true if the string represents a vowel (a,e,i,o or u)
     * otherwise return false.
     * @param letter String
     * @return boolean
     */
    public static boolean isVowel( String letter ) 
    {
        return  letter.equalsIgnoreCase( "A")||
                letter.equalsIgnoreCase( "E")||
                letter.equalsIgnoreCase( "I")||
                letter.equalsIgnoreCase( "O")||
                letter.equalsIgnoreCase( "U");
    }
    
    
    //---------------------------------------------------------------
    /** returns a String representing the letter in "text" at index n
      * returns null if the index is out of bounds.
      * @param text String
      * @param n int
      * @return String
      */  
    public static String letterAt ( String text, int n )
    {
        if( n>=0 && n<text.length() ) {
            return text.substring( n, n+1 );
        }
        return null;
    }
    
    
    //----------------------------------------------------------------- 
    /** returns  "word" translated to pig latin. 
     *
     * @param word String
     * @return String
     */
    public static String translate( String word ) 
    {

        if( firstVowel(word) != -1 ) {
            String start = word.substring( 0, firstVowel(word));
            String end = word.substring( firstVowel(word));
            return end+start+"ay";
        }
        else{
            return word+"ay";
        }
        //return "";
    }   
    
    
    
    
    
    //---------------------------------------------------------------
    /** A unit test of the above methods.
      *  DO NOT EDIT
      * 
      * @param args String
      */
    public static void main( String args[] )
    {
        String alpha;
        
        //--------------------------------------------------------------
        alpha = "ABCDE";
        System.out.println( "\n\n******** TEST LetterAt ************" );
        System.out.println( "Original: " + alpha ); 
        
        String letter;
        for( int i = -1; i < alpha.length() + 1; i++ )
        {
            letter = letterAt( alpha, i );
            if( letter == null )
                System.out.println( "LetterAt " + i + " : " + "null" );
            else
                System.out.println( "LetterAt " + i + " : " + letter ); 
        }
        
        
        //-------------------------------------------------------------
        alpha = "ABCDEioux";
        System.out.println( "\n\n******** TEST isVowel *************" );
        System.out.println( "Word: " + alpha ); 
        
        for( int i = 0; i < alpha.length(); i++ )
        {
            letter = letterAt( alpha,  i );
            if( letter == null )
                System.out.println( "LetterAt " + i + " : " + "null" );
            else
                System.out.println( "isVowel " + letter + " is " + 
                                   isVowel( letter ) ); 
        }
        
        //--------------------------------------------------------------
        System.out.println( "\n\n******** TEST firstVowel **********" );
        String words[] = { "one", "two", "three", "shhh", "hymn", "" };
        
        for( int i = 0; i < words.length; i++ )
        {
            int idx = firstVowel( words[ i ] );
            if( idx == -1 )
                System.out.println( words[ i ] + ":  no vowels" );
            else
                System.out.println( words[ i ] + " : '" + 
                                   letterAt( words[ i ], idx ) + 
                                   "' at index " + idx ) ; 
        }
        
        
        //--------------------------------------------------------------
        System.out.println( "\n\n******* TEST translator ***********" );
        String words2[] = { "dog", "bananna", "nix", "scram" };
        
        for( int i = 0; i < words2.length; i++ )
            System.out.println( words2[ i ] + " : " + 
                               translate( words2[ i ] ) );
        
    } // end of main
    
} // end of class
