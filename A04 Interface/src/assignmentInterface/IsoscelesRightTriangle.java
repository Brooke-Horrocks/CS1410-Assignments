/**
* Assignment A03 Inheritance
* Program: IsoscelesRightTriangle
* Programmer: Brooke Horrocks
* Date: Jun 19, 2018
*/
/**
 * 
 */
package assignmentInterface;

/**
 * @author Brooke
 *
 */
public class IsoscelesRightTriangle implements Shape, Printable {
	
	private double leg;

	/**
	 * Constructor IsoscelesRightTriangle
	 * @param l
	 * Constructor to take one parameter and assign it to leg
	 */
	public IsoscelesRightTriangle(int l) {
		super();
		leg = l;
	}

	/** 
	 * 
	 * Method: hypotenuse
	 * @return square root double of both legs squared
	 */
	public double hypotenuse() {
		return Math.hypot(leg, leg);
	}

	/**
	 * @return the leg
	 */
	public double getLeg() {
		return leg;
	}
	
	/**
	 * Print instance of IsoscelesRightTriangle
	 */
	@Override
	public String toString() {
		return String.format("%s (%.0f)", this.getClass().getSimpleName(), getLeg());
	}

	/**
	 * Calculate perimeter of an IsoscelesRightTriangle instance
	 * @return perimeter
	 */
	@Override
	public double perimeter() {
		return leg * 2 + hypotenuse();
	}

	/**
	 * Calculate area of an IsoscelesRightTriangle instance
	 * @return area
	 */
	@Override
	public double area() {
		return ((hypotenuse() * hypotenuse()) / 4);
	}

	/**
	 * Print hollow pattern of an IsoscelesRightTriangle instance
	 */
	@Override
	public void print() {
		String spaces = " ";
		System.out.println("o");
		if(leg > 1) {
			for(int i = 0; i < leg - 2; i++) {
				System.out.println("o" + spaces + "o");
				spaces += " ";
				for(int j = 0; j < 1; j++) {
					spaces += " ";
				}
			}
			for(int j = 0; j < leg; j++) {
				System.out.print("o ");
			}
		}
		else {
			System.out.println("o");
		}
		System.out.println();
		System.out.println();
	}
}
