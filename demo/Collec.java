package demo;

import java.util.ArrayList;

public class Collec {
	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		arr.add("pen");
		arr.add("pencil");
		arr.add("marker");
		arr.add("eraser");
		System.out.println(arr);
		ArrayList arr1=new ArrayList();
		arr1.add("ram");
		arr1.add("sham");
		arr1.add("khan");
		arr.addAll(arr1);
		System.out.println(arr);
		System.out.println(arr.contains("marker"));
		System.out.println(arr.containsAll(arr1));
		System.out.println(arr.contains("marker"));
		System.out.println(arr.equals("eraser"));
		System.out.println(arr.hashCode());
		
		
		
	}

}
