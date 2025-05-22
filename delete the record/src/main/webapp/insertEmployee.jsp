<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Employee</title>
</head>
<body>
    <h2>Insert New Employee</h2>
    <form method="post">
        Emp No: <input type="number" name="empno" required /><br/>
        Emp Name: <input type="text" name="empname" required /><br/>
        Basic Salary: <input type="number" name="salary" required /><br/>
        <input type="submit" value="Insert" />
    </form>

<%
    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salaryStr = request.getParameter("salary");

    if (empnoStr != null && empname != null && salaryStr != null) {
        int empno = Integer.parseInt(empnoStr);
        int salary = Integer.parseInt(salaryStr);

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

            PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                out.println("<p style='color:green;'>Employee inserted successfully!</p>");
            } else {
                out.println("<p style='color:red;'>Insertion failed.</p>");
            }

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (con != null) con.close();
        }
    }
%>
</body>
</html>
