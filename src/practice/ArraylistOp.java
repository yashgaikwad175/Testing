package practice;

import java.util.ArrayList;

public class ArraylistOp {

	public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.set(2,50);
	
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.get(3));
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	
	for(int k:a)
	{
		System.out.print(" "+k);
	}
	
	}

}
