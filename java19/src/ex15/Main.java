package ex15;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("c:\\work");
		
		File[] arr = file.listFiles();
		
		for (File f : arr) {
			if (f.isDirectory())
				System.out.println(f.getPath());
		}
	}

}
