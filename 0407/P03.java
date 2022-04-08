package Apr7st;

import java.io.FileOutputStream;
import java.io.IOException;

public class P03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\kopo\\Desktop\\out.txt");
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}
