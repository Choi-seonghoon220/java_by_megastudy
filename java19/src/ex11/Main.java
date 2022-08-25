package ex11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] score = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("이름 : "); name[i] = sc.next();
			System.out.print("점수 : "); score[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + " " + score[i]);
		}
	}

}
