package by.htp.les11.main;

public class Fraction {
	private int numerator;
	private int denominator;

	public void setNumerator(int _numerator) {
		numerator = _numerator;
	}

	public void setDenominator(int _denominator) {
		denominator = _denominator;
	}

	private int findNod() {

		int nod;
		
		nod = Math.min(numerator, denominator);
		while(!(numerator % nod == 0 && denominator % nod == 0)) {
			nod--;
		}
		
		return nod;
	}

	public void sokr() {
		int nod;
		
		nod = findNod();
		
		numerator = numerator/ nod;
		denominator = denominator / nod;

	}
}