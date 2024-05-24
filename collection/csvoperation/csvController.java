package csvoperation;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class csvController {
public static void main(String[] args) {

	List<Employee> list =csv.addToList() ;
	/*String loc = list.get(0).birthdate;
	String date[] = loc.split("-");
	LocalDate bdate = LocalDate.parse(date[2] + "-" + date[1] + "-" + date[0]);
	LocalDate cur = LocalDate.now();
	int age = Period.between(bdate, cur).getYears();
	System.out.println(list.get(0).name);
	System.out.println(list.get(0).salary);
	System.out.println(age);
	*/

	Scanner sc = new Scanner(System.in);
	int key=0;
	int next=0;
	do {
		System.out.println("------------------------------------------------");
		System.out.println("1.add next");

		System.out.println("2.add 100 in bulk");

		System.out.println("3.add 100 in parallel");

		System.out.println("4.check Balance");
		System.out.println("enter your choice:");

	key = sc.nextInt();
	switch (key) {
	case 1:
		String loc = list.get(next).birthdate;
		String date[] = loc.split("-");
		LocalDate bdate = LocalDate.parse(date[2] + "-" + date[1] + "-" + date[0]);
		LocalDate cur = LocalDate.now();
		int age = Period.between(bdate, cur).getYears();
		System.out.println(list.get(next).name);
		System.out.println(list.get(next).salary);
		System.out.println(age);
		System.out.println(next);
		next++;
		break;
	case 2:
		
		break;
	case 3:
		
		break;

	default:
		break;
	}

}while(key>0);
}}
