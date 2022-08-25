package test02;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream ints = new FileInputStream("./data/file1.txt");
		
		int ch;
		
		while ((ch = ints.read()) != -1) {
			System.out.print( (char)Character.toUpperCase(ch));
		}
	}

}
