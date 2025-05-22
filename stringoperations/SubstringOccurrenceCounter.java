package JavaProgram3;
import java.util.Scanner;
public class SubstringOccurrenceCounter {
	
	
	
		

		

		    // User-defined function to count substring occurrences
		    public static int countOccurrences(String mainString, String subString) {
		        int count = 0;
		        int index = 0;

		        while ((index = mainString.indexOf(subString, index)) != -1) {
		            count++;
		            index += subString.length(); // Move past the current match
		        }

		        return count;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the main string: ");
		        String main = sc.nextLine();

		        System.out.print("Enter the substring to search: ");
		        String sub = sc.nextLine();

		        int result = countOccurrences(main, sub);

		        System.out.println("The substring '" + sub + "' appears " + result + " time(s) in the main string.");

		        sc.close();
		    }
		}




