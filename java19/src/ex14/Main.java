package ex14;

import java.io.File;
import java.net.URI;

public class Main {

	public static void main(String[] args) throws Exception {
		File dir = new File("c:/temp/dir");
		File file1 = new File("c:/temp/file1.txt");
		File file2 = new File("c:/temp/file2.txt");
		File file3 = new File(new URI("file:///c:/temp/file3.txt"));
		
		if (dir.exists() == false) dir.mkdirs();
		if (file1.exists() == false) file1.createNewFile();
		if (file2.exists() == false) file2.createNewFile();
		if (file3.exists() == false) file3.createNewFile();
	}

}
