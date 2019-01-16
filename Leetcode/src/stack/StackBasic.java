package stack;

//import java.util.ArrayList;
//ArrayList will automatically adjust its size,
//but the level of efficiency is lower than size-fixed Array

public class StackBasic {
	private int[] stack;
	private int top;

	public StackBasic(int n) {
		stack = new int[n];
		top = -1;
	}
	
	public void push(int data) {
		stack[++top] = data;
	}
	
	public int pop() {			
		return stack[top--];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean empty() {
		return top == -1;
	}
	
	public int size() {
		return top;
	}
}	
