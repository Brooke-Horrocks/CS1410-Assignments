/**
* Assignment A03 Inheritance
* Program: Square
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
public class Square extends Rectangle implements Shape, Printable {

	/**
	 * Constructor Square
	 * @param side
	 * Constructor to take one parameter and assign it to both length and width from the super class
	 */
	public Square(double side) {
		super(side, side);
	}

	/**
	 * @return side
	 */
	public double getSide() {
		return super.getLength();
	}

	/**
	 * Print instance of Square
	 */
	@Override
	public String toString() {
		return String.format("%s (%.0f)", this.getClass().getSimpleName(), getSide());
	}
}
