package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperation
{
    public static void main(String[] args)
    {
        Operations calcule = new Operations();
        double resultat = 0.0;

        resultat = calcule.calcul(2.0,5.0,'+');
        System.out.println(resultat);
        resultat = calcule.calcul(2.0,5.0,'-');
        System.out.println(resultat);
        resultat = calcule.calcul(2.0,5.0,'*');
        System.out.println(resultat);
        resultat = calcule.calcul(2.0,5.0,'/');
        System.out.println(resultat);

    }
}
