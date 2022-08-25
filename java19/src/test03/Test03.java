package test03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class Test03 {

	public static void main(String[] args)  {
		if (args.length != 2) {
			System.out.println("!!source file 과 target file이 제공되지 않았습니다.");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("!!source file이 존재하지 않습니다.");
			System.exit(0);
		}
		
        File targetFile = new File(args[1]);
       
        try(
        		FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile);
         ) {
	        byte[] buf = new byte[1000];
	 
	        int readData;
	        while ((readData = fis.read(buf)) != -1) {
	            fos.write(buf, 0, readData);
	        }
        } catch( Exception e) {}
 
 
    }
}
