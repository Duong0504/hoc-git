/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package dalAccount;

import java.util.ArrayList;
import model.DocGia;
import model.QuyenHan;
import model.TaiKhoan;
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
public class TaiKhoanDAOTest {
    TaiKhoanDAO acc;
    public TaiKhoanDAOTest() {
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
     * Test of findQhId method, of class TaiKhoanDAO.
     */
    @Test
    public void testFindQhId() {
        System.out.println("findQhId");
        int qhId = 0;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        QuyenHan expResult = null;
        QuyenHan result = instance.findQhId(qhId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTheId method, of class TaiKhoanDAO.
     */
    @Test
    public void testFindTheId() {
        System.out.println("findTheId");
        String theid = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TheThuVien expResult = null;
        TheThuVien result = instance.findTheId(theid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDocGiaId method, of class TaiKhoanDAO.
     */
    @Test
    public void testFindDocGiaId() {
        System.out.println("findDocGiaId");
        String code = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        DocGia expResult = null;
        DocGia result = instance.findDocGiaId(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserName method, of class TaiKhoanDAO.
     */
    @Test
    public void testFindUserName() {
        System.out.println("findUserName");
        String username = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        boolean expResult = false;
        boolean result = instance.findUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTkId method, of class TaiKhoanDAO.
     */
    @Test
    public void testFindTkId() {
        System.out.println("findTkId");
        int tkId = 0;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.findTkId(tkId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTaiKhoanByUsername method, of class TaiKhoanDAO.
     */
    @Test
    public void testGetIdTaiKhoanByUsername() {
        System.out.println("getIdTaiKhoanByUsername");
        String username = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.getIdTaiKhoanByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForgetPassword method, of class TaiKhoanDAO.
     */
    @Test
    public void testGetForgetPassword() {
        System.out.println("getForgetPassword");
        String username = "";
        String card = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.getForgetPassword(username, card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class TaiKhoanDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        TaiKhoanDAO instance = new TaiKhoanDAO();
        ArrayList<TaiKhoan> expResult = null;
        ArrayList<TaiKhoan> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTaikhoanNhanVien method, of class TaiKhoanDAO.
     */
    @Test
    public void testAddTaikhoanNhanVien() {
        System.out.println("addTaikhoanNhanVien");
        TaiKhoan t = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.addTaikhoanNhanVien(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTaikhoanDocGia method, of class TaiKhoanDAO.
     */
    @Test
    public void testAddTaikhoanDocGia() {
        System.out.println("addTaikhoanDocGia");
        TaiKhoan t = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.addTaikhoanDocGia(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginNhanVien method, of class TaiKhoanDAO.
     */
    @Test
    public void testLoginNhanVien() {
        System.out.println("loginNhanVien");
        String username = "";
        String matkhau = "";
        String manhanvien = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.loginNhanVien(username, matkhau, manhanvien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginDocGia method, of class TaiKhoanDAO.
     */
    @Test
    public void testLoginDocGia() {
        System.out.println("loginDocGia");
        String username = "";
        String matkhau = "";
        String mathe = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.loginDocGia(username, matkhau, mathe);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTaiKhoanNhanVien method, of class TaiKhoanDAO.
     */
    @Test
    public void testUpdateTaiKhoanNhanVien() {
        System.out.println("updateTaiKhoanNhanVien");
        TaiKhoan t = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.updateTaiKhoanNhanVien(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTaiKhoanDocGia method, of class TaiKhoanDAO.
     */
    @Test
    public void testUpdateTaiKhoanDocGia() {
        System.out.println("updateTaiKhoanDocGia");
        TaiKhoan t = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.updateTaiKhoanDocGia(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaiKhoanBYID method, of class TaiKhoanDAO.
     */
    @Test
    public void testGetTaiKhoanBYID() {
        System.out.println("getTaiKhoanBYID");
        int id = 0;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.getTaiKhoanBYID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TaiKhoanDAO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TaiKhoanDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
