package com.fizzbuzz;

class FizzBuzzConverter {

	String convert(int number) {
		if (number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}
}