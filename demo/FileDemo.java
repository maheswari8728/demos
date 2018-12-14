package demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]) throws IOException {
		String s=args[0];
		File file=new File(s);
		file.createNewFile();
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canRead());
		System.out.println(file.length());
	}

}
