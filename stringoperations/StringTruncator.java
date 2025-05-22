package JavaProgram3;
import java.util.Scanner;
public class StringTruncator {
	
	
	
		

		

		    // User-defined function to truncate a string and add ellipsis
		    public static String truncate(String str, int length) {
		        if (str == null) {
		            return "";
		        }

		        if (str.length() <= length) {
		            return str; // No need to truncate
		        }

		        if (length <= 3) {
		            return "..."; // Not enough room for characters, return only ellipsis
		        }

		        return str.substring(0, length - 3) + "...";
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        System.out.print("Enter maximum length: ");
		        int maxLength = sc.nextInt();

		        String result = truncate(input, maxLength);
		        System.out.println("Truncated string: " + result);

		        sc.close();
		    }
		}




