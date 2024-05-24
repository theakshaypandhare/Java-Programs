
public class equal {

	public static void main(String[] args) {
		String e1=new String("JAVA");
		String e2=new String("JAVA");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e1.equals(e2));
	}
	@Override
		public boolean equals(Object obj) {
		System.out.println(obj.hashCode());
			// TODO Auto-generated method stub
			return (this  == obj);
		}
		
}
