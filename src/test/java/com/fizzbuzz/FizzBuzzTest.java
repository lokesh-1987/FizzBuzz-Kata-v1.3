package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzzConverter fizzBuzzConverter;
	
	@Before
	public void initializeFizzBuzzInstance() {
		fizzBuzzConverter = new FizzBuzzConverter();
	}

	@Test
	public void fizzBuzzConverterShouldReturnOneFor1() {
		assertEquals("1", fizzBuzzConverter.convert(1));
	}
	
	@Test
	public void fizzBuzzConverterShouldReturnFizzForMultiplesOfThree() {
		assertEquals("Fizz", fizzBuzzConverter.convert(3));
	}
	
	@Test
	public void fizzBuzzConverterShouldReturnBuzzForMultiplesOfFive() {
		assertEquals("Buzz", fizzBuzzConverter.convert(5));
	}
}