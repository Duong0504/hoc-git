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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.DocGia;
import model.QuyenHan;
import model.TaiKhoan;
import model.TheThuVien;

/**
 *
 * @author thang
 */
@WebServlet(name = "TaoThe", urlPatterns = {"/function"})
public class TaoThe extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
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
            out.println("<h1>Servlet TaoThe at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ request
        Map<String, String> params = extractParameters(request);

        // Khởi tạo DAO
        NhanVienDAO ndao = new NhanVienDAO();
        TaiKhoanDAO accdao = new TaiKhoanDAO();
        DocGiaDAO ddao = new DocGiaDAO();

        // Kiểm tra dữ liệu hợp lệ
        List<String> errors = validateInputs(params, ndao, accdao);

        if (!errors.isEmpty()) {
            request.setAttribute("msg", String.join("\n", errors));
            request.getRequestDispatcher("cardRegister.jsp").forward(request, response);
            return;
        }

        // Tạo đối tượng DocGia
        DocGia d = new DocGia(params.get("CCCD"), params.get("name"), params.get("gender"),
                params.get("ngaysinh"), params.get("place"), params.get("email"),
                params.get("sdt"));
        ddao.insert(d);

        // Tạo thẻ thư viện
        TheThuVien the = new TheThuVien(params.get("card"), d, params.get("ngaycap"), params.get("ngayhet"));
        ndao.insert(the);

        try {
            int role = Integer.parseInt(params.get("role"));
            QuyenHan qh = accdao.findQhId(role);
            TaiKhoan acc = new TaiKhoan(params.get("username"), params.get("password"),
                    params.get("avartar"), qh, the);
            ndao.insert(acc);
            request.setAttribute("success", "Tạo tài khoản thành công");
        } catch (Exception e) {
            request.setAttribute("msg", "Lỗi khi xử lý tài khoản.");
        }

        request.getRequestDispatcher("cardRegister.jsp").forward(request, response);
    }

    /**
     * Lấy tất cả tham số từ request
     */
    private Map<String, String> extractParameters(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
        String[] keys = {"name", "CCCD", "sdt", "gender", "ngaysinh", "place", "email",
            "card", "ngaycap", "ngayhet", "username", "password", "cpassword",
            "avartar", "role"};
        for (String key : keys) {
            params.put(key, request.getParameter(key));
        }
        return params;
    }

    /**
     * Kiểm tra dữ liệu nhập vào
     */
    private List<String> validateInputs(Map<String, String> params, NhanVienDAO ndao, TaiKhoanDAO accdao) {
        List<String> errors = new ArrayList<>();

        if (ndao.findMaThe(params.get("card"))) {
            errors.add("Mã thẻ đã tồn tại.");
        }
        if (accdao.findUserName(params.get("username"))) {
            errors.add("Username đã tồn tại.");
        }
        if (params.get("card").length() > 10) {
            errors.add("Mã thẻ không hợp lệ.");
        }
        if (ndao.findCccd(params.get("CCCD"))) {
            errors.add("CCCD đã tồn tại.");
        }
        if (ndao.findSdt(params.get("sdt"))) {
            errors.add("Số điện thoại đã tồn tại.");
        }
        if (ndao.findEmail(params.get("email"))) {
            errors.add("Email đã tồn tại.");
        }
        if (!params.get("password").equals(params.get("cpassword"))) {
            errors.add("Mật khẩu không khớp.");
        }

        return errors;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
