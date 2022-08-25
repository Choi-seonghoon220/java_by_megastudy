package test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try (
			FileReader fr = new FileReader("./data/data1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("./data/data1_out.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		){
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line.replaceAll(" ", "") + "\r\n");
			}
		} catch(Exception e) {}
		
		try {
			ProcessBuilder builder = new ProcessBuilder("notepad.exe", "./data/data1_out.txt");
			builder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
