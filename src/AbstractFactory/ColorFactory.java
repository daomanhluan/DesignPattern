package AbstractFactory;

public class ColorFactory extends Abstract {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		switch (color) {
		case "Red": {
			return new Red();
		}
		case "Blue": {
			return new Blue();
		}
		default: {
			return null;
		}
		}
	}


	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
