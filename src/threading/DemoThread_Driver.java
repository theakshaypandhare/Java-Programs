package threading;

public class DemoThread_Driver {
public static void main(String[] args) {
	DemoThread d=new DemoThread();
	d.start();
	for (int i = 0; i < 5; i++) {
		System.out.println("main");
		try {
			d.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
}
