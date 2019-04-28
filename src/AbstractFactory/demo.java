package AbstractFactory;

public class demo {

	public static void main(String[] args) {
		
		
		Abstract abstract1 =AbstractFactory.getAbstact("ShapeFactory");
		Shape shape1 = abstract1.getShape("Circle");
		Shape shape2 = abstract1.getShape("Triangle");
		Shape shape3 = abstract1.getShape("Square");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
	
}
