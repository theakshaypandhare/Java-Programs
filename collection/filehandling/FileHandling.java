package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling {
	public static void main(String[] args) throws IOException {
		String file = "E:\\abcd.txt";
		// way 1
		FileReader f = new FileReader("E:\\abc.txt");
		int i;
		String s1 = "";
		while ((i = f.read()) != -1) {
			s1 += (char) i;
		}
		System.out.println(s1);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("1. uppercase");
		System.out.println("2. LowerCase");
		System.out.println("3. Each first word uppercase");

		int key;
		do {
			key = sc1.nextInt();
			switch (key) {
			case 1:
				FileWriter fw = new FileWriter(file);
				fw.write(s1.toUpperCase());
				fw.flush();
				System.out.println(s1.toUpperCase());
				break;
			case 2:
				FileWriter fw1 = new FileWriter(file);
				fw1.write(s1.toLowerCase());
				fw1.flush();
				System.out.println(s1.toLowerCase());
				break;
			case 3:
				FileWriter fw2 = new FileWriter(file);
				String[] strr = s1.split(" ");
				String cap = "";
				for (int i1 = 0; i1 < strr.length; i1++) {
					cap += strr[i1].substring(0, 1).toUpperCase() + strr[i1].substring(1) + " ";
				}
				fw2.write(cap);
				fw2.flush();
				System.out.println(cap);
				break;
			default:
				System.out.println("wrong input");
				break;
			}

		} while (i < 0);
	}
}
