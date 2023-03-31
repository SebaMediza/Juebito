package Practica_2_1.Ejercicio_2_1_1;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class ContenidoAudioVisual {
    private Scanner input = new Scanner(System.in);
    private String titulo;
    private String autor;
    private GregorianCalendar duracion;
    private String director;
    private List<String> interpretes;
    private List<String> actores;
    private GregorianCalendar fechaEstreno;
    private String genero;
    private String idiomaOriginal;
    private String subtitulos;

    GregorianCalendar calendar = new GregorianCalendar();

    public ContenidoAudioVisual(){};

    public ContenidoAudioVisual(String titulo, String autor, GregorianCalendar duracion, String director, GregorianCalendar fechaEstreno, String genero, String idiomaOriginal, String subtitulos){
        this.titulo=titulo;
        this.autor=autor;
        this.director=director;
        this.genero=genero;
        this.idiomaOriginal=idiomaOriginal;
        this.subtitulos=subtitulos;
        this.actores=null;
        this.actores=null;
        this.fechaEstreno=null;
        this.duracion=null;
    }

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

    public GregorianCalendar getDuracion() {
        return duracion;
    }
    public void setDuracion(GregorianCalendar duracion) {
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
    public void setInterpretes(String interprete) {
        this.interpretes.add(interprete);
    }
    public List<String> getActores() {
        return this.actores;
    }
    public void setActores(String actor) {
        this.actores.add(actor);
    }
    public GregorianCalendar getFechaEstreno() {
        return fechaEstreno;
    }
    public void setFechaEstreno(GregorianCalendar fechaEstreno) {
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