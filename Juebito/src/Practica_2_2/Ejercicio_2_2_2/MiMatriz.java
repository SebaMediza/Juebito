package Practica_2_2.Ejercicio_2_2_2;

public class MiMatriz implements Multiplicable{
    private int[][] valor = {{10,20,30},{40,50,60},{70,80,90}};

    public void multiplicar(int valor){
        for(int i=0;i<this.valor.length;i++){
            for(int j=0;j<this.valor[i].length;j++){
                this.valor[i][j] = (this.valor[i][j] * valor);
            }
        }
    }

    public void mostrarResultados(){
        for(int i=0;i<this.valor.length;i++){
            for(int j=0;j<this.valor[i].length;j++){
                System.out.println(this.valor[i][j]);
            }
        }
    }
}