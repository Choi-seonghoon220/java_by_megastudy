package ex07;

import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./data/text_file.txt");
		
		char[] arr = new char[10];
		int len;
		
		while ((len = reader.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		reader.close();
	}

}
