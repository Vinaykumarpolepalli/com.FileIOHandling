package com.FileIOHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method Started");
		FileWriter fw = new FileWriter("D:\\FileIOHandling\\Text4\\vinay.txt");
		char[] ch = {'A','B', 'C','D'};
		
		fw.write(ch);
		fw.write('\n');
		fw.write(65);
		fw.write(85);
		fw.write(89);
		fw.write('\n');
		fw.write(100);
		fw.flush();
		
		fw.write("Vinay kumar");
		System.out.println("MAin method id ended");
	}

}
