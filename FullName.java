package assignment3;

public class FullName {
	   public static void main(String args[])
	   {
	   FullName f = new FullName();
	   f.fullName("divya", "devi");

	   }
	       
	       public void fullName(String firstName,String lastName)
	       {
	           String s=" ";
	                   
	           s=firstName.concat(lastName);
	           System.out.println(s);
	           
	       }

}
