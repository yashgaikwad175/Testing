package practice;


import java.util.Arrays;

public class ArrayOperation {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[3]);
		
		for(int K:a)
		{
			System.out.print(" "+K);
		}
	}

}
