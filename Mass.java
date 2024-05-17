import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.naming.InitialContext;
import javax.swing.JComponent;

public class Mass extends JComponent {

    private int x = 1920;
    private int y = 1080;
    private int radius = 50;
    private Point position = new Point((x/2 - radius), radius);
    private double initialSpeed = 0;
    private double speed;
    private double acceleration = 9.8;
    private double time = 0.005;
   

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(new Color(233,224, 210));
        g.fillRect(0, 0, x, y);
       
        g.setColor(new Color(80, 48, 30));
        g.fillOval((int)(position.getX()), (int)(position.getY()), radius, radius);
           
    }   

    public Point getPoint()
    {
        return this.position;
    }

    public void accelerate()
    {   
        speed = initialSpeed + acceleration * time;

        if (position.getY() >= 1080-radius)
        {
            bounce();
        }
        else 
            move();
    }

    public void move() 
    {
        Point newPosition = new Point((int)(x/2 - radius), (int)position.getY() + (int)speed);
        this.position = newPosition;
        initialSpeed = speed;
       
    }

    public void bounce()
    {
        initialSpeed = -speed * 0.07f;
        System.out.println("Cheguei");
    }
}