package assignments_Core_Java;

import java.util.Scanner;

public class PrintGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks to Check Grades : ");
		int mark = sc.nextInt();
		if(mark>90 && mark<100) {
			System.out.println("You Pass With AA Grade");
		}else if(mark>80 && mark<=90) {
			System.out.println("You Pass With AB Grade");
		}else if(mark>70 && mark<=80) {
			System.out.println("You Pass With BB Grade");
		}else if(mark>60 && mark<=70) {
			System.out.println("You Pass With BC Grade");
		}else if(mark>50 && mark<=60) {
			System.out.println("You Pass With CD Grade");
		}else if(mark>40 && mark<=50) {
			System.out.println("You Pass With DD Grade");
		}else if(mark>1 && mark<=40) {
			System.out.println("fail");
		}else {
			System.out.println("Incorrect Input");
		}
	}
}
