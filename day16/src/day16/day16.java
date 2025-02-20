package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class day16 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("Untitled 5");
		printResult(file);

	}

	public static void printResult(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] words = line.split(" ");

		int[] numbers = new int[words.length];

		int i = 0;
		int sum = 0;

		for (String word : words) {
			numbers[i] = Integer.parseInt(word);
			sum = sum + numbers[i];
			i++;
		}

		double sredne = (double) sum / numbers.length;

		System.out.println(sredne + "-->" + (double) Math.round(sredne * 1000d) / 1000d);
	}

}
