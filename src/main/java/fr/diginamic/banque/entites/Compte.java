package fr.diginamic.banque.entites;

public class Compte
{
    int numCompte;
    float soldeCompte;

    public Compte(int numCompte, float soldeCompte)
    {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString()
    {
        return "compte{numCompte = " + numCompte + " " + "soldecompte = " + soldeCompte + " }";
    }
}
