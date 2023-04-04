package Practica_2_2.Ejercicio_2_2_2;

public class MiMatriz implements Multiplicable{
    private int[][] valor = {{1,2,3},{4,5,6},{7,8,9}};

    public void multiplicar(int valor){
        for(int i=0;i<this.valor.length;i++){
            for(int j=0;j<this.valor[i].length;j++){
                this.valor[i][j] = (this.valor[i][j] * valor);
            }
        }
    }

    public int[][] mostrarResultados(){
        return this.valor;
    }
}