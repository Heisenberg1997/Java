package student;

public class StudentClass {
	private String name;
	private Student students[];
	private int size;
	static int captical = 40;//班级容量
	
	public StudentClass(String name,int size) {
		this.name = name;
		this.size = size;
	}
	public String getName()
{
		return name;
}
	public int getSize() {
		return size;
	}
	public Student[] getStudent() {
		return students;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		if(size > captical) {
			System.out.println("size 为" + size +", 不能超过" + captical);
		}
	}
	public void setCaptical(int captical) {
		this.captical = captical;
	}
	
	public void setStudents(Student...students) {
		for(int i =0; i<size;i++) {
			this.students[i] = new Student(students[i]);
		}
	}
}
