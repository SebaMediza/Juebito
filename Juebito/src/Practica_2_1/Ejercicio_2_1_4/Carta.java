package Practica_2_1.Ejercicio_2_1_4;

public class Carta {
    private String pica;
    private String corazon;
    private String diamante;
    private String trebol;
    private int min = 1, max = 4;
    private int rango = max - min + 1;


public void generarCarta(){
    int tipo = 0;
    tipo = (int) (Math.random() * this.rango) + this.min;
    System.out.println(tipo);
}
}
