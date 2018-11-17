/**
* Assignment A03 Inheritance
* Program: Circle
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
public class Circle implements Shape {
	
	private int radius;
	
	/**
	 * Calculate perimeter of Circle instance 
	 * @return perimeter
	 */
	@Override
	public double perimeter() {
		return circumference();
	}

	/**
	 * Calculate area of Circle instance
	 * @return area
	 */
	@Override
	public double area() {
		double result;
		
		result = (Math.pow(radius, 2)*Math.PI);
		
		return result;
	}

	/**
	 * Constructor Circle
	 * @param r
	 * Constructor to take one parameter and assign it to radius
	 */
	public Circle(int r) {
		super();
		radius = r;
	}
	
	/**
	 * Calculate diameter of Circle instance
	 * @return radius times 2
	 */
	public int diameter() {
		return radius*2;
	}
	
	/**
	 * Calculate Circumference of Circle instance
	 * @return diameter times pi
	 */
	public double circumference() {
		return (Math.PI * (radius*2));
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Print instance of Circle
	 */
	@Override
	public String toString() {
		return String.format("%s (%d)", this.getClass().getSimpleName(), getRadius());
	}
}
