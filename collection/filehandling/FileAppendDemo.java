package filehandling;

import java.io.*;
import java.io.PrintWriter;

public class FileAppendDemo {
	public static void main(String args[]) throws IOException {
		apendIntoFile("names.txt", "akshay");
		// in Java 7 you can do it easily using try-with-resource
		// statement as shown below

	}
	static void apendIntoFile(String Filename,String text) {

		try (FileWriter f = new FileWriter(Filename, true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {
			p.print(text);

		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
