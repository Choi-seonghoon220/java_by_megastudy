package test01;

import java.io.IOException;

public class Main {

	public static void main(String[] args){
		byte[] arr = new byte[100];
		
		System.out.print("문자열 : ");
		
		try {
			int len = System.in.read(arr);
			System.out.print(new String(arr, 0, len).toUpperCase());
		} catch (IOException e) {}
	}

}
