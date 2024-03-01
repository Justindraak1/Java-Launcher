package launcher;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;

public class App {
 //test to see if it runs
    public String getGreeting() {
        return "Hello World!";
    }
 //
                                    
 // Variables
    public ArrayList<Vector> snake = new ArrayList<Vector>();
        	public Vector pos;
        public Vector dir = new Vector<>(0, 0);
        public Integer spd = 20;
        public Integer len = 5;

    public ArrayList<Vector> snake2 = new ArrayList<Vector>();
        public Vector pos2;
        public Vector dir2 = new Vector<>(0, 0);
        public Integer spd2 = 20;
        public Integer len2 = 5;
 //


    public void start() {
        JFrame frame = new JFrame("Swing Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(getGreeting());
        frame.getContentPane().add(label);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            App app = new App();
            app.start();
        });
    }
}