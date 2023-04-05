package Practica_2_2.Ejercicio_2_2_4;

public class Masajista extends SeleccionFutbol {
    private Integer anioExperiencia;
    private String titulacion;

    public Masajista(){
        this.anioExperiencia = 15;
        this.titulacion = "Masajista Profecional, MP:02568";
        this.nombre = "Natalia";
        this.apellidos = "Fredes";
        this.edad = 37;
        this.id = 25;
    }

    public void darMasaje(){
        System.out.println("La " + 
        this.titulacion + 
        "; " +
        this.apellidos + 
        " " +
        this.nombre +
        ", con " +
        this.edad +
        " años de edad" +
        " y " +
        this.anioExperiencia +
        " años de experiencia, sera la encargada de tu masaje." 
        );
    }
}
