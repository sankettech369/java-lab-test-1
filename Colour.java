
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Colour extends JFrame implements ActionListener {

    JCheckBox r, g, b;
    JLabel l;
    JButton btn;

    Colour() {
        setTitle("Color Selector");
        setSize(300, 200);
        setLayout(new FlowLayout());

        r = new JCheckBox("Red");
        g = new JCheckBox("Green");
        b = new JCheckBox("Blue");

        l = new JLabel("Selected Color");
        l.setOpaque(true);
        l.setPreferredSize(new Dimension(200, 50));
        

        btn = new JButton("Apply Color");
        btn.addActionListener(this);

        add(r);
        add(g);
        add(b);
        add(l);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        boolean R = r.isSelected();
        boolean G = g.isSelected();
        boolean B = b.isSelected();

        if (R && G && B)
            l.setBackground(Color.WHITE);
        else if (R && G)
            l.setBackground(Color.YELLOW);
        else if (R && B)
            l.setBackground(Color.MAGENTA);
        else if (G && B)
            l.setBackground(Color.CYAN);
        else if (R)
            l.setBackground(Color.RED);
        else if (G)
            l.setBackground(Color.GREEN);
        else if (B)
            l.setBackground(Color.BLUE);
        else {
            l.setText("No color selected");
            l.setBackground(Color.LIGHT_GRAY);
            return;
        }

        l.setText("Selected Color");
    }

    public static void main(String[] args) {
        new Colour();
    }
}
