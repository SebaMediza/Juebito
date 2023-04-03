package Practica_2_1.Ejercicio_2_1_4;

import java.text.BreakIterator;

public class Carta {
    private int pica;
    private int corazon;
    private int diamante;
    private int trebol;

public Carta generarCarta(int i){
    switch(i){
        case 1: //PICA
            this.pica++;
            
        break;
        case 2: //CORAZON
        break;
        case 3: //DIAMANTE
        break;
        case 4: //TREBOL
        break;
        default;
        }
    }
}