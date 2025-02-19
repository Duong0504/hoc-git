/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dalQuyenHan;

import java.util.ArrayList;
import model.QuyenHan;
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
public class QuyenHanDAOTest {
    QuyenHanDAO a;
    public QuyenHanDAOTest() {
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
     * Test of findQuyenHanNameByQHID method, of class QuyenHanDAO.
     */
    @Test
    public void testFindQuyenHanNameByQHID() {
        System.out.println("findQuyenHanNameByQHID");
        int qhId = 0;
        QuyenHanDAO instance = new QuyenHanDAO();
        QuyenHan expResult = null;
        QuyenHan result = instance.findQuyenHanNameByQHID(qhId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class QuyenHanDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        QuyenHanDAO instance = new QuyenHanDAO();
        ArrayList<QuyenHan> expResult = null;
        ArrayList<QuyenHan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QuyenHanDAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuyenHanDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
