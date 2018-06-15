package student;
import java.io.*;
public class Student implements Serializable {
	private String name;
	private String id;
	private int eng;
	private int math;
	private int comp;
	private int sum;
	
	public Student (String id,String name,int eng,int math,int comp,int sum) {
		this.id = id;
		this.name = name ;
		this.eng = eng;
		this.math =  math;
		this.comp = comp;
		this.sum = sum;
	}
	public Student(Student s) {
		this.sum=s.sum;
		this.id=s.id;
		this.name = s.name;
		this.eng = s.eng;
		this.comp = s.comp;
		this.math = s.math;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setMath(int math) {
		this.math = math;
		sum();
	}
	public void setComp(int comp) {
		this.comp = comp;
		sum();
	}
	public void setSum(int sum) {
		this.sum = sum;
		sum();
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	public int getComp() {
		return comp;
	}
	void sum() {
		this.sum = math+eng+comp;
	}
	@Override
	public String toString () {
		return getId() + "\t" + getName() + "\t" + getEng()+ "\t" + getMath() + "\t" + getComp(); 
	}
	
}

