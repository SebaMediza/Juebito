package Practica_2_1.Ejercicio_2_1_2;

public class Conversor {

    public static void converterStringToBinary(String carter){
        String casa = carter;
        for(int i=0;i<casa.length();i++){
            int carcter = Integer.valueOf(casa.charAt(i));
            System.out.println(Integer.toBinaryString(carcter));
        }
    }
    
    public static String converterBinaryToString(String binaryText){
        // Necesitamos separar cada número binario por espacio. Usamos split
    String[] binaryNumbers = binaryText.split(" ");
    String text = "";

    // Los recorremos. En cada paso tenemos al número binario
    for (String currentBinary : binaryNumbers) {
        // Ahora convertimos ese binario a decimal
        int decimal = binaryToDecimal(currentBinary);
        // Obtenemos la letra que le corresponde a ese valor ASCII
        char letra = (char) decimal;
        text += letra;
    }
    return text;
    }

    private static int binaryToDecimal(String binary) {
        // A este número le vamos a sumar cada valor binario
        int decimal = 0;
        int position = 0;
        // Recorrer la cadena...
        for (int x = binary.length() - 1; x >= 0; x--) {
            // Saber si es 1 o 0; primero asumimos que es 1 y abajo comprobamos
            short digit = 1;
            if (binary.charAt(x) == '0') {
                digit = 0;
            }
    
      /*
          Se multiplica el dígito por 2 elevado a la potencia
          según la posición; comenzando en 0, luego 1 y así
          sucesivamente
       */
            double multiplier = Math.pow(2, position);
            decimal += digit * multiplier;
            position++;
        }
        return decimal;
    }
}
