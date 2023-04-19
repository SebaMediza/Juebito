package Practica_2_3.Ejercicio_2_3_3;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ParametersGUI extends JFrame implements KeyListener{
    ParametersGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 81 -> System.out.println("Toggle SXF");
            case 87 -> System.out.println("Toggle Music");
            case 32 -> System.out.println("Pause / Start");
            case 37 -> System.out.println("Izquierda");
            case 38 -> System.out.println("Arriba");
            case 39 -> System.out.println("Derecha");
            case 40 -> System.out.println("Abajo");
            case 88 -> System.out.println("Shoot");
            case 90 -> System.out.println("Special Attack");
            case 10 -> System.out.println("Start Game");
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
