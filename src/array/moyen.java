package array;

import java.util.Scanner;

public class moyen {

    public static void main (String[] args){

        moyenTab();

        // moySansTab();
    }

    public static void moyenTab(){

        Scanner sc= new Scanner(System.in);
        System.out.print("Entrez le nombre de personnes : ");
        int nb = sc.nextInt();

        int[] tabEnt = new int[nb];
        int somme = 0;
        for (int i=0; i<nb; i++){
            System.out.println("Entrez votre age "+(i+1)+" : ");
            tabEnt[i] = sc.nextInt();
            somme += tabEnt[i];
        }

        System.out.printf("La moyenne des ages (%d) est : %f", nb, somme / (float)nb);
    }

    public  static void moySansTab(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez l'age 1 :");
        int a1 = sc.nextInt();
        System.out.print("Entrez l'age 2 :");
        int a2 = sc.nextInt();
        System.out.print("Entrez l'age 3 :");
        int a3 = sc.nextInt();

        System.out.println("La moyen est de : "+ (a1+a2+a3)/3);
    }
}
