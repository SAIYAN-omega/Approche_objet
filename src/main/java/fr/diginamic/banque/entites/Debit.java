package fr.diginamic.banque.entites;

public class Debit extends Operation
{



    public Debit(int montantOperation, String dateOperation)
    {
        super(montantOperation, dateOperation);
    }

    public String getType()
    {
        return "DEBIT";
    }
}
