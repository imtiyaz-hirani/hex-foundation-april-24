package com.ds;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("harry");
		stack.push("ronald");
		stack.push("hermione");
		stack.push("draco");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());//draco
		}
	}
}
