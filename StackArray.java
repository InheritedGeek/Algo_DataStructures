package com.company;

// Implementing StackPractice using Array

public class StackArray {
	static int top = -1;
	final static int max = 100;
	int[] array = new int[max];

	public boolean isEmpty(){
		if (top<0)
			return true;
		return false;
	}

	public boolean push(int x){
		if (top >= max-1) {
			System.out.println("StackPractice Overflow");
			return false;
		}
		top+=1;
		array[top] = x;
		return true;
	}

	public int pop(){
		if (top < 0)
		{
			System.out.println("StackPractice Underflow");
			return 0;
		}
		else
		{
			int x = array[top];
			top -= 1;
			return x;
		}
	}
}

class Main{
	public static void main(String args[])
	{
		StackArray s = new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);

		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack");
	}
}