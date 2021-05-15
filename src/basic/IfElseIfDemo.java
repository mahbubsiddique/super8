package basic;

public class IfElseIfDemo {

	public static void main(String[] args) {

		int x = 105;
		int y = 105;

		if (x > y)
			System.out.println("x is bigger");
		else if (y > x)
			System.out.println("y is bigger");
		else if (x == y)
			System.out.println("both are the same");
		else
			System.out.println("ERROR");
	}// end of main

}// end of class
