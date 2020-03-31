package by.htp.les11.main;

public class Test1 {
	
	private int a;
	private int b;
	
	public void setA (int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setB (int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
	public void print() {
		System.out.println("a = " + a + ", b = " + b);
	}
	
	public int sum() {
		int sum;
		sum = a + b;
		return sum;
	}
	
	public int max() {
		int max;
		max = Math.max(a, b);
		return max;
	}

}
