package MultiThreading;
//Volatile keyword is used to modify the value of a variable by different threads. It is also used to make classes thread safe. It means that multiple threads can use a method and instance of the classes at the same time without any problem. The volatile keyword can be used either with primitive type or objects.
//The volatile variables are always visible to other threads.

class VolatileKeywordExample extends Thread {
	private int val;
	
	VolatileKeywordExample(String name, int value) {
		super(name);
		this.val = value;
	}
	
	
	private volatile boolean exit = false; //Volatile can only be applied to instance variables, which are of type object or private 
	
	public void stopThread() {
		if (val == 0) {
		exit = true;
	    }
	}
	
	
	public void run() {
		while (!exit) {
			System.out.println(Thread.currentThread().getName() + " Thread is running");
			while (val != 0) {
				System.out.println("Value is:" + val);
				val--;
			}
			stopThread();
		}
	System.out.println("Thread stopped");
	
	}
	
	
	public static void main(String[] args) {
		int val = 5;
		VolatileKeywordExample t1 = new VolatileKeywordExample("SahilThread1", val);
		t1.start();
	}
}
