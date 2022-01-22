/**
 * Bug.java:
 * Use class to represent a bug.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.*;
import java.awt.Color;

/**
 *Define a new class called Bug
 */

public class Bug {
    private Ellipse tail;//To build the tail of the bug
    private Ellipse body1;//To build one of the part of the body of the bug
    private Ellipse body2;//To build the middle part of the body of the bug
    private Ellipse body3;//To build the first part of the body of the bug
    private Ellipse head;//To build the head of the bug
    private Ellipse leftEye;//To build the left eye of the bug
    private Ellipse rightEye;//To build the right eye of the bug
    private Ellipse rightEyeBall;//To build the right eyeball of the bug
    private Ellipse leftEyeBall;//To build the left eyeball of the bug
    private Rectangle mouth;//To build the mouth of the bug
    private Line leftTentacle;//To build the left tentacle of the bug
    private Line rightTentacle;//To build the right tentacle of the bug

    /**
     * Draw the tail of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setTail( int x, int y, Color c ) {

        //build the tail of the bug
        tail = new Ellipse();
        tail.setSize(20, 25);
        tail.setLocation(x + 90, y + 20);
        tail.setFrameColor(Color.WHITE);
        tail.setColor(c);
    }

    /**
     * Draw one part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody1(int x, int y, Color c ) {

        //build one of the part of the body of the bug
        body1 = new Ellipse();
        body1.setSize(25, 30);
        body1.setLocation(x + 80, y + 30);
        body1.setColor(c);
        body1.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the second part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody2(int x, int y, Color c ) {

        //build the middle part of the body of the bug
        body2 = new Ellipse();
        body2.setSize(30, 35);
        body2.setLocation(x + 70, y + 40);
        body2.setColor(c);
        body2.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the third part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody3(int x, int y, Color c ) {

        //build the first part of the body of the bug
        body3 = new Ellipse();
        body3.setSize(35, 40);
        body3.setLocation(x + 60, y + 50);
        body3.setColor(c);
        body3.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the head of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setHead(int x, int y, Color c ) {

        //build the head of the bug
        head = new Ellipse();
        head.setSize(45, 40);
        head.setLocation(x + 40, y + 60);
        head.setColor(c);
        head.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the left eye of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setLeftEye(int x, int y) {

        //build the left eye of the bug
        leftEye = new Ellipse();
        leftEye.setSize(13, 13);
        leftEye.setLocation(x + 48, y + 65);
        leftEye.setColor(Color.WHITE);
        leftEye.setFrameColor(Color.BLACK);
    }

    /**
     * Draw right eye of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setRightEye(int x, int y) {

        //build the right eye of the bug
        rightEye = new Ellipse();
        rightEye.setSize(10, 10);
        rightEye.setLocation(x + 61, y + 67);
        rightEye.setColor(Color.WHITE);
        rightEye.setFrameColor(Color.BLACK);
    }

    /**
     * Draw the left eyeball of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setLeftEyeball( int x, int y) {

        //build the left eyeball of the bug
        leftEyeBall = new Ellipse();
        leftEyeBall.setSize(3, 3);
        leftEyeBall.setLocation(x + 52, y + 68);
        leftEyeBall.setColor(Color.BLACK);
        leftEyeBall.setFrameColor(Color.BLACK);
    }

    /**
     * Draw the right eyeball of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setRightEyeball(int x, int y) {

        //To build the right eyeball of the bug
        rightEyeBall = new Ellipse();
        rightEyeBall.setSize(3, 3);
        rightEyeBall.setLocation(x + 65, y + 71);
        rightEyeBall.setColor(Color.BLACK);
        rightEyeBall.setFrameColor(Color.BLACK);
    }

    /**
     * Draw the mouth of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setMouth(int x, int y) {

        //build the mouth of the bug
        mouth = new Rectangle();
        mouth.setSize(20, 5);
        mouth.setLocation(x + 48, y + 85);
    }

    /**
     * Draw the left tentacle of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setLeftTentacle(int x, int y) {

        //build the left tentacle of the bug
        leftTentacle = new Line();
        leftTentacle.setSize(10, 10);
        leftTentacle.setRotation(80);
        leftTentacle.setLocation(x + 50, y + 58);
        leftTentacle.setColor(Color.BLACK);
    }

    /**
     * Draw the right tentacle of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setRightTentacle( int x, int y) {

        //build the right tentacle of the bug
        rightTentacle = new Line();
        rightTentacle.setSize( 10, 10 );
        rightTentacle.setRotation( 100 );
        rightTentacle.setLocation( x+65, y+58 );
        rightTentacle.setColor( Color.BLACK );
    }

    /**
     * A constructor that takes two integers parameters and creates a Bug with
     * default color at the specified point.
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public Bug( int x,int y )
    {
        setTail( x, y, Color.GREEN );
        setBody1( x, y, Color.GREEN );
        setBody2( x, y, Color.GREEN);
        setBody3( x, y, Color.GREEN );
        setHead( x, y, Color.GREEN );
        setLeftEye( x, y);
        setRightEye( x, y);
        setLeftEyeball( x, y);
        setRightEyeball( x, y);
        setMouth( x, y);
        setLeftTentacle( x, y);
        setRightTentacle( x, y);
    }

    /**
     * A default, no-parameter constructor, that creates a bug with
     * a default color located at (0,0).
     */

