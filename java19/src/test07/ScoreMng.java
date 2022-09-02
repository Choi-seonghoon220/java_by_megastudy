package test07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreMng {
	private Map<Integer, Score> map_score;
	private Scanner sc;
	static String fileName = "./score_data.dat";
	boolean isUpdate;

	public ScoreMng() {
		try (
				FileInputStream fos = new FileInputStream(fileName);
				ObjectInputStream oos = new ObjectInputStream(fos);
				)
		{
			map_score = (Map<Integer, Score>) oos.readObject();

		} catch (FileNotFoundException e) {
			map_score = new TreeMap<>();
		} catch (ClassNotFoundException e) {
			System.out.println("파일 형식 오류");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("파일 읽기 오류");
			System.exit(0);
		}
		sc = new Scanner(System.in);
		isUpdate = false;
	}

	public void exec() {

		int chosenNumber;

		while (true) {
			chosenNumber = getNumber("1.Append, 2.Modify, 3.Remove, 4.View, 5.Exit=>");
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
				break;
			}
		}
		if (!isUpdate)
			return;
		
		try (
				FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				)
		{
			oos.writeObject(map_score);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void append() {
		int key;

		while (true) {
			key = getNumber("[Append end=-999] 번호:");
			if (key == -999) {
				break;
			}
			if (map_score.containsKey(key)) {
				System.out.println("이미 존재하는 번호입니다.");
				continue;
			}
			isUpdate = true;
			map_score.put(key, getScore(key));
		}
	}

	public void modify() {
		int key;

		while (true) {
			key = getNumber("[Append end=-999] 번호:");
			if (key == -999) {
				break;
			}
			if (!map_score.containsKey(key)) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}
			isUpdate = true;
			map_score.put(key, getScore(key));
		}
	}

	public void remove() {
		int key;

		while (true) {
			key = getNumber("[Append end=-999] 번호:");
			if (key == -999) {
				break;
			}
			if (map_score.containsKey(key)) {
				isUpdate = true;
				map_score.remove(key);
			} else {
				System.out.println("존재하지 않는 번호입니다.");
			}
		}
	}

	public void view() {
		System.out.println("-------------------------------------------------");

		map_score.forEach((key, value) -> {
			System.out.printf("%5d %6s %5d %5d %5d %5d %5.2f\n", key, value.name, value.kor, value.eng, value.mat,
					value.tot, value.avg);
		});

		System.out.println("-------------------------------------------------");
	}

	public int getNumber(String str) {
		while (true) {
			System.out.print(str);

			String temp = sc.nextLine();

			if (temp.matches("-?\\d+")) {
				return Integer.parseInt(temp);
			}
			System.out.println("숫자를 입력하세요.");
		}
	}

	public Score getScore(int num) {
		String name;
		int kor, eng, mat;

		System.out.print("이름:");
		name = sc.nextLine();
		kor = getNumber("국어:");
		eng = getNumber("영어:");
		mat = getNumber("수학:");

		return new Score(num, name, kor, eng, mat);
	}
}
