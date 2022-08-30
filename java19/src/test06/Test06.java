package test06;

import java.io.File;

public class Test06 {

	public static void main(String[] args) {
		dirView("c:\\work", "py");
	}
	
	public static void dirView(String sourcePath, String exe) {
		class GetFile {
			int count;
			int size;
			
			GetFile() {
				count = 0;
				size = 0;
			}
			
			void fileReader(String sourcePath, String exe) {
				File sourceFile = new File(sourcePath);
				
				File[] fileArr = sourceFile.listFiles();
				for (File st : fileArr) {
					if (st.isDirectory()) {
						fileReader(st.getPath(), exe);
					} else {
						if (st.getName().endsWith(exe)) {
							count++;
							size += st.length();
							System.out.println(st.getPath());
						}
					}
				}
			}
			
		}
		
		GetFile temp = new GetFile();
		temp.fileReader(sourcePath, exe);
		System.out.printf("count = %d, size = %.2fMb", temp.count, temp.size / Math.pow(2,20));
	}
}

//class GetFile {
//	int count;
//	int size;
//	
//	GetFile() {
//		count = 0;
//		size = 0;
//	}
//	
//	void fileReader(String sourcePath, String exe) {
//		File sourceFile = new File(sourcePath);
//		
//		File[] fileArr = sourceFile.listFiles();
//		for (File st : fileArr) {
//			if (st.isDirectory()) {
//				fileReader(st.getPath(), exe);
//			} else {
//				if (st.getName().endsWith(exe)) {
//					count++;
//					size += st.length();
//					System.out.println(st.getPath());
//				}
//			}
//		}
//	}
//	
//}