/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testBibliotheque;

import bibliotheque.Bibliotheque;
import bibliotheque.Livre;
import bibliotheque.ListePersonnes;
import bibliotheque.Personne;
import exceptions.AuteurIntrouvable;
import exceptions.LivreIntrouvable;
import exceptions.NumeroInterdit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author etulyon1
 */
public class BibliothequeTest {

    public BibliothequeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterLivre method, of class Bibliotheque.
     */
    @Test
    public void testAjouterLivre() {
        Personne auteur1 = new Personne("John", "Doe", 1954);
        Livre leLivre = new Livre("Un Livre", 250, auteur1);
        Bibliotheque laBibliotheque = new Bibliotheque();
        laBibliotheque.ajouterLivre(leLivre);
        assertTrue(laBibliotheque.livrePossede(leLivre.getTitre()));
    }

    /**
     * Test of afficherContenuBibliotheque method, of class Bibliotheque.
     */
    @Test
    public void testAfficherContenuBibliotheque() {
        Personne auteur1 = new Personne("Doe", "John", 1954);
        Livre leLivre = new Livre("Un Livre", 250, auteur1);
        Livre leLivre2 = new Livre("Un Autre Livre", 100, auteur1);
        Bibliotheque laBibliotheque = new Bibliotheque();
        laBibliotheque.ajouterLivre(leLivre);
        laBibliotheque.ajouterLivre(leLivre2);
        String attendu = "Un Livre, John Doe, 250p ; Un Autre Livre, John Doe, 100p ; ";
        assertEquals(attendu, laBibliotheque.afficherContenuBibliotheque());

    }

    /**
     * Test of rechercherAuteur method, of class Bibliotheque.
     *
     * @throws exceptions.AuteurIntrouvable
     */
    @Test
    public void testRechercherAuteur() throws exceptions.AuteurIntrouvable {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Livre livre = new Livre("Mind", 250, alan);
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(livre);
        assertEquals(bibliotheque.afficherContenuBibliotheque(), bibliotheque.rechercherAuteur("Turing", "Alan").afficherContenuBibliotheque());
    }

    /**
     * Test of rechercherTitre method, of class Bibliotheque.
     *
     * @throws exceptions.LivreIntrouvable
     */
    @Test
    public void testRechercherTitre() throws exceptions.LivreIntrouvable {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Livre livre = new Livre("Mind", 250, alan);
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(livre);
        assertEquals(bibliotheque.afficherContenuBibliotheque(), bibliotheque.rechercherTitre("Mind").afficherContenuBibliotheque());
    }

}
