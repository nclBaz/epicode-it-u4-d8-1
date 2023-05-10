package app;

import threads.MyFirstRunnable;
import threads.MyFirstThread;

public class Application {
	public static void main(String[] args) {
		System.out.println("CIAO DAL MAIN THREAD");
		MyFirstThread t1 = new MyFirstThread(Colors.ANSI_CYAN);
		MyFirstThread t2 = new MyFirstThread(Colors.ANSI_GREEN);
		MyFirstThread t3 = new MyFirstThread(Colors.ANSI_RED);
		Thread t4 = new Thread(new MyFirstRunnable(Colors.ANSI_PURPLE, "THREAD 4"));
		// t1.run();
		// Non bisogna utilizzare run direttamente,
		// altrimenti l'esecuzione avviene sul Thread principale
		t1.setName("THREAD 1");
		t2.setName("THREAD 2");
		t3.setName("THREAD 3");
		t4.setName("AJEJE");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		// t4.start(); <-- NON ESEGUIRE DUE VOLTE LO STESSO THREAD

		// **************** ESEMPIO CON ANONYMOUS CLASS *************

//		new Thread() {
//			public void run() {
//				System.out.println(Colors.ANSI_BLUE + "CIAO DA ANONYMOUS CLASS");
//			}
//		}.start();
//
//		new Thread(new MyFirstRunnable("", "Anonymous")) {
//			public void run() {
//				System.out.println(Colors.ANSI_BLACK + "CIAO DA ANONYMOUS RUNNER");
//			}
//		}.start();

	}
}
