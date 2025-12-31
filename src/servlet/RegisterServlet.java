package servlet;

import db.DBConnection;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int year = Integer.parseInt(req.getParameter("year"));

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO students(name, email, year) VALUES (?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, year);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        resp.sendRedirect("show_all");
    }
}
