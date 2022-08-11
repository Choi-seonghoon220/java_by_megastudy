package test10;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreMng {
	private Map<Integer, Score> map_score;
	private Scanner sc;
	
	public ScoreMng() {
		sc = new Scanner(System.in);
		map_score = new TreeMap();
	}
	public void exec() {
		int chosenNumber;
		
		while (true) {
			System.out.print("1.Append, 2.Modify, 3.Remove, 4.View, 5.Exit=>");
			chosenNumber = sc.nextInt();
//			switch(chosenNumber) {
//			   case 1 : append(); break;
//			}
			if (chosenNumber == 1) {
				append();
			} else if (chosenNumber == 2) {
				modify();
			} else if (chosenNumber == 3) {
				remove();
			} else if (chosenNumber == 4) {
				view();
			} else if (chosenNumber == 5) {
				exit();
			}
		}
	}
	
	public void append() {
		int[] intArr = new int[4];
		String name;
		
		while(true) {
			System.out.print("[Append end=-999] 번호:");
			intArr[0] = sc.nextInt();
			sc.nextLine();
			if (intArr[0] == -999) {
				break;
			} else if (!map_score.containsKey(intArr[0])) {
			
			
				System.out.print("이름:");
				name = sc.nextLine();
				System.out.print("국어:");
				intArr[1] = sc.nextInt();
				System.out.print("영어:");
				intArr[2] = sc.nextInt();
				System.out.print("수학:");
				intArr[3] = sc.nextInt();
				
				map_score.put(intArr[0], new Score(intArr[0], name, intArr[1], intArr[2], intArr[3]));
			} else {
				System.out.println("이미 존재하는 번호입니다.");
			}
		}
	}
	
	public void modify() {
		
	}
	public void remove() {
		
	}
	public void view() {
		
	}
	public void exit() {
		
	}
}