package MyPackage;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Класс DrawingPanel
class DrawingPanel extends JPanel {
    private Shape[] shapes;

    public DrawingPanel() {
        shapes = new Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            int width = random.nextInt(50) + 10;
            int height = random.nextInt(50) + 10;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            switch (random.nextInt(3)) {
                case 0:
                    shapes[i] = new Circle(color, x, y, width);
                    break;
                case 1:
                    shapes[i] = new Rectangle(color, x, y, width, height);
                    break;
                case 2:
                    shapes[i] = new Triangle(color, x, y, width, height);
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
