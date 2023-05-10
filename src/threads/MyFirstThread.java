package threads;

import app.Application;

public class MyFirstThread extends Thread {

	@Override
	public void run() { // Questo è il task eseguito dal Thread
		for (int i = 0; i < 10; i++) {
			Application.logger.info("" + i);
			// System.out.println(color + this.getName() + "-->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Application.logger.error(getName());
			}
		}
	}
}
