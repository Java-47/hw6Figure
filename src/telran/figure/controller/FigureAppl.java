package telran.figure.controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import telran.figure.model.Circle;
import telran.figure.model.Shape;
import telran.figure.model.Square;
import telran.figure.model.Triangle;

public class FigureAppl {

	public static void main(String[] args) {
		Shape[] figures = new Shape[4];
		figures[0] = new Circle(6);
		figures[1] = new Circle(5);
		figures[2] = new Triangle(4);
		figures[3] = new Square(3);
		
		System.out.println("Total Area - " + totalArea(figures));
		System.out.println("Tatal Perimeter - " + totalPerimeter(figures));
		System.out.println("Total Area of Circles - " + totalAreaOfCircles(figures));
	}
	public static double totalArea(Shape[] figures)
	{
		double res = 0;
		for (int i = 0; i < figures.length; i++) {
			if(figures[i] != null) {
				res += figures[i].calcArea();
			}
		}
		return res;
	}
	public static double totalPerimeter(Shape[] figures)
	{
		double res = 0;
		for (int i = 0; i < figures.length; i++) {
			if(figures[i] != null) {
				res += figures[i].calcPerimeter();
			}	
		}
		return res;
	}
	public static double totalAreaOfCircles(Shape[] figures)
	{
		double res = 0;
		String regex = "\\.Circle@";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("");
		for (int i = 0; i < figures.length; i++) {
			matcher.reset(figures[i].toString());
	
			if(figures[i] != null && matcher.find()) {
				res += figures[i].calcArea();
			}
		}
		return res;
	}
	
}
