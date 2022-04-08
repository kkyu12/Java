package Apr7st;

import java.io.File;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\kopo\\Desktop");
		File files[] = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
