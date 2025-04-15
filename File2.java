package com.FileIOHandling;

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method ");
		File f = new File("D:\\FileIOHandling\\Text4");
		//f.createNewFile();
		f.mkdir();//Creates the directory named by this abstract pathname.
		
		File f1 = new File(f,"Vinay.txt");
		f1.createNewFile();
		
		if(f1.exists()) {
			System.out.println("File is created already");
		}else {
			f1.createNewFile();
		}
		
		System.out.println("absolutePath:"+f1.getAbsolutePath());
		System.out.println("AbsolutePath:"+f1.getCanonicalPath());
		System.out.println("AbsolutePath:"+f1.getFreeSpace());
		System.out.println("AbsolutePath:"+f1.getTotalSpace());
		
		File f2 = new File("D:\\FileIOHandling\\Text2");
		f2.delete();
		
		System.out.println("Main is End method");

		
		
		
		
		

		}

}
