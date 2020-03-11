package in;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Entry {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue...");
        System.out.print("Entrez votre nom : ");
        String name = sc.nextLine();
        System.out.print("Entrez votre age : ");
        byte age = sc.nextByte();
        sc.nextLine();
        System.out.println("Entrez vote addresse : ");
        String adr = sc.nextLine();

        System.out.println(name +" " + age + " " + adr);
    }
}
