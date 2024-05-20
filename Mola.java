import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.Math;

public class Mola{
    private double normalSize = 20;
    private double size;
    private double k = 200;
    private double deformacao;
    private double fe;
    private Mass mass1;
    private Mass mass2;
    private double fx;
    private double fy;
    private double dx;
    private double dy;

    
    Mola(Mass mass1, Mass mass2)
    {
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.dx = mass2.getPoint().getX() - mass1.getPoint().getX();
        this.dy = mass2.getPoint().getY() - mass1.getPoint().getY();
        this.size = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        this.deformacao = size - normalSize;
        this.fe = k*deformacao;
        this.fx = (dx/size) * fe;
        this.fy = (dy/size)*fe;
        mass1.moveMola(fx,fy);
        mass2.moveMola(fx, fy);
        
    }

    public Mass getMass(int num)
    {
        if(num == 1)
            return mass1;
        else if (num ==2)
            return mass2;
        else
            return mass1;
    }

     
    
}
