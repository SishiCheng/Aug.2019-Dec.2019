/**
 * House.java:
 * Use class to represent a house in four seasons.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.Ellipse;
import wheelsunh.users.Line;
import wheelsunh.users.Rectangle;
import wheelsunh.users.ShapeGroup;

import java.awt.Color;

/**
 *Define a new class called house
 */

public class House extends ShapeGroup implements Seasonal {
    private Rectangle roof;
    private Rectangle body;
    private Ellipse window;
    private Line window1;
    private Line window2;
    private Rectangle door;

    /**
     * Draw the roof of the house
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     * @param c The color of the roof
     */

    public void setRoof( int x, int y, Color c)
    {
        roof = new Rectangle();
        roof.setSize(120, 20);
        roof.setLocation( x, y );
        roof.setColor( c );
        roof.setFrameColor( Color.BLACK );
        super.add( this.roof );
    }

    /**
     * Draw the main part of the house
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     * @param c The color of the main part of the house
     */

    public void setBody( int x, int y, Color c)
    {
        body = new Rectangle();
        body.setSize( 100, 120 );
        body.setLocation( x+10, y+16 );
        body.setColor( c );
        super.add( this.body );
    }

    /**
     * Draw the window of the house
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setWindow( int x, int y )
    {
        window = new Ellipse();
        window.setSize( 30, 30 );
        window.setLocation( x+75, y+30 );
        window.setColor( Color.CYAN );
        window1 = new Line();
        window1.setSize( 30, 30 );
        window1.setLocation( x+75, y+45 );
        window1.setColor( Color.black );
        window2 = new Line();
        window2.setSize( 30, 30 );
        window2.setLocation( x+75, y+45 );
        window2.setColor( Color.BLACK );
        window2.setRotation( 90 );


        super.add( this.window );
        super.add( this.window1 );
        super.add( this.window2 );
    }

    /**
     * Draw the door of the house
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setDoor( int x, int y )
    {
        door = new Rectangle();
        door.setSize( 20, 45 );
        door.setLocation( x+50, y+90 );
        door.setColor( Color.magenta );
        super.add( this.door );
    }

    /**
     * A constructor that takes two integers parameters and creates a house with
     * the specific color at the specified point.
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     * @param c The color of the house
     */

    public House(int x, int y, Color c)
    {
        setBody( x, y, c );
        setRoof( x, y, c );
        setWindow( x, y );
        setDoor( x, y );
    }

    /**
     * override the spring method from the seasonal interface for the house class
     */

    @Override
    public void spring() {
        roof.setColor( Color.GREEN );
        body.setColor( Color.PINK );
    }

    /**
     * override the winter method from the seasonal interface for the house class
     */

    @Override
    public void winter() {
        roof.setColor( Color.WHITE );
        roof.setFrameColor( Color.BLACK );
        body.setColor( Color.GRAY );
    }

    /**
     * override the summer method from the seasonal interface for the house class
     */

    @Override
    public void summer() {
        roof.setColor( Color.RED );
        body.setColor( Color.yellow );
    }

    /**
     * override the fall method from the seasonal interface for the house class
     */

    @Override
    public void fall() {
        roof.setColor( Color.ORANGE.darker() );
        body.setColor( Color.RED.darker() );
    }
}
