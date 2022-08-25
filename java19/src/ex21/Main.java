package ex21;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		FileInputStream fs = new FileInputStream("./data/text_file.txt");
		Reader reader = new InputStreamReader(fs);
		char[] arr = new char[100];
		int len;
		
		while((len = reader.read(arr)) != -1) {
			System.out.print(new String(arr, 0, len));
		}
		reader.close();
		fs.close();
	}

}
