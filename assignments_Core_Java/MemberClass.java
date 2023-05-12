package assignments_Core_Java;

class Member {
	int DataMembers;
	String Name;
	int age;
	long PhoneNumber;
	String Address;
	int salary;
	
	public void printSalary(int salary) {
		this.salary = salary;
		System.out.println("Salary is "+salary);
	}
}

public class MemberClass {
	public static void main(String[] args) {
		Member mb = new Member();
		mb.printSalary(10000);
	}
}
