package in.com.cg.shape;
//main function
public class ShapeMain {

	public static void main(String[] args) {
			Shape shape;
		
		//DRAWING A CIRCLE
		shape=new Circle();
		shape.draw();
		
		//DRAWING A RECTANGLE
		shape=new Rectangle();
		shape.draw();
		
		//DRAWING A POLYGON
		shape=new Polygon();
		shape.draw();
		
		//Testing method overriding
		Square rectangle=new Square();//upcasting
		rectangle.draw();//overriding

	}

}
