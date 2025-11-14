package fr.diginamic.banque.entites;

public class Credit extends Operation
{

    public Credit(int montantOperation, String dateOperation)
    {
        super(montantOperation, dateOperation);
    }

    public String getType()
    {
        return "CREDIT";
    }
}
