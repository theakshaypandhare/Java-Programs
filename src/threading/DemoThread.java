package threading;

public class DemoThread extends Thread {
@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		
		System.out.println("hiii");
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
