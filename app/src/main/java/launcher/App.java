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
                                    
 // Variables per Snake
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

 // General Variables
    public Vector food;
    public Integer size = 30;
    public Integer w, h;
    public Boolean Paused = true;
 //

 // Create Window
    public void start() {
        
        JFrame frame = new JFrame("2-Player Snake");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(getGreeting());
        frame.getContentPane().add(label);

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