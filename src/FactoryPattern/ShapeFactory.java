package FactoryPattern;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		switch (shape) {
		case "Circle":{
			return new Circle();
		}
		case "Square":{
			return new Square();
		}
		case "Triangle":{
			return new Triangle();
		}
		
		default:
			return null;
		}
	}
}
