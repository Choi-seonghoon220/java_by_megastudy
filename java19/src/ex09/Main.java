package ex09;

import java.io.StringWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) throws Exception {
		Writer writer = new StringWriter();
		
		for (int i = 1; i <= 5; i++) {
			writer.append("메가코딩컴퓨터학원" + i + "\n");
		}
		
		writer.close();
		System.out.println((writer.toString()));
	}

}
