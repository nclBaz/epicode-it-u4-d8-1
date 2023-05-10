package threads;

public class MyFirstThread extends Thread {
	private String color;

	public MyFirstThread(String c) {
		this.color = c;
	}

	@Override
	public void run() { // Questo è il task eseguito dal Thread
		for (int i = 0; i < 10; i++) {
			System.out.println(color + this.getName() + "-->" + i);
		}
	}
}
