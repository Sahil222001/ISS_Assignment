package MultiThreading;
//Using runnable interface
public class ThreadExample implements Runnable {
	public void run() {   //Method run 
		System.out.println("thread is running...");
			for (int i = 1; i <= 10; i++) {
				try {
				System.out.println(i);
				Thread.sleep(2000);  //Each iteration will take place after 2 seconds
				} 
				
				catch (InterruptedException e) {
				}
		 }
	}
		public static void main(String args[]) {
	    ThreadExample te= new ThreadExample();
		Thread mythread = new Thread(te); //Creating Thread object and passing classes object in the thread class
		
		mythread.start(); //starting thread execution
		}
}
