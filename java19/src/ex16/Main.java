package ex16;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		dirView("c:/windows");
	}
	static void dirView(String path) {
		File file = new File(path);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if (f.isDirectory()) {
				System.out.println("\t<DIR>\t\t" + f.getName());
			} else {
				System.out.println("\t\t\t" + f.length() / 1024.0 + "kb\t" + f.getName());
			}
		}
	}

}
