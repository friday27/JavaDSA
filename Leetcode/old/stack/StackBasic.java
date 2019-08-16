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
	
	public StackBasic() {
		stack = new int[10];
		top = -1;
	}
	
	public void push(int data) {
		if(top+1>stack.length) 
			System.out.println("Stack overflow");
		else 
			stack[++top] = data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}else {
			return stack[top--];
		}
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public static void main(String[] args) {
		StackBasic s = new StackBasic(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
	}
}	

