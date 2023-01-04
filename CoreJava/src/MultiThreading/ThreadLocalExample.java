package MultiThreading;
//Java ThreadLocal class provides thread-local variables.
//It enables you to create variables that can only be read and write by the same thread. 
//If two threads are executing the same code and that code has a reference to a ThreadLocal variable then the two threads can't see the local variable of each other.

//JavaTpointEample
class ThreadLocalExample {
	 public static class MyRunnable implements Runnable   
	    {  
	        private ThreadLocal<Integer> threadLocal =  new ThreadLocal<Integer>();  
	        public void run() {  
	            threadLocal.set((int)(Math.random()*100));  
	            try   
	            {  
	                Thread.sleep(1000);  
	            } catch (InterruptedException e) {  
	            }  
	            
	            System.out.println(threadLocal.get());  
	        }  
	    }  
	    public static void main(String[] args)   
	    {  
	        MyRunnable r = new MyRunnable();  
	          
	        Thread t1 = new Thread(r);  
	        Thread t2 = new Thread(r);  
	        // this will call run() method   
	        t1.start();  
	        t2.start();  
	    }  
}

//If the access to the set() call had been synchronized and it had not been a ThreadLocal object, the second thread would have overridden the value set by the first thread.
//Since, it is a ThreadLocal object so both the threads cannot see the value of each other. They can set and get different values.