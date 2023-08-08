package practice;

public class If {
	public static void main(String[] args) {
		// Outer loop
		for (int i = 0; i <6; i++) {
		  System.out.println(""); // Executes 2 times
		  
		  // Inner loop
		  for (int j = 0; j>=2; j++) {
		    System.out.print("* "); // Executes 6 times (2 * 3)
		  }
		} }}