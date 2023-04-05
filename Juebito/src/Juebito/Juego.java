package Juebito;

public abstract class Juego {
    private String resultado;
    
    public abstract void jugar();
    
    public String mostrarResultado() {
        return this.resultado;
    }
}
