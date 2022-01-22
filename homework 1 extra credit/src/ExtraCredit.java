/**
 * ExtraCredit.java.
 * This class building my bug.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.*;
import java.awt.Color;

/**
 *Define a new class called ExtraCredit
 */

public class ExtraCredit
{

    /**
     * Constructor for class ExtraCredit
     */

    public ExtraCredit()
    {
        Rectangle pad = new Rectangle( 200, 200 );//To build a rectangle pad
        pad.setFillColor( Color.WHITE );
        pad.setFrameColor( Color.BLACK );
        pad.setSize( 123, 105 );
    }

    /**
     * Function main begins with program execution
     *
     * @param args String
     */

    public static void main( String[] args )
    {
        Frame f = new Frame();//To build the frame to draw the bug
        ExtraCredit app = new ExtraCredit();//Creat a object call app
        app.buildBug();//Call the function to build the bug
    }

    /**
     * Function buildBug is use to draw the bug
     */

    public void buildBug()
    {
        Ellipse ellipse1 = new Ellipse();//To build the tail of the bug
        ellipse1.setSize( 20,25 );
        ellipse1.setLocation( 290,220 );
        ellipse1.setColor( Color.GREEN );
        ellipse1.setFrameColor( Color.WHITE );
        //To build one of the part of the body of the bug
        Ellipse ellipse2 = new Ellipse();
        ellipse2.setSize( 25,30 );
        ellipse2.setLocation( 280,230 );
        ellipse2.setColor( Color.GREEN );
        ellipse2.setFrameColor( Color.WHITE );
        //To build the middle part of the body of the bug
        Ellipse ellipse3 = new Ellipse();
        ellipse3.setSize( 30,35 );
        ellipse3.setLocation( 270,240 );
        ellipse3.setColor( Color.GREEN );
        ellipse3.setFrameColor( Color.WHITE );
        //To build the first part of the body of the bug
        Ellipse ellipse4 = new Ellipse();
        ellipse4.setSize( 35,40 );
        ellipse4.setLocation( 260,250 );
        ellipse4.setColor( Color.GREEN );
        ellipse4.setFrameColor( Color.WHITE );
        Ellipse ellipse5 = new Ellipse();//To build the head of the bug
        ellipse5.setSize( 45,40 );
        ellipse5.setLocation( 240,260 );
        ellipse5.setColor( Color.GREEN );
        ellipse5.setFrameColor( Color.WHITE );
        Ellipse ellipse6 = new Ellipse();//To build the left eye of the bug
        ellipse6.setSize( 13,13 );
        ellipse6.setLocation( 248,265 );
        ellipse6.setColor( Color.WHITE );
        ellipse6.setFrameColor( Color.BLACK );
        Ellipse ellipse7 = new Ellipse();//To build the right eye of the bug
        ellipse7.setSize( 10,10 );
        ellipse7.setLocation( 261,267 );
        ellipse7.setColor( Color.WHITE );
        ellipse7.setFrameColor( Color.BLACK );
        Ellipse ellipse8 = new Ellipse();//To build the left eyeball of the bug
        ellipse8.setSize( 3,3 );
        ellipse8.setLocation( 252,268 );
        ellipse8.setColor( Color.BLACK );
        ellipse8.setFrameColor( Color.BLACK );
        //To build the right eyeball of the bug
        Ellipse ellipse9 = new Ellipse();
        ellipse9.setSize( 3,3 );
        ellipse9.setLocation( 265,271 );
        ellipse9.setColor( Color.BLACK );
        ellipse9.setFrameColor( Color.BLACK );
        Rectangle rectangle = new Rectangle();//To build the mouth of the bug
        rectangle.setSize( 20, 5 );
        rectangle.setLocation( 248, 285 );
        Line line1 = new Line();//To build the left tentacle of the bug
        line1.setSize( 10, 10 );
        line1.setRotation( 80 );
        line1.setLocation( 250, 258 );
        line1.setColor( Color.BLACK );
        Line line2 = new Line();//To build the right tentacle of the bug
        line2.setSize( 10, 10 );
        line2.setRotation( 100 );
        line2.setLocation( 265, 258 );
        line2.setColor( Color.BLACK );
    }
}
