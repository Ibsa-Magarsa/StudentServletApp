package servlet;

import db.DBConnection;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class ShowAllServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        List<String[]> students = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                students.add(new String[]{
                    rs.getString("name"),
                    rs.getString("email"),
                    String.valueOf(rs.getInt("year"))
                });
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        req.setAttribute("students", students);
        req.getRequestDispatcher("show_all.jsp").forward(req, resp);
    }
}
