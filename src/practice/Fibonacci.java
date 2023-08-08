package practice;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", "); //0,1,1,2,3,5,8
             //13,21,34
			// compute the next term
			int nextTerm = firstTerm + secondTerm;//0+1=1,1+1=2,1+2=3 ,2+3=5,
			//3=5=8,5+8=13,8+13=21, 13+21=34 , 21+34=55
			firstTerm = secondTerm; // f=1,f=1,f=2,f=3,f=5,f=8,f=13,f=21f=34
			secondTerm = nextTerm; //s=1,s=2.s=3,s=5,s=8,s=13,s=21,s=34 s=55
		}

	}

}
