package demo;

public class Pro {
	int pid;
	int price;
	String pname;
	
	public Pro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Pro(int pid, int price, String pname) {
		super();
		this.pid = pid;
		this.price = price;
		this.pname = pname;
	}



	@Override
	public String toString() {
		return "Pro [pid=" + pid + ", price=" + price + ", pname=" + pname + "]";
	}
	
	
	
	

}
