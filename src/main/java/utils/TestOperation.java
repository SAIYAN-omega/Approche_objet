package utils;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation
{
    public static void main(String[] args)
    {
        Operation[] calcule = new Operation[4];
        calcule[0] = new Credit(2,"0");
        calcule[1] = new Credit(3,"1");
        calcule[2] = new Debit(4,"2");
        calcule[3] = new Debit(5,"3");
        double montantGlobal = 0.0;

        for (int i = 0; i < calcule.length; i++)
        {
            System.out.println(calcule[i]);
            System.out.println(calcule[i].getType());

            if(calcule[i].getType() == "DEBIT")
            {
                montantGlobal = calcule[i].montantOperation - 2;
            }
            else
            {
                montantGlobal = calcule[i].montantOperation + 2;
            }
        }
    }
}
