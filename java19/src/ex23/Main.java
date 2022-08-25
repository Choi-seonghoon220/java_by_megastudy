package ex23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/test.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("c:/temp/test3.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] arr = bis.readAllBytes();
		
		bos.write(arr);
		
		bos.flush();
		bos.close();
		bis.close();
		
		ProcessBuilder builder = new ProcessBuilder("mspaint.exe", "c:\\temp\\test3.jpg");
		builder.start();
	}

}
