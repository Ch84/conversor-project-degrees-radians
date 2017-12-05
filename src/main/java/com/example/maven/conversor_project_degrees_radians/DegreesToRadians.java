package com.example.maven.conversor_project_degrees_radians;

/**
 * My DegreesToRadians class. This program converts degrees to radians
 * and radians to degrees. 
 * 
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-05
 *
 */

public class DegreesToRadians {
	
	/**
	 * My constructor with my methods to execute the conversion from
	 * degrees to radians. Takes in the value and returns the result.
	 * 
	 * @param value
	 * @return result
	 */
	static double convertDegresToRadians(double value) {
		double result = Math.toRadians(value);
		return result;
		
	}
	/**
	 * My constructor with my methods to execute the conversion from
	 * radians to degrees. Takes in the value and returns the result.
	 * 
	 * @param value
	 * @return result
	 */
	static double convertRadiansToDegres(double value) {
		double result = Math.toDegrees(value);
		return result;

	}

}
