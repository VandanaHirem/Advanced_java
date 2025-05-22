package primenumber;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/primecheck")

	
	public class PrimeCheckServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        try {
	            int number = Integer.parseInt(request.getParameter("number"));
	            boolean isPrime = true;

	            if (number <= 1) {
	                isPrime = false;
	            } else {
	                for (int i = 2; i <= Math.sqrt(number); i++) {
	                    if (number % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	            }

	            out.println("<html><body>");
	            out.println("<h2>Prime Check Result</h2>");
	            if (isPrime) {
	                out.println("<p>" + number + " is a <strong>prime number</strong>.</p>");
	            } else {
	                out.println("<p>" + number + " is <strong>not a prime number</strong>.</p>");
	            }
	            out.println("<a href='primeForm.html'>Check Another</a>");
	            out.println("</body></html>");

	        } catch (NumberFormatException e) {
	            out.println("<html><body>");
	            out.println("<p style='color:red;'>Invalid input! Please enter a valid number.</p>");
	            out.println("<a href='primeForm.html'>Try Again</a>");
	            out.println("</body></html>");
	        }
	    }
	}


