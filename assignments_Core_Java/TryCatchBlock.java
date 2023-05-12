package assignments_Core_Java;

import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Num A : ");
			int numa = sc.nextInt();
			System.out.print("Enter Num B : ");
			int numb = sc.nextInt();
			int numc = numa/numb;
			System.out.println(numc);
		}catch(ArithmeticException e) {
			System.out.println("Cannot Divide By zero");
		}catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
