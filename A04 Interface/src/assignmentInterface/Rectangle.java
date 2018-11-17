/**
* Assignment A03 Inheritance
* Program: Rectangle
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
public class Rectangle implements Shape, Printable {
	
	private double length;
	private double width;
	
	/**
	 * 
	 * Constructor Rectangle
	 * @param l 
	 * Assign l to length
	 * @param w
	 * Assign w to width
	 */
	public Rectangle(double l, double w) {
		super();
		length = l;
		width = w;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Print instance of Rectangle
	 */
	@Override
	public String toString() {
		return String.format("%s (%.0fX%.0f)", this.getClass().getSimpleName(), length, width);
	}

	/**
	 * Calculate perimeter of Rectangle instance
	 * @return perimeter (2 * (length + width))
	 */
	@Override
	public double perimeter() {
		return 2*(length + width);
	}

	/**
	 * Calculate area of Rectangle instance
	 * @return area (length * width)
	 */
	@Override
	public double area() {
		return length*width;
	}

	/**
	 * Print hollow pattern of Rectangle instance
	 */
	@Override
	public void print() {
		String spaces = "";
		
		for(int i = 0; i < length; i++) {
			System.out.print("o ");
			
		}
		
		for(int j = 0; j < (length*2) - 3; j++) {
			spaces += " ";
		}
		
		System.out.println();
		
		for(int k = 0; k < width - 2; k++) {
			System.out.println("o" + spaces + "o");
		}
		
		for(int l = 0; l < length; l++) {
			System.out.print("o ");
		}
		System.out.println();
		System.out.println();
	}
	
}
