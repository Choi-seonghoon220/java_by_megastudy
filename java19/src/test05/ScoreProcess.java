package test05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ScoreProcess {
	private String source_path;
	private PrintStream prtStream;
	private List<Score> data_list;

	void exec(String source_path, String target_path) {
		if (target_path == null)
			prtStream = System.out;
		else
			try { 
				prtStream = new PrintStream(target_path);
			} catch (FileNotFoundException e1) {}

		this.source_path = source_path;
		this.input();
		this.view();
	}

	void input() {
		List<String> list = null;

		try {
			list = Files.readAllLines(Paths.get(this.source_path), Charset.forName("utf8") );
		} catch (IOException e) {
			System.out.println(e.getMessage() );
		}

		data_list = new ArrayList<>();

		list.forEach(str -> {
			data_list.add(new Score(str));
		});

		data_list.sort((a, b) -> {
			int chk = a.getBan() - b.getBan();
			if (chk == 0)
				chk = a.getNum() - b.getNum();
			return chk;
		});

		for (Score score1 : data_list) {
			int r = 1;
			for (Score score2 : data_list) {
				if (score1.getBan() == score2.getBan() && score2.getAvg() > score1.getAvg())
					r++;
			}
			score1.setRank(r);
		}
	}

	void view() {
		int currentBan = 0;
		int tot_kor = 0;
		int tot_eng = 0;
		int tot_mat = 0;
		int cnt = 0;
		
		for (int i = 0; i < data_list.size(); i++) {
			if (currentBan != data_list.get(i).getBan()) {
				if( currentBan!=0 ) {
					prtStream.println(Score.getFooter(tot_kor, tot_eng, tot_mat, cnt));
					tot_kor = 0;
					tot_eng = 0;
					tot_mat = 0;
					cnt = 0;
				}
				currentBan = data_list.get(i).getBan();
				prtStream.println(currentBan + "반");
				prtStream.println(Score.getTitle());
			}
			
			prtStream.println(data_list.get(i));
			
			tot_kor += data_list.get(i).getKor();
			tot_eng += data_list.get(i).getEng();
			tot_mat += data_list.get(i).getMat();
			cnt++;
			
//			if (i == data_list.size() - 1 || currentBan != data_list.get(i + 1).getBan()) {
//				prtStream.println(Score.getFooter(tot_kor, tot_eng, tot_mat, cnt));
//				tot_kor = 0;
//				tot_eng = 0;
//				tot_mat = 0;
//				cnt = 0;
//			}
		}
		prtStream.println(Score.getFooter(tot_kor, tot_eng, tot_mat, cnt));
		
	}
}
