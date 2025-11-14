package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne
{
    public static void main(String[] args)
    {
        CalculMoyenne test = new CalculMoyenne();
        double moyenne = 0.0;
        test.ajout(3.0);
        moyenne = test.calcule();
        System.out.println(moyenne);

        test.ajout(9.0);
        moyenne = test.calcule();
        System.out.println(moyenne);

        test.ajout(10.0);
        moyenne = test.calcule();
        System.out.println(moyenne);
    }
}
