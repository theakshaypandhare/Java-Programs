public class sum_Usingreturn {
 public static void main(String[] args) {
	int res=sum(10,30);
//	sys
//	even(res);
	int res1=sum(10,30);
	even(res1);
	
}
 public static int sum(int a,int b)
 {
	 int c=a+b;
	 return c;
 }
 public static void even(int a)
 {
	 if(a%2==0)
		 System.out.println("even");
	 else
		 System.out.println("odd");
 }
}

