package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison
{
    public static void main(String[] args)
    {
        //Chambre chambre = new Chambre(0,9.0);
        Cuisine cuisine = new Cuisine(0,6.0);
        Cuisine cuisine2 = new Cuisine(2,5.2);

        SalleDeBain salleDeBain = new SalleDeBain(0,4.0);
        SalleDeBain salleDeBain2 = new SalleDeBain(0,4.0);
        SalleDeBain salleDeBain3 = new SalleDeBain(0,4.0);

        Maison maison = new Maison();
        //maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(cuisine2);

        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(salleDeBain2);
        maison.ajouterPiece(salleDeBain3);


        System.out.println(maison.superficieGlobal("cuisine"));
        System.out.println(maison.nbrPieceDemander("cuisine"));

        System.out.println(maison.superficieGlobal("salla de bain"));
        System.out.println(maison.nbrPieceDemander("salla de bain"));
    }
}
