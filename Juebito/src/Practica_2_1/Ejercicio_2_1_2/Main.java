package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
        Validador v = new Validador();
        if(v.esAlfanumerico("ab123")){
            System.out.println("Es Alfanumerico");
        }else{
            System.out.println("No es");
        }
    }
}