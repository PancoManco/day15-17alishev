package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class day15 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("Untitled 2");
		Scanner scanner = new Scanner(file);
		PrintWriter pw = new PrintWriter("Untitled 4");

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			// System.out.println(line);
			String[] words = line.split(";");

			if (Integer.parseInt(words[2]) <= 0) {
				pw.println(line.replace(";", ","));
				// System.out.println(line.replace(";", ","));

			}

		}
		pw.close();
		scanner.close();
	}

}
