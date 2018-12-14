
public class Gender1 {
		private String firstName;
		private String lastName;
		private String gender;
		private int age;
		private int pno;
		
		
				public Gender1() {
			super();
			// TODO Auto-generated constructor stub
		}
				


				public Gender1(String firstName, String lastName, String gender, int age,int pno) {
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
	    System.out.println("Gender:"+Gender.F);
	    System.out.println("Age:"+s);
	    System.out.println("phone number"+pnum);
	}

}
