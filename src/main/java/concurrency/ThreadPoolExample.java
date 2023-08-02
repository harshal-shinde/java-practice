package concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {
	private String name;
	
	public Task(String s) {
		name =s;
	}
	
	
	//Prints task name and sleeps for 1s
	//This whole process is repeated 5 times
	
	public void run() {
		try {
			for(int i=0; i < 5; i++) {
				if(i ==0) {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initilization time for " + " Task Name -" +name+ " = " +ft.format(d));
					//Prints the initialization time for every tasks
				} else {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing time for task name - " + name +"="+ft.format(d));
					//print the execution task
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " Complete");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadPoolExample {
	//Maximum number of threads in thread pool
	static final int MAX_T = 4;
	
	public static void main(String[] args) {
		//Create five task
		Runnable r1 = new Task("task 1");
		Runnable r2 = new Task("task 2");
		Runnable r3 = new Task("task 3");
		Runnable r4 = new Task("task 4");
		Runnable r5 = new Task("task 5");
		
		//Create thread pool  with MAX_T
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		//Pass those tasks to pool
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
		
	}
}
