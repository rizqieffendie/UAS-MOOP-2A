
class RunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;

	public RunnableDemo(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Running " + threadName);
	
	try {
		for (int i = 4; i > 0; i--) {
			System.out.println("Thread : " + threadName + ", "+i);
		}
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println("Thread " + threadName + "interrupted.");
		System.out.println("Thread "+ threadName + "exiting.");
	}
	}
	

	public void start() {
		System.out.println("Starting " + threadName);
		if (t==null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			RunnableDemo R1 = new RunnableDemo("Thread - 1");
			R1.start();
			
			RunnableDemo R2 = new RunnableDemo("Thread - 2");
			R2.start();
		}
	
	}
	
//	@Override
	


