package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoList {

	public static void main(String[] args) {

		List<String> lines = readFileInputlist("data.txt",
				"C:\\Users\\Lenovo\\eclipse-workspace\\saif-workspace\\java-revision\\");

		// print data on console by ready line byline text
		for (String line : lines) {
			System.out.println(line);
		}
	}

	private static List<String> readFileInputlist(String fileName, String path) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(path + fileName), StandardCharsets.UTF_8);

		} catch (Exception e) {
			System.out.println("Exception Ocuured : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		return lines;
	}
}
