/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurActuelle;
    private double prixAcheter;
    private int qteAcheter;
    
    public Action ( int unId, String unNom, double uneValeur, double unPrix, int uneQuantite)
    {
        idAction = unId;
        nomAction = unNom;
        valeurActuelle = uneValeur;
        prixAcheter = unPrix;
        qteAcheter = uneQuantite;
    }

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @param nomAction the nomAction to set
     */
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    /**
     * @return the valeurActuelle
     */
    public double getValeurActuelle() {
        return valeurActuelle;
    }

    /**
     * @param valeurActuelle the valeurActuelle to set
     */
    public void setValeurActuelle(double valeurActuelle) {
        this.valeurActuelle = valeurActuelle;
    }

    /**
     * @return the prixAcheter
     */
    public double getPrixAcheter() {
        return prixAcheter;
    }

    /**
     * @param prixAcheter the prixAcheter to set
     */
    public void setPrixAcheter(double prixAcheter) {
        this.prixAcheter = prixAcheter;
    }

    /**
     * @return the qteAcheter
     */
    public int getQteAcheter() {
        return qteAcheter;
    }

    /**
     * @param qteAcheter the qteAcheter to set
     */
    public void setQteAcheter(int qteAcheter) {
        this.qteAcheter = qteAcheter;
    }
    
    
}
