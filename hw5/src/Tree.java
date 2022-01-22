/**
 * Tree.java:
 * Use class to represent a tree in four seasons.
 *
 * @author Sishi Cheng
 */

import wheelsunh.users.Rectangle;
import wheelsunh.users.RoundedRectangle;
import wheelsunh.users.ShapeGroup;

import java.awt.Color;

/**
 *Define a new class called Tree
 */

public class Tree extends ShapeGroup implements Seasonal {
    private Rectangle leaves1;
    private Rectangle shade1;
    private Rectangle leaves2;
    private Rectangle shade2;
    private RoundedRectangle trunk;

    /**
     * Draw the leaves of the tree
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     * @param c The color of the leaves
     */

    public void setLeaves1( int x, int y, Color c )
    {

        //build the leaves of the tree
        leaves1 = new Rectangle();
        leaves1.setSize( 50, 50 );
        leaves1.setLocation( x, y );
        leaves1.setColor( c );
        leaves1.setRotation( 45 );
        super.add( this.leaves1 );
    }

    /**
     * Draw the leaves of the tree
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     * @param c The color of the leaves
     */

    public void setLeaves2( int x, int y, Color c )
    {

        //build the leaves of the tree
        leaves2 = new Rectangle();
        leaves2.setSize( 40, 40 );
        leaves2.setLocation( x+4, y-33 );
        leaves2.setColor( c );
        leaves2.setRotation( 45 );
        super.add( this.leaves2 );
    }

    /**
     * Create a rectangle to shade the unwanted part
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setShade1( int x, int y )
    {

        //build a rectangle to shade the unwanted part
        shade1 = new Rectangle();
        shade1.setSize( 71, 35 );
        shade1.setLocation( x-12, y+25 );
        shade1.setColor( Color.WHITE );
        super.add( this.shade1 );
    }

    /**
     * Create another rectangle to shade the unwanted part
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setShade2( int x, int y )
    {

        //build a rectangle to shade the unwanted part
        shade2 = new Rectangle();
        shade2.setSize( 57, 35 );
        shade2.setLocation( x-6, y-14 );
        shade2.setColor( Color.WHITE );
        super.add( this.shade2 );
    }

    /**
     * Draw the trunk of the tree
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public void setTrunk( int x, int y )
    {

        //build a rounded rectangle for the tree trunk
        trunk = new RoundedRectangle();
        trunk.setSize( 10, 30 );
        trunk.setLocation( x, y );
        trunk.setColor( Color.DARK_GRAY.brighter() );
        super.add( this.trunk );
    }

    /**
     * override the spring method from the seasonal interface for tree class
     */

    @Override
    public void spring() {
        setLeaves1(200, 200, Color.GREEN );
        setShade1(200, 200 );
        setTrunk( 220, 225 );
    }

    /**
     * override the winter method from the seasonal interface for the tree class
     */

    @Override
    public void winter() {
        setLeaves2( 200, 200, Color.white);
        leaves2.setFrameColor( Color.BLACK );
        setShade2( 200, 200 );
        setLeaves1(200, 200, Color.white );
        leaves1.setFrameColor( Color.BLACK );
        setShade1(200, 200 );
        setTrunk( 220, 225 );
    }

    /**
     * override the summer method from the seasonal interface for the tree class
     */

    @Override
    public void summer() {
        setLeaves2( 200, 200, Color.GREEN );
        setShade2( 200, 200 );
        setLeaves1(200, 200, Color.GREEN );
        setShade1(200, 200 );
        setTrunk( 220, 225 );
    }

    /**
     * override the fall method from the seasonal interface for the tree class
     */

    @Override
    public void fall() {
        setLeaves2( 200, 200, Color.ORANGE.darker() );
        setShade2( 200, 200 );
        setLeaves1(200, 200, Color.ORANGE.darker());
        setShade1(200, 200 );
        setTrunk( 220, 225 );
    }
}
