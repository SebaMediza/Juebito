package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
        Validador v = new Validador();
        //String linea = "exe456+*/*/(=&%DTY$HB/7654Y)";
        float linea = (float) 223.22;
        if(v.esFlotante(linea)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
    }
}