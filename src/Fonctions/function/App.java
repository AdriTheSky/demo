package Fonctions.function;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        System.out.println("Privet MY FRIEND");
        System.out.println("Que veux-tu faire MY FRIEND");
        System.out.println("1 - Determiner un nombre premier");
        System.out.println("2 - Determiner un nombre parfait");
        System.out.println("3 - Determiner un tri de chaine de caractère");
        System.out.println("4 - Determiner si la chaine 1 = chaine2");
        System.out.println("5 - Determiner si le mot est un palindrome");

        int resp = sc.nextInt();
        sc.nextLine();

        switch (resp){
            case 1:
                isPremier();
                break;
            case 2:
                isParfait();
                break;
            case 3:
                trie();
                break;
            case 4:
                isContains();
                break;
            case 5:
                isPalindrome();
                break;
        }

    }

    public static void isPremier(){

        int reste;
        boolean prem = true;
        Scanner b = new Scanner(System.in);

        System.out.println("Ecrire un nombre : \n");

        int nbr = b.nextInt();
        for(int i = 2;  i < nbr/2; i++){

            reste = nbr%i;

            if (reste == 0){
                prem=false;
                break;
            }
        }
        if (prem){
            System.out.println( nbr + " est un nombre premier");
        }else {
            System.out.println( nbr + " n'est pas un nombre premier");
        }
    }

    public static void isParfait() {

        int somme = 0;
        boolean parf = true;
        Scanner c = new Scanner(System.in);

        System.out.println("Ecrire un nombre : \n");

        int nbr = c.nextInt();

        for (int i = 1; i <= nbr; i++){
            if (nbr % i == 0){
                somme += i;
            }
        }
        if (nbr*2 == somme){
            System.out.println( nbr + " est un nombre parfait");
        }else {
            System.out.println( nbr + " n'est pas un nombre parfait");
        }
    }

    public static void trie(){

        //String [] alphab = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] arrays=new String[]{"uniforme","alpha","tango","zoulou","charlie","papa","hotel"};
        System.out.println("Avant: ");

        for(int i=0; i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }
        System.out.println("\nAprès:");
        Arrays.sort(arrays);

        for(int i=0; i<arrays.length;i++){
            System.out.print(arrays[i]+",");
        }

    }

    public static void isContains(){

    }

    public static void isPalindrome(){

        String chaine = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Le mot à vérifier : ");
        chaine = sc.nextLine();

        if (pal(chaine))
            System.out.println("'"+chaine + "' est un palindrome");
        else
            System.out.println("'"+chaine + "' n'est pas un palindrome");
    }
    public static boolean pal(String chaine){
        int i=0, longueur=chaine.length()-1;
        boolean egale=true;
        while(i<longueur/2 && egale){
            if(chaine.charAt(i)==chaine.charAt(longueur-i))
                egale = true;
            else
                egale = false;
            i++;
        }
        return egale;
    }



}
