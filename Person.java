package assignment6;

public class Person {
	private String firstName;
	private String secondName;
	private  String gender;
	int age;

Person(String firstName,String secondName, String gender, int age){
    this.firstName = firstName;
    this.secondName =secondName;
    this.gender = gender;
    this.age = age;
}
Person()
{
	
}




public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


}
