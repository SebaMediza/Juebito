package Practica_2_3.Ejercicio_2_3_2;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

    static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    static JTextArea result;

    public void showGUI(){
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
        result = new JTextArea();

        JFrame f = new JFrame("Calculadora");
        GridBagConstraints c = new GridBagConstraints();
        f.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(3,3,3,3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //PRIMERA FILA
        c.weightx = 0.5;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 1;
        f.add (result,c);
        c.gridwidth = 1;
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 1;
        f.add (b18,c);
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        f.add(b7,c);
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        f.add(b8,c);
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 2;
        f.add(b9,c);
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 2;
        f.add(b10,c);
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 2;
        f.add(b15,c);
        //SEGUNDA FILA
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        f.add(b4,c);
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        f.add(b5,c);
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        f.add(b6,c);
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 3;
        f.add(b11,c);
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 3;
        f.add(b16,c);
        //TERCERA FILA
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        f.add(b1,c);
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        f.add(b2,c);
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 4;
        f.add(b3,c);
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 4;
        f.add(b12,c);
        c.gridheight = 2;
        c.weightx = 0.5;
        c.gridx = 4;
        c.gridy = 4;
        f.add(b17,c);
        //ULTIMA FILA
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 5;
        f.add(b0,c);
        c.gridwidth = 1;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        f.add(b14,c);
        c.weightx = 0.5;
        c.gridx = 3;
        c.gridy = 5;
        f.add(b13,c);
        f.pack();
        f.setVisible(true);
        this.action();
    }
    private void action(){
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
    }
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.showGUI();
    }

    public void actionPerformed(ActionEvent evt) {
        if(evt.getActionCommand().equals(b0.getActionCommand())){
            result.append(b0.getText());
        }
        if(evt.getActionCommand().equals(b1.getActionCommand())){
            result.append(b1.getText());
        }
        if(evt.getActionCommand().equals(b13.getActionCommand())){
            result.append(b13.getText());
        }
        if(evt.getActionCommand().equals(b17.getActionCommand())){

        }


    }
}