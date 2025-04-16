package com.FileIOHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String username = "Admin";
	transient String password = "Admi@123";

}

public class FileSerialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Main method is Started");
		Employee e = new Employee();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("D:\\FileIOHandling\\Text4\\vinay2ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		
		
		//deserialization
		FileInputStream fis = new FileInputStream("D:\\FileIOHandling\\Text4\\vinay2ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 = (Employee) ois.readObject();
		
		System.out.println("Username:"+e1.username);
		System.out.println("Password:"+e1.password);
		
		ois.close();
		oos.close();
		
	}

}
