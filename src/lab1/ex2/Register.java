package lab1.ex2;

public class Register {
	private Course course;
	private float grade;

	public Register(Course course, float grade) {
		super();
		this.course = course;
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}
	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	
}
