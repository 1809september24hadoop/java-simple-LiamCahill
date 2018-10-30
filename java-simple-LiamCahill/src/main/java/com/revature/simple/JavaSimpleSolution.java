package com.revature.simple;

public class JavaSimpleSolution implements JavaSimple {

	@Override
	public int castToInt(double n) {

		n = int (n);
		return 0;
	}

	@Override
	public byte castToByte(short n) {

		n = byte(n)
				return 0;
	}

	@Override
	public double divide(double operandOne, double operandTwo) throws IllegalArgumentException {

		int x = operandOne/operandTwo;
		return x;
	}

	@Override
	public boolean isEven(int n) {
		// TODO Auto-generated method stub
		int x = n/2;
		if( x = 1) {
			return false;
		}
		else {
			return true;

		}

		@Override
		public boolean isAllEven(int[] array) {
			for(int i = 0;i < array.length;i++){
				if(int[i]%2 == 0) {
					return true;
				} else {
					return false;
				}
			}

		}

		@Override
		public double average(int[] array) throws IllegalArgumentException {

			for(int j = 0;j < array.length;j++) {
				int sum += array[j];
			} else if{
				array[] == null{
					throw IllegalArgumentException;
				}
			}


		}

		@Override
		public int max(int[] array) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int fibonacci(int n) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int[] sort(int[] array) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int factorial(int n) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int[] rotateLeft(int[] array, int n) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String isPrime(int n) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return false;
		}

	}
