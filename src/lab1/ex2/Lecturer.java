package lab1.ex2;

import java.util.Objects;

public class Lecturer {
	private String name;
	private Date dateOfBirth;
	private String degree;

	public Lecturer(String name, Date dateOfBirth, String degree) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Lecturer [name=" + name + ", dateOfBirth=" + dateOfBirth + ", degree=" + degree + "]";
	}
	
	public static void main(String[] args) {
		Lecturer l1 = new Lecturer("Le Phi Hung", new Date(5, 6, 1987), "Thac Si");
		System.out.println(l1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lecturer other = (Lecturer) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(degree, other.degree)
				&& Objects.equals(name, other.name);
	}

}
