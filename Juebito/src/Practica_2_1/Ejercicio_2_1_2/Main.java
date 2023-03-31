package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
        Validador v = new Validador();
        //String linea = "--hola";
        //char linea = '9';
        float linea = 285;
        if(v.esFlotante(linea)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}