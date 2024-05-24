package TestVagrant;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{

		ArrayList a=new ArrayList();
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Question ID");
			int question_id=s.nextInt();
			System.out.println("Enter Quetion Description");
			String question_des=s.nextLine();
			s.nextLine();
			question_des=s.nextLine();
			System.out.println("Enter the Number of Years and then Enter Years");
			int size=s.nextInt();
			int[] year=new int[size];
			for(int j=0;j<year.length;j++)
			{
				year[j]=s.nextInt();
			}
			System.out.println("Enter the Concept");
			s.nextLine();
			String concept=s.nextLine();
			a.add(new QuestionDetails(question_id, question_des, year, concept));
		}
		System.out.println("The Choices are");
		System.out.println("1.Get quetion from a particular year");
		System.out.println("2.Get the max repeated concept");
		int choice=s.nextInt();
		switch (choice) 
		{
		case 1:
		{
			System.out.println("Enter the year");
			int year=s.nextInt();
			ArrayList<String> res=QuestionDetails.getMaxQuestion(year, a);
			for(int i=0;i<res.size();i++)
			{
				System.out.println(res.get(i));
			}
			break;
		}
		case 2:
			System.out.println(QuestionDetails.getMaxConcept(a));
			break;	
		}
		
	}
	
	
}
