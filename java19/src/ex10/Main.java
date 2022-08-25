package ex10;

import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception {
//		InputStream ins = System.in;
//		
//		System.out.print("문자입력:");
//		
//		int ch = ins.read();
//		
//		System.out.println("입력한 문자는 " + (char)ch);
		
		InputStream ins = System.in;
		
		byte[] arr = new byte[100];
		
		System.out.print("문자열 입력:");
		
		int len = ins.read(arr);
		
		System.out.println("문자열 : " + new String(arr, 0, len));
	}

}
