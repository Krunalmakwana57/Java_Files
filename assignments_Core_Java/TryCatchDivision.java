package assignments_Core_Java;

public class TryCatchDivision {
	public static void main(String[] args) {
		if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command line arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Division by zero not allowed.");
        }
	}
}
