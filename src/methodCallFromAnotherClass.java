
public class methodCallFromAnotherClass {
	public static void main(String[] args) {
int sum=0;
		System.out.println("start--------------------------------------------------");
		for (int i = 1; i <10; i++) {
			int res=primeNO_Palindrome_user_choice_usingMethodd.prime(i);
			System.out.println(res);
			sum=sum+res;
		}

		System.out.println(sum);
		System.out.println("end--------------------------------------------------");
	}

}
