package AbstractFactory;

public class ShapeFactory extends Abstract{

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
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
