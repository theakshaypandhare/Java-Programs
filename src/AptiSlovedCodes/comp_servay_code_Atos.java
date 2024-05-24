package AptiSlovedCodes;
import java.util.Scanner;

public class comp_servay_code_Atos {
	public void servey(int input1, int input2, int input3, int input4[]) {
		Scanner sc = new Scanner(System.in);
		input4 = new int[input1];
		System.out.println("enter " + input1 + " values");
		for (int i = 0; i < input4.length; i++) {
			input4[i] = sc.nextInt();
		}
		if (input4[0] < input4[input4.length-1])
		{
		System.out.println(input3/input2+","+input4[input3-1]);
		}
		else
		{
			System.out.println(input3/input2+","+input4[input4.length-input3]);
		}
	}

	public static void main(String[] args) {
		comp_servay_code_Atos c = new comp_servay_code_Atos();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		c.servey(sc.nextInt(), sc.nextInt(),sc.nextInt(), null);
	}
}
