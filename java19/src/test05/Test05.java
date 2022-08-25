package test05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {

	public static void main(String[] args) {
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("!!source file이 존재하지 않습니다.");
			System.exit(0);
		}
//		
//		ScorePrcess proce = new ScoreProcess();
//		
//		if( args.length==1)
//		    proce.exec( args[0], args[0] );
//		else
//			proce.exec( args[0], null );
//		
//		
		try (
				FileReader fr = new FileReader("./data/score1.txt");
				BufferedReader br = new BufferedReader(fr);
			){
			Set<Score> ban1_set = new TreeSet<>();
			Set<Score> ban2_set = new TreeSet<>();
			Set<Score> ban3_set = new TreeSet<>();
			
				String line;
				while ((line = br.readLine()) != null) {
					String[] lineArr;
					lineArr = line.split("\t");
					
//					if (lineArr[0].equals("1")) {
//						ban1_set.add(new Score(Integer.parseInt(lineArr[0]), lineArr[1],
//												Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4])));
//					} else if (lineArr[0].equals("2")) {
//						ban2_set.add(new Score(Integer.parseInt(lineArr[0]), lineArr[1],
//												Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4])));
//					} else if (lineArr[0].equals("3")) {
//						ban3_set.add(new Score(Integer.parseInt(lineArr[0]), lineArr[1],
//												Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4])));
//					}
					
					
					System.out.println(lineArr[0]);
				  	
				}
				
				for (Score v : ban1_set) {
					System.out.println(v);
				}
				
			} catch(Exception e) {}
			
	}

}



//		File sourceFile = new File(args[0]);
//		if (!sourceFile.exists()) {
//			System.out.println("!!source file이 존재하지 않습니다.");
//			System.exit(0);
//		}
//		
//        File targetFile = new File(args[1]);
//       
//        try(
//        		FileInputStream fis = new FileInputStream(sourceFile);
//                FileOutputStream fos = new FileOutputStream(targetFile);
//         ) {
//	        byte[] buf = new byte[1000];
//	 
//	        int readData;
//	        while ((readData = fis.read(buf)) != -1) {
//	            fos.write(buf, 0, readData);
//	        }
//        } catch( Exception e) {}