package fr.diginamic.operations;

public class Operations
{
    double resultat;
    public double calcul(double a,double b,char operateur)
    {
        switch (operateur)
        {
            case '+':
                resultat = a+b;
                break;
            case '-':
                resultat =  a-b;
                break;
            case '*':
                resultat =  a*b;
                break;
            case '/':
                resultat =  a/b;
                break;
            default:
                System.out.println("erreur de saisie");
                break;
        }
        return resultat;
    }
}
