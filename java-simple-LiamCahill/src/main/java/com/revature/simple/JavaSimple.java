package com.revature.simple;

/** 
 *	Work out the code below to the best of your ability.
 *	If confused on how to get started ask batch mates or ask in general slack
 *	don't hesitate to ask!
 *
 *	Rules: 
 *	- Do not change the methods parameters or names.
 *
 *	Suggestion: 
 *  - I believe in self commenting code, however if you did something clever
 * 	or special, please use verbose comments.
 *	- Try to use the web or ask batch mates only when you are blocked in one spot.
 *	The idea of assignments is to make you think and practice.
 *  - Do not copy paste code from the web if you are not ready to explain it.
 *
**/
public interface JavaSimple {
	 
	/**
	 * 1. Cast from double to int.
	 * 
	 * Labels: [primitives, casting]
	 * 
	 * f(0.0) = 0
	 * f(3.1) = 3
	 **/
	public int castToInt(double n);
	
	/**
	 * 2. Cast from short to byte.
	 * 
	 * Labels: [primitives, casting]
	 * 
	 * f(2) = 2
	 * f(128) = -128
	 **/
	public byte castToByte(short n);

	/**
	 * 3. Division.
	 * 
	 * Labels: [operators, exceptions, control statements]
	 * 
	 * f(10,2) = 5.0
	 * f(3,2) = 1.5
	 * 
	 * @throws IllegalArgumentException when operandTwo is 0.
	 **/
	public double divide(double operandOne, double operandTwo) throws IllegalArgumentException;
	
	/**
	 * 4. Check if int is Even.
	 * 
	 * Labels: [operators, control statements]
	 * 
	 * f(2) = true
	 * f(3) = false
	 * 
	 * Can't use % Modulus
	 * if(n % 2 == 0) {
	 * 		return true;
	 * } else {
	 * 		return false;
	 * }
	 **/
	public boolean isEven(int n);
	
	/**
	 * 5. Check if the whole Array is Even.
	 * 
	 * Labels: [operators, arrays, control statements]
	 * 
	 * f([2]) = true
	 * f([2,4,6,8,10]) = true
	 * 
	 * f([3]) = false
	 * f([2,4,6,8,11]) = false
	 **/
	public boolean isAllEven(int[] array);

	
	/**
	 * 6. Return the Average.
	 * 
	 * Labels: [arrays, operators, control statements, exceptions]
	 * 
	 * f([2]) = 2.0
	 * f([2,3]) = 2.5
	 * 
	 * @throws IllegalArgumentException when array is null.
	 */
	public double average(int[] array) throws IllegalArgumentException;
	
	/**
	 * 7. Return the Max value.
	 * 
	 * Labels: [arrays, operators, control statements, exceptions]
	 * 
	 * f([10,2,4,7,9]) = 10
	 * f([10,10,13,13,14,15,17,17]) = 17
	 * 
	 * @throws IllegalArgumentException when array is null.
	 */
	 public int max(int[] array) throws IllegalArgumentException;
	 
	/**
	 * 8. Calculate the nth Fibonacci number.
	 * f(0) = 0
	 * f(1) = 1
	 * f(10) = 34
	 * 
	 * Hint: Use an array.
	 * 
	 * @return The nth Fibonacci number.
	 * 
	 * @throws IllegalArgumentException when n is less than 0.
	**/
	public int fibonacci(int n) throws IllegalArgumentException;
	
	/** 
	 * 9. Sort array of integers.
	 * f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	 * 
	 * Rules: 
	 * - DO NOT use built-in sort() available methods.
	 * - DO NOT use bubble sort.
	 * - DO NOT use Sorted Sets.
	 * 
	 * @return The sorted array.
	 * 
	 * @throws IllegalArgumentException if the array is null.
	**/
	public int[] sort(int[] array) throws IllegalArgumentException;
	
	/**
	 * 10. Return the factorial of n
	 * f(0) = 1
	 * f(1) = 1
	 * f(3) = 6
	 * 
	 * Hint: Do it recursively.
	 * 
	 * @return The factorial result.
	 * 
	 * @throws IllegalArgumentException if n is less than 0.
	**/
	public int factorial(int n) throws IllegalArgumentException;
	
	/**
	 * 11. Rotate left.
	 * Given array, rotate left n times.
	 * 
	 * f([1,2,3,4,5], 1) = [2,3,4,5,1]
	 * f([1,2,3,4,5], 6) = [2,3,4,5,1]
	 * f([1,2,3,4,5], 3) = [4,5,1,2,3]
	 * 
	 * @return The rotated array.
	 * 
	 * @throws IllegalArgumentException if the array is null or n is less than 0.
	**/
	public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException;
	
	/**
	 * 12. Check if an int is Prime only using ONLY Ternary Operators.
	 * 
	 * f(7) = true
	 * f(157) = true
	 * 
	 * Rules: 
	 * - Only use if/else statements for the exception throwing part.
	 * - You can use ternary operators as many times as you need.
	 * 
	 * @return A message stating if the number is prime or not.
	 * 
	 * @throws IllegalArgumentException if n is less than 0.
	**/
	public String isPrime(int n);
	
	/**
	 * 13. Balanced Brackets.
	 * 
	 * A bracket is any one of the following: (, ), {, }, [, or ]
	 * The following are balanced brackets:
	 * ()
	 * ()()
	 * (())
	 * ({[]})
	 * 
	 * The following are NOT balanced brackets:
	 * (
	 * )
	 * (()
	 * ([)]
	 * 
	 * Hint: Use the Stack class, but be ready to explain this if you do so.
	 * 
	 * @return true if balanced, false if not balanced
	 * 
	 * @throws IllegalArgumentException if the String is null.
	**/
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException;
}
