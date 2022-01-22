import wheelsunh.users.AnimationTimer;
import wheelsunh.users.Frame;

public class week5Lab {
    public static void main(String[] args) {
        Frame f = new Frame();
        Target t1 = new Target();
        AnimationTimer timer1 = new AnimationTimer(100, t1);
        timer1.start();

        Car c1 = new Car();
        AnimationTimer timer2 = new AnimationTimer( 100, c1 );
        timer2.start();
    }

}
