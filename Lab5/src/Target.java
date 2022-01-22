

// --------------- imports ------------------------------

import wheelsunh.users.*;

import java.awt.Color;

/**
 * Target.java:
 * <p>
 * Displays a simple archery target using multiple Wheels Shapes.
 * The entire target is built in a method, makeTarget.
 * <p>
 * makeTarget has position arguments.
 *
 * @author rdb and mlb
 */
public class Target extends ShapeGroup implements Animator
{
    //---------------- instance variables ------------------------------
    // local "constant" variables define the locations of the inner
    //   circles relative to the level1 circle.
    private final int level2X = 15, level2Y = 15;
    private final int level3X = 25, level3Y = 25;
    private final int level4X = 30, level4Y = 30;

    // local "constant" variables define the sizes of all circles
    private final int level1Size = 80;
    private final int level2Size = 50;
    private final int level3Size = 30;
    private final int level4Size = 20;

    // other local variables are used to references  Wheels objects
    // used to draw the target.
    private Ellipse level1;
    private Ellipse level2;
    private Ellipse level3;
    private Ellipse level4;

    private int animateDX = 10;
    // -----------------------------------------------------------------

    /**
     * Constructor for the TargetApp class.
     */
    public Target()
    {
        super();
        this.makeTarget( 0, 0 );
    }
    ////////////////////////////////////////////////////////////////////
    /**
     * 2 parameter constructor goes here:
     */
    // Write constructor with position parameters (2 ints)
    public Target( int x, int y )
    {
        super();
        this.makeTarget( x, y );
    }

    ////////////////////////////////////////////////////////////////////
    // -----------------------------------------------------------------

    // -----------------------------------------------------------------

    /**
     * move( int dx, int dy ).
     * move the location of the target by dx and dy
     * newx = oldx + dx
     * newy = oldy + dy
     * use Target's setLocation method to actually change the location
     *
     * @param dx int
     * @param dy int
     */
    public void move( int dx, int dy ) {
        /////////////////////////////////////////////////////////
        // move code here
        int x = super.getXLocation();
        int y = super.getYLocation();

        super.setLocation( x + dx, y + dy );

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
    public void makeTarget( int x, int y ) {
        // create the level1 circle
        level1 = new Ellipse( x, y );
        level1.setSize( level1Size, level1Size );
        super.add( this.level1 );
        // create the next level4 circle
        level2 = new Ellipse( x + level2X, y + level2Y );
        level2.setSize( level2Size, level2Size );
        level2.setColor( Color.BLUE );
        super.add( this.level2 );
        // create the next level4 circle
        level3 = new Ellipse( x + level3X, y + level3Y );
        level3.setSize( level3Size, level3Size );
        level3.setColor( Color.CYAN );
        super.add( this.level3 );
        // create the level4 circle
        level4 = new Ellipse( x + level4X, y + level4Y );
        level4.setColor( Color.BLACK );
        level4.setSize( level4Size, level4Size );
        super.add( this.level4 );
    }

    // -----------------------------------------------------------------

    /**
     * main program just invokes the class constructor.
     *
     * @param args String
     */
    public static void main( String[] args ) {
        Frame f = new Frame();
        Target t1 = new Target();
        AnimationTimer timer = new AnimationTimer( 100, t1 );
        timer.start();
    }


    @Override
    public void animate()
    {
        int leftX = this.level1.getXLocation() + this.animateDX;
        int rightX = this.level1.getXLocation() + this.level1.getWidth() + this.animateDX;

        if( leftX < 0 || rightX > 700 )
        {
            this.animateDX *= -1;
        }

        this.move( this.animateDX, 0 );
    }
} //End of Class TargetApp
