package multithreading;

public class MultithreadingDemo extends Thread {

	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId()
					+" is running");
		} catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}