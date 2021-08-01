import javax.swing.*; //menu submenu menubar and menuitems

public class guimenu {
    public static void main(String[] args) {
        JMenu m1, m2;
        JMenuItem i1, i2, i3, i4;
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        m1 = new JMenu("menu");
        m2 = new JMenu("submenu");
        i1 = new JMenuItem("1");
        i2 = new JMenuItem("2");
        i3 = new JMenuItem("3");
        i4 = new JMenuItem("4");
        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        m1.add(m2);
        mb.add(m1);
        f.setJMenuBar(mb);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}