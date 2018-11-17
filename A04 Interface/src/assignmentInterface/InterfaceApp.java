/**
* Assignment A04 Interface
* Program: InterfaceApp
* Programmer: Brooke Horrocks
* Date: Jul 4, 2018
*/
/**
 * 
 */
package assignmentInterface;

/**
 * @author Brooke
 *
 */
public class InterfaceApp {

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Instances of Shapes
		 */
		Rectangle rect1 = new Rectangle(6,3);
		Rectangle rect2 = new Rectangle(5,4);
		Square square1 = new Square(4);
		Square square2 = new Square(3);
		IsoscelesRightTriangle tri1 = new IsoscelesRightTriangle(5);
		IsoscelesRightTriangle tri2 = new IsoscelesRightTriangle(3);
		Circle circle1 = new Circle(7);
		Circle circle2 = new Circle(2);
		
		/**
		 * Array of Shapes
		 */
		Shape[] shapes = {rect1, rect2, square1, square2, tri1, tri2, circle1, circle2};
		
		/**
		 * Output Header
		 */
		System.out.println("Shape Array:");
		System.out.println("------------");
		
		/**
		 * For loop to loop through shapes array and print instance, perimeter, area 
		 * and, if applicable, print pattern from interface Printable
		 */
		for(Shape el : shapes) {
			System.out.println(el);
			System.out.printf("Perimeter: %.1f%n", el.perimeter());
			System.out.printf("Area: %.1f%n", el.area());
			
			if(el instanceof Printable) {
				((Printable) el).print();
			}
			System.out.println();
		}
	}

}
