package JavaProgram2;
import java.util.Scanner;
public class StringOperationsDemo {
	
	
	
		

		

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // 1. String Creation and Basic Operations
		        String str1 = "Hello";
		        String str2 = new String("World");
		        System.out.println("String 1: " + str1);
		        System.out.println("String 2: " + str2);

		        // 2. Length and Character Access
		        System.out.println("Length of str1: " + str1.length());
		        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

		        // 3. String Comparison
		        System.out.println("str1 equals str2? " + str1.equals(str2));
		        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

		        // 4. String Searching
		        String str3 = "Java programming is fun";
		        System.out.println("Index of 'programming': " + str3.indexOf("programming"));
		        System.out.println("Does it contain 'fun'? " + str3.contains("fun"));

		        // 5. Substring Operations
		        String sub = str3.substring(5, 16);
		        System.out.println("Substring (5 to 15): " + sub);

		        // 6. String Modification
		        String replaced = str3.replace("fun", "awesome");
		        System.out.println("Modified string: " + replaced);

		        // 7. Whitespace Handling
		        String messy = "   trimmed string example   ";
		        System.out.println("Original: '" + messy + "'");
		        System.out.println("Trimmed: '" + messy.trim() + "'");

		        // 8. String Concatenation
		        String concat = str1.concat(" ").concat(str2);
		        System.out.println("Concatenated string: " + concat);

		        // 9. String Splitting
		        String csv = "apple,banana,mango";
		        String[] fruits = csv.split(",");
		        System.out.println("Fruits:");
		        for (String fruit : fruits) {
		            System.out.println("- " + fruit);
		        }

		        // 10. StringBuilder Demo
		        StringBuilder sb = new StringBuilder("Welcome");
		        sb.append(" to Java");
		        sb.insert(0, "Say: ");
		        sb.replace(0, 4, "Shout");
		        sb.reverse();
		        System.out.println("StringBuilder result: " + sb.reverse());

		        // 11. String Formatting
		        String name = "Alice";
		        int age = 22;
		        String formatted = String.format("Name: %s, Age: %d", name, age);
		        System.out.println("Formatted string: " + formatted);

		        // 12. Validate Email with contains(), startsWith(), endsWith()
		        System.out.print("Enter an email to validate: ");
		        String email = sc.nextLine();
		        if (email.contains("@") && email.endsWith(".com") && (email.startsWith("user") || email.startsWith("info"))) {
		            System.out.println("Email seems valid.");
		        } else {
		            System.out.println("Invalid email format.");
		        }

		        sc.close();
		    }
		}




