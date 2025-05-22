package JavaProgram3;
import java.util.Random;
import java.util.Scanner;
public class RandomStringGenerator {
	
	
	
		

		

		    // User-defined function to generate a random string
		    public static String generateRandomString(int length) {
		        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		        StringBuilder result = new StringBuilder();
		        Random rand = new Random();

		        for (int i = 0; i < length; i++) {
		            int index = rand.nextInt(characters.length());
		            result.append(characters.charAt(index));
		        }

		        return result.toString();
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the desired length of the random string: ");
		        int length = sc.nextInt();

		        String randomStr = generateRandomString(length);
		        System.out.println("Generated Random String: " + randomStr);

		        sc.close();
		    }
		}




