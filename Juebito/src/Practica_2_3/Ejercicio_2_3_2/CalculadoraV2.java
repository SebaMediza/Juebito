package Practica_2_3.Ejercicio_2_3_2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CalculadoraV2 extends Frame implements ActionListener {

	//public String botones[] = {"1","2","3","+","4","5","6","-","7","8","9","*","0","/","=","AC"};   
    public String botones[] = {"<-","7", "8", "9", "/", "CE", "4", "5", "6", "*", "C", "1","2","3","-", "=", "0", ",", "+"};
	public Integer resultado = 0;
	public TextField calculo;

	public int cifras[] = new int[20];
	public int operaciones[] = new int[20];
	public int c; //Contador

	public CalculadoraV2 (String title, Integer width, Integer height) {
		setTitle(title);
		setSize(width,height);
		setLayout(new GridLayout(2,2));

		calculo = new TextField("0");
		add(calculo);

		cifras[0] = 0;
		operaciones[0] = 0;
		c = 1;

		Panel panelBotones = new Panel(new GridLayout(4,5));
		for (int i=0;i<botones.length;i++) {
			Button b = new Button(botones[i]);
			b.addActionListener(this);
			panelBotones.add(b);
		}
		add(panelBotones);
        setVisible(getFocusTraversalKeysEnabled());
	}

	public void actionPerformed (ActionEvent e) {
		String operacion = ((Button)e.getSource()).getLabel();
		ejecutaOrden(operacion);
	}

	public void ejecutaOrden (String orden) {
		if (ordenNumerica(orden)) {
			if (((String)calculo.getText()).equals("0")) calculo.setText(orden);
			else calculo.setText(calculo.getText()+orden);
		} else if (orden.equals("+")) {
			cifras[c] = Integer.parseInt(calculo.getText());
			operaciones[c] = 0;
			c+=1;
			calculo.setText("");
		} else if (orden.equals("-")) {
			cifras[c] = Integer.parseInt(calculo.getText());
			operaciones[c] = 1;
			c+=1;
			calculo.setText("");
		} else if (orden.equals("*")) {
			cifras[c] = Integer.parseInt(calculo.getText());
			operaciones[c] = 2;
			c+=1;
			calculo.setText("");
		} else if (orden.equals("/")) {
			cifras[c] = Integer.parseInt(calculo.getText());
			operaciones[c] = 3;
			c+=1;
			calculo.setText("");
		} else if (orden.equals("=")) {
			cifras[c] = Integer.parseInt(calculo.getText());
			calculo.setText(String.valueOf(ejecutarOp()));
			c = 0;
			cifras[0] = Integer.parseInt(calculo.getText());
		} else if (orden.equals("AC")) {
			cifras[0] = 0;
			c = 0;
			calculo.setText("");
		}
	}

	public boolean ordenNumerica (String orden) {
		try {
			Integer.parseInt(orden);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public int ejecutarOp () {
		int resultado = cifras[0];
		for (int i=1;i<=c;i++) {
			if (operaciones[i-1]==0) resultado += cifras[i];
			else if (operaciones[i-1]==1) resultado -= cifras[i];
			else if (operaciones[i-1]==2) resultado *= cifras[i];
			else if (operaciones[i-1]==3) resultado /= cifras[i];
		}
		return resultado;
	}

	public static void main (String args[]) {
		CalculadoraV2 c = new CalculadoraV2("Calculadora",500,300);
		c.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent evt ){
			  System.exit( 0 );
			}
		  });
	}

}