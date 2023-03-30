package Practica_2_1.Ejercicio_2_1_2;

public class Main {
    public static void main(String[] args) {
        Validador v = new Validador();
        String linea = "exe456+*/*/(=&%DTY$HB/7654Y)";
        if(v.esAlfanumerico(linea)){
            System.out.println("Es Alfanumerico");
        }else{
            System.out.println("NO Es Alfanumerico");
        }
        
    }
}