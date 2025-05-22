package JavaProgram3;
import java.util.Scanner;
public class NumericStringValidator {
	
	
	
		

		

		    // User-defined function to check if the string is numeric
		    public static boolean isNumeric(String str) {
		        if (str == null || str.isEmpty())
		            return false;

		        for (char c : str.toCharArray()) {
		            if (!Character.isDigit(c))
		                return false;
		        }

		        return true;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string to check if it's numeric: ");
		        String input = sc.nextLine();

		        if (isNumeric(input)) {
		            System.out.println("✅ The string contains only numeric characters.");
		        } else {
		            System.out.println("❌ The string is not numeric.");
		        }

		        sc.close();
		    }
		}




