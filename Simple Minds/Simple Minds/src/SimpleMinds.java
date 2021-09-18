// package simple.minds;

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;
    
    public class SimpleMinds extends JFrame implements ActionListener {
    
        JButton b1, b2;
        JTextField t1;
    
        SimpleMinds() {
            setBounds(250, 80, 1200, 600);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
    
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
            JLabel l1 = new JLabel(i1);
    
           l1.setBounds(0, 0, 600, 600);
           add(l1);
    
            JLabel l2 = new JLabel("Simple Minds");
            l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
            l2.setBounds(750, 100, 300, 45);
            l2.setForeground(new Color(30, 144, 254));
            add(l2);
    
            JLabel l3 = new JLabel("Enter Your Name");
            l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
            l3.setBounds(800, 190, 300, 20);
            l3.setForeground(Color.BLUE);
            add(l3);
    
             t1 = new JTextField();
            t1.setBounds(735, 240, 300, 25);
            t1.setFont(new Font("Times New Roman", Font.BOLD, 18));
            add(t1);
    
            b1 = new JButton("Rules");
            b1.setBounds(750, 310, 100, 25);
            b1.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
            b1.setBackground(new Color(30, 144, 254));
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            add(b1);
    
            b2 = new JButton("Exit");
            b2.setBounds(915, 310, 100, 25);
            b2.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
            b2.setBackground(new Color(30, 144, 254));
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            add(b2);
    
            setVisible(true);
    
        }
    
        public void actionPerformed(ActionEvent ae) {
    
            if (ae.getSource() == b1) {
            String name  = t1.getText();
            this.setVisible(false);
           new Rules(name);
            
            } else {
                System.exit(0);
            }
    
        }
    
        public static void main(String[] args) {
           new SimpleMinds();
        }
    
    }
    