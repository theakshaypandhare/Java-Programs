package filehandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
public static void main(String[] args) throws IOException {
	String file = "E:\\abcd.txt";
	FileReader f = new FileReader("E:\\abc.txt");
	int i;
	String s1 = "";
	while ((i = f.read()) != -1) {
		s1 += (char) i;
	}
		FileWriter fw3 = new FileWriter(file);
		String ss=s1.replaceAll("Welcome to java", "welcome to python");
		fw3.write(ss);
		fw3.flush();
		System.out.println(ss);
}
}


