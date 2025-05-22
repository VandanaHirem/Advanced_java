package JavaProgram3;
import java.util.Scanner;
public class CheckNullOrWhitespace {
	
	

	
		
		

		    // User-defined function to check for null or empty string
		    public static boolean isNullOrEmpty(String str) {
		        return (str == null || str.trim().isEmpty());
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string to check: ");
		        String input = sc.nextLine();

		        if (isNullOrEmpty(input)) {
		            System.out.println("The string is either null or contains only whitespace.");
		        } else {
		            System.out.println("The string is NOT null and contains valid characters.");
		        }

		        sc.close();
		    }
		}




