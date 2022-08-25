package ex13;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get("./data", "data.txt");
		
		List<String> list = Files.readAllLines(path, Charset.defaultCharset());
		for (String str : list) {
			System.out.println(str);
		}
	}

}
