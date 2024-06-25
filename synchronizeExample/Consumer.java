package synchronizeExample;

public class Consumer extends Thread {
	Q obj1; 

	public Consumer(Q obj) {
		this.obj1 = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj1.get();
		}
	}
}
