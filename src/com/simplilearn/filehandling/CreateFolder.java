package com.simplilearn.filehandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		createFolder("Bank");
		createFile("Accounts", "C:\\Users\\Lenovo\\eclipse-workspace\\saif-workspace\\java-revision\\Bank");

	}

	private static void createFolder(String folderName) {
		File file = new File(folderName);
		try {
			// create a folder
			boolean response = file.mkdir();
			if (response) {
				System.out.println("Folder is created successfully !");

			} else {
				System.out.println("Folder already exist !");
			}
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	// create file
	private static void createFile(String fileName, String path) {
		File file = new File(path + fileName);

		try {
			boolean response = file.createNewFile();
			if (response) {
				System.out.println("File is created successfully !");

			} else {
				System.out.println("File already exist !");
			}
		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}
}
