import javax.swing.*;
import java.awt.event.*;

public class guiform {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Submit");
        JLabel l1 = new JLabel("Your Name");
        JLabel l2 = new JLabel("Your Class");
        JTextField t = new JTextField("name ");
        JTextField t1 = new JTextField("class ");
        JLabel l3 = new JLabel();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JLabel l4 = new JLabel("hello");
        b.setBounds(150, 290, 100, 30);
        t.setBounds(100, 90, 200, 30);
        t1.setBounds(100, 180, 200, 30);
        l1.setBounds(100, 50, 200, 30);
        l2.setBounds(100, 140, 200, 30);
        l3.setBounds(80, 330, 250, 30);
        r1.setBounds(100, 220, 200, 20);
        r2.setBounds(100, 250, 200, 20);
        l4.setBounds(80, 350, 250, 30);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    // JOptionPane.showMessageDialog(this, "message");
                    l4.setText("Male");
                }
                if (r2.isSelected()) {
                    // JOptionPane.showMessageDialog(this, "message");
                    l4.setText("Female");
                }
                if (r2.isSelected() && r1.isSelected()) {
                    // JOptionPane.showMessageDialog(this, "message");
                    l4.setText("Female and male");
                }
                // String host = t.getText();
                l3.setText(t.getText() + " your form is Submitted.");
            }
            // java.net.InetAddress.getByName(host).getHostAddress() //ip address related
        });
        f.add(b);
        f.add(t);
        f.add(t1);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(r1);
        f.add(r2);
        f.add(l4);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
