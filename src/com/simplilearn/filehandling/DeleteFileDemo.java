package com.simplilearn.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	public static void main(String[] args) {

		deleteFile("data.txt", "C:\\Users\\Lenovo\\eclipse-workspace\\saif-workspace\\java-revision\\");

	}

	private static void deleteFile(String fileName, String path) {
		// delete File

		try {
			Files.delete(Paths.get(path + fileName));
			System.out.println("File is deleted successfully  ! ");
		} catch (Exception e) {
			System.out.println("File Not Found Exception !");
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

}
