package Entities;

public class ProjetMobile extends Projet
{
    private int nbEcran;

    public ProjetMobile(String unNom, int unId, int uneDuree, double unTaux, int nbEcran) {
        super(unNom, unId, uneDuree, unTaux);
        this.nbEcran = nbEcran;
    }


    @Override
    public String getInfos()
    {
        return super.getInfos()+ nbEcran;
    }

}
