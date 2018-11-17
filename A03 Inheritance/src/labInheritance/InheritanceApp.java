/**
* Assignment A03 Inheritance
* Program: InheritanceApp
* Programmer: Brooke Horrocks
* Date: Jun 19, 2018
*/
/**
 * 
 */
package labInheritance;

/**
 * @author Brooke
 *
 */
public class InheritanceApp {

	/**
	 * Method: main
	 * @param args
	 * Main to create objects and show inheritance and polymorphism
	 */
	public static void main(String[] args) {
		
		/**
		 * Creating and initializing instances of Rectangle, Square, IsoscelesRightTriangle and Circle
		 */
		Rectangle myRectangle = new Rectangle(5, 4);
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(4);
		
		/**
		 * Printing myRectangle object along with associated methods
		 */
		System.out.println(myRectangle);
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getWidth() + "\n");
		
		/**
		 * Printing mySquare object along with associated methods
		 */
		System.out.println(mySquare);
		System.out.println("Side: " + mySquare.getSide() + "\n");
		
		/**
		 * Printing myIsoscelesRightTriangle object along with associated methods
		 */
		System.out.println(myIsoscelesRightTriangle);
		System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
		System.out.printf("Hypotenuse: %.2f%n%n", myIsoscelesRightTriangle.hypotenuse());
		
		/**
		 * Printing myCircle object along with associated methods
		 */
		System.out.println(myCircle);
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.println("Circumference: " + myCircle.circumference());
		System.out.println("Radius: " + myCircle.getRadius() + "\n");
		
		/**
		 * Printing rectangle2 object along with associated methods
		 */
		Rectangle rectangle2 = mySquare;
		System.out.printf("rectangle2:%n-----------%n");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getWidth() + "\n");
		
		/**
		 * Create and initialize array of Rectangle objects
		 */
		Rectangle[] rectangles = {rectangle2, mySquare, myRectangle};
		
		System.out.printf("Rectangle Array:%n----------------%n");
		
		/**
		 * for loop to iterate through Rectangle array rectangles and print each object and associated methods
		 */
		for(Rectangle r : rectangles) {
			/**
			 * Print object
			 */
			System.out.println(r);
			
			/** 
			 * if statement to check for instance of Rectangle and print appropriate methods
			 */
			if(r instanceof Rectangle) {
				System.out.println("Length: " + r.getLength());
				System.out.println("Width: " + r.getWidth());
			}
			
			System.out.println();
		}
	}

}
