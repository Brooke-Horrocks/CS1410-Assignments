/**
* Assignment A03 Inheritance
* Program: Square
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
public class Square extends Rectangle {

	/**
	 * 
	 * Constructor Square
	 * @param side
	 * Constructor to take one parameter and assign it to both length and width from the super class
	 */
	public Square(int side) {
		super(side, side);
	}

	/**
	 * @return the side
	 */
	public int getSide() {
		return super.getLength();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s (%d)", this.getClass().getSimpleName(), getSide());
	}
	
	
}
