package Practica_2_2.Ejercicio_2_2_2;

public class NumeroEntero implements Multiplicable {
    private int valor = 5;

    public void multiplicar(int numero){
        this.valor = (this.valor * numero);
    }

    public int mostrarResultados(){
        return this.valor;
    }
}
