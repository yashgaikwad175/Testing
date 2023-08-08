package testing;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {

		String a []= {"Aniket","Anant","Payal", "Kriashna"};   // array
		
		System.out.println(a.length); // responsible to calculate size
		
		System.out.println(a[3]);
		
		// index will always starts from zero
		
        System.out.println(a[0]);
		
		System.out.println(Arrays.toString(a));
		// this is first approach 
		
		a[2]="Rohit";  
		
		 System.out.println(Arrays.toString(a));
		
		// second approach to print array
		for(int i=0; i<a.length; i++)           
		{
			System.out.println(a[i]);
		}
		
		// third approach to print array
		for(String k:a)
		{
			System.out.print(k+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}

	}


	
