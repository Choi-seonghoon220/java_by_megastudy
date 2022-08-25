package ex28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		writeTest();
		readTest();
	}
	static String file_name = "./data/object.dat";
	
	static void writeTest() throws Exception {
		Member[] arr = { new Member("홍길동", "hong", "1111"),
						new Member("이건길", "lee", "3333"),
						new Member("김형석", "kim", "444") };
		
		FileOutputStream fos = new FileOutputStream(file_name);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(arr.length);
		for (Member mem : arr) {
			oos.writeObject(mem);
		}
		oos.flush();
		oos.close();
	}
	static void readTest() throws Exception {
		FileInputStream fis = new FileInputStream(file_name);
		ObjectInputStream ois = new ObjectInputStream(fis);
		int cnt = (Integer)ois.readObject();
		
		for (int i = 1; i <= cnt; i++) {
			Member mem = (Member) ois.readObject();
			System.out.println(mem);
		}
		ois.close();
	}
}
