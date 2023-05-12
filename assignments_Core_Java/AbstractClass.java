package assignments_Core_Java;

abstract class Parent{
	abstract public void message();
}

class Child1 extends Parent {
	public void message() {
		System.out.println("Message Method in Child1");
	}
}

class Child2 extends Parent {
	public void message() {
		System.out.println("Message Method in Child2");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.message();
		Child2 c2 = new Child2();
		c2.message();
	}
}
