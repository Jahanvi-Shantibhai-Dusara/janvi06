package interthreadcommunication;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);


	}

}
