package day16_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day16_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// рандомные числа 12 штук
		File file = new File("file1.txt");
		PrintWriter pw = new PrintWriter(file);

		// среднее арифметическое по 4 пары из 12 штук
		File file1 = new File("file2.txt");
		PrintWriter pw1 = new PrintWriter(file1);

		int[] numbers = new int[12];
		Random rand = new Random();

		int sum = 0;
		double[] sredne = new double[3];

		for (int i = 0; i < 12; i++) {

			numbers[i] = rand.nextInt(100);
			pw.print(numbers[i] + " ");

		}

		int index = 0;
		for (int i = 0; i < 12; i = i + 4) {

			for (int j = i; j < i + 4; j++) {

				sum = sum + numbers[j];
			}
			sredne[index] = sum / 4;
			index++;
			sum = 0;

		}

		for (int i = 0; i < sredne.length; i++) {
			pw1.print(sredne[i] + " ");
		}

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(sredne));

		file.createNewFile();
		file1.createNewFile();

		pw.close();
		pw1.close();
		printfile(file1);
	}

	public static void printfile(File file) throws FileNotFoundException {

		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] words = line.split(" ");

		double[] numbers = new double[words.length];

		int i = 0;
		int sum = 0;

		for (String word : words) {
			numbers[i] = Double.parseDouble(word);
			sum = (int) (sum + numbers[i]);
			i++;
		}

		System.out.println((int) sum);

	}

}
