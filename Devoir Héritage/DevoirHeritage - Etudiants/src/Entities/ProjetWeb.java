package Entities;

public class ProjetWeb extends Projet
{
    private int nbPages;
    private boolean responsive;

    public ProjetWeb(String unNom, int unId, int uneDuree, double unTaux, int nbPages, boolean responsive) {
        super(unNom, unId, uneDuree, unTaux);
        this.nbPages = nbPages;
        this.responsive = responsive;
    }



    @Override
    public String getInfos()
    {
        return super.getInfos()+ nbPages+responsive;
    }
}
