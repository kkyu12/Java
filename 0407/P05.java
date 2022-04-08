package Apr7st;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\out.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
