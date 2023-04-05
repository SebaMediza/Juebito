package Practica_2_2.Ejercicio_2_2_4;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad; 
    protected void entrenar(){
        System.out.println("Estamos entrenando");
    }

    public static void main(String[] args) {
        // Masajista masajista = new Masajista();
        // masajista.darMasaje();
        Fulbolista futbolista = new Fulbolista();
        futbolista.entrevistar();
    }
}
