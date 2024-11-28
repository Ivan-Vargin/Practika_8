package MyPackage;

import java.awt.*;
import javax.swing.*;
public class ThirdGui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
//создали панель
        JPanel panel= new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
// задали свойство панели размеры
        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);
//добавили панель к фрейму
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
