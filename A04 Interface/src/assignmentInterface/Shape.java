/**
* Assignment A04 Interface
* Program: Shape
* Programmer: Brooke Horrocks
* Date: Jun 28, 2018
*/
/**
 * 
 */
package assignmentInterface;

/**
 * @author Brooke
 *
 */
public interface Shape {
	
	/**
	 * Method: perimeter
	 * @return perimeter
	 * To be overridden to calculate perimeter of a Class instance that implements Shape
	 */
	double perimeter();
	
	/**
	 * Method: area
	 * @return area
	 * To be overridden to calculate area of a Class instance that implements Shape
	 */
	double area();

}
