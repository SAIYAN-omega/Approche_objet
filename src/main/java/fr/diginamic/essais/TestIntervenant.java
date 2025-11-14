package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant
{
    public static void main(String[] args)
    {
        Salarie salarie = new Salarie("r","t",36.0);
        Pigiste pigiste = new Pigiste("r","t",36,39.0);

        System.out.println(salarie.getSalaire());
        System.out.println(pigiste.getSalaire());

        salarie.afficherDonnees();
        pigiste.afficherDonnees();

    }
}
