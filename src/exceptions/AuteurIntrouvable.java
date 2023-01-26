/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 * Classe de l'exception AuteurIntrouvable qui sert si aucun livre d'un auteur
 * n'est présent dans la bibliothèque
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class AuteurIntrouvable extends Exception {

    /**
     * Constructeur de l'Exception AuteurIntrouvable.
     */
    public AuteurIntrouvable() {
        super("L'auteur est introuvable.");
    }
}
