
public class GreaterValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=55410,b=4553,c=1552,d=66,e=546;
		int res=a>b?(a>c?(a>d?(a>e?a:e):d):(c>d?(c>e?c:e):d)):(b>c?(b>d?(b>e?b:e):(d>e?d:e)):c);
System.out.println(res);
	}

}
