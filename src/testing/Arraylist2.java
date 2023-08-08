package testing;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("yash");
		obj.add("anant");
		obj.add("aniket");
		obj.add("pratham");
		
//		System.out.println(obj);
//		 // this is 1st approach
//		System.out.println(obj.size());
//		 System.out.println(obj.get(3));
//		 System.out.println(obj.get(0));
//		 
//		 obj.remove(2);
//		 System.out.println(obj);
//		 
//		 obj.set(0, "rohit");
//		 System.out.println(obj);
//		 
//		 obj.add("ramesh");
//		 System.out.println(obj);
////		 
		 System.out.println(obj.contains("rohit"));
		 
		// second approach to print Arraylist
		 for( int i=0; i<obj.size();i++)
		 {
			 
			 System.out.print(obj.get(i)+" ");
		 }
	}
}
