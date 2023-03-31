package Practica_2_1.Ejercicio_2_1_2;
import java.util.regex.Pattern;

public class Validador {
    private String alfanumerico;
    private Float flotante;
    private String email;
    private String letras;

    public boolean esAlfanumerico(String alfaumerico) {
        this.alfanumerico = alfaumerico;
        String patron = "^[\\w]*$";
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(this.alfanumerico).lookingAt();
        return b;
    }
    //REVISAR
    public boolean esFlotante(Float flotante){
        this.flotante = flotante;
        String asd = String.valueOf(this.flotante);
        String patron = "^[\\d]*.+[\\d]*";           
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(asd).lookingAt();
        return b;
    }

    public boolean esEmail(String mail){
        this.email = mail;
        String patron = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(this.email).lookingAt();
        return b;
    }

    public boolean esLetra(char letra){
        this.letras = String.valueOf(letra);
        String patron = "^\\D";
        Pattern p = Pattern.compile(patron);
        Boolean b = p.matcher(this.letras).lookingAt();
        return b;
    }
}
