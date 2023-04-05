package Practica_2_2.Ejercicio_2_2_2;

import java.util.ArrayList;

public class Main implements Multiplicable{
    public static void main(String[] args) {
        ArrayList<Multiplicable> miArray = new ArrayList<>();
        NumeroEntero num = new NumeroEntero();
        NumeroEntero num_2 = new NumeroEntero();
        miArray.add(0, num);
        num.multiplicar(5);
        num_2 = (NumeroEntero) miArray.get(0);
        System.out.println(num_2.mostrarResultados());        
        
        MiVector vec = new MiVector();
        MiVector vec_2 = new MiVector();
        miArray.add(0, vec);
        vec.multiplicar(10);
        vec_2 = (MiVector) miArray.get(0);
        vec_2.mostrarResultados();
    
        MiMatriz mat = new MiMatriz();
        MiMatriz mat_2 = new MiMatriz();
        miArray.add(0, mat);
        mat.multiplicar(10);
        mat_2 = (MiMatriz) miArray.get(0);
        mat_2.mostrarResultados();
    }
}
