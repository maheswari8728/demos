package assignment5;

public class Person2 extends Account2 {
	
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}

	void withdrawal(double amount) {
		balance-=amount;
		// TODO Auto-generated method stub
		
	}

}
