package app;

import threads.MyFirstThread;

public class Application {
	public static void main(String[] args) {
		System.out.println("CIAO DAL MAIN THREAD");
		MyFirstThread t1 = new MyFirstThread(Colors.ANSI_CYAN);
		MyFirstThread t2 = new MyFirstThread(Colors.ANSI_GREEN);
		MyFirstThread t3 = new MyFirstThread(Colors.ANSI_RED);
		// t1.run();
		// Non bisogna utilizzare run direttamente,
		// altrimenti l'esecuzione avviene sul Thread principale
		t1.setName("THREAD 1");
		t2.setName("THREAD 2");
		t3.setName("THREAD 3");

		t1.start();
		t2.start();
		t3.start();
	}
}
