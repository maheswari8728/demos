package demo;

public class NumberCheck {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		if(number<0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is Positive");
	}

}
