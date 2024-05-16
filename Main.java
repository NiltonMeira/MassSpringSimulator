import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Point;
import java.awt.event.ActionListener;

import javafx.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1920, 1080);

        Mass mass = new Mass();
        frame.add(mass);

        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Point massPoint = mass.getPoint();
                
            }
        };
        Timer timer = new Timer(1000, taskPerformer);
        timer.start();

    }
}