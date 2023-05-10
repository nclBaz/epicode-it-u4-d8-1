package threads;

import app.Application;

public class MyFirstRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Application.logger.info("" + i);
//			System.out.println(color + this.name + "-->" + i);
		}

	}

}
