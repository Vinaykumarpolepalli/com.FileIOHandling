package com.FileIOHandling;

import java.io.File;

public class File3 {

	public static void main(String[] args) {
		System.out.println("Main Method ");
		File f = new File("D:\\");
		String []  listoffiles= f.list();
		int count = 0;
		
		for(String file:listoffiles) {
			System.out.println(file);
			count++;
		}
		System.out.println("Total count of files:"+ count);
	}
	

}
