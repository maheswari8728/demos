package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mcr {
	
 public static void main(String[] args) {
	
	/* String input="Shop,Mop,Hopping,Chopping";
	 Pattern pattern=Pattern.compile("hop");
	 Matcher matcher=pattern.matcher(input);
	 System.out.println(matcher.matches());
	 
	 while(matcher.find())
	 {
		 System.out.println(matcher.group()+":"+matcher.start()+":"+matcher.end());
	 }*/
	Mcr s=new Mcr();
	 //s.par("Maheswari");
	 s.par1("7411802571");
	 }
 static void par(String name)
 {
	 Pattern pattern=Pattern.compile("[A-Z][a-z]{2,6}");
	 Matcher matcher=pattern.matcher(name);
	 System.out.println(matcher.matches());
 }
 static void par1(String pno)
 {
	 Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
	 Matcher matcher=pattern.matcher(pno);
	 System.out.println(matcher.matches());
 }
 static void email(String em)
 {
	 Pattern pattern=Pattern.compile("[a-z]*");
	 Matcher matcher=pattern.matcher(em);
	 System.out.println(matcher.matches());
 }
}
