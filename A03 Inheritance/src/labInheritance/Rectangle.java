/**
* Assignment A03 Inheritance
* Program: Rectangle
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
public class Rectangle {
	
	private int length;
	private int width;
	
	/**
	 * 
	 * Constructor Rectangle
	 * @param l 
	 * Assign l to length
	 * @param w
	 * Assign w to width
	 */
	public Rectangle(int l, int w) {
		super();
		length = l;
		width = w;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s (%dX%d)", this.getClass().getSimpleName(), length, width);
	}
	
}
