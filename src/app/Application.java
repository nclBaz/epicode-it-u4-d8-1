package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import threads.MyFirstRunnable;
import threads.MyFirstThread;

public class Application {
	public static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("CIAO DAL MAIN THREAD");
		MyFirstThread t1 = new MyFirstThread();
		MyFirstThread t2 = new MyFirstThread();
		MyFirstThread t3 = new MyFirstThread();
		Thread t4 = new Thread(new MyFirstRunnable());
		// t1.run();
		// Non bisogna utilizzare run direttamente,
		// altrimenti l'esecuzione avviene sul Thread principale
		t1.setName("THREAD 1");
		t2.setName("THREAD 2");
		t3.setName("THREAD 3");
		t4.setName("AJEJE");

		t1.start();
		try {
			t1.join();
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		t4.start();

		t3.interrupt();
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
