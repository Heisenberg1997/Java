package student;

import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student students[];
		StudentClass aClass = new StudentClass("ruanjina" , 5);
		students = new Student[aClass.getSize()];
		for(int i =0; i<aClass.getSize();i++) {
			students[i] = new Student (getAStudent(i+1));
			System.out.print("00000");
			
		}
		aClass.setStudents(students);
		String sss = aClass.toString();
		System.out.println(sss);
		try {
			FileOutputStream fo = new FileOutputStream("stu.ser");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			for(Student s : students) {
				so.writeObject(s);
			}
			so.close();
		}
		catch (Exception e) {
			System.out.println("jkjkjkjkjk");
		}
	}
	
	public static Student getAStudent(int i) {
		Student studenti;
		/*Scanner sc = null ;
		sc = new Scanner(System.in);
		String id = sc.next();
		String name = sc.next();
		int eng = Integer.valueOf(sc.next().toString()).intValue();
		int math = Integer.valueOf(sc.next().toString()).intValue();
		int comp = Integer.valueOf(sc.next().toString()).intValue();
		studenti =new Student(id,name,eng,math,comp, 0);
		sc.close();*/
		String id = Keyboard.getString();
		String name = Keyboard.getString();
		int eng = Keyboard.getInteger();
		int math = Keyboard.getInteger();
		int comp = Keyboard.getInteger();
		studenti = new Student(id,name,eng,math,comp,0);
		return studenti;
			
		}

}
