package com.company;

import java.util.Stack;

public class Stacks {

	static Stack<Character> stack = new Stack();
	static char exp[] = {'{','(',')','}','[',')'};
	
	static boolean areParenthesisBalanced(char[] Expression) {


		for (int i = 0; i < Expression.length; i++) {
			char c = Expression[i];

			if (c == '(' || c =='[' || c == '{'){
				System.out.println("Pushed in "+c);
				stack.push(c);
			}

			if (c == '}'){
				if (stack.pop()=='{')
					System.out.println("Poped out: "+"{");
				else {
					return false;
				}
			}

			if (c == ']'){
				if (stack.pop()=='[')
					System.out.println("Poped out: "+"[");
				else {
					return false;
				}
			}

			if (c == ')'){
				if (stack.pop()=='(')
					System.out.println("Poped out: "+"(");
				else {
					return false;
				}
			}


		}

		if (stack.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args){

		System.out.println(areParenthesisBalanced(exp));
	}
}
