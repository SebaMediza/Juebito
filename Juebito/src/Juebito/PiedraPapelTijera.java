package Juebito;

import java.util.Random;

public class PiedraPapelTijera extends Juego{
    private String piedra = "piedra";
    private String papel = "papel";
    private String tijera = "tijera";
    
    @Override
    public void jugar() {
    
        Random random = new Random();
        int num = random.nextInt(3);
        if (num == 0) {
            this.resultado = piedra;
        } else if (num == 1) {
            this.resultado = papel;
        } else {
            this.resultado = tijera;
        }

    }
    
}
