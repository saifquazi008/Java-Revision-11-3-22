package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CreateNewFileDemo {

	public static void main(String[] args) {
		createFile("data.txt");
		createFileFOS("testdata.txt");
	}

	// create file using File class
	private static void createFile(String fileName) {
		// file
		File file = new File(fileName);
		try {
			// create file
			boolean response = file.createNewFile();
			if (response) {
				System.out.println("File is created successfully !");

			} else {
				System.out.println("File already exist !");
			}
			// Write content to file -> FileWriter -> Character stream
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Today is a good day !");
			fileWriter.append("\nToday is a wonderful day !");
			fileWriter.close();
			System.out.println("Operation is completed !");
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	// create file using FileOutStream class
	private static void createFileFOS(String fileName) {
		try {
			String data = "Today is a good day !";
			FileOutputStream out = new FileOutputStream(fileName);
			// write data with output stream
			out.write(data.getBytes());
			out.close();
			System.out.println("File is created and data is written !");
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
