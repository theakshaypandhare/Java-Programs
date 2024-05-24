
public class InitializeInstanceVeriable {
int a=434;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public static void main(String[] args) {
	InitializeInstanceVeriable i=new InitializeInstanceVeriable();
	i.setA(234);
	System.out.println(i.getA());
}
}
