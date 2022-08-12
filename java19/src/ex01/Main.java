package ex01;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		byte[] arr = "ABCDEF".getBytes();
		InputStream is = new ByteArrayInputStream(arr);
		int ch;
		
		while((ch = is.read()) != -1) {
			System.out.print((char)ch);
		}
		is.close();
		
		System.out.println((char)1222);
	}

}
