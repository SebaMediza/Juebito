package Practica_2_2.Ejercicio_2_2_2;

public class MiVector implements Multiplicable {
    private int[] valor = {1,2,3,4,5,6,7,8,9};

    public void multiplicar(int valor){
        for(int i=0;i<this.valor.length;i++){
            this.valor[i] = (this.valor[i] * valor);
        }
    }

    public void mostrarResultados(){
        for(int i=0;i<this.valor.length;i++){
            System.out.println(this.valor[i]);
        }
    }
}
