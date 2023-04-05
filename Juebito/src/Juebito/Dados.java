package Juebito;

public class Dados extends Juego{
    private int min = 1;
    private int max = 6;
    private int rango = max - min + 1;
    
    @Override
    public void jugar() {
        int dado;
        dado = (int) (Math.random() * this.rango) + this.min;
        this.resultado = String.valueOf(dado);
    }   
}
