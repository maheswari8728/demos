package demo;                         //over ridden method

public class CarMain {
	
	public static void main(String[] args) {
		
		SportsCar sc=new SportsCar();
		sc.move();
		sc.capacity();
		String s=sc.fuel();
		System.out.println(s);
	}

}
