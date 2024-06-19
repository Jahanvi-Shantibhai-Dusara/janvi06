package priorityqueue;

import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> q = new PriorityQueue<>();
		
		q.add("jahanvi");
		q.add("Khushi");
		q.add("Avani");
		
		System.out.println(q);
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		
		q1.add(2);
		q1.add(0);
		q1.add(3);
		
		System.out.println(q1);
		
	}

}
