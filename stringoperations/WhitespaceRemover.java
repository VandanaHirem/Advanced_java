package JavaProgram3;
import java.util.Scanner;
public class WhitespaceRemover {
	


		    // User-defined function to remove all whitespace from a string
		    public static String removeWhitespace(String str) {
		        return str.replaceAll("\\s+", "");
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string with spaces: ");
		        String input = sc.nextLine();

		        String result = removeWhitespace(input);

		        System.out.println("String without whitespace: " + result);

		        sc.close();
		    }
		}




