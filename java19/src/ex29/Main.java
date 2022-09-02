package ex29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
	
		try {
			URL url = new URL("http://munpc01.dothome.co.kr/img/bg2.jpg");
			
			InputStream ins = url.openStream();
			
			FileOutputStream fouts = new FileOutputStream("c:/temp/out3.jpg");
			
			byte[] arr = new byte[100];
			int len;
			
			while ((len = ins.read(arr)) != -1) {
				fouts.write(arr, 0, len);
			}
			fouts.flush();
			fouts.close();
			
			ProcessBuilder builder = new ProcessBuilder("mspaint.exe", "d:\\temp\\out3.jpg");
			builder.start();
		} catch (MalformedURLException e) {
			System.out.println("1");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("2");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("3");
			e.printStackTrace();
		}
		
		
		
	}

}
