import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of row : ");
		int row = sc.nextInt();
		System.out.println("enter size of col : ");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				System.out.print("enter value at a["+r+"]["+c+"] : ");
				a[r][c] = sc.nextInt();
			}
		}
		System.out.println("enter size of row : ");
		int row1 = sc.nextInt();
		System.out.println("enter size of col : ");
		int col1 = sc.nextInt();
		int a1[][] = new int[row1][col1];
		for(int r1=0;r1<a1.length;r1++) {
			for(int c1=0;c1<a1.length;c1++) {
				System.out.print("enter value at a1["+r1+"]["+c1+"] : ");
				a1[r1][c1] = sc.nextInt();
			}
		}
		
		
	}
}