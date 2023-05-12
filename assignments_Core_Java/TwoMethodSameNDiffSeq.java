package assignments_Core_Java;


class PrintNum{
	public void printn(int n,char c) {
		System.out.println("Integer is : "+n+" Character is : "+c);
	}
	public void printn(char c,int n) {
		System.out.println("Character is : "+c+" Integer is : "+n);
	}
}

public class TwoMethodSameNDiffSeq {
	public static void main(String[] args) {
		PrintNum pn = new PrintNum();
		pn.printn(10, 'a');
		pn.printn('b', 20);
		
	}
}
