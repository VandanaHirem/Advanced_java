<%@ page import="java.sql.*" %>
<html>
<head><title>Update Coffee</title></head>
<body>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root"; // Change as needed
    String password = "";     // Change as needed

    Connection conn = null;
    Statement stmt = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        stmt = conn.createStatement();

        // Update record if form was submitted
        String id = request.getParameter("id");
        String coffee_name = request.getParameter("coffee_name");
        String price = request.getParameter("price");

        if (id != null && coffee_name != null && price != null) {
            String updateQuery = "UPDATE coffee SET coffee_name='" + coffee_name + "', price=" + price + " WHERE id=" + id;
            int rows = stmt.executeUpdate(updateQuery);
            out.println("<p>" + rows + " record(s) updated.</p>");
        }

        // Display all records
        out.println("<h2>Coffee Table Records</h2>");
        ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Price</th></tr>");
        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getDouble("price") + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try {
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            out.println("Closing error: " + e.getMessage());
        }
    }
%>
</body>
</html>
