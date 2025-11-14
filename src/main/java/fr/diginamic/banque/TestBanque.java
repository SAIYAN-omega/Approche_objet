package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.compteTaux;

public class TestBanque
{
    public static void main(String[] args)
    {
        //Compte client = new Compte(15,125.2f);
        //System.out.println(client);

        Compte[] client = new Compte[2];
        client[0] = new Compte(5,12.2f);
        client[1] = new compteTaux(5,12.5f,50);

        for (int i = 0; i < client.length; i++)
        {
            System.out.println(client[i]);
        }

    }
}
