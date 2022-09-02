package test06;

import java.io.File;
import java.util.ArrayList;

public class Test06 {

	public static void main(String[] args) {
//		dirView("c:\\work", "py");
		dirStorageView("c:\\Program Files");
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
	
	public static void dirStorageView(String sourcePath) {
		class FileStorage {
			String path;
			long size;
			
			FileStorage(String path, long size) {  
				this.path = path;
				this.size = size;
			}
		}
		
		class GetFile {
			int size;
			ArrayList<FileStorage> fileAL = null;
			
			GetFile() {
				size = 0;
			}
			
			FileStorage fileReader(String sourcePath) {
				FileStorage tempStorage = null;
				fileAL = new ArrayList<>();
				
				File sourceFile = new File(sourcePath);
				
				File[] fileArr = sourceFile.listFiles();
				for (File st : fileArr) {
					if (st.isFile()) {
						System.out.println("file");
						fileAL.add(new FileStorage(st.getName(), st.length()));
					} else {
						System.out.println("dir");
						fileAL.add(fileReader(st.getPath()));
					}
				}
				return tempStorage;
			}
		}
		
		GetFile temp = new GetFile();
		temp.fileReader(sourcePath);
		
		temp.fileAL.sort((a, b) -> {
			long chk = a.size - b.size;
			return (int) chk;
		});
		
		for (FileStorage fileTemp : temp.fileAL) {
			System.out.println(fileTemp.path + "    " + fileTemp.size);
		}
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