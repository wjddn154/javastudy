package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		FileInputStream is = null;
		
		try {
			in = new FileReader("1234.txt");
			
			int count = 0;
			int data = -1;
			while((data=in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("");
			System.out.println("count : "  + count);
			System.out.println("==============================================");
			
			count = 0;
			data = -1;
			is = new FileInputStream("1234.txt");
			while((data=is.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("");
			System.out.println("count : "  + count);

			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FIle Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
