package ex02;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws Exception{
		byte[] arr = "mega coding computer,giga coding".getBytes();
		InputStream is = new ByteArrayInputStream(arr);
		byte[] buff = new byte[6];
		
		int len;
		
		while((len = is.read(buff)) != -1) {
			System.out.print(new String(buff, 0, len));
		}
		is.close();
	}

}
