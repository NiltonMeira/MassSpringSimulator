import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);

        Point position = new Point(100, 20);
        Point position2 = new Point(100, 500);

        Mass mass = new Mass(position);
        Mass mass2 = new Mass(position2);

        Mundo mundo = new Mundo();
        mundo.addMass(mass);
        mundo.addMass(mass2);
      

        Mola mola = new Mola(mass, mass2);
        mundo.addMola(mola);

        frame.add(mundo);
        frame.revalidate();

        ArrayList<Mass> mundinho = mundo.getList();

        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                for (Mass mass : mundinho) {
                    mass.accelerate();
                    frame.repaint();
                }

            }

        };
        Timer timer = new Timer(10, taskPerformer);
        timer.start();

    }
}