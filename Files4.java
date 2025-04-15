package com.FileIOHandling;

import java.io.FileReader;
import java.io.IOException;

public class Files4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Main Method is Started");
		FileReader fr = new FileReader("D:\\FileIOHandling\\Text4\\vinay.txt");
		int i =fr.read();//Reads a single character
		
		while(i!=-1) {
			System.out.println((char)i);
			Thread.sleep(500);
			i=fr.read();
		}
		
		

	}

}
