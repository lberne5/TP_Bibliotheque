/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Classe pour créer une liste de personnes.
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class ListePersonnes {

    /**
     * Constructeur de la classe ListePersonne. Crée une nouvelle ArrayList qui
     * contient des Personnes.
     */
    public ListePersonnes() {
        listePersonnes = new ArrayList<>();
    }

    /**
     * Methode permettant d'ajouter une personne à la liste de personnes.
     *
     * @param p
     */
    public void ajouter(Personne p) {
        listePersonnes.add(p);
    }

    /**
     * Methode permettant de savoir si un objet Personne p appartient à la liste
     * de personnes
     *
     * @param p
     * @return True si la personne est dans la liste et False sinon
     */
    public boolean appartient(Personne p) {
        return (listePersonnes.contains(p));
    }

    /**
     * Methode permettant de savoir si un nom et prenom appartiennent à la liste
     * de personnes.
     *
     * @param nom
     * @param prenom
     * @return True si une personne avec ce nom et ce prénom est dans la liste
     * et False sinon
     */
    public boolean appartient(String nom, String prenom) {
        Iterator<Personne> iter = listePersonnes.iterator();
        while (iter.hasNext()) {
            Personne p = iter.next();
            if (nom == p.getNom() && prenom == p.getPrenom()) {
                return true;
            }
        }
        return false;
    }

    private List<Personne> listePersonnes;
}
