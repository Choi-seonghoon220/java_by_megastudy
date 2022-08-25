package ex04;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws Exception{
		OutputStream outs = new ByteArrayOutputStream();
		byte[] arr = "mega coding".getBytes();
		
		for (byte b : arr) {
			outs.write(b);
		}
		outs.close();
		System.out.println(outs.toString());
	}

}
