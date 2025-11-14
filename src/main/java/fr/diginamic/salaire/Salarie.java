package fr.diginamic.salaire;

public class Salarie extends Intervenant
{
    double salaire;

    public Salarie(String nom, String prenom, double salaire)
    {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire()
    {
        return 25.0;
    }

    public String statut()
    {
        return "Salarier";
    }
}
