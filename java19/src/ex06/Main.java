package ex06;

import java.io.Reader;
import java.io.StringReader;

public class Main {

	public static void main(String[] args) throws Exception {
		Reader reader = new StringReader("메가코딩컴퓨터학원");
	
		int ch;
		
		while ((ch = reader.read()) != -1) {
			System.out.print((char)ch);
		}
		reader.close();
	}

}
