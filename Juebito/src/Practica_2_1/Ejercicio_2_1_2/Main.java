package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
//      String palabra = "heloo";
//      Conversor.converter(palabra);
        Validador v = new Validador();
        String variable = "123";
        if(v.esAlfanumerico(variable)){
            System.out.println("Es alfanumerico");
        } else 
            System.out.println("no es alfanumerico");
    }
}