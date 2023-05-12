package assignments_Core_Java;

public class Patterns {
	public static void main(String[] args) {
		
		//Question 1 =>
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		//Question 2 =>
		int num=1;
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}
