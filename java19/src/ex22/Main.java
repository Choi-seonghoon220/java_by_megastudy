package ex22;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("./data/out.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write("바이트 출력 스트림을 문자 출력 스트림으로 변환");
		
		writer.flush();
		writer.close();
	}

}
