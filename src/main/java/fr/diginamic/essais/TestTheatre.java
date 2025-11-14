package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre
{
    public static void main(String[] args)
    {
        Theatre seance = new Theatre("dupont",20);
        seance.inscrire(20,5.0);
        System.out.println(seance.recetteTotale);
        System.out.println(seance.totalClientInscrit);
    }
}
