package Juebito;

public abstract class Juego {
    protected String resultado;
    
    public abstract void jugar();
    
    public String mostrarResultado() {
        return this.resultado;
    }
}
