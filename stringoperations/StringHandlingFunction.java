package JavaProgram3;
import java.util.Scanner;

public class StringHandlingFunction {
	
	
		

		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // 1. String Creation and Basic Operations
		        String str1 = "Welcome";
		        String str2 = new String("AIET");
		        System.out.println("String 1: " + str1);
		        System.out.println("String 2: " + str2);

		        // 2. Length and Character Access
		        System.out.println("Length of str1: " + str1.length());
		        System.out.println("Character at position 2 in str1: " + str1.charAt(2));

		        // 3. String Comparison
		        System.out.println("str1 equals str2? " + str1.equals(str2));
		        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

		        // 4. String Searching
		        String str3 = "Java Programming Language";
		        System.out.println("Index of 'Programming': " + str3.indexOf("Programming"));
		        System.out.println("Does it contain 'Lang'? " + str3.contains("Lang"));

		        // 5. Substring Operations
		        String sub = str3.substring(5, 16);
		        System.out.println("Substring from index 5 to 15: " + sub);

		        // 6. String Modification
		        String replaced = str3.replace("Java", "Python");
		        System.out.println("Modified string: " + replaced);

		        // 7. Whitespace Handling
		        String messy = "   Hello AIET   ";
		        System.out.println("Original: '" + messy + "'");
		        System.out.println("Trimmed: '" + messy.trim() + "'");

		        // 8. String Concatenation
		        String combined = str1 + " to " + str2;
		        System.out.println("Concatenated string: " + combined);

		        // 9. String Splitting
		        String csv = "apple,banana,mango,orange";
		        String[] fruits = csv.split(",");
		        System.out.println("Splitted fruits:");
		        for (String fruit : fruits) {
		            System.out.println("- " + fruit);
		        }

		        // 10. StringBuilder Demo
		        StringBuilder sb = new StringBuilder("AIET");
		        sb.append(" College");
		        sb.insert(0, "Welcome to ");
		        sb.replace(11, 18, "Campus");
		        System.out.println("StringBuilder Result: " + sb);

		        // 11. String Formatting
		        String name = "Alice";
		        int age = 21;
		        String formatted = String.format("Name: %s, Age: %d", name, age);
		        System.out.println("Formatted string: " + formatted);

		        // 12. Validate Email
		        System.out.print("Enter your email: ");
		        String email = sc.nextLine();

		        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
		            System.out.println("✅ Valid Email");
		        } else {
		            System.out.println("❌ Invalid Email");
		        }

		        sc.close();
		    }
		}




