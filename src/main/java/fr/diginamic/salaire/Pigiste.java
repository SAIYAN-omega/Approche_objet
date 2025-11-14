package fr.diginamic.salaire;

public class Pigiste extends Intervenant
{
    int joursTravailler;
    double remunerationJournalier;

    public Pigiste(String nom, String prenom, int joursTravailler, double remunerationJournalier) {
        super(nom, prenom);
        this.joursTravailler = joursTravailler;
        this.remunerationJournalier = remunerationJournalier;
    }

    public double getSalaire()
    {
        return 23.0;
    }

    public String statut()
    {
        return "Pigiste";
    }
}
