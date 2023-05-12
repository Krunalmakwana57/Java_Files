package assignments_Core_Java;

class Shape {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    void printShape() {
        System.out.println("This is a rectangular shape");
    }	
}

class Circle extends Shape {
    void printShape() {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeClassDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.printShape();
        sq.printSquare();
    }
}
