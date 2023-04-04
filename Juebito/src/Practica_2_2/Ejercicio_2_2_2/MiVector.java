package Practica_2_2.Ejercicio_2_2_2;

public class MiVector implements Multiplicable {
    private int[] valor;

    public void multiplicar(int valor){
        for(int i=0;i<this.valor.length;i++){
            this.valor[i] = (this.valor[i] * valor);
        }
    }

    public int[] mostrarResultados(){
        return this.valor;
    }
}
