package Entities;

public class Projet
{
    private int idProjet;
    private String nomProjet;

    private int duree;

    private double tauxHoraire;

    public Projet(String unNom, int unId, int uneDuree, double unTaux)
    {
        this.nomProjet = unNom;
        this.idProjet = unId;
        this.duree = uneDuree;
        this.tauxHoraire = unTaux;
    }


    @Override
    public double calculerMontant()
    {


        return montant;
    }
    @Override
    public String getInfos()
    {
        return nomProjet+idProjet+duree+tauxHoraire;
    }

}
