package ex19;

import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("./data/out.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("메가코딩학원\r\n");;
		fw.write("기가코딩학원\r\n");;
		
		fw.flush();
		fw.close();
		
		ProcessBuilder builder = new ProcessBuilder("notepad.exe", "./data/out.txt");
		builder.start();
	}

}
