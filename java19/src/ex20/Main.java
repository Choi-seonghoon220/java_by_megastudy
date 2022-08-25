package ex20;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		char[] arr = new char[100];
		int len;
		
		System.out.print("문자열 입력 : ");
		len = reader.read(arr);
		
		System.out.println(new String(arr, 0, len));
	}

}
