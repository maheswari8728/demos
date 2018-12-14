package demo;

import java.util.Arrays;

public class Arr {
	
	public static void main(String[] args) {
		
		int obj[]= {2,6,8,1};
		
		for(int var:obj)
		{
		System.out.println(var);	
		}
		System.out.println(Arrays.binarySearch(obj, 4));
		
		 int obj1[]=Arrays.copyOf(obj, 2);
		 
		 for(int index:obj1)
		 {
			 System.out.println(index);
		 }
	   	
		int obj2[]=Arrays.copyOfRange(obj, 0, 2);
		
		for(int q:obj2)
		{
			System.out.println(q);
		}
	}

}
