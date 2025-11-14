package entites;

public class AdressePostale
{
    int numeroDeRue;
    String LibelleRue;
    int CodePostal;
    String Ville;

    AdressePostale(int numeroDeRue,String LibelleRue,int CodePostal,String Ville)
    {
        this.numeroDeRue = numeroDeRue;
        this.LibelleRue = LibelleRue;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
    }
}

