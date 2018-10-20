public class CalculateRectangle {
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		double perimeter= rect.calculatePerimeter(12, 10);
		double area = rect.calculateArea(12, 10);
		System.out.println("Perimeter of the rectangle is "+perimeter);
		System.out.println("Area of the rectangle is "+area);
	}

}
