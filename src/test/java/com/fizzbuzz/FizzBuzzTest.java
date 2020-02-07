package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzConverterShouldReturnOneFor1() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		assertEquals("1", fizzBuzzConverter.convert(1));
	}
}