package override;

public class fatherSonHabbit {
	void eat() {
	System.out.println("food");
	}
	void dirnk()
	{
		System.out.println("watwe");
	}
 public static void main(String[] args) {
			son s=new son();
			s.dirnk();
			s.eat();
			}	
}
class son extends fatherSonHabbit
{
	 @Override
	void dirnk() {
		System.out.println("juice");
	}
	
	 
}

