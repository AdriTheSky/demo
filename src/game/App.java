package game;

import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bienvenue dans le GAME !");
        System.out.println("Entrez le nom de la partie : ");
        String label = sc.nextLine();
        System.out.print("Entrez Joueur 1 : ");
        String name1 = sc.nextLine();
        System.out.print("Entrez Joueur 2 : ");
        String name2 = sc.nextLine();
        System.out.print("En combien de tours, souhaitez-vous réaliser la partie : ");
        int nbTours = sc.nextInt();
        sc.nextLine();

        Game game = new Game(new Player(name1), new Player(name2), label, nbTours);
        game.start();


    }
}
