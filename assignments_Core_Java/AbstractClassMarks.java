package assignments_Core_Java;

import java.util.Scanner;

abstract class Marks{
	abstract public double getPercentage();
}

class StudentA extends Marks{
	int sub1;
	int sub2;
	int sub3;
	
	public StudentA(int sub1,int sub2,int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public double getPercentage() {
		return (sub1+sub2+sub3)/3;
	}
}

class StudentB extends Marks{
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	
	public StudentB(int sub1,int sub2,int sub3,int sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	
	
	public double getPercentage() {
		return (sub1+sub2+sub3+sub4)/4;
	}
}


public class AbstractClassMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks For Student A : ");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		StudentA sa = new StudentA(sub1,sub2,sub3);
		System.out.println("Percentage of Sudent A is = "+sa.getPercentage());
		System.out.println("\n\nEnter Marks for Student B : ");
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		int sub6 = sc.nextInt();
		int sub7 = sc.nextInt();
		StudentB sb = new StudentB(sub4,sub5,sub6,sub7);
		System.out.println("Percentage of Sudent B is = "+sb.getPercentage());
	}
}
