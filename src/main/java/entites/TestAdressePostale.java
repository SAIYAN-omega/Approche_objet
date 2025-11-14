package entites;


import entites2.Personne;

public class TestAdressePostale
{
    public static void main(String[] args)
    {

        AdressePostale adrr1 = new AdressePostale(15,"12 rue bg",34660,"Montpellier");
        Personne Client1 = new Personne("Vidal","Thomas");
        Personne Client = new Personne("Vidal","Thomas",adrr1);

        Client.sePresenter();

        Client.setNom("dupond");
        Client.setPrenom("bernard");
        Client.setAdresse(adrr1);

        Client.sePresenter();

        System.out.println("Je m appelle " + Client.getPrenom() + " " + Client.getNom().toUpperCase());

    }
}
