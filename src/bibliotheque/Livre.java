/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import exceptions.NumeroInterdit;

/**
 * Classe pour créer un livre
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class Livre {

    /**
     * Constructeur de la classe Livre
     *
     * @param titre
     * @param nbPages
     * @param auteur
     */
    public Livre(String titre, int nbPages, Personne auteur) {
        this.titre = titre;
        this.nombreDePages = nbPages;
        this.auteur = auteur;
        this.numLivre = ++dernierNum;
    }

    /**
     * Accesseur de la variable numLivre
     *
     * @return
     */
    public int getNumLivre() {
        return numLivre;
    }

    /**
     * Accesseur de la variable Titre
     *
     * @return
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Accesseur de la variable nombreDePages
     *
     * @return
     */
    public int getNombreDePages() {
        return nombreDePages;
    }

    /**
     * Accesseur de la variable Auteur
     *
     * @return
     */
    public Personne getAuteur() {
        return auteur;
    }

    /**
     * Accesseur de la variable dernierNum
     *
     * @return dernierNum
     */
    public int getDernierNum() {
        return Livre.dernierNum;
    }

    /**
     * Mutateur de la variable numLivre
     *
     * @param numero
     * @throws exceptions.NumeroInterdit
     */
    public void setNumLivre(int numero) throws NumeroInterdit {
        if (this.getDernierNum() < numero) {
            this.numLivre = numero;
            Livre.dernierNum = numero;
        } else if (numero <= this.getDernierNum()) {
            throw new NumeroInterdit();
        }
    }

    /**
     * Mutateur de la variable titre
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Mutateur de la variable Auteur
     *
     * @param p
     */
    public void setAuteur(Personne p) {
        this.auteur = p;
    }

    /**
     * Mutateur de variable nbPages
     *
     * @param nbPages
     */
    public void setNombreDePages(int nbPages) {
        this.nombreDePages = nbPages;
    }

    /**
     * Redéfinition de la méthode toString pour la classe Livre
     *
     * @return titre + ", " + nom de l'auteur + ", " + numLivre
     */
    @Override
    public String toString() {
        return (titre + ", " + auteur.getPrenom() + " " + auteur.getNom() + ", " + nombreDePages + "p");
    }

    private int numLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    private static int dernierNum;
}
