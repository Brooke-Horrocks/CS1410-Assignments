package assignmentListVsSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {

	private List<ColoredSquare> list;
	private Set<ColoredSquare> set;
	
	/**
	 * 
	 * Constructor ListVsSetDemo
	 * @param elements add elements to both list and set
	 */
	public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<>(Arrays.asList(elements));
	    set = new HashSet<>(Arrays.asList(elements));
	}
	
	/**
	 * 
	 * Method: getListElements
	 * @return list elements
	 */
	public String getListElements() {
		StringBuilder sb = new StringBuilder();
		for(ColoredSquare el : list) {
			sb.append(el).append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * Method: getSetElements
	 * @return set elements
	 */
	public String getSetElements() {
		StringBuilder sb = new StringBuilder();
		for(ColoredSquare el : set) {
			sb.append(el).append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * Method: addElement
	 * @param el adds element to both list and set
	 */
	public void addElement(ColoredSquare el) {
		list.add(el);
		set.add(el);
	}
}
