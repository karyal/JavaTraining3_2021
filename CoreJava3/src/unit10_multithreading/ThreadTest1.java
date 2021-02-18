package unit10_multithreading;

public class ThreadTest1 {
	public static void main(String[] args) {
		//i loop
		for(int i = 1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();

		//j loop
		for(int j = 1; j<=100; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
