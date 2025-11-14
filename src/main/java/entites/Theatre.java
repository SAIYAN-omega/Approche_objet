package entites;

public class Theatre
{
    public String nom;
    public int nbMax;
    public int totalClientInscrit;
    public double recetteTotale;


    public Theatre(String nom, int nbMax)
    {
        this.nom = nom;
        this.nbMax = nbMax;
    }

    public void inscrire(int nbClient, double prixPlace)
    {
        if((totalClientInscrit + nbClient) <= nbMax)
        {
            totalClientInscrit = totalClientInscrit + nbClient;
            recetteTotale += nbClient*prixPlace;
        }
        else
        {
            System.err.println("desoler capaciter max atteint");
        }
    }
}
