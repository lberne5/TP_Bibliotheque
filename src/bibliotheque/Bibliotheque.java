/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.util.ArrayList;
import java.util.List;
import exceptions.AuteurIntrouvable;
import exceptions.LivreIntrouvable;
import java.util.Iterator;

/**
 * Classe pour la gestion de la bibliothèque
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class Bibliotheque {

    /**
     * Constructeur de la classe Bibliotheque. Crée une nouvelle ArrayList qui
     * contient le contenu de la bibliothèque.
     */
    public Bibliotheque() {
        bibliotheque = new ArrayList<>();
    }

    /**
     * Methode permettant d'ajouter un livre à la bibliothèque.
     *
     * @param livre
     */
    public void ajouterLivre(Livre livre) {
        bibliotheque.add(livre);
    }

    /**
     * Methode permettant d'afficher le contenu de la bibliothèque.
     *
     * @return livres.toString() + " ; " pour tous les livres de la bibliotheque
     */
    public String afficherContenuBibliotheque() {
        String contenuBibliotheque = "";
        Iterator<Livre> iter = bibliotheque.iterator();
        while (iter.hasNext()) {
            Livre l = iter.next();
            contenuBibliotheque += l.toString() + " ; ";
        }
        return contenuBibliotheque;
    }

    /**
     * Methode permettant de faire une recherche par auteur.
     *
     * @param nom
     * @param prenom
     * @return une bibliotheque qui comprend tous les livres de cet auteur si il
     * y en a dans la bibliothèque
     * @throws exceptions.AuteurIntrouvable
     */
    public Bibliotheque rechercherAuteur(String nom, String prenom) throws AuteurIntrouvable {
        if (!auteurConnu(nom, prenom)) {
            throw new AuteurIntrouvable();
        }

        Bibliotheque rechercheAuteur;
        rechercheAuteur = new Bibliotheque();
        Iterator<Livre> iter = bibliotheque.iterator();
        while (iter.hasNext()) {
            Livre livre = iter.next();
            if (nom == livre.getAuteur().getNom() && prenom == livre.getAuteur().getPrenom()) {
                rechercheAuteur.ajouterLivre(livre);
            }
        }

        return rechercheAuteur;
    }

    /**
     * Methode permettant de faire une recherche par titre.
     *
     * @param titre
     * @return une bibliotheque qui comprend tous les livres avec ce titre (au
     * cas où il y ait plusieurs exemplaires)
     * @throws exceptions.LivreIntrouvable
     */
    public Bibliotheque rechercherTitre(String titre) throws LivreIntrouvable {
        if (!livrePossede(titre)) {
            throw new LivreIntrouvable();
        }

        Bibliotheque rechercheTitre;
        rechercheTitre = new Bibliotheque();
        Iterator<Livre> iter = bibliotheque.iterator();
        while (iter.hasNext()) {
            Livre livre = iter.next();
            if (titre == livre.getTitre()) {
                rechercheTitre.ajouterLivre(livre);
            }
        }

        return rechercheTitre;
    }

    /**
     * Methode permettant de savoir si un livre est dans la bibliotheque
     *
     * @param titre
     * @return True si le livre est dans la bibliotheque, False si non.
     */
    public boolean livrePossede(String titre) {
        Iterator<Livre> iter = bibliotheque.iterator();
        while (iter.hasNext()) {
            Livre l = iter.next();
            if (l.getTitre() == titre) {
                return true;
            }
        }
        return false;
    }

    /**
     * Methode permettant de savoir s'il y a un livre dans la bibliotheque qui a
     * été écrit par un auteur qui a pour nom nom et pour prénom prenom.
     *
     * @param nom
     * @param prenom
     * @return True si oui, False si non.
     */
    public boolean auteurConnu(String nom, String prenom) {
        Iterator<Livre> iter = bibliotheque.iterator();
        while (iter.hasNext()) {
            Livre l = iter.next();
            if (l.getAuteur().getNom() == nom
                    && l.getAuteur().getPrenom() == prenom) {
                return true;
            }
        }
        return false;
    }

    private List<Livre> bibliotheque;
}
