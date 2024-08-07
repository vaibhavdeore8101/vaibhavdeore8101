package operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("Demo.txt");
		if(file.exists()) {
			FileOutputStream fileOutStream=new FileOutputStream(file);
			fileOutStream.write(20);
			System.out.println("Data is Wriitten in the File");
			fileOutStream.close();
		}
		else {
			file.createNewFile();
			System.out.println("File is Created");
			FileOutputStream fileOutStream=new FileOutputStream(file);
			fileOutStream.write(20);
			System.out.println("Data is Wriitten in the File");
			fileOutStream.close();
		}
	}

}
