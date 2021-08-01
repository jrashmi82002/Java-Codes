import javax.swing.*;// java gui class  here this program shows structural componen ts of java gui

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        // JButton b = new JButton(new ImageIcon("image location"));
        JRadioButton rb = new JRadioButton("Male");
        JRadioButton rb1 = new JRadioButton("Female");
        // JTextArea ta = new JTextArea();
        JTextField tf = new JTextField();
        rb.setBounds(0, 100, 100, 200);
        rb1.setBounds(100, 100, 200, 200);
        // ta.setBounds(0, 400, 100, 300);
        b.setBounds(0, 0, 100, 100);
        tf.setBounds(0, 300, 300, 100);
        b.addActionListener(new ActionListener() {// adding event to button

            @Override
            public void actionPerformed(ActionEvent e) {

                tf.setText("hello everyone");
            }

        });
        f.add(rb1);// to add particular structure inside the frame
        f.add(b);
        f.add(rb);
        // f.add(ta);
        f.add(tf);
        f.setSize(400, 400);// opening size of gui in it
        f.setLayout(null);// to see proper setup of layout
        f.setVisible(true);// to see items in gui
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close program from terminal also
    }
}
