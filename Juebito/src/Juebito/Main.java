package Juebito;

import java.util.Vector;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Vector<Juego> games = new Vector<>();
      int indice;
      try (Scanner input = new Scanner(System.in)) {
         int eleccion;
         do{
            System.out.println("1: Juego Dado");
            System.out.println("2: Juego Piedra, Pepel o Tijera");
            System.out.println("0: Salir");
            Dados dice = new Dados();
            games.add(0, dice);
            PiedraPapelTijera juegar = new PiedraPapelTijera();
            games.add(1,juegar);

            eleccion = input.nextInt();
            switch(eleccion){
               case 1:
                  indice = 0;
                  games.get(indice).jugar();
                  System.out.println("El resultado es: ");
                  System.out.println(games.get(indice).mostrarResultado());
               break;
               case 2:
                  indice = 1;
                  games.get(indice).jugar();
                  System.out.println("El resultado es: ");
                  System.out.println(games.get(indice).mostrarResultado());
               break;
            }
         }while(eleccion != 0);
      }
   }
}
