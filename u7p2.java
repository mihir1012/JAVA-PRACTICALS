// A correct implementation of a producer and consumer.
class Q {
	//int n;
	int a[]=new int[3];
	static int c;
	Q()
	{
		c=0;
	}
	boolean valueSet = false;
	synchronized int get() {
		while(!valueSet)
			try {
				wait();
			}	 	
			catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		
		
		if(c == 0)
		{
			valueSet=false;
			notify();
			return 0;
		}
		else
		{
			System.out.println("Got: " + a[--c]);
			notify();
			return a[c];

		}
	}
	synchronized void put(int n) {
		while(valueSet)
		{try {
			wait();
		}	 
		catch(InterruptedException e) {
			System.out.println("InterruptedException caught");
		}}
		if( c== 3)
		{
			valueSet = true;
			notify();
		}
		if(c!=3){
			
			this.a[c] = n;
			System.out.println("Put: " + a[c++]);
			notify();
			
		}		
}
}

class Producer implements Runnable {
	Q q;
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i = 0;
	while(true) {
		q.put(i++);
		}
	}
}
class Consumer implements Runnable {
	Q q;
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
class u7p2 {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
