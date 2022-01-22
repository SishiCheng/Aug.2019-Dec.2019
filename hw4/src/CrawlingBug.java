/**
 * CrawlingBug.java:
 * This class inherits from Bug class to make the bug crawling toward the lower
 * left corner
 *
 * @author Sishi Cheng
 */

import java.awt.*;

/**
 *Define a new class called CrawlingBug which inherits from Bug
 */

public class CrawlingBug extends Bug
{

    /**
     * A constructor that takes two integers parameters and creates a Bug with
     * default color at the specified point.
     *
     * @param x The x coordinate that be relative
     * @param y The y coordinate that be relative
     */

    public CrawlingBug(int x, int y) {
        super(x, y);
    }

    /**
     * A default, no-parameter constructor, that creates a bug with
     * a default color located at (0,0).
     */

    public CrawlingBug() {
        super();
    }

    /**
     * A constructor that takes a Color as a parameter and creates a bug at
     * (0,0) with the color being the specified color.
     *
     * @param c The color of the bug
     */

    public CrawlingBug(Color c) {
        super(c);
    }

    public void moveDown(int d1)
    {
        setLocation( getXLocation()-d1, getYLocation()+d1);
    }
}
