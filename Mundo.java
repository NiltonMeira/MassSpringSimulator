import java.util.ArrayList;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;


public class Mundo extends JComponent {

    
    private ArrayList<Mass> massList;
    private ArrayList<Mola> molaList;
    private int x = 600;
    private int y = 600;

    public Mundo() {
        massList = new ArrayList<Mass>();
        molaList = new ArrayList<Mola>();
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(new Color(233,224, 210));
        g.fillRect(0, 0, x, y);
        draw(g);
    }   

    public void addMass(Mass mass)
    {   
        this.massList.add(mass);
    }

    public void addMola(Mola mola)
    {
        this.molaList.add(mola);
    }

    public void draw(Graphics g)
    {
        for (Mass mass : massList)
        {
            g.setColor(new Color(80, 48, 30));
            g.fillOval((int)(mass.getPoint().getX()), (int)(mass.getPoint().getY()), 20, 20);
        }

        for (Mola mola : molaList)
        {
            g.setColor(new Color(0,0, 210));
            g.drawLine(
                (int)(mola.getMass(1).getPoint().getX()) + mola.getMass(1).getRadius()/2, 
                (int)(mola.getMass(1).getPoint().getY()) + mola.getMass(1).getRadius()/2, 
                (int)(mola.getMass(2).getPoint().getX()) + mola.getMass(2).getRadius()/2, 
                (int)(mola.getMass(2).getPoint().getY()) + mola.getMass(2).getRadius()/2
            ); 
        }

        
    }

    public ArrayList<Mass> getList()
    {
        return massList;
    }

    
}
