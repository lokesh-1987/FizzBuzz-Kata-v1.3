package com.fizzbuzz;

class FizzBuzzConverter {

	String convert(int number) {
		if (number % (3 * 5) == 0)
			return "FizzBuzz";
		else if (number % 3 == 0)
			return "Fizz";
		else if(number % 5 == 0)
			return "Buzz";
		return String.valueOf(number);
	}
}