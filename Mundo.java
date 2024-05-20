import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics;

public class Mundo extends JComponent {

    
    private ArrayList<Mass> massList;
    private int x = 600;
    private int y = 600;

    public Mundo() {
        massList = new ArrayList<Mass>();
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

    public void draw(Graphics g)
    {
        for (Mass mass : massList)
        {
            g.setColor(new Color(80, 48, 30));
            g.fillOval((int)(mass.getPoint().getX()), (int)(mass.getPoint().getY()), 20, 20);
        }
    }

    public ArrayList<Mass> getList()
    {
        return massList;
    }

    
}
