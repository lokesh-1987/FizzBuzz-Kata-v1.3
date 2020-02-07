package com.fizzbuzz;

class FizzBuzzConverter {
	
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FizzBuzz = "FizzBuzz";

	String convert(int number) {
		if (number % (3 * 5) == 0)
			return FizzBuzz;
		else if (number % 3 == 0)
			return FIZZ;
		else if(number % 5 == 0)
			return BUZZ;
		return String.valueOf(number);
	}
}