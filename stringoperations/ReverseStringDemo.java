package JavaProgram3;
import java.util.Scanner;
public class ReverseStringDemo {
	
	
	
		

		

		    // User-defined function to reverse a string
		    public static String reverseString(String str) {
		        StringBuilder reversed = new StringBuilder(str);
		        return reversed.reverse().toString();
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string to reverse: ");
		        String input = sc.nextLine();

		        String result = reverseString(input);

		        System.out.println("Reversed string: " + result);

		        sc.close();
		    }
		}




