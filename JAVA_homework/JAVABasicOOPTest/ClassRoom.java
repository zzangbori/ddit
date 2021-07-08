public class ClassRoom {
	private int classNumber;
	private Student[] students = new Student[5];
	private Teacher teacher;
	private int totalStudent;
	
	public ClassRoom(int classNumber, Teacher teacher) {
	}
	
	public int getClassNumber() {
	}
	
	public boolean addStudent(Student student) {
		try {
		}catch (ArrayIndexOutOfBoundsException e) {
		}
	}
	
	public void showClassInfo() {
	}
	
	public void showStudentInfo(Human human, int index) {
		try {
		}catch (NotTeacherException e) {
		}catch (NotConfirmException e) {
		}catch (ArrayIndexOutOfBoundsException e) {
		}
	}
}
