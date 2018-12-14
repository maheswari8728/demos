import java.util.Scanner;

public class StringConMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add string to itself");
		System.out.println("2.Replace odd positions");
		System.out.println("3.remove Duplications");
		System.out.println("4.Change odd characters to upper case");
		System.out.println("enter choice");
		int ch=sc.nextInt();
		StringCon obj=new StringCon();
		
		switch(ch)
		{
		case 1:obj.concat();
		
		       break;
		       
		case 2:obj.replace();
		
	       break;
	       
		case 3:obj.duplicate();
		
	       break;
		       
		case 4:obj.odd();
		
	       break;
		
		}
		
	}
}