    public Bug()
    {
        setTail( 0, 0 , Color.GREEN );
        setBody1( 0, 0, Color.GREEN );
        setBody2( 0, 0, Color.GREEN );
        setBody3( 0, 0, Color.GREEN );
        setHead( 0, 0, Color.GREEN );
        setLeftEye( 0, 0 );
        setRightEye( 0, 0);
        setLeftEyeball( 0, 0);
        setRightEyeball( 0, 0 );
        setMouth( 0, 0 );
        setLeftTentacle( 0, 0 );
        setRightTentacle( 0, 0 );
    }

    /**
     * A constructor that takes a Color as a parameter and creates a bug at
     * (0,0) with the color being the specified color.
     *
     * @param c The color of the bug
     */

    public Bug( Color c )
    {
        setTail( 0, 0 , c );
        setBody1( 0, 0, c );
        setBody2( 0, 0, c);
        setBody3( 0, 0, c );
        setHead( 0, 0, c );
        setLeftEye( 0, 0);
        setRightEye( 0, 0);
        setLeftEyeball( 0, 0);
        setRightEyeball( 0, 0);
        setMouth( 0, 0);
        setLeftTentacle( 0, 0);
        setRightTentacle( 0, 0);
    }

    /**
     * Locate the bug at the specified point.
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setLocation( int x, int y )
    {
        tail.setLocation( x + 90, y + 20 );
        body1.setLocation( x + 80, y + 30 );
        body2.setLocation( x + 70, y + 40 );
        body3.setLocation( x + 60, y + 50 );
        head.setLocation( x + 40, y + 60 );
        leftEye.setLocation( x + 48, y + 65 );
        rightEye.setLocation( x + 61, y + 67 );
        leftEyeBall.setLocation(x + 52, y + 68 );
        rightEyeBall.setLocation(x + 65, y + 71 );
        mouth.setLocation( x + 48, y + 85);
        leftTentacle.setLocation( x + 50, y + 58 );
        rightTentacle.setLocation( x + 65, y + 58 );
    }

    /**
     * set the color of the main component of the Bug to the specified color.
     *
     * @param c The color of the bug
     */

    public void setColor( Color c )
    {
        tail.setColor( c );
        tail.setFrameColor(Color.WHITE);
        body1.setColor( c );
        body1.setFrameColor(Color.WHITE);
        body2.setColor( c );
        body2.setFrameColor(Color.WHITE);
        body3.setColor( c );
        body3.setFrameColor(Color.WHITE);
        head.setColor( c );
        head.setFrameColor(Color.WHITE);
    }

    /**
     * Takes an integer for a parameter and moves the Bug down
     *
     * @param d The numbers of the pixels to move
     */

    public void moveDown( int d )
    {
        setLocation( getXLocation(), getYLocation()+d);
    }

    /**
     * Returns the color of the Bug.
     *
     * @return  The color of the bug's main component
     */
    public Color getColor()
    {
        return tail.getColor();
    }

    /**
     * Returns the x location of the Bug.
     *
     * @return  The x location of the bug
     */

    public int getXLocation() {
        return tail.getXLocation()-90;
    }

    /**
     * Returns the y location of the Bug.
     *
     * @return  The y location of the bug
     */

    public int getYLocation() {
        return tail.getYLocation()-20;
    }

    // -----------------------------------------------------------------
    /** main program creates a frame and test the class constructor and methods.
     */
    public static void main(String[] args)
    {
        new Frame();

        //build bug1
        Bug bug1 = new Bug( 200, 200 );

        //build bug2
        Bug bug2 = new Bug();
        Utilities.sleep( 1000 );

        //build bug3
        Bug bug3 = new Bug( Color.BLUE );
        Utilities.sleep( 1000 );
        bug3.setLocation(400, 300 );
        Utilities.sleep( 1000 );
        bug1.setColor( Color.YELLOW );
        Utilities.sleep( 1000 );
        bug1.moveDown(30);
        Utilities.sleep( 1000 );
        bug1.setColor(bug3.getColor());
        Utilities.sleep( 1000 );
        bug2.setLocation(bug1.getXLocation(), bug1.getYLocation());
    }
}
