package com.company;

public class Recursion {

	public static void main(String[] args) {
		int k = 5;
		System.out.println("Factorial of "+ k +" is "+factorial(k));
	}

	static boolean checkPrime(int n){
		if (n==2){
			return true;
		}
		if (n >2){
			if (n % 2 !=0){
				//Check for prime in Odd No's
			}

		}
		return false;
	}

	static int factorial(int n){
		if (n == 0)
			return 1;

		else{
			return n*factorial(n-1);
		}
	}

}
