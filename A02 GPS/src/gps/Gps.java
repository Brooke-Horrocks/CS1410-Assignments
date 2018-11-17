/**
* Assignment A02 GPS
* Program: Gps
* Programmer: Brooke Horrocks
* Date: Jun 17, 2018
*/
/**
 * 
 */
package gps;

import java.util.ArrayList;

/**
 * @author Brooke
 *
 */
public class Gps {
	
	private ArrayList<GpsPosition> route = new ArrayList<GpsPosition>();
	
	public Gps(GpsPosition position) {
		route.add(position);
		
	}
	
	public ArrayList<GpsPosition> getRoute(){
		return route;
	}
	
	public void update(GpsPosition position) {
		route.add(position);
	}

	

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		

	}

}
