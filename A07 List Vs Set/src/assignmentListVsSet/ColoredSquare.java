package assignmentListVsSet;

import java.awt.Color;

public class ColoredSquare {
	
	private int side;
	private Color color;
	
	/**
	 * Constructor ColoredSquare
	 * @param s side length
	 * @param c color of square
	 */
	public ColoredSquare(int s, Color c) {
		side = s;
		color =c;
	}

	/**
	 * 
	 * Method: area
	 * @return area of ColoredSquare object
	 */
	public int area() {
		return side * side;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}
	
	/**
	 * @return printed ColoredSquare object
	 */
	public String toString() {
		return String.format("side:%d #%02X%02X%02X",
                side, color.getRed(), color.getGreen(),
                color.getBlue());
	}
}
