package telran.figure.model;

public class Circle extends Shape{

	public Circle(double side) {
		super(side);
	}

	public double calcArea() {
		
		return Math.PI * (side * side);
	}

	public double calcPerimeter() {
		
		return 2*Math.PI*side;
	}

}
