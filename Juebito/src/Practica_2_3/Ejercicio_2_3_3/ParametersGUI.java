package Practica_2_3.Ejercicio_2_3_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/* * * * * * * * * * * * * * * * * * * * * * * *
* q = Toggle SXF // KeyCode = 81                *
* w = Toggle Music // KeyCode = 87              *
* SpaceBar = Pause / Resume // KeyCode = 32     *
* Izquierda = Left // KeyCode = 37              *
* Arriba = Up // KeyCode = 38                   *
* Derecha = Right // KeyCode = 39               *
* Abajo = Down // KeyCode = 40                  *
* x = Shoot // KeyCode = 88                     *
* z = Special Attack  // KeyCode = 90           *
* Enter = Start Game // KeyCode = 10            *
* * * * * * * * * * * * * * * * * * * * * * * * */

public class ParametersGUI extends JFrame implements KeyListener{
    JLabel label;
    ImageIcon icon;
    ParametersGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        icon = new ImageIcon("rocket.png");
        label= new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        label.setBackground(new Color(123,123,123));
        label.setOpaque(true);
        //this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
        this.add(label);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
//            case 81 -> System.out.println("Toggle SXF");
//            case 87 -> System.out.println("Toggle Music");
//            case 32 -> System.out.println("Pause / Start");
            //Izquierda
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            //Arriba
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            //Derecha
            case 'd' ->  label.setLocation(label.getX() + 10, label.getY());
            //Abajo
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
//            case 88 -> System.out.println("Shoot");
//            case 90 -> System.out.println("Special Attack");
//            case 10 -> System.out.println("Start Game");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
//            case 81 -> System.out.println("Toggle SXF");
//            case 87 -> System.out.println("Toggle Music");
//            case 32 -> System.out.println("Pause / Start");
            //Izquierda
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            //Arriba
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            //Derecha
            case 39 ->  label.setLocation(label.getX() + 10, label.getY());
            //Abajo
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
//            case 88 -> System.out.println("Shoot");
//            case 90 -> System.out.println("Special Attack");
//            case 10 -> System.out.println("Start Game");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("Soltaste la tecla: " + e.getKeyChar());
//        System.out.println("Con codigo de tecla: " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new ParametersGUI();
    }
}
