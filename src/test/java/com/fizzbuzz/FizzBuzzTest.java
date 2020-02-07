package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private static final String _1 = "1";
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FizzBuzz = "FizzBuzz";
	
	private FizzBuzzConverter fizzBuzzConverter;
	
	@Before
	public void initializeFizzBuzzInstance() {
		fizzBuzzConverter = new FizzBuzzConverter();
	}

	@Test
	public void fizzBuzzConverterShouldReturnOneFor1() {
		assertEquals(_1, fizzBuzzConverter.convert(1));
	}
	
	@Test
	public void fizzBuzzConverterShouldReturnFizzForMultiplesOfThree() {
		assertEquals(FIZZ, fizzBuzzConverter.convert(3));
	}
	
	@Test
	public void fizzBuzzConverterShouldReturnBuzzForMultiplesOfFive() {
		assertEquals(BUZZ, fizzBuzzConverter.convert(5));
	}
	
	@Test
	public void fizzBuzzConverterShouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
		assertEquals(FizzBuzz, fizzBuzzConverter.convert(15));
	}
}