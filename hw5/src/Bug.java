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

public class Bug extends ShapeGroup implements Seasonal
{
    protected Ellipse tail;//To build the tail of the bug
    protected Ellipse body1;//To build one of the part of the body of the bug
    protected Ellipse body2;//To build the middle part of the body of the bug
    protected Ellipse body3;//To build the first part of the body of the bug
    protected Ellipse head;//To build the head of the bug
    protected Ellipse leftEye;//To build the left eye of the bug
    protected Ellipse rightEye;//To build the right eye of the bug
    protected Ellipse rightEyeBall;//To build the right eyeball of the bug
    protected Ellipse leftEyeBall;//To build the left eyeball of the bug
    protected Rectangle mouth;//To build the mouth of the bug
    protected Line leftTentacle;//To build the left tentacle of the bug
    protected Line rightTentacle;//To build the right tentacle of the bug
    protected Ellipse hat1;//To build a part of hat of the bug
    protected Ellipse hat2;//To build a part of hat of the bug
    protected Rectangle hat3;////To build the a part of hat of the bug

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
        super.add( this.tail );
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
        super.add( this.body1 );
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
        super.add( this.body2 );
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
        super.add( this.body3 );
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
        super.add( this.head );
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
        super.add( this.leftEye );
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
        super.add( this.rightEye );
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
        super.add( this.leftEyeBall );
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
        super.add( this.rightEyeBall );
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
        super.add( this.mouth );
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
        super.add( this.leftTentacle );
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
        super.add( this.rightTentacle );
    }

    public void setHat(int x, int y, Color c) {
        hat1 = new Ellipse();
        hat1.setSize(30, 10);
        hat1.setLocation(x+6, y-7);
        hat1.setColor(c);
        hat1.setFrameColor(Color.BLACK);
        super.add(this.hat1);
        hat2 = new Ellipse();
        hat2.setSize(18, 15);
        hat2.setLocation(x+11, y-15);
        hat2.setColor(c);
        hat2.setFrameColor(Color.BLACK);
        super.add(this.hat2);
        hat3 = new Rectangle();
        hat3.setSize(20,5);
        hat3.setLocation(x+10, y-5);
        hat3.setColor(c);
        super.add(this.hat3);

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
     * set the color of the main component of the Bug to the five different color.
     *
     * @param a One of the color of the bug
     * @param b One of the color of the bug
     * @param c One of the color of the bug
     * @param d One of the color of the bug
     * @param e One of the color of the bug
     */

    public void setColor(Color a, Color b, Color c, Color d, Color e ){}

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
     * override the spring method from the seasonal interface for the Bug class
     */

    @Override
    public void spring() {
       setHat(head.getXLocation(),head.getYLocation(),Color.yellow);
    }

    /**
     * override the winter method from the seasonal interface for the Bug class
     */

    @Override
    public void winter() {
        setHat(head.getXLocation(),head.getYLocation(),Color.white);
    }

    /**
     * override the summer method from the seasonal interface for the Bug class
     */

    @Override
    public void summer() {
        setHat(head.getXLocation(),head.getYLocation(),Color.red);
    }

    /**
     * override the fall method from the seasonal interface for the Bug class
     */

    @Override
    public void fall() {
        setHat(head.getXLocation(),head.getYLocation(),Color.orange);
    }

}
