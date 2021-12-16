package multithreading;

public class Multithread {
	public static void main(String[] args) {
		int n = 8;
		for(int i=0; i<n; i++) {
			MultithreadingDemo object = 
					new MultithreadingDemo();
			object.start();
		}
	}
}

