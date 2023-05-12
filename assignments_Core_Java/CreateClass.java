package assignments_Core_Java;


class PrintNumber{
	
	public void printn(int n) {
		System.out.println("Integer Number is "+n);
	}
	
	public void printn(float m) {
		System.out.println("Float Number is "+m);
	}
	
	public void printn(double k) {
		System.out.println("Double Number is "+k);
	}
	
	
}

public class CreateClass {
	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		pn.printn(10);
		pn.printn(10.25f);
		pn.printn(32.45);
		
	}
	
}
