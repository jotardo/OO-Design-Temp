package lab2;

public class Test {
	public static void main(String[] args) {
		Customer rc1 = new ResidentalCustomer(66, "Do Hung Son", "99/9 KP9 Thu Duc");
		Customer rc2 = new ResidentalCustomer(74, "Nguyen Vu Quynh Anh", "25/7 KP1 Tan Hoa");
		Customer bc1 = new BusinessCustomer(11, "ABC Corp", "55/7 Quan Go Vap", 31564858238l);
		System.out.println(rc1);
		System.out.println(rc2);
		System.out.println(bc1);
	}
}
