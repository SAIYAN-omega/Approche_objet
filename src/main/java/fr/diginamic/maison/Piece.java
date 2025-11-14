package fr.diginamic.maison;

public abstract class Piece
{
    int etage;
    double superficie;
    String nom;

    public Piece(int etage, double superficie)
    {
        this.etage = etage;
        this.superficie = superficie;
    }

    public abstract String designation();
}
