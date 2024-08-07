package operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("Demo.txt");
		if(file.exists()) {
			FileInputStream fileInput=new FileInputStream(file);
			System.out.println(fileInput.read());
			System.out.println("Data Fetched Succesfully");
			fileInput.close();
		}
		else {
			System.out.println("File Does Not Exits");
		}
	}

}
