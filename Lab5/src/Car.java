import wheelsunh.users.*;
import wheelsunh.users.Frame;
import wheelsunh.users.Rectangle;

import java.awt.*;

public class Car extends ShapeGroup implements Animator {
    private final int bodyX = 15, bodyY = 20;
    private final int wheel1X = 16, wheel1Y = 40;
    private final int wheel2X = 50, wheel2Y = 59;

    private final int bodySizeX = 80, bodySizeY = 40;
    private final int wheel1SizeX = 20, wheel1SizeY = 20;
    private final int wheel2SizeX = 20, wheel2SizeY = 20;

    private Rectangle body;
    private Ellipse wheel1;
    private Ellipse wheel2;

    private int animateDX = 10;
    private int animateDY = 10;

    public Car() {
        super();
        this.makeCar();
    }

    public void move( int dx, int dy ) {
        /////////////////////////////////////////////////////////
        // move code here
        int x = super.getXLocation();
        int y = super.getYLocation();

        super.setLocation( x + dx, y + dy );

        ////////////////////////////////////////////////////////
    }

    @Override
    public void animate() {
        int leftX = this.body.getXLocation() + this.animateDX;
        int rightX = this.body.getXLocation() + this.body.getWidth() + this.animateDX;

        int upperY = this.body.getYLocation() + this.animateDY;
        int lowerY = this.body.getYLocation() + this.body.getHeight() + this.animateDY;

        if( leftX < 0 || rightX > 550 )
        {
            this.animateDX *= -1;
            this.animateDY *= -1;
        }

        this.move( this.animateDX, this.animateDY);
    }

    public void makeCar()
    {
        body = new Rectangle();
        body.setLocation( bodyX, bodyY );
        body.setSize( bodySizeX, bodySizeY );
        body.setColor(Color.BLUE);
        body.setRotation(30);
        super.add(this.body);

        wheel1 = new Ellipse( wheel1X, wheel1Y );
        wheel1.setSize( wheel1SizeX, wheel1SizeY);
        super.add(this.wheel1);

        wheel2 = new Ellipse( wheel2X, wheel2Y );
        wheel2.setSize( wheel2SizeX, wheel2SizeY);
        super.add(this.wheel2);
    }

    public static void main(String[] args) {
        Frame f = new Frame();
        Car c1 = new Car();

        AnimationTimer timer = new AnimationTimer( 100, c1 );
        timer.start();
    }
}
