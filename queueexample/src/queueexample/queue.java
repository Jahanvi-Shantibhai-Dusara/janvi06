package queueexample;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<>();
		
		q.add("jahanvi");
		q.add("Khushi");
		q.add("Avani");
		
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
	}

}
