package com.company;

public class Villes {

    public static void afficherTab(int[][] tab){
        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)
                System.out.println(tab[i][j]);
    }
}
