package Tableau;

import java.util.Arrays;
import java.util.Objects;

public class Exercice1 {

    public static void main(String[] args){
        int [] tab = new int[] {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        //affTableau(tab);
        //affTableauInv(tab);
        //nbrSuprTrois(tab);
        nbrPairs(tab);

    }

    public static void affTableau(int [] tab){

        for(int i = 0; i < tab.length; i++)
        {
            System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tab[i]);
        }
    }

    public static void  affTableauInv(int [] tab){

        for (int i = (tab.length - 1) ; i >=0  ; i--) {

            System.out.println("Le tableau inverse donne : " + tab[i]);
        }
    }

    public static void nbrSuprTrois(int [] tab){

        int valeur = 3;
        int index;

        for(int i = 0; i < tab.length; i++)
        {
            if(Objects.equals(tab[i], valeur)){
                index = i;
                System.out.println("La valeur supérieur à 3 : " + index);
            }
        }
    }

    public static void nbrPairs(int [] tab){

        for(int i = 0; i < tab.length; i++){
            if(tab[i]%2 == 0){
                System.out.println(tab[i] + " est pairs");
            }else{
                System.out.println(tab[i] + " est impairs");
            }
        }
    }
}
