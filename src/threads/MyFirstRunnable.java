package threads;

public class MyFirstRunnable implements Runnable {

	private String color;
	private String name;

	public MyFirstRunnable(String color, String name) {
		this.color = color;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(color + this.name + "-->" + i);
		}

	}

}
