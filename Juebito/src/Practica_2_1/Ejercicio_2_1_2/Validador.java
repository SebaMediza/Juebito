package Practica_2_1.Ejercicio_2_1_2;
import java.util.regex.Pattern;

public class Validador {
    private String alfanumerico;
    private Float flotante;
    private String email;
    private char letras;

    public boolean esAlfanumerico(String alfaumerico) {
        this.alfanumerico = alfaumerico;
        String patron = "^\\w";
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(this.alfanumerico).lookingAt();
        return b;
    }

    public boolean esFlotante(Float flotante){
        String asd = String.valueOf(this.flotante);
        String patron = "^\\\\d+\\.\\d*";
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(asd).lookingAt();
        return b;
    }
}
