package ex08;

import java.io.FileWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./data/out_file.txt");
		
		for (int i = 1; i <= 20; i++) {
			writer.write("메가코딩컴퓨터학원" + i + "\n");
		}
		
		writer.close();
		ProcessBuilder builder = new ProcessBuilder("notepad.exe", "./data/out_file.txt");
		builder.start();
	}

}
