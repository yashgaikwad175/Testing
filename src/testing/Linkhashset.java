package testing;

import java.util.LinkedHashSet;

public class Linkhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer>obj=new LinkedHashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(10);
		obj.add(50);
		
		System.out.println(obj);
		
		//for loop is not applicable
		// for each loop
		
		for(int a:obj)
		{
			System.out.println(a);
		}
		}

}
