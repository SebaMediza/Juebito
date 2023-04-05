package Practica_2_1.Ejercicio_2_1_4;
import java.util.Vector;

public class Mazo {
    private final Vector<Carta> macito;
    private int min = 1, max = 4;
    private int rango = max - min + 1;
        
    public Mazo() {
        macito = new Vector<>();
    }

    public void addCarta(Carta card){
        int tipo = 0;
        tipo = (int) (Math.random() * this.rango) + this.min;

    switch(tipo){
        case 1: //PICA
            Carta carta = new Carta();
            macito.add(carta);
        break;
        case 2: //CORAZON
        break;
        case 3: //DIAMANTE
        break;
        case 4: //TREBOL
        break;
        default:
        System.out.println("Error");
        }
    }
}
