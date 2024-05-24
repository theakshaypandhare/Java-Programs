package ImportantPrograms;

public class PallendromNumber {
public static void main(String[] args) {
	int num=121;
	int rev=0;
int temp=num;
while (num>0) {
	int dig=num%10;
	System.out.println(dig);
	rev=rev*10+dig;
	num=num/10;
}
System.out.println(rev);
if (rev==temp) 
	System.out.println("pallendrom");
else
	System.out.println("not pallendrom");
}
}
