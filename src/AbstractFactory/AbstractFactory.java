package AbstractFactory;

public class AbstractFactory {

	
	public static Abstract getAbstact(String factory) {
		
		switch (factory) {
		case "ShapeFactory":{
			return new ShapeFactory();
		}
		case "ColorFactory":{
			return new ColorFactory();
		}

		default:{
			return null;
		}
			
		}
	}
}
