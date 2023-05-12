package assignments_Core_Java;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int n = sc.nextInt();
        int factorial = Factorial(n);
        System.out.println(n + "! = " + factorial);
	}
		static int Factorial(int n) {
			if (n == 0) {
				return 1;
			} else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
