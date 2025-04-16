package com.FileIOHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method Started");
		FileWriter fw = new FileWriter("D:\\FileIOHandling\\Text4\\vinay.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
//		bw.write(100);
//		bw.write(101);;
//		bw.write(104);;
//		bw.write(105)

		bw.append("Good day");
		bw.newLine();
		
		bw.write("Have a nice day");
		bw.write(" Don't call LC Team as bro and sis ,call them with names");
		//bw.append('c');
		bw.flush();
		
		
		
		fw.close();
		bw.close();

	}

}
