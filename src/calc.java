import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc {

    private JTextField l;
    private JPanel panel1;
    private JButton bm;
    private JButton bd;
    private JButton bp;
    private JButton b1;
    private JButton b4;
    private JButton b7;
    private JButton b2;
    private JButton b5;
    private JButton b8;
    private JButton b3;
    private JButton b6;
    private JButton b9;
    private JButton bo;
    private JButton bdot;
    private JButton be;
    private JButton bc;
    private JButton bs;
    private JLabel label;
    private JButton back;
    String s0,s1,s2;

    public calc() {
        s0=s1=s2="";
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        bo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        bdot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=actionEvent.getActionCommand();
                if(!s1.equals(""))
                    s2=s2+s;
                else
                    s0=s0+s;
                l.setText(s0+s1+s2);
            }
        });
        be.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double te;
                if(s1.equals("+"))
                    te=Double.parseDouble(s0)+Double.parseDouble(s2);
                else if(s1.equals("-"))
                te=Double.parseDouble(s0)-Double.parseDouble(s2);
                else if(s1.equals("x"))
                    te=Double.parseDouble(s0)*Double.parseDouble(s2);
                else
                    te=Double.parseDouble(s0)/Double.parseDouble(s2);
                s0=Double.toString(te);
                s2=s1="";
                l.setText(s0+s1+s2);

                }
        });
        bc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
             s0=s1=s2="";
             l.setText(s0+s1+s2);
            }
        });
        bm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double te=0;
                String s=actionEvent.getActionCommand();
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else {
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                   s0=  s0 = Double.toString(te);
                   s1=s;
                   s2="";
                }
                l.setText(s0+s1+s2);
            }
        });
        bd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                double te=0;
                String s=actionEvent.getActionCommand();
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else {
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                    s0=  s0 = Double.toString(te);
                    s1=s;
                    s2="";
                }
                l.setText(s0+s1+s2);
            }
        });
        bp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                double te=0;
                String s=actionEvent.getActionCommand();
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else {
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                    s0=  s0 = Double.toString(te);
                    s1=s;
                    s2="";
                }
                l.setText(s0+s1+s2);
            }
        });
        bs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                double te=0;
                String s=actionEvent.getActionCommand();
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                else {
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                    s0=  s0 = Double.toString(te);
                    s1=s;
                    s2="";
                }
                l.setText(s0+s1+s2);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(s1.equals(""))
                    s0=s0.substring(0,s0.length()-1);
                else if(!s2.equals(""))
                    s2=s2.substring(0,s2.length());
                else
                    s1="";
                l.setText(s0+s1+s2);


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calc");
        frame.setContentPane(new calc().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
