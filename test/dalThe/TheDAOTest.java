/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dalThe;

import java.util.ArrayList;
import model.DocGia;
import model.TheThuVien;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author duong
 */
public class TheDAOTest {
    
    public TheDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class TheDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TheDAO instance = new TheDAO();
        ArrayList<TheThuVien> expResult = null;
        ArrayList<TheThuVien> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheById method, of class TheDAO.
     */
    @Test
    public void testGetTheById() {
        System.out.println("getTheById");
        String mathe = "";
        TheDAO instance = new TheDAO();
        TheThuVien expResult = null;
        TheThuVien result = instance.getTheById(mathe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TheDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        TheThuVien t = null;
        TheDAO instance = new TheDAO();
        instance.insert(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMaDocGia method, of class TheDAO.
     */
    @Test
    public void testFindMaDocGia() {
        System.out.println("findMaDocGia");
        String maDocGia = "";
        TheDAO instance = new TheDAO();
        DocGia expResult = null;
        DocGia result = instance.findMaDocGia(maDocGia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMaThe method, of class TheDAO.
     */
    @Test
    public void testFindMaThe() {
        System.out.println("findMaThe");
        String Mathe = "";
        TheDAO instance = new TheDAO();
        boolean expResult = false;
        boolean result = instance.findMaThe(Mathe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TheDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TheThuVien the = null;
        TheDAO instance = new TheDAO();
        instance.update(the);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
