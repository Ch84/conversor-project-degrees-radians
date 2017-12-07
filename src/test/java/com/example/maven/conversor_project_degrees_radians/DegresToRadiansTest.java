package com.example.maven.conversor_project_degrees_radians;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * This is my test class. Here I perform the tests for each of my
 * methods to test the conversion from degrees to radians and the
 * conversion from radians to degrees.
 *
 * @author Christian Hall
 * @version 1.0
 * @since 2017-12-05
 */

public class DegresToRadiansTest {
	/**
	 * Constructor code below to call on my class file.
	 * 
	 * {@code DegreesToRadians dtr = new DegreesToRadians();}
	 */
	DegreesToRadians dtr = new DegreesToRadians();
	
	public static final Logger LOG = Logger.getLogger(DegresToRadiansTest.class.getName());

	/**
	 * My constructor with the parameter below. Takes in value and
	 * returns the result.
	 * 
	 * @param value
	 * @return result
	 */
	public double degrees2radians(double value) {
		double result = value * (Math.PI / 180);
		return result;	
	}
	/**
	 * My constructor with the parameter below. Takes in the value and
	 * returns the result.
	 * 
	 * @param value
	 * @return result
	 */
	public double radians2degrees(double value) {
		double result = value * (180 / Math.PI);
		return result;
	}
	@Test
	public void testDegresToRadians() {
		Random random = new Random();
		
		for (int k=0; k<10; k++) {
			double randomNumber = random.nextDouble()*100;
			
			LOG.info("Testing the method degrees to radians with: " + randomNumber);
			assertEquals(degrees2radians(randomNumber), DegreesToRadians.convertDegresToRadians(randomNumber),0.5);

		}
	}
	@Test
	public void testRadiansToDegres() {
		Random random = new Random(); 
		
		for (int k=0; k<10; k++) { 
			double randomNumber = random.nextDouble()*100;
			
			LOG.info("Testing the method radians to degrees with: " + randomNumber);
			assertEquals(radians2degrees(randomNumber), DegreesToRadians.convertRadiansToDegres(randomNumber), 0.1);

		} 
	} 

}
