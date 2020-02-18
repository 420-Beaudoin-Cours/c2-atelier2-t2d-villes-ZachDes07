package com.company;

public class Villes {

    public static void afficherTab(int[][] tab){
        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        for(int i = 0; i < nbLignes; i++)
            for(int j = 0; j < nbColonnes; j++)
                System.out.println(tab[i][j] + "");
    }

    public static int sommeUneLigne(int[][] tab, int iLigne){
        int somme = 0;

        for(int i = 0; i < tab[iLigne].length; i++) {
            somme = somme + tab[iLigne][i];
            iLigne++;
        }

        return somme;
    }

    public static int moyenneUneLigne(int [][] tab, int iLigne){
        int nbColonnes = tab[0].length;
        int moyenne = 0;
        int somme = 0;

        for(int i = 0; i < tab[iLigne].length; i++) {
            somme = somme + tab[iLigne][i];
        }

        moyenne = somme / nbColonnes;

        return moyenne;
    }

}
