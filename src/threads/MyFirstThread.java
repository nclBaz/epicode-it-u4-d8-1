package threads;

import app.Application;

public class MyFirstThread extends Thread {

	@Override
	public void run() { // Questo è il task eseguito dal Thread
		for (int i = 0; i < 10; i++) {
			Application.logger.info("" + i);
			// System.out.println(color + this.getName() + "-->" + i);
		}
	}
}
