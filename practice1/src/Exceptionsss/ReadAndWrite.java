package Exceptionsss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}

	void saveFile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d:/abc.txt");
	}
}

class Test11 {
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			rw.saveFile();
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("hello");
	}
}