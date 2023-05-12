package assignments_Core_Java;

public class IndexOutOfBoundException {
	public static void main(String[] args) {
		int[] a = new int[5];
        try {
            a[5] = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getStackTrace());
        }
	}
}
