package fr.diginamic.operations;

public class CalculMoyenne
{
    double[] nombre = new double[1];


    public void ajout(double valeur)
    {
        double[] sauvguarde = new double[nombre.length];
        for (int i = 0; i < nombre.length; i++)
        {
            sauvguarde[i] = nombre[i];
        }
        nombre = new double[nombre.length + 1];
        for (int i = 0; i < sauvguarde.length; i++)
        {
            nombre[i] = sauvguarde[i];
        }
        nombre[nombre.length - 1] = valeur;
    }

    public double calcule()
    {
        double moyenne = 0.0;
        double somme = 0.0;
        for (int i = 0; i < nombre.length; i++)
        {
            somme = somme + nombre[i];

        }
        moyenne = somme/nombre.length;

        return moyenne;
    }


}
