package Practica_2_1.Ejercicio_2_1_2;

public class Conversor {

    public static void converter(String carter){
        String casa = carter;
        for(int i=0;i<casa.length();i++){
            int carcter = Integer.valueOf(casa.charAt(i));
            System.out.println(Integer.toBinaryString(carcter));
        }
    } 
}
