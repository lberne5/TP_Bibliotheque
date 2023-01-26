package testBibliotheque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import bibliotheque.Personne;
import exceptions.NumeroInterdit;

/**
 *
 * @author josephineReischel
 * @author leaBerne
 */
public class PersonneTest {

    public PersonneTest() {
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
     * Test of getNumero method, of class Personne.
     */
    @Test
    public void testGetNumero() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(alan.getDernierNum(), alan.getNumero());
    }

    /**
     * * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test of getDernierNum method, of class Personne.
     */
    @Test
    public void testGetDernierNum() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(alan.getNumero(), alan.getDernierNum());
    }

    /**
     * Test of setNumPers method, of class Personne.
     */
    @Test
    public void testSetNumPers() throws NumeroInterdit {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setNumPers(18);
        assertEquals(18, alan.getNumero());
    }

    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setNomPers("Minsky");
        assertEquals("Minsky", alan.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class Personne.
     */
    @Test
    public void testSetPrenomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setPrenomPers("Marvin");
        assertEquals("Marvin", alan.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);

        alan.setAnNaissance(1990);
        assertEquals(1990, alan.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing, Alan, 1912, " + alan.getNumero(), alan.toString());
    }
    /* PARTIE 1 - 3) Import des librairies dans la partie "Librairie" de Netbeans. Rajouter import org.junit.Ignore pour ignorer les tests.
@Ignore fait que ces tests ne sont pas pris en compte et juste 80 % des tests sont passés. Sinon tous les autres tests passent.*/
}
