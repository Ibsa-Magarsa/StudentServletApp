<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h2>Registered Students</h2>
<table border="1" cellpadding="10">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Year</th>
    </tr>

    <%
        List<String[]> students = (List<String[]>) request.getAttribute("students");
        if (students != null) {
            for (String[] s : students) {
    %>
                <tr>
                    <td><%= s[0] %></td>
                    <td><%= s[1] %></td>
                    <td><%= s[2] %></td>
                </tr>
    <%
            }
        }
    %>
</table>
<br>
<a href="register.jsp">Register New Student</a>
</body>
</html>
