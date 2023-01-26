/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import exceptions.NumeroInterdit;

/**
 * Classe pour créer des personnes.
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class Personne {

    /**
     * Constructeur de la classe Personne
     *
     * @param nom
     * @param prenom
     * @param anneeNaissance
     */
    public Personne(String nom, String prenom, int anneeNaissance) {
        this.nomPers = nom;
        this.prenomPers = prenom;
        this.anNaissance = anneeNaissance;
        this.numeroPers = ++dernierNumero;
    }

    /**
     * Mutateur de la variable numeroPers
     *
     * @param numero
     * @throws exceptions.NumeroInterdit
     */
    public void setNumPers(int numero) throws NumeroInterdit {
        if (this.getDernierNum() < numero) {
            this.numeroPers = numero;
            Personne.dernierNumero = numero;
        } else if (numero <= this.getDernierNum()) {
            throw new NumeroInterdit();
        }
    }

    /**
     * Mutateur de la variable nomPers
     *
     * @param nom
     */
    public void setNomPers(String nom) {
        this.nomPers = nom;
    }

    /**
     * Mutateur de la variable prenomPers
     *
     * @param prenom*
     */
    public void setPrenomPers(String prenom) {
        this.prenomPers = prenom;
    }

    /**
     * Mutateur de la variable anNaissance
     *
     * @param annee
     */
    public void setAnNaissance(int annee) {
        this.anNaissance = annee;
    }

    /**
     * Accesseur de la variable dernierNumero
     *
     * @return dernierNumero
     */
    public int getDernierNum() {
        return Personne.dernierNumero;
    }

    /**
     * Accesseur de la variable numeroPers
     *
     * @return numeroPers
     */
    public int getNumero() {
        return numeroPers;
    }

    /**
     * Accesseur de la variable nomPers
     *
     * @return nomPers
     */
    public String getNom() {
        return nomPers;
    }

    /**
     * Accesseur de la variable pernomPers
     *
     * @return prenomPers
     */
    public String getPrenom() {
        return prenomPers;
    }

    /**
     * Accesseur de la variable anNaissance.
     *
     * @return anNaissance
     */
    public int getAnNaissance() {
        return anNaissance;
    }

    /**
     * Redéfinition de la méthode toString pour la classe Personne
     *
     * @return nomPers + ", " + prenomPers + ", " + anNaissance
     */
    @Override
    public String toString() {
        return (nomPers + ", " + prenomPers + ", " + anNaissance + ", " + numeroPers);
    }

    private int numeroPers, anNaissance;
    private static int dernierNumero = 0;
    private String nomPers, prenomPers;
    /*
    Questions PARTIE 1:
    
    1) NetBeans dit que anNaissance, nomPers, prenomPers peuvent être final car le constructeur n'est pas utilisé et qu'il n'y a pas de setteur
    4) On genère le numéroPers (final) par un compteur statique dernierNumero qui est incrémenté à chaque instanciation. 
    L'avantage est que les numéros vont ainsi être unique, mais l'inconvénient est que le numéro ne peut plus être modifié  
    (ce qui est en fait ce qui garentit l'unicité du nunémro).
    On pourrait aussi utiliser AtomicInteger et sa methode incrementAndGet() pour dernierNumero et procéder de la même façon que décrite précédemment
    pour numeroPers. 
    Cependant, ça ne règle pas le problème de savoir comment rendre un numéro unique ET modifiable.. 
    Solution (pas optimale) trouvée: si dernierNuméro < numéro alors dernierNumero = numero. si dernierNumero >= numero alors on jette une exception
    car cela voudrait dire que le numéro a déjà été assigné.
    Autrement, nous aurions pu utiliser une Liste de Personnes, pour retrouver la personne qui avait ce numéro, et échanger leurs deux numéros. 

     */
}
