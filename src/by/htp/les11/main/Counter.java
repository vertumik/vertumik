//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
//свое значение на единицу в заданном диапазоне. 
//Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
//Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. 
//Написать код, демонстрирующий все возможности класса.

package by.htp.les11.main;

public class Counter {
	
	private int min;
	private int max;
	private int value;
	
	Counter(int min, int max, int value){
		this.min = min;
		this.max = max;
		this.value = value;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int increaseValue() {
		if ((min >= 0) && (max <= 100)) {
			value++;
		}
		return value;
	}
	public int decreaseValue() {
		if ((min >= 0) && (max <= 100)) {
			value--;
		}
		return value;
	}
	
}
