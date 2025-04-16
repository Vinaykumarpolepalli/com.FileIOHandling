package com.FileIOHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinterWriter1 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main method is Started");
		PrintWriter pw = new PrintWriter("D:\\FileIOHandling\\Text4\\vinay1.txt");
		pw.println("J2SE");
		pw.println("J2EE");
		pw.println("Frameworks");
		pw.println("Spring");
		pw.println("Spring Boot");
		pw.println(100);
		pw.println(1000L);
		pw.println(true);
		pw.println("A");
		pw.println(56.80);
		
		
		pw.flush();
		pw.close();
		
		//Assignment 
		//Write a program to write the content to the file name it as A(Printwriter)
		//Write a program to Write the content to the file name it as B(PrintWriter)
		//Read the content from A and B store it into C file(BufferReader)
		
	}

}
