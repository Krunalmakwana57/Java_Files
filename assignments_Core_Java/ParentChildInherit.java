package assignments_Core_Java;

class ParentClass{
	public void parentMethod() {
		System.out.println("This is Parent Class");
	}
}

class ChildClass extends ParentClass{
	public void childMethod() {
		System.out.println("This is Child Class");
	}
}

public class ParentChildInherit {
	public static void main(String[] args) {
		
		//Parent Class Object Calls Parent Class Method
		ParentClass pc = new ParentClass();
		pc.parentMethod();
		
		//Child Class Object Calls Child Class Method
		ChildClass cc = new ChildClass();
		cc.childMethod();
		
		//This is ChildClass Object it Calls Parent Class Method
		cc.parentMethod();
	}
}
