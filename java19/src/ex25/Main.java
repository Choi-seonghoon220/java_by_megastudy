package ex25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("./data/out.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("이유빈");
		dos.writeInt(100);
		dos.writeDouble(95.7);
		
		dos.writeUTF("김형석");
		dos.writeInt(90);
		dos.writeDouble(87.5);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("./data/out.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 1; i <= 2; i++) {
			String name = dis.readUTF();
			int tot = dis.readInt();
			double avg = dis.readDouble();
			
			System.out.println(name + " " + tot + " " + avg);
		}
		dis.close();
		}

}
