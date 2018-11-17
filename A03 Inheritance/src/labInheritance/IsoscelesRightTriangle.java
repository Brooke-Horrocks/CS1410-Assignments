/**
* Assignment A03 Inheritance
* Program: IsoscelesRightTriangle
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
public class IsoscelesRightTriangle {
	
	private int leg;

	/**
	 * 
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
	public int getLeg() {
		return leg;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s (%d)", this.getClass().getSimpleName(), getLeg());
	}
}
