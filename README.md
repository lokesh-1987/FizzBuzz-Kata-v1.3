# The FizzBuzz problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

# Architecture

This application was designed as a standalone jar file and contains a concrete class i.e., FizzBuzzConverter and a test class i.e, FizzBuzzTest. The FizzBuzzConverter returns
	1.  The number
	2. "fizz" for numbers that are multiples of 3
	3. "buzz" for numbers that are multiples of 5
	4. "FizzBuzz" for numbers that are multiples of 15

FizzBuzzTest class, basically, covers all the possible test cases to test the FizzBuzz problem.

# Application Link

https://github.com/lokesh-1987/FizzBuzz-Kata-v1.3

# Plan and Execution

1. Create Junit Test class i.e.,FizzBuzzTest to test the FizzBuzz Problem.
2. Create a concrete class i.e.,FizzBuzzConverter that solves the problem.
3. Create a maven build to build the application as a jar file using the following command i.e., mvn clean install
4. In order to run the application, follow the below steps,
	a) Open a terminal window 
	b) Change directory to your maven project. You should be in a directory that contains pom.xml file.
	c) Run the following command: mvn -Dtest=FizzBuzzTest test