package telran.figure.model;

public class Triangle extends Shape{

	public Triangle(double side) {
		super(side);
	}

	public double calcArea() {
		return ((side*side)*Math.sqrt(3.0))/4;
	}

	public double calcPerimeter() {
		return side*3;
	}

}
