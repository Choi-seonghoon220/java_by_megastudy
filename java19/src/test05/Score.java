package test05;

public class Score {
	private String name;
	private int ban, num, kor, eng, mat, tot;
	private int rank;
	private double avg;
	
	public Score(String line) {
		String[] lineArr;
		lineArr = line.split("\t");
		
		this.ban = Integer.parseInt(lineArr[0]);
		this.num = Integer.parseInt(lineArr[1]);
		this.name = lineArr[2];
		this.kor =  Integer.parseInt(lineArr[3]);
		this.eng =  Integer.parseInt(lineArr[4]);
		this.mat = Integer.parseInt(lineArr[5]);
		this.tot = kor + eng + mat;
		this.avg = this.tot / 3.0;
	}
	public int getBan() {
		return this.ban;
	}
	public int getNum() {
		return this.num;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMat() {
		return this.mat;
	}
	public double getAvg() {
		return this.avg;
	}
	public void setRank( int r) {
		this.rank = r;
	}
	public static String getTitle() {
		return String.format("   num   name     kor   eng   mat  tot  avg     rank\n%s", getBar());
	}
	
	public static String getFooter(int tot_kor, int tot_eng, int tot_mat, int cnt) {
		return String.format("%s\n%20.2f %5.2f %5.2f",getBar(), ((double)(tot_kor) / cnt), ((double)(tot_eng) / cnt), ((double)(tot_mat) / cnt));
		
		
	}
	
	public static String getBar() {
		return "-------------------------------------------------------";
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %5d %5.2f %5d", num, name, kor, eng, mat, tot, avg, rank);
		
	}
	
}