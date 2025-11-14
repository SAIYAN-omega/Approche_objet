package fr.diginamic.essais;

import entites.Salarie;
import fr.diginamic.chaines.ManipulationChaine;

public class TestChaine
{
    public static void main(String[] args)
    {
        ManipulationChaine chaine = new ManipulationChaine();

        //1)_______________________________________________________------
        char premierCaractere = chaine.chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        //---------------------------------------------------------------

        //2)-------------------------------------------------------------
        int taillechaine = chaine.chaine.length();
        System.out.println("Taille de la chaine: " + taillechaine);
        //---------------------------------------------------------------

        //3)-------------------------------------------------------------
        int index = chaine.chaine.indexOf(';');                        //
        System.out.println("l'index du premier (;): " + index);        //
        //---------------------------------------------------------------

        //4)-------------------------------------------------------------
        String nomFamille = chaine.chaine.substring(0,index);          //
        System.out.println("nom : " + nomFamille);                     //
        //---------------------------------------------------------------

        //5 et 6)--------------------------------------------------------
        System.out.println("nom en MAJ : " + nomFamille.toUpperCase());//
        System.out.println("nom en min : " + nomFamille.toLowerCase());//
        //---------------------------------------------------------------

        //7)-------------------------------------------------------------
        String[] mots = chaine.chaine.split(";");
        for (int i = 0; i < mots.length; i++)
        {
            System.out.println(mots[i]);
        }
        //---------------------------------------------------------------

        //9)-------------------------------------------------------------
        String nom = mots[0];
        String prenom = mots[1];
        String salaire = mots[2].replace(" ","");
        double salaires = Double.parseDouble(salaire);
        Salarie travailleur = new Salarie(nom,prenom,salaires);
        //----------------------------------------------------------------

    }
}
