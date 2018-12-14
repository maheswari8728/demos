package demo;
                                                      //Array of objects concept
public class TraineeMain {

	public static void main(String[] args) {
		
		Trainee trainee[]=new Trainee[3];
		
		 trainee[0]=new Trainee(166179,"Mahi",20000);
		 trainee[1]=new Trainee(166180,"Ravi",20000);
		 trainee[2]=new Trainee(166179,"Suma",20000);
		
		for(int i=0;i<trainee.length;i++)
		{
			System.out.println(trainee[i].ename);
			System.out.println(trainee[i].empid);
			System.out.println(trainee[i].salary);
		}
		
	}
	
	

}
