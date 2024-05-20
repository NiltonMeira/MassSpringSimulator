import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JComponent;

public class Mass  {

    private int x = 600;
    private int y = 600;
    private int radius = 20;
    private Point position;
    private double initialSpeed = 0;
    private double speed;
    private double acceleration = 9.8;
    private double time = 0.010;
   
    public Mass(Point position){
        this.position = position;
    }

    public Point getPoint()
    {
        return this.position;
    }

    public void accelerate()
    {   
        speed = initialSpeed + acceleration * time;

        if (position.getY() >= y - 3*radius && speed >0)
            bounce();
        
        else 
            move();
    }

    public void move() 
    {
        Point newPosition = new Point((int)(position.getX()), (int)position.getY() + (int)speed);
        this.position = newPosition;
        initialSpeed = speed;
       
    }

    public void bounce()
    {
        initialSpeed = -speed * 0.7f;
    }
}