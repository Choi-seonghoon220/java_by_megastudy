package test05;

import java.io.File;

public class Test05 {

	public static void main(String[] args) {
		if( args.length==0) {
			System.exit(0);
		}
		
		File file = new File(args[0]);
		if( !file.exists() ) {
			System.out.println("!!source file이 존재하지 않습니다.");
			System.exit(0);System.exit(0);
		}
		
		ScoreProcess proce = new ScoreProcess();
		
		if (args.length == 1)
		    proce.exec(args[0], null);
		else
			proce.exec(args[0], args[1] );
		
			
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