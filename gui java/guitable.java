import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class guitable {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        String data[][] = { { "1", "Rashmi", "Btech", "9999999999" }, { "2", "Vaibhav", "4th", "8888888888" },
                { "3", "Karan", "10th", "7777777777" } };
        String col[] = { "S.No", "Name", "Class", "Number" };
        JTable t = new JTable(data, col);// make table using data and coloum arrays
        t.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(t);// for table header
        f.add(sp);
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
