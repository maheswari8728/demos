package demo;

public class SwitchExp {
	public static void main(String[] args) 
	{
		String currentDay=args[0];
		switch(currentDay) {
		case "Monday":
		case "tuesday":
		case "wednesday":
			System.out.println("Boring");
			break;
		case "thursday":
			System.out.println("interesting");
			break;
		case "Friday":
			System.out.println("funny");
			break;
		case "Saturday":
			System.out.println("lazy");
			break;
		case "Sunday":
			System.out.println("sleeping");
			break;
			default:
				System.out.println("good");
				break;
		}
	}

}
