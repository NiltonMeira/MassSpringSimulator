import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);

        Mass mass = new Mass();
        frame.add(mass);

        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                mass.accelerate();
                frame.repaint();
            }
        };
        Timer timer = new Timer(10, taskPerformer);
        timer.start();

    }
}