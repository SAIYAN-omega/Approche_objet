package fr.diginamic.maison;

import java.util.Arrays;

public class Maison
{
    Piece[] maison = new Piece[1];

    public boolean verifDonneePiece(Piece pieces)
    {
        boolean reponse = false;
        if(pieces.etage >= 0 && pieces.superficie >= 0.0)
        {
            reponse = true;
        }
        else
        {
            reponse = false;
        }
        return reponse;
    }

    public void ajouterPiece(Piece pieces)
    {
        if((pieces != null) && (verifDonneePiece(pieces)))
        {
            if((this.maison[this.maison.length - 1] == null))
            {
                this.maison[this.maison.length - 1] = pieces;
            }
            else
            {
                this.maison = Arrays.copyOf(this.maison,this.maison.length + 1);
                this.maison[this.maison.length - 1] = pieces;
            }
        }
        else
        {
            System.err.println("impossible desoler");
        }
    }

    public double surperficieTotaleMaison()
    {
        double surperficieTotale = 0.0;
        for (int i = 0; i < this.maison.length; i++)
        {
            surperficieTotale += this.maison[i].superficie;
        }
        return surperficieTotale;
    }

    public double superficieTotalEtage(int etage)
    {
        double surperficieTotale = 0.0;
        for (int i = 0; i < this.maison.length; i++)
        {
            if(this.maison[i].etage == etage)
            {
                surperficieTotale += this.maison[i].superficie;
            }
        }
        return surperficieTotale;
    }

    public double superficieGlobal(String typePiece)
    {
        double surperficieTotale = 0.0;
        for (int i = 0; i < this.maison.length; i++)
        {
            if(this.maison[i].designation() == typePiece)
            {
                surperficieTotale += this.maison[i].superficie;
            }
        }
        return surperficieTotale;
    }

    public int nbrPieceDemander(String typePiece)
    {
        int cpt = 0;
        for (int i = 0; i < this.maison.length; i++)
        {
            if(this.maison[i].designation() == typePiece)
            {
                cpt++;
            }
        }
        return cpt;
    }

}
