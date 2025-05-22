package JavaProgram3;
import java.util.Scanner;
public class CapitalizeWordsDemo {
	

	
		

		

		    // User-defined function to capitalize the first letter of each word
		    public static String capitalizeWords(String str) {
		        String[] words = str.trim().split("\\s+");
		        StringBuilder result = new StringBuilder();

		        for (String word : words) {
		            if (!word.isEmpty()) {
		                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		                result.append(capitalized).append(" ");
		            }
		        }

		        return result.toString().trim();
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a sentence: ");
		        String input = sc.nextLine();

		        String output = capitalizeWords(input);
		        System.out.println("Capitalized: " + output);

		        sc.close();
		    }
		}



