package threads;

import concurrency.Countdown;

public class CountdownThread extends Thread {
	private Countdown c;

	public CountdownThread(Countdown c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.doCountdown();
	}

}
