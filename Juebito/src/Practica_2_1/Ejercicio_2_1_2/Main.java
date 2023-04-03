package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
        String palabra = "H";
        Conversor.converterStringToBinary(palabra);
        
        String bianrio = "00101101";
        System.out.println(Conversor.converterBinaryToString(bianrio));
    }
}