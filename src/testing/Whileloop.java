package testing;

import java.util.Scanner;

public class Whileloop
{
	private static Scanner sc;
	public static void main(String[] args) {
		int i =1;
		int j;
		 sc = new Scanner(System.in); 
		  System.out.println("Please Enter any integer Value : ");
	        j = sc.nextInt(); 
	 while (i < j)
	{
	  System.out.println(i+ ".hello");
	  i++;
	}
	}
}
