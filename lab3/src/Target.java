/**
 * Target.java:
 *
 * Displays a simple archery target using multiple Wheels Shapes.
 * The entire target is built in a method, makeTarget.
 *
 * makeTarget has position arguments.
 *
 * @author rdb and mlb with modifiaction by Professor Rossi
 */

// --------------- imports ------------------------------
import wheelsunh.users.*;
import java.awt.Color;

public class Target
{
    //---------------- instance variables ------------------------------
    private final int LEVEL2X = 15,  level2Y = 15;
    private final int    level3X    = 25,  level3Y = 25;
    private final int    level4X    = 30,  level4Y = 30;

    private int    level1Size  = 80;
    private int    level2Size = 50;
    private int    level3Size = 30;
    private int    level4Size  = 20;

    private Ellipse    level1;
    private Ellipse    level2;
    private Ellipse    level3;
    private Ellipse    level4;
    
    // -----------------------------------------------------------------
    /** 
     * Constructor for the Target class.
     */
    public Target( )
    {
           makeTarget( 0, 0 );
    } 
    ////////////////////////////////////////////////////////////////////
    /**
     * 2 parameter constructor goes here:
     */
    // Write constructor with position parameters (2 ints)
    public Target( int x, int y )
    {
        makeTarget( x, y );
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////
    // -----------------------------------------------------------------
    /**
     * setLocation( int x, int y ).
     *   change the location of the target; 
     *   need to invoke setLocation on  4 ellipses that compose target.
     * 
     * @param x int
     * @param y int
     * 
     */
    public void setLocation( int x, int y )
    {
        /////////////////////////////////////////////////////////
        // setLocation code here
        level1.setLocation( x, y );
        level2.setLocation( x+LEVEL2X, y+level2Y );
        level3.setLocation( x + level3X, y + level3Y );
        level4.setLocation( x + level4X, y + level4Y );
        ////////////////////////////////////////////////////////
    }
    
    // -----------------------------------------------------------------
    /**
     * move( int dx, int dy ).
     *   move the location of the target by dx and dy
     *     newx = oldx + dx 
     *     newy = oldy + dy
     *   use Target's setLocation method to actually change the location
     * 
     * @param dx int
     * @param dy int
     * 
     */
    public void move( int dx, int dy )
    {
        /////////////////////////////////////////////////////////
        // move code here
        int x = level1.getXLocation();
        int y = level1.getYLocation();
        level1.setLocation( x+dx, y+dy );
        level2.setLocation( x+dx+LEVEL2X, y+dy+level2Y );
        level3.setLocation( x + dx+level3X, y +dy+ level3Y );
        level4.setLocation( x +dx+ level4X, y + dy+level4Y );
        ////////////////////////////////////////////////////////
    }
    
    // -----------------------------------------------------------------
    /**
     * makeTarget.
     * encapsulates all the Wheels components needed to draw a target.
     * 
     * @param x int
     * @param y int
     */
    public void makeTarget( int x, int y )
    {
        // local "constant" variables define the locations of the inner
        //   circles relative to the level1 circle.

        
        // local "constant" variables define the sizes of all circles

        
        // other local variables are used to references  Wheels objects
        // used to draw the target.

        
        // create the level1 circle
        level1 = new Ellipse( x, y );
        level1.setSize( level1Size, level1Size );
        
        // create the next level4 circle
        level2 = new Ellipse( x + LEVEL2X, y + level2Y );
        level2.setSize( level2Size, level2Size );
        level2.setColor( Color.BLUE );
        
        // create the next level4 circle
        level3 = new Ellipse( x + level3X, y + level3Y );
        level3.setSize( level3Size, level3Size );
        level3.setColor( Color.CYAN );
        
        // create the level4 circle
        level4 = new Ellipse( x + level4X, y + level4Y );
        level4.setColor( Color.BLACK );
        level4.setSize( level4Size, level4Size );
    }
    
    // -----------------------------------------------------------------
    /** main program just invokes the class constructor.
      * 
      * @param args String
      * 
      */
    public static void main( String[] args )
    {
        Frame f = new Frame();
        Target t1 = new Target();

        ////////////////////////////////////////////////////////////////
        // Add much more Target creation code here
        //
        Target t2 = new Target( 100, 100);
        Target t3 = new Target( 200, 200);

        Utilities.sleep( 1000 );
        t1.setLocation( 400, 400 );

        Utilities.sleep( 200 );
        t2.move(10, 10 );
        Utilities.sleep( 200 );
        t2.move( 20, 20 );
        Utilities.sleep( 200 );
        t2.move( 25, 25 );
        Utilities.sleep( 200 );
        t2.move( 30, 30 );
        ////////////////////////////////////////////////////////////////
    }
    

} //End of Class Target
