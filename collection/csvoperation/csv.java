package csvoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class csv {

	public static List<Employee> addToList() {
		List<Employee> list = new ArrayList<>();
		String file = "E:\\10001.csv";
		try {
			BufferedReader b = new BufferedReader(new FileReader(file));
			String line = b.readLine();
			while (line != null) {
				String s = b.readLine();
				if (s == null) {
					break;
				} else {
					String[] emp = s.split(",");
					list.add(retriveEmp(emp));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static Employee retriveEmp(String[] arr) {
		String name = arr[0];
		String birthdate = arr[1];
		double salary = Double.parseDouble(arr[2]);

		return new Employee(name, birthdate, salary);
	}

	
}
