package ex27;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		FileWriter writer = new FileWriter("./data/out.txt");
		
		PrintWriter pw = new PrintWriter(writer);
		
		pw.println("프린터 보조스트림입니다.");
		pw.printf("이름 : %s, 점수 : %d\n", "홍길동", 60);
		
		pw.flush();
		pw.close();
	}

}
