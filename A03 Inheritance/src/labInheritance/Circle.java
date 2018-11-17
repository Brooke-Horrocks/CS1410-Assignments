/**
* Assignment A03 Inheritance
* Program: Circle
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
public class Circle {
	
	private int radius;

	/**
	 * 
	 * Constructor Circle
	 * @param r
	 * Constructor to take one parameter and assign it to radius
	 */
	public Circle(int r) {
		super();
		radius = r;
	}
	
	/**
	 * 
	 * Method: diameter
	 * @return radius times 2
	 */
	public int diameter() {
		return radius*2;
	}
	
	/**
	 * 
	 * Method: circumference
	 * @return diameter times pi
	 */
	public double circumference() {
		return Math.round(Math.PI * (radius*2));
		
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s (%d)", this.getClass().getSimpleName(), getRadius());
	}
}
