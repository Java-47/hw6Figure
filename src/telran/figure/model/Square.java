package telran.figure.model;

public class Square extends Shape{

	public Square(double side) {
		super(side);
	}

	public double calcArea() {
		return side*side;
	}

	public double calcPerimeter() {
		return side*4;
	}

}
