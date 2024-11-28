package MyPackage;

import javax.swing.*;
public class SecondGui {
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
//сощдали еще одну кнопку
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button1);
//добавили вторую кнопку
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
