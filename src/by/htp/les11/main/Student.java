//Создать класс студент с полями имя, фимилия и с массивом, содержащим 5 оценок студента. 
//Написать set- get методы инициализации полей экземпляра класса, а также метод, 
//определяющий среднюю арифметическое оценок студента. 
//Создать объект класса, вызвать методы инициализации, 
//вызвать метод определение средней оцценки студента.

package by.htp.les11.main;

public class Student {
	private String name;
	private String surname;
	private String groupNum;
	private int[] marks = new int[5];
	
	public void setGroupNum (String groupNum) {
		this.groupNum = groupNum;
	}
	
	public String getGroupNum() {
		return groupNum;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setSurname (String surname) {
		this.surname = surname;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
		}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int[] getMarks() {
		return marks;
	}

}
