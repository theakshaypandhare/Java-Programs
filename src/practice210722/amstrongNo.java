package practice210722;

public class amstrongNo {
public static void main(String[] args) {
	int num=1634;
	int numm=num;
	int count=0;
	while (num>0) {
	count++;
		num=num/10;
//		System.out.println(num);
	}
	System.out.println(count);
	double sum=0;
	while (numm>0) {
		int dig=numm%10;
		sum=sum+Math.pow(dig, count);
		numm=numm/10;
	}
	System.out.println(sum);
	
}
}
