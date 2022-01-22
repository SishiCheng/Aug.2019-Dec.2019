/**
 * Lab2.java;
 * Class to make concentric circle
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.*;
import wheelsunh.users.Frame;

import java.awt.*;

public class Lab2
{
    //ALL TOGETHER
    public void buildConcentricCircles()
    {
        Ellipse e = new Ellipse();
        e.setSize( 200,200 );

        Ellipse e1 = new Ellipse();
        e1.setSize( e.getWidth()/2,e.getHeight()/2 );
        e1.setColor( Color.BLUE );
        e1.setLocation( e.getXLocation() + e1.getWidth()/2, e.getYLocation() + e1.getHeight()/2 );

        Ellipse e2 = new Ellipse();
        e2.setSize( e1.getWidth()/2, e1.getHeight()/2 );
        e2.setColor( Color.GREEN );
        e2.setLocation( e1.getXLocation() + e2.getWidth()/2, e1.getYLocation() + e2.getHeight()/2 );
    }

    public void buildCircleRelative( int x, int y, int r, Color c )
    {
        Ellipse e = new Ellipse();
        e.setSize(2*r, 2*r );
        e.setLocation( x, y );
        e.setColor( c );

        Ellipse e1 = new Ellipse();
        e1.setSize( e.getWidth()/2,e.getHeight()/2 );
        e1.setColor( Color.BLUE );
        e1.setLocation( e.getXLocation() + e1.getWidth()/2, e.getYLocation() + e1.getHeight()/2 );

        Ellipse e2 = new Ellipse();
        e2.setSize( e1.getWidth()/2, e1.getHeight()/2 );
        e2.setColor( Color.GREEN );
        e2.setLocation( e1.getXLocation() + e2.getWidth()/2, e1.getYLocation() + e2.getHeight()/2 );
    }

    public void buildCircleRecursive( int x, int y, int r, int i )
    {
        Ellipse e = new Ellipse();
        e.setSize( 2*r, 2*r );
        e.setLocation( x, y );
        if( i == 0 ) {
            e.setColor( Color.RED );
        }
        else if( i == 1) {
            e.setColor( Color.BLUE );
        }
        else {
            e.setColor( Color.GREEN );
            return;
        }
        buildCircleRecursive( e.getXLocation()+r/2, e.getYLocation()+r/2, r/2, i+1);
    }

    public static void main(String[] args)
    {
        Frame f = new Frame();
        Lab2 lab2 = new Lab2();
        lab2.buildConcentricCircles();
        lab2.buildCircleRelative(100, 100, 100, Color.BLACK);
        lab2.buildCircleRecursive(50, 295, 100, 0);
    }
}
