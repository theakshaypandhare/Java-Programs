//19may..
/*
package ArrayListt;
import java.util.ArrayList;
public class A6 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		a.remove(2); //remove(int index)
		System.out.println(a);
	}
}*/

//==============================================================================//
package ArrayList;
import java.util.ArrayList;
/*
* add names of famous actors
*and remove a name from the list
*/
public class A6
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("prabhas");
		a.add("yash");
		a.add("srk");
		a.add("maheshbabu");
		
		System.out.println(a);
		a.remove("srk");
		System.out.println(a);

		
	}
}