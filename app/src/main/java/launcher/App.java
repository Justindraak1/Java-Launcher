package launcher;

import javax.swing.*;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

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