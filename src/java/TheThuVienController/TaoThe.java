/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package TheThuVienController;

import dalAccount.TaiKhoanDAO;
import dalDocGia.DocGiaDAO;
import dalNhanVien.NhanVienDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DocGia;
import model.QuyenHan;
import model.TaiKhoan;
import model.TheThuVien;

/**
 *
 * @author thang
 */
@WebServlet(name="TaoThe", urlPatterns={"/function"})
public class TaoThe extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TaoThe</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TaoThe at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         String name = request.getParameter("name");
        String cccd = request.getParameter("CCCD");
        String sdt = request.getParameter("sdt");
        String gender = request.getParameter("gender");
        String ngaysinh = request.getParameter("ngaysinh");
        String place = request.getParameter("place");
        String email = request.getParameter("email");
        String card = request.getParameter("card");
        String ngaycap = request.getParameter("ngaycap");
        String ngayhet = request.getParameter("ngayhet");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String cpassword = request.getParameter("cpassword");
        String avartar = request.getParameter("avartar");
        String role_raw = request.getParameter("role");

        NhanVienDAO ndao = new NhanVienDAO();
        TaiKhoanDAO accdao = new TaiKhoanDAO();
        DocGiaDAO ddao = new DocGiaDAO();
        request.setAttribute("name", name);
        request.setAttribute("sdt", sdt);
        request.setAttribute("CCCD", cccd);
        request.setAttribute("gender", gender);
        request.setAttribute("ngaysinh", ngaysinh);
        request.setAttribute("place", place);
        request.setAttribute("email", email);
        request.setAttribute("card", card);
        request.setAttribute("ngaycap", ngaycap);
        request.setAttribute("ngayhet", ngayhet);
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("cpassword", password);

        request.setAttribute("avartar", avartar);
        boolean maTheExist = ndao.findMaThe(card);
        boolean UserNameExist = accdao.findUserName(username);
        boolean CCCDExist = ndao.findCccd(cccd);
        boolean sdtExist = ndao.findSdt(sdt);
        boolean emailExist = ndao.findEmail(email);
        int cardLength = card.length();
        String msg = "";

        if (maTheExist) { //
            msg+=("ma the da ton tai\n");
        }

        if (UserNameExist) { //
            msg+=("username da ton tai\n");
        }
        if (cardLength > 10) {
            msg+=("Invalid Card ID.\n");
        }
        if (CCCDExist) { //
            msg+=("CCCD da ton tai\n");
        }

        if (sdtExist) {
            msg+=("sdt da ton tai\n");
        }
        if (emailExist) {
            msg+=("Email da ton tai\n");
        }
        if (!password.equals(cpassword)) { // 
            msg+=("Xác nhận mật khẩu match với mật khẩu\n");
        }

        if (msg.length() > 0) {
//            request.setAttribute("msg", msg.toString());
//            request.setAttribute("card", maTheExist || cardLength > 10 ? null : card);
//            request.setAttribute("cccd", CCCDExist ? null : cccd);
//            request.setAttribute("email", emailExist ? null : email);
//            request.setAttribute("phone", sdtExist ? null : sdt);
//            request.setAttribute("username", UserNameExist ? null : username);
           // request.setAttribute("cpassword", !password.equals(cpassword) ? null : cpassword);
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("cardRegister.jsp").forward(request, response);
        } else {
           

            

            

            DocGia d = new DocGia(cccd, name, gender,ngaysinh, place, email, sdt);
            ddao.insert(d);
            TheThuVien the = new TheThuVien(card, d, ngaycap, ngayhet);
            ndao.insert(the);
            try {
                int role = Integer.parseInt(role_raw);
                QuyenHan qh = accdao.findQhId(role);
                TaiKhoan acc = new TaiKhoan(username, password, avartar, qh, the);

                ndao.insert(acc);
                request.setAttribute("success", "tạo tài khoản thành công ");
                request.getRequestDispatcher("cardRegister.jsp").forward(request, response);
            } catch (Exception e) {
            }

        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
