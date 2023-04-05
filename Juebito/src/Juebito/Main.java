package Juebito;

import java.util.Vector;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Vector<Juego> games = new Vector<>();
      try (Scanner input = new Scanner(System.in)) {
         int eleccion;
         do{
            System.out.println("1: Juego Dado");
            System.out.println("2: Juego Piedra, Pepel o Tijera");
            System.out.println("0: Salir");
            eleccion = input.nextInt();
            switch(eleccion){
               case 1:
               Dados dice = new Dados();
               games.add(dice);
               games.get(0).jugar();
               System.out.println("El resultado es: ");
               System.out.println(games.get(0).mostrarResultado());
               System.out.println("");
               break;
               case 2:
               PiedraPapelTijera juegar = new PiedraPapelTijera();
               games.add(juegar);
               games.get(0).jugar();
               System.out.println("El resultado es: ");
               System.out.println(games.get(0).mostrarResultado());
               System.out.println("");
               break;
            }
         }while(eleccion != 0);
      }
   }
}
