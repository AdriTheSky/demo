package PlusMoins;

import java.util.Random;
import java.util.Scanner;

public class plusmoins {

    public static void main (String[] args){

        fairePartie();
    }

    public static void fairePartie(){

        int Prix = 0;
        int Compt= 0;
        Random rnd = new Random();
        int JustPrix = rnd.nextInt(10);

        System.out.println("Et z'est partie les amiiis :)");

        do{

            System.out.println("Choisir un nombre : "+ Prix);

            Scanner sc = new Scanner(System.in);
            Prix = sc.nextInt();
            Compt = Compt + 1;

            if (Prix < JustPrix) {
                System.out.println("C'est plus allez encore un effort");

            } else if(Prix > JustPrix) {
                System.out.println("C'est moins allez encore un effort");

            }

        }while (Prix  != JustPrix);


        System.out.println("Tu as gagné en " + Compt + " fois !");


    }
}
