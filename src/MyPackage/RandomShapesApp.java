package MyPackage;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawingPanel());
        frame.setVisible(true);
    }
}
