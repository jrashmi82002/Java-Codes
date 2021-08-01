import javax.swing.*;
import java.awt.*;
// import java.applet.*;

public class guigraphics extends JPanel {

    public void paint(Graphics g) {
        g.setColor(Color.red);// to select color at particular level
        g.drawLine(0, 0, 100, 100);
        g.setColor(Color.blue);
        g.drawString("hello java GUI", 200, 200);
        g.setColor(Color.pink);
        g.drawRect(0, 0, 300, 300);
        g.setColor(Color.black);
        g.draw3DRect(100, 100, 100, 100, true);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Graphics");// title

        f.setContentPane(new guigraphics());
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

    }
}
