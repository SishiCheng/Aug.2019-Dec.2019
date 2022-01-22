/** 
 * P2Start.java:
 * Draws two pads for drawing bugs.
 * 
 * @author Sishi Cheng
 */

import wheelsunh.users.*;
import java.awt.Color;

/**
 *Define a new class called P2Start
 */

public class P2Start 
{
    //---------------- instance variables ------------------------------
    private Rectangle pad1, pad2;
    int x1 = 200, y1 = 200,
        x2 = 400, y2 = 200;
    int padX = 123, padY = 105;
    
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
    
    // -----------------------------------------------------------------
    /** Constructor for the P2Start class.
     */

    public P2Start( )
    {
        pad1 = new Rectangle( x1, y1 );
        pad1.setFillColor( Color.WHITE );
        pad1.setFrameColor( Color.BLACK );
        pad1.setSize( padX, padY );
       
        pad2 = new Rectangle( x2, y2 );
        pad2.setFillColor( Color.WHITE );
        pad2.setFrameColor( Color.BLACK );
        pad2.setSize( padX, padY );
        
        //place a call to your method here to draw the bug for pad 1
        buildBug( x1, y1 );

        //place a call to your method here to draw the bug for pad 2
        buildBug( x2, y2 );
    }

    /**
     * Draw the tail of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */
    
    public void setTail( int x, int y ) {
        tail = new Ellipse();
        tail.setSize(20, 25);
        tail.setLocation(x + 90, y + 20);
        tail.setColor(Color.GREEN);
        tail.setFrameColor(Color.WHITE);
    }


    /**
     * Draw one part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody1(int x, int y ) {
        body1 = new Ellipse();
        body1.setSize(25, 30);
        body1.setLocation(x + 80, y + 30);
        body1.setColor(Color.GREEN);
        body1.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the second part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody2(int x, int y ) {
        body2 = new Ellipse();
        body2.setSize(30, 35);
        body2.setLocation(x + 70, y + 40);
        body2.setColor(Color.GREEN);
        body2.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the third part of the body of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setBody3(int x, int y ) {
        body3 = new Ellipse();
        body3.setSize(35, 40);
        body3.setLocation(x + 60, y + 50);
        body3.setColor(Color.GREEN);
        body3.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the head of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setHead(int x, int y ) {
        head = new Ellipse();
        head.setSize(45, 40);
        head.setLocation(x + 40, y + 60);
        head.setColor(Color.GREEN);
        head.setFrameColor(Color.WHITE);
    }

    /**
     * Draw the left eye of the bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setLeftEye(int x, int y) {
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

    public void setLeftEyeball( int x, int y ) {
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

    public void setLeftTentacle(int x, int y ) {
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

    public void setRightTentacle( int x, int y ) {
        rightTentacle = new Line();
        rightTentacle.setSize( 10, 10 );
        rightTentacle.setRotation( 100 );
        rightTentacle.setLocation( x+65, y+58 );
        rightTentacle.setColor( Color.BLACK );
    }

    /**
     * Draw the whole bug
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void buildBug(int x, int y ) {
        setTail( x, y );
        setBody1( x, y );
        setBody2( x, y );
        setBody3( x, y );
        setHead( x, y );
        setLeftEye( x, y);
        setRightEye( x, y);
        setLeftEyeball( x, y );
        setRightEyeball( x, y);
        setMouth( x, y);
        setLeftTentacle( x, y );
        setRightTentacle( x, y );
    }

    
    // -----------------------------------------------------------------
    /** main program creates a frame and invokes the class constructor.
     */
    public static void main(String[] args)
    {
	    new Frame();
        P2Start app = new P2Start(); //This will draw the pads for you
    }
}
