package operations;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File file = new File("Demo.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("File Deeted SuccesFully");
		}
		else {
			System.out.println("File does not Exists");
		}
	}

}
