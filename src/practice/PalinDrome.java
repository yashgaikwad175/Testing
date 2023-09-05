package practice;

public class PalinDrome {

	public static void main(String[] args) {
		int num =272;
		int reversedNum = 0;
		int rem;
		int orgNumber = num;
		while (num != 0) {
			rem = num % 10; // 275%10=5 ---- 27%10=7-----2%10=2   // 272%10=2 ---27%10=7 2%10=2
			reversedNum = reversedNum * 10 + rem; // 0*10+5=5----- 5*10+7=57----57*10+2=572// 0*10+2=2 ----- 2*10+7=27--- 27*10+2=272
			num = num/10; // 275/10=27.5(27 int) ----- 27/10=2.7(2 int) ------2/10=0 /// 272/10=27.2 (27 int)---27/10=2.7(2int)--- 2/10=0

		}
		System.out.println(reversedNum);
		if (orgNumber == reversedNum) {
			System.out.println(orgNumber + " is palindrome");

		} else {
			System.out.println(orgNumber + "is not palindrome");
		}

	}

}
