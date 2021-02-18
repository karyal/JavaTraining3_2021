package unit10_multithreading;

class MyThread3 extends Thread{

	public MyThread3(String name) {
		super(name);
	}
	public void run(){

		for(int i=1; i<=100; i++) {
			System.out.println(this.getName()+" = "+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}

public class MyThread4 {
	public static void main(String[] args) {
		MyThread3 obj1 = new MyThread3("thread-1");
		MyThread3 obj2 = new MyThread3("thread-2");
		obj1.start();
		obj2.start();		
	}
}