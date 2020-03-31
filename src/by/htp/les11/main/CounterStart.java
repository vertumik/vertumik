package by.htp.les11.main;

public class CounterStart {

	public static void main(String[] args) {
		
		Counter count = new Counter(0, 100, 0);
		int val = count.increaseValue();
		System.out.println(val);
		val = count.decreaseValue();
		System.out.println(val);
		

	}

}
