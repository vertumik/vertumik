package by.htp.les11.main;

public class StudentStart {

	public static void main(String[] args) {
		
		int size = 10;
		Student[] students = new Student[size];
		
		students[0] = new Student();
		students[0].setName("Ivan");
		students[0].setSurname("Ivanov");
		students[0].setGroupNum("12");
		students[0].setMarks(new int[] {3,4,5,3,4});
		
		students[1] = new Student();
		students[1].setName("Petr");
		students[1].setSurname("Petrov");
		students[1].setGroupNum("12");
		students[1].setMarks(new int[] {4,4,5,5,4});
		
		students[2] = new Student();
		students[2].setName("Sidr");
		students[2].setSurname("Sidorov");
		students[2].setGroupNum("12");
		students[2].setMarks(new int[] {4,4,5,5,4});
		
		students[3] = new Student();
		students[3].setName("Maksim");
		students[3].setSurname("Maksimov");
		students[3].setGroupNum("12");
		students[3].setMarks(new int[] {5,5,5,5,5});
		
		students[4] = new Student();
		students[4].setName("Valentin");
		students[4].setSurname("Valentinov");
		students[4].setGroupNum("12");
		students[4].setMarks(new int[] {4,3,5,5,4});
		
		students[5] = new Student();
		students[5].setName("Roman");
		students[5].setSurname("Romanov");
		students[5].setGroupNum("12");
		students[5].setMarks(new int[] {4,4,5,5,4});
		
		students[6] = new Student();
		students[6].setName("Vassili");
		students[6].setSurname("Vassiljev");
		students[6].setGroupNum("12");
		students[6].setMarks(new int[] {5,5,5,5,5});
		
		students[7] = new Student();
		students[7].setName("Leonid");
		students[7].setSurname("Leonidov");
		students[7].setGroupNum("12");
		students[7].setMarks(new int[] {4,4,5,5,4});
		
		students[8] = new Student();
		students[8].setName("Guss");
		students[8].setSurname("Gusev");
		students[8].setGroupNum("12");
		students[8].setMarks(new int[] {4,4,5,5,4});
		
		students[9] = new Student();
		students[9].setName("Jhon");
		students[9].setSurname("Silver");
		students[9].setGroupNum("12");
		students[9].setMarks(new int[] {5,5,5,5,5});
		
		printStudents(highLevelStudents(students));
		

	}
	
	public static void printStudents(Student[] sts) {
		for (Student student : sts) {
			System.out.println(student.getName() + " " + student.getSurname() + " " + student.getGroupNum());
		}
	}
	
	public static Student[] highLevelStudents(Student[] students){
		Student[] highLevelStudents = new Student[students.length];
		int i = 0;
		for (Student student : students) {
			if (isAStudent(student)) {
				highLevelStudents[i] = student;
				i++;
			}
		}
		
		if (i == students.length) {
			return highLevelStudents;
		}
		
		Student[] result = new Student[i];
		
		for (i = 0; i < result.length; i++) {
			result[i] = highLevelStudents[i];
		}
		return result;
	}
	
	public static boolean isAStudent(Student st) {
		int[] marks;
		marks = st.getMarks();
		for (int mark : marks) {
			if (mark != 5) {
				return false;
			}
		}
		return true;
	}

}
