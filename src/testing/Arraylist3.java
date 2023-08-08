package testing;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<Double> obj=new ArrayList<Double>();
		obj.add(2.2);
		obj.add(5.5);
		obj.add(4.4);
		obj.add(5.5);
		
		System.out.println(obj);
		 // this is 1st approach
		System.out.println(obj.size());
		 System.out.println(obj.get(3));
		 System.out.println(obj.get(0));
		 
		 obj.remove(2);
		 System.out.println(obj);
		 
		 obj.set(0,6.6);
		 System.out.println(obj);
		 
		 obj.add(7.7);
		 System.out.println(obj);
		 
		 System.out.println(obj.contains(7.7));
		 
		// second approach to print Arraylist
		 for( int i=0; i<obj.size();i++)
		 {
			 
			 System.out.print(obj.get(i)+" ");
		 }
	}
}



