package ex17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("c:/temp/test.jpg");
		OutputStream fos = new FileOutputStream("c:/temp/test2.jpg");
		
		byte[] buff = new byte[100];
		int len;
		
		while ((len = fis.read(buff)) != -1) {
			fos.write(buff, 0, len);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		ProcessBuilder builder = new ProcessBuilder("mspaint.exe", "c:\\temp\\test2.jpg");
		builder.start();
	}

}
