package Practica_2_2.Ejercicio_2_2_2;

import java.util.ArrayList;

public class Main implements Multiplicable{
    public static void main(String[] args) {
        ArrayList<Multiplicable> miArray = new ArrayList<>();
        for(int i=0;i<3;i++){
            switch (i){
                case 0:
                miArray.add(i, new NumeroEntero());
                break;
                case 1:
                miArray.add(i,new MiVector());
                break;
                case 2:
                miArray.add(i, new MiMatriz());
                break;
            }    
        }
        miArray.get(0);
        Multiplicable.multiplicar(5);
    }
}
