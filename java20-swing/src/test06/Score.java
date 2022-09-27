package test06;

public class Score {
	int ban, num;
	String name;
	int kor, eng, mat, tot;
	double avg;
	 
	public Score(String line) {
		String[] lineArr;
		lineArr = line.trim().split("\\s+");
		
		this.ban = Integer.parseInt(lineArr[0]);
		this.num = Integer.parseInt(lineArr[1]);
		this.name = lineArr[2];
		this.kor =  Integer.parseInt(lineArr[3]);
		this.eng =  Integer.parseInt(lineArr[4]);
		this.mat = Integer.parseInt(lineArr[5]);
		this.tot = kor + eng + mat;
		this.avg = this.tot / 3.0;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %5d %5.2f", num, name, kor, eng, mat, tot, avg);
		
	}
}
