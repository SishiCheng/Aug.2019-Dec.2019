import java.awt.*;

public class RainbowBug extends Bug
{

    /**
     * A default, no-parameter constructor, that creates a bug with
     * a default color located at (0,0).
     */

    public RainbowBug() {
        super();
    }

    /**
     * A constructor that takes two integers parameters and creates a Bug with
     * default color at the specified point.
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public RainbowBug(int x, int y) {
        super(x, y);
    }

    /**
     * A constructor that takes a Color as a parameter and creates a bug at
     * (0,0) with the color being the specified color.
     *
     * @param c The color of the bug
     */

    public RainbowBug(Color c) {
        super(c);
    }

    /**
     * Override the setColor method
     *
     * @param a One of the color of the bug
     * @param b One of the color of the bug
     * @param c One of the color of the bug
     * @param d One of the color of the bug
     * @param e One of the color of the bug
     */

    public void setColor(Color a, Color b, Color c, Color d, Color e )
    {
        tail.setColor( a );
        tail.setFrameColor(Color.WHITE);
        body1.setColor( b );
        body1.setFrameColor(Color.WHITE);
        body2.setColor( c );
        body2.setFrameColor(Color.WHITE);
        body3.setColor( d );
        body3.setFrameColor(Color.WHITE);
        head.setColor( e );
        head.setFrameColor(Color.WHITE);
    }
}
