package lab1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private Date dateOfBirth;
	private Lecturer assistant;
	private List<Register> courseRegs;
	
	public Student(String name, Date dateOfBirth, Lecturer assistant) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.assistant = assistant;
		this.courseRegs = new ArrayList<Register>();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", assistant=" + assistant + ", courseRegs="
				+ courseRegs + "]";
	}
	
	public void register(Course c) {
		if (getCourseReg(c) != null)
			return;
		this.courseRegs.add(new Register(c, 0));
	}
	

	public void updateGrade(Course c, float grade) {
		Register r = getCourseReg(c);
		if (r != null)
			r.setGrade(grade);
	}
	
	public float averageOfGrade() {
		float result = 0;
		int totalCredit = 0;
		for (Register r : this.courseRegs) {
			result += r.getGrade() * r.getCourse().getCredits();
			totalCredit += r.getCourse().getCredits();
		}
		result = result / totalCredit;
		return result;
	}
	
	public String rank() {
		float avg = averageOfGrade();
		if (avg >= 9)
			return "Xuat Sac";
		if (avg >= 8)
			return "Gioi";
		if (avg >= 7)
			return "Kha";
		if (avg >= 6)
			return "Trung Binh Kha";
		if (avg >= 5)
			return "Trung Binh";
		return "Khong duoc xet tot nghiep";
	}
	
	public void printGradeReport() {
		System.out.printf("Ho ten: %s\n", name);
		System.out.printf("Ngay sinh: %s\n", dateOfBirth.toString());
		System.out.printf("STT\t\t\tMon\t\tDiem\n");
		for (int i = 0; i < this.courseRegs.size(); i++) {
			System.out.printf("%d\t\t\t%s\t\t%.1f\n", i+1, this.courseRegs.get(i).getCourse().getName(), this.courseRegs.get(i).getGrade());
		}
		System.out.printf("Diem TB: %.1f\n", averageOfGrade());
		System.out.printf("Xep loai: %s\n", rank());		
	}
	
	private Register getCourseReg(Course c) {
		for (Register r : this.courseRegs)
			if (r.getCourse().equals(c))
				return r;
		return null;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("A", new Date(0,0,0), null);
		Course c1 = new Course("OOP", 4, null);
		s1.register(c1);
		s1.updateGrade(c1, 10f);
		s1.printGradeReport();
	}
}
