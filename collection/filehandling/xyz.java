package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class xyz {
	public static void appendStrToFile(String fileName, String str) {
		try {

			BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
			String file = fileName;
			BufferedReader f = new BufferedReader(new FileReader(file));
			int i;
			String s1 = "";
			while ((i = f.read()) != -1) {
				s1 += (char) i;
			}
			out.write(s1);
			out.write(str);
			out.close();
		}

		catch (IOException e) {

			System.out.println("exception occurred" + e);
		}
	}
	public static void main(String[] args) throws Exception {
		String fileName = "Geek.txt";

		try {

			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

			out.write("Hello World:\n");

			out.close();
		}

		catch (IOException e) {

			System.out.println("Exception Occurred" + e);
		}

		String str = "This is GeeksforGeeks";

		appendStrToFile(fileName, str);

		try {
			BufferedReader in = new BufferedReader(new FileReader("Geek.txt"));

			String mystring;
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		}

		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}
