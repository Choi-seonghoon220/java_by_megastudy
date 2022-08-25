package ex26;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("./data/out.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("프린터 보조스트림입니다.");
		ps.printf("이름 : %s, 점수 : %d\n",	"홍길동", 60);
		
		ps.flush();
		ps.close();
	}

}
