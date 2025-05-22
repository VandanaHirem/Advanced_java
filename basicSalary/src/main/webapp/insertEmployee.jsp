<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert Employee</title>
</head>
<body>
    <h2>Enter Employee Details</h2>
    <form method="post">
        Emp No: <input type="number" name="empno" required /><br/>
        Name: <input type="text" name="empname" required /><br/>
        Basic Salary: <input type="number" name="salary" required /><br/>
        <input type="submit" value="Insert and Generate Report" />
    </form>

<%
    String empnoStr = request.getParameter("empno");

    if (empnoStr != null) {
        int empno = Integer.parseInt(empnoStr);
        String empname = request.getParameter("empname");
        int salary = Integer.parseInt(request.getParameter("salary"));

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

            PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);
            ps.executeUpdate();

            out.println("<hr/><h2>Salary Report</h2>");
            out.println("<pre>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

            int total = 0;
            while (rs.next()) {
                out.println("Emp_No   : " + rs.getInt("Emp_NO"));
                out.println("Emp_Name : " + rs.getString("Emp_Name"));
                out.println("Basic    : " + rs.getInt("Basicsalary"));
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                total += rs.getInt("Basicsalary");
            }

            out.println("Grand Salary : " + total);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            out.println("</pre>");

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (con != null) con.close();
        }
    }
%>
</body>
</html>
