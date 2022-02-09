package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream output = new FileOutputStream("C:/Users/Do/io_test/text.txt");
		
		FileWriter output2 = new FileWriter("C:/Users/Do/io_test/text.txt");
		
		output2.write("qwertyuuiop"
				+ "\n" + "asdfghjkl"
						+ "\n" + "zxcvbnm");
		
		output2.flush();
		output2.close();
		

	}

}
