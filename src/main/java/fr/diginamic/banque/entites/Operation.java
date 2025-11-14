package fr.diginamic.banque.entites;

public abstract class Operation
{
   public String dateOperation;
   public int montantOperation;

    public Operation(int montantOperation, String dateOperation)
    {
        this.montantOperation = montantOperation;
        this.dateOperation = dateOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }
    public abstract String getType();
}
