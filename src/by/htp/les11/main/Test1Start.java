package by.htp.les11.main;

public class Test1Start {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.setA(9);
		t1.setB(5);
		int x = t1.max();
		int y = t1.sum();
		t1.print();
		System.out.println("максимальное число: " + x + " сумма чисел: " + y);

	}

}
