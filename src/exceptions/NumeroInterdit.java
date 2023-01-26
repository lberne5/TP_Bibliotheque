/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 * Classe de l'exception NumeroInterdit, qui sert si on essaie d'assigner à un
 * objet un numéro qui a déjà été assigné.
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class NumeroInterdit extends Exception {

    /**
     * Constructeur de l'Exception NumeroInterdit
     */
    public NumeroInterdit() {
        super("Opération impossible. Ce numéro a déjà été assigné.");
    }
}
