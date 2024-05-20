import java.awt.Point;


public class Mass  {

    private int y = 600;
    private int radius = 20;
    private Point position;
    private double initialSpeedY = 0;
    private double initialSpeedX = 0;
    private double speedY;
    private double speedX;
    private double acceleration = 9.8;
    private double time = 0.010;
    private double massa = 10;
   
    public Mass(Point position){
        this.position = position;
    }

    public Point getPoint()
    {
        return this.position;
    }

    public int getRadius()
    {
        return radius;
    }

    public void accelerate()
    {   
        speedY = initialSpeedY + acceleration * time;

        if (position.getY() >= y - 3*radius && speedY >0)
            bounce();
        
        else 
            move();
    }

    public void move() 
    {
        Point newPosition = new Point((int)(position.getX()), (int)position.getY() + (int)speedY);
        this.position = newPosition;
        initialSpeedY = speedY;
       
    }

    public void moveMola(double fx, double fy)
    {   
        double acMolaX = fx/massa;
        speedX = initialSpeedX + acMolaX * time;
        double acMolaY = fy/massa;
        speedY = initialSpeedY + acMolaY * time;

        Point newPosition = new Point((int)(position.getX() + speedX), (int)position.getY() + (int)speedY);
        this.position = newPosition;
        initialSpeedY = speedY;
        initialSpeedX = speedX;
    }

    public void bounce()
    {
        initialSpeedY = -speedY * 0.7f;
    }
}