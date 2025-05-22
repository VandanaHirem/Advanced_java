package JavaProgram2;

public class StringPerformanceTest {
	

	
		

		    public static void main(String[] args) {
		        int iterations = 10000;
		        String text = "AIET";

		        // Testing StringBuffer
		        long startBuffer = System.nanoTime();
		        StringBuffer sbf = new StringBuffer();
		        for (int i = 0; i < iterations; i++) {
		            sbf.append(text);
		        }
		        long endBuffer = System.nanoTime();
		        long durationBuffer = endBuffer - startBuffer;

		        // Testing StringBuilder
		        long startBuilder = System.nanoTime();
		        StringBuilder sbd = new StringBuilder();
		        for (int i = 0; i < iterations; i++) {
		            sbd.append(text);
		        }
		        long endBuilder = System.nanoTime();
		        long durationBuilder = endBuilder - startBuilder;

		        // Output results
		        System.out.println("Time taken by StringBuffer  : " + durationBuffer + " ns");
		        System.out.println("Time taken by StringBuilder : " + durationBuilder + " ns");

		        // Justification
		        if (durationBuilder < durationBuffer) {
		            System.out.println("\n✅ StringBuilder is faster than StringBuffer.");
		        } else {
		            System.out.println("\n✅ StringBuffer is faster than StringBuilder.");
		        }
		    }
		}




