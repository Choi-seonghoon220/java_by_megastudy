package ex12;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("./data/score.txt"));
		String line;
		String[] arr;
		while(sc.hasNext()) {
			line = sc.nextLine();
			arr = line.split(",");
			System.out.println(String.join(" ", arr));
		}
		sc.close();
	}

}
