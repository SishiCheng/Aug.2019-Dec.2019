import wheelsunh.users.Ellipse;

import java.awt.*;

public class ChangeColor extends Target
{
    public ChangeColor() {
        super();
    }

    public ChangeColor(int x, int y) {
        super(x, y);
    }

    public void makeTarget( int x, int y ) {
        // create the level1 circle
        level1 = new Ellipse( x, y );
        level1.setSize( level1Size, level1Size );
        level1.setColor( Color.BLUE );
        super.add( this.level1 );

        // create the next level4 circle
        level2 = new Ellipse( x + level2X, y + level2Y );
        level2.setSize( level2Size, level2Size );
        super.add( this.level2 );

        // create the next level4 circle
        level3 = new Ellipse( x + level3X, y + level3Y );
        level3.setSize( level3Size, level3Size );
        level3.setColor( Color.GREEN );
        super.add( this.level3 );

        // create the level4 circle
        level4 = new Ellipse( x + level4X, y + level4Y );
        level4.setColor( Color.BLACK );
        level4.setSize( level4Size, level4Size );
        super.add( this.level4 );
    }
}
