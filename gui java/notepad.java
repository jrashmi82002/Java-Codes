import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
// import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class notepad {
    public static void main(String[] args) {
        int h = 600;
        int w = 600;
        JFrame f = new JFrame();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");
        JMenuBar mb = new JMenuBar();
        JMenuItem fi1 = new JMenuItem("New");
        JMenuItem fi2 = new JMenuItem("Save");
        JMenuItem fi3 = new JMenuItem("Open");
        JMenuItem ei1 = new JMenuItem("Cut");
        JMenuItem ei2 = new JMenuItem("Copy");
        JMenuItem ei3 = new JMenuItem("Paste");
        JMenuItem ei4 = new JMenuItem("Undo");
        JMenuItem ti1 = new JMenuItem("Filter");
        JMenuItem ti2 = new JMenuItem("Color");
        JMenuItem ti3 = new JMenuItem("Insert");
        JMenuItem hi1 = new JMenuItem("help");
        JTextArea ta = new JTextArea();
        JScrollPane sb = new JScrollPane(ta);
        sb.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.add(sb);
        ta.setBounds(0, 0, w, h);
        file.add(fi1);
        file.add(fi2);
        file.add(fi3);
        edit.add(ei1);
        edit.add(ei1);
        edit.add(ei2);
        edit.add(ei3);
        edit.add(ei4);
        tools.add(ti1);
        tools.add(ti2);
        tools.add(ti3);
        help.add(hi1);
        mb.add(file);
        mb.add(edit);
        mb.add(tools);
        mb.add(help);
        f.add(ta);
        f.setJMenuBar(mb);
        f.setSize(h, w);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
