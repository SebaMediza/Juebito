package Practica_2_1;
import java.sql.Time;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList
;
public class ContenidoAudioVisual {
    private Scanner input = new Scanner(System.in);
    private String titulo;
    private String autor;
    private GregorianCalendar duracion;
    private String director;
    private List<String> interpretes;
    private List<String> actores;
    private Date fechaEstreno;
    private String genero;
    private String idiomaOriginal;
    private String subtitulos;



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getInterpretes() {
        return this.interpretes;
    }

    public void setInterpretes() {
        System.out.println("Ingrese los Interpretes, para finalizar ingrese FIN");
        String aca;
        input.nextLine();
        do{
            aca = input.nextLine();
            this.interpretes.add(aca);
        }while(aca.matches("FIN"));
    }

    public List<String> getActores() {
        return this.actores;
    }

    public void setActores() {
        System.out.println("Ingrese los Actores, para finalizar ingrese FIN");
        String aca;
        input.nextLine();
        do {
            aca = input.nextLine();
            this.actores.add(aca);
        }while (aca.matches("FIN"));
    }



public class GuardarNombres {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); // Se crea una lista para guardar los nombres
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        
        // Se utiliza un ciclo while que se ejecuta mientras el usuario no ingrese la palabra "FIN"
        while (true) {
            System.out.print("Ingrese un nombre (o escriba FIN para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("FIN")) {
                break; // Si se ingresa la palabra FIN, se sale del ciclo
            }
            nombres.add(nombre); // Se agrega el nombre a la lista
        }
        
        // Se imprime la lista de nombres
        System.out.println("Los nombres ingresados son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

}


    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }
}