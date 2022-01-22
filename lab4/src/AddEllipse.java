import wheelsunh.users.*;

import java.awt.*;

public class AddEllipse extends Target
{
    private final int level5X = 36, level5Y = 36;
    private final int level5Size = 8;
    private Ellipse level5;

    public AddEllipse() {
        super();
    }

    public AddEllipse( int x, int y ) {
        super(x, y);
    }

    public void makeTarget( int x, int y )
    {
        super.makeTarget( x, y );
        level5 = new Ellipse( x + level5X, y + level5Y );
        level5.setColor( Color.YELLOW );
        level5.setSize( level5Size, level5Size );
        super.add( this.level5 );
    }
}
