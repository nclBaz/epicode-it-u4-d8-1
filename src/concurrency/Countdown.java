package concurrency;

import app.Application;

public class Countdown {
	private int i;

	public synchronized void doCountdown() {
		for (i = 100; i > 0; i--) {
			Application.logger.info("i= " + i);
		}
	}
}
