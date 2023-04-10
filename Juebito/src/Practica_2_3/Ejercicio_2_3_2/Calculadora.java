package Practica_2_3.Ejercicio_2_3_2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculadora extends Panel implements ActionListener {

    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    JTextField result;

    public Calculadora() {
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("/");
        b11 = new JButton("*");
        b12 = new JButton("-");
        b13 = new JButton("+");
        b14 = new JButton(",");
        b15 = new JButton("CE");
        b16 = new JButton("C");
        b17 = new JButton("=");
        b18 = new JButton("<-");

        result = new JTextField();

        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(b15);
        this.add(b16);
        this.add(b17);
        this.add(b18);
        this.add(result);


    }

    public void mostrar(){
        Frame f = new Frame("Botones Nuevo");
        GridBagConstraints c = new GridBagConstraints();
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        f.setLayout(new GridBagLayout());

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        f.addWindowListener(l);
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 3.0;
        f.add(this.result, c);
        c.gridwidth = GridBagConstraints.REMAINDER; //end row
        f.add(this.b18, c);
        f.pack();
        f.setVisible(true);
    }


    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.mostrar();

    }

    public void actionPerformed(ActionEvent evt) {
    }
}