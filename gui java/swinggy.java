import javax.swing.*;

import java.awt.*;//for adding graphics

public class swinggy extends JPanel {// class to make gui is extended here

    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b;
        JLabel l1, l2;
        l1 = new JLabel("Name");
        l2 = new JLabel("Email");
        b = new JButton("submit");
        l1.setBounds(0, 0, 100, 20);
        b.setBounds(0, 110, 100, 30);
        l2.setBounds(0, 241, 100, 20);

        f.add(l1);
        f.add(l2);
        f.add(b);// adds the last one to frame

        // new swinggy(); // do not call paint function directly

        f.setContentPane(new swinggy());// object calls paint function

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);// make gui visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}