package com.FileIOHandling;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args)  throws IOException{
		System.out.println("Main Method ");
		File f = new File("E:\\FileIOHandling\\Text1.txt");
		
		boolean status=f.createNewFile();
		if(status) {
			System.out.println("Files is cretated succesfilly");
		}else {
			System.out.println("not created file");
		}
		
		System.out.println("End method ");
	}

}
