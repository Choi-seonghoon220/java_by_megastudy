package ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStream ins = new FileInputStream("c:/temp/test.jpg");
		OutputStream outs = new FileOutputStream("c:/temp/test2.jpg");
		
		byte[] buff = new byte[100];
		int len;
		
		while((len = ins.read(buff)) != -1) {
			outs.write(buff, 0, len);
		}
		outs.flush();
		outs.close();
		ins.close();
		
		ProcessBuilder builder = new ProcessBuilder("mspaint.exe", "c:\\temp\\test2.jpg");
		builder.start();
	}

}
