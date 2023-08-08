package testing;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(40);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		 System.out.println(obj);
		 // this is 1st approach
		 System.out.println(obj.size());
           // to calculate length

		 System.out.println(obj.get(3));
		 System.out.println(obj.get(0));
		 //to retrieve the value at specific index
		 obj.add(0,98);
		 System.out.println(obj);
		 // second approach to print arraylist
		 for(int i=0; i<obj.size();i++)
		 {
			 System.out.println(obj.get(i));
		 }
		  
	}

}
