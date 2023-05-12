package assignments_Core_Java;

public class AreaOfTriangle {
	private int side1;
	   private int side2;
	   private int side3;

	   public AreaOfTriangle() {
	      side1 = 3;
	      side2 = 4;
	      side3 = 5;
	   }

	   public int getPerimeter() {
	      return side1 + side2 + side3;
	   }

	   public double getArea() {
	      double s = (side1 + side2 + side3) / 2.0;
	      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	   }

	   public static void main(String[] args) {
		  AreaOfTriangle t = new AreaOfTriangle();
	      System.out.println("Perimeter of the triangle is: " + t.getPerimeter());
	      System.out.println("Area of the triangle is: " + t.getArea());
	   }
}
