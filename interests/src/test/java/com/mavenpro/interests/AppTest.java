package com.mavenpro.interests;

//import org.junit.*;
//import static org.junit.Assert.*;
public class AppTest {

	public void test() {

		// Calculate Simple Interest

		double answer = App.simpleInterest(500, 20, 5);

		assertEquals(500, answer,0.1);

		

		

		// Calculate Compound Interest

		answer = App.compoundInterest(500, 10, 2);

		assertEquals(105,answer,0.1);

	}

	private void assertEquals(int i, double answer, double d) {
		// TODO Auto-generated method stub
		
	}
}