package entites;


import entites2.Personne;

public class TestAdressePostale
{
    public static void main(String[] args)
    {
        adressePostale adrr1 = new adressePostale();
        adressePostale adrr2 = new adressePostale();
        Personne Client = new Personne();

        adrr1.CodePostal = 34660;
        adrr1.LibelleRue = "12 rue bg";
        adrr1.numeroDeRue = 15;
        adrr1.Ville = "Montpellier";

        adrr2.CodePostal = 34660;
        adrr2.LibelleRue = "12 rue bg";
        adrr2.numeroDeRue = 15;
        adrr2.Ville = "Montpellier";

        Client.Prenom = "Thomas";
        Client.Nom = "Vidal";
        Client.adresse = new adressePostale();

    }
}
