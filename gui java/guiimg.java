import javax.swing.*;
// import java.awt.*;

public class guiimg {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        ImageIcon img = new ImageIcon("ref2icon.jpg");
        JLabel ll = new JLabel(img);
        f.add(ll);
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
