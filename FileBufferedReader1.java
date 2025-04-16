package com.FileIOHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReader1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main methog is started");
		FileReader fr = new FileReader("D:\\FileIOHandling\\Text4\\vinay.txt");
		BufferedReader br = new BufferedReader(fr);


		try {

			String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
			
		}finally {
		fr.close();
		br.close();
		}
	}

}
