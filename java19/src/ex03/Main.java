package ex03;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("./data/data4.txt");
		byte[] buff = new byte[100];
		
		int len;
		int pos = 0;
		
		while((len = is.read(buff, pos, 4)) != -1) {
			pos += len;
		}
		System.out.println(new String(buff, 0, pos));
		is.close();
	}

}
