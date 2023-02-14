package lab1.ex2;

import java.util.Objects;

public class Course {
	
	private String name;
	private int credits;
	private Lecturer lecture;
	
	public int getCredits() {
		return credits;
	}
	
	public String getName() {
		return name;
	}

	public Course(String name, int credits, Lecturer lecture) {
		super();
		this.name = name;
		this.credits = credits;
		this.lecture = lecture;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", lecture=" + lecture + "]";
	}
	
	public static void main(String[] args) {
		Lecturer tvt = new Lecturer("Thai Van Ton", new Date(6, 7, 1994), "Cu nhan");
		Course c1 = new Course("Vat ly 2", 2, tvt);
		System.out.println(c1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return credits == other.credits && Objects.equals(lecture, other.lecture) && Objects.equals(name, other.name);
	}
	
}
