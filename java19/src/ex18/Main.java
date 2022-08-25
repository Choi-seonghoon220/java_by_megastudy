package ex18;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("./data/text_file.txt");
		
		char[] arr = new char[10];
		int len;
		
		while ((len = fr.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		fr.close();
	}

}
