
public class pgm16 {
public static void main(String[] args) {
	int sum=0,prod=1;
	for (int i = 20; i <=120; i++) {
		if (i%2==0) {
			sum=sum+i;
		}
		else {
			prod=prod*i;
		}
	}
	System.out.println(sum);
	System.out.println(prod);
}
}
