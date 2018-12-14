
public class Demo implements Inter2 {

	@Override
	public void method1() {
		
		System.out.println("implementation of method1");
		
		// TODO Auto-generated method stub
	}

	@Override
	public void method2() {
		
		System.out.println("implementation of method2");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		Inter2 obj=new Demo();
		obj.method1();
	}

}
