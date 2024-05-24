
public class PositiveNegativeOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
a=-11;
if (a>0 && a%2==0) //f
{
System.out.println("number is positive even");
	
} 
else if(a>0&&a%2!=0)//f
{
System.out.println("number is positve odd");
}
else if (a<0 && a%2==0)//f
{
	System.out.println("number is negative even");
	
} 
else if(a<0 && a%2!=0)//t
{
System.out.println("number is neagative odd");
}	
else
	{
		System.out.println("zero");
	}
	

}
}