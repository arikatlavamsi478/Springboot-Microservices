package com.healthycoderapp;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class BMICalculatorTest {
	
	@Test
	void should__ReturnTrue_when_dietRecommended() {
		// given
		double weight  = 99.9;
		double height = 1.99;
		
		// when
		boolean recommended = BMICalculator.isDietRecommended(weight, height);
		
		// then
		assertTrue(recommended);
	}
	
	@Test
	void should__Return_False_when_dietNotRecommended() {
		// given
		double weight  = 123.44;
		double height = 5.99;
		
		// when
		boolean recommended = BMICalculator.isDietRecommended(weight, height);
		
		// then
		assertFalse(recommended);
	}

	@Test
	void should__ThrowException_when_HeightIsZero() {
		// given
		double weight  = 123.44;
		double height = 0.0;
		
		// when
	Executable executable =() -> BMICalculator.isDietRecommended(weight, height);
		
		// then
		//assertThrows(ArithmeticException.class, )
		assertThrows(ArithmeticException.class, executable);
	}
}
