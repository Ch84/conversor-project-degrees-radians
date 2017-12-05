package com.example.maven.conversor_project_degrees_radians;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class DegresToRadiansTest {
	DegreesToRadians dtr = new DegreesToRadians();
	
	public static final Logger LOG = Logger.getLogger(DegresToRadiansTest.class.getName());

	
	public double degrees2radians(double value) {
		double result = value * (Math.PI / 180);
		return result;	
	}
	public double radians2degrees(double value) {
		double result = value * (180 / Math.PI);
		return result;
	}

	@Test
	public void testDegresToRadians() {
		Random random = new Random();
		
		for (int k=0; k<100; k++) {
			double randomNumber = random.nextDouble()*100;
			
			LOG.info("Testing the method degrees to radians with: " + randomNumber);
			assertEquals(degrees2radians(randomNumber), dtr.convertDegresToRadians(randomNumber),0.5);

		}
	}
	@Test
	public void testRadiansToDegres() {
		Random random = new Random();
		
		for (int k=0; k<100; k++) {
			double randomNumber = random.nextDouble()*100;
			
			LOG.info("Testing the method radians to degrees with: " + randomNumber);
			assertEquals(radians2degrees(randomNumber), dtr.convertRadiansToDegres(randomNumber), 0.1);

		}
	}

}
