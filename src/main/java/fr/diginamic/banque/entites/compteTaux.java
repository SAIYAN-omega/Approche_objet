package fr.diginamic.banque.entites;

public class compteTaux extends Compte
{
    int tauxRemuneration;

    public compteTaux(int numCompte, float soldeCompte, int tauxRemuneration)
    {
        super(numCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "compteTaux{" +
                "tauxRemuneration=" + tauxRemuneration +
                ", numCompte=" + numCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}
