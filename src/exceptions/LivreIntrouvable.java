/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 * Classe de l'exception LivreIntrouvable qui sert si aucun livre n'est présent
 * dans la bibliothèque
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class LivreIntrouvable extends Exception {

    /**
     * Constructeur de l'Exception LivreIntrouvable.
     */
    public LivreIntrouvable() {
        super("Le livre est introuvable.");
    }

}
