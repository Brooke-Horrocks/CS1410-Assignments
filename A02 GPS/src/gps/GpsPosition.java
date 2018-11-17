/**
* Assignment A02 GPS
* Program: GpsPosition
* Programmer: Brooke Horrocks
* Date: Jun 12, 2018
*/
/**
 * 
 */
package gps;

/**
 * @author Brooke
 *
 */
public class GpsPosition {
	
	private double latitude;
	private double longitude;
	private double elevation;
	
	public GpsPosition(double lat, double lon, double ele) {
		latitude = lat;
		longitude = lon;
		elevation = ele;
		
		if((lat - lon) > 90) {
			throw new IllegalArgumentException("Invalid latitude and/or longitude");
		}
		
		if((lon - lat) > 90) {
			throw new IllegalArgumentException("Invalid latitude and/or longitude");
		}
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getElevation() {
		return elevation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%.6f, %.6f (%.1f)", latitude, longitude, elevation);
	}
	
	
}
