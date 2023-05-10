package concurrency;

import threads.CountdownThread;

public class ConcurrencyMain {

	public static void main(String[] args) {
		Countdown c = new Countdown();
		CountdownThread t1 = new CountdownThread(c);
		CountdownThread t2 = new CountdownThread(c);

		t1.start();
		t2.start();

	}

}
