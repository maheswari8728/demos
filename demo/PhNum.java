package demo;

public class PhNum {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private int pno;
	
	
			public PhNum() {
		super();
		// TODO Auto-generated constructor stub
	}
			


			public PhNum(String firstName, String lastName, String gender, int age,int pno) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.gender = gender;
				this.age = age;
				this.pno=pno;
			
			}




			public String getFirstName() {
				return firstName;
			}



			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}



			public String getLastName() {
				return lastName;
			}



			public void setLastName(String lastName) {
				this.lastName = lastName;
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



			public int getPno() {
				return pno;
			}



			public void setPno(int pno) {
				this.pno = pno;
			}

			
 void display(String p,String q,String r,int s,int pnum)
{
	System.out.println("Person Details:");
    System.out.println("-----------------");
    System.out.println("FirstName:"+p);
    System.out.println("Last Name:"+q);
    System.out.println("Gender:"+r);
    System.out.println("Age:"+s);
    System.out.println("phone number"+pnum);
}


	}


