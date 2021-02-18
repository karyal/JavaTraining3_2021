package unit4_collections.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void f1() {
		Queue<String> pqueue = new PriorityQueue<>(); 
		pqueue.add("SUN");
		pqueue.add("MON");
		pqueue.add("TUE");
		pqueue.add("WED");
		pqueue.add("THU");
		pqueue.add("FRI");
		pqueue.add("SAT");
		System.out.println(pqueue.size());
		pqueue.remove();
		System.out.println(pqueue.size());
	}
	public static void print(Queue queue) {
		for(Object item : queue) {
			System.out.print(item+", ");
		}
		System.out.println();
	}
	public static void f2() {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("SUN");
		queue.add("MON");
		queue.add("TUE");
		queue.add("WED");
		queue.add("THU");
		queue.add("FRI");
		queue.add("SAT");
		System.out.println(queue.size());
		print(queue);				
		//System.out.println(queue.size());
		queue.poll();
		print(queue);
		queue.remove();
		print(queue);
		queue.remove("SUN");
		print(queue);
	}
	
	public static void main(String[] args) {
		f2();
	}
	
}