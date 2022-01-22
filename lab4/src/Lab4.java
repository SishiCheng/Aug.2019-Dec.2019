import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;

public class Lab4
{
    public static void main( String[] args ) {
        Frame f = new Frame();
        Target t1 = new Target();
        Utilities.sleep( 1000 );
        t1.setLocation( 100, 100 );
        Utilities.sleep( 1000 );
        t1.move( 10, 10 );
        ////////////////////////////////////////////////////////////////
        // Add much more Target creation code here
        //
        AddEllipse t2 = new AddEllipse();
        ChangeColor t3 = new ChangeColor( 200, 200 );


        ////////////////////////////////////////////////////////////////
    }
}
