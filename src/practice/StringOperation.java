package practice;

public class StringOperation {
public static void main(String[] args) {
	String a="  Yash gaikwad  ";
	String b="prathamesh";
	String c="Prathamesh";
	System.out.println(a);
	System.out.println(a.length());
	System.out.println(a.charAt(5));
	System.out.println(a.substring(5));
	System.out.println(a.substring(2, 5));
	System.out.println(a.contains("waa"));
	System.out.println(a.startsWith("Yash"));
	System.out.println(a.endsWith("d"));
	System.out.println(b.concat(" dhasade"));
	System.out.println(b.equals(c));
	System.out.println(b.equalsIgnoreCase(c));
	System.out.println(a.trim());
}
}
