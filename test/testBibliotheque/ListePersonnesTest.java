/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testBibliotheque;

import bibliotheque.ListePersonnes;
import bibliotheque.Personne;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author josephineReischel
 * @author leaBerne
 */
public class ListePersonnesTest {

    public ListePersonnesTest() {
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
     * Test of ajouter method, of class ListePersonnes.
     */
    @Test
    public void testAjouter() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        ListePersonnes listePersonnes = new ListePersonnes();
        listePersonnes.ajouter(alan);
        assertTrue(listePersonnes.appartient(alan));
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_Personne() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne jeremy = new Personne("Machin", "Jeremy", 1952);
        ListePersonnes laListe = new ListePersonnes();
        laListe.ajouter(alan);
        assertTrue(laListe.appartient(alan));
        assertFalse(laListe.appartient(jeremy));
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_String_String() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        ListePersonnes listePersonnes = new ListePersonnes();
        listePersonnes.ajouter(alan);
        assertTrue(listePersonnes.appartient("Turing", "Alan"));
    }

}
/* Partie 2 Q 4 : La Javadoc est juste générée pour les classes 
qui sont des packages qui se trouvent dans Source Packages.*/
