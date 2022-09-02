package test07;

import java.io.Serializable;

public class Score implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int num;
	String name;
	int kor, eng, mat, tot;
	double avg;
	
	Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}
	public String toString() {
		String str = String.format("%5d %6s %5d %5d %5d %5d %6.2f", num, name, kor, eng, mat, tot, avg);
		return str;
	}
}
