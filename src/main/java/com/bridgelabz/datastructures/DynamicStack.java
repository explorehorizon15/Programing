package com.bridgelabz.datastructures;

public class DynamicStack {
	int capacity=2;
    int Stack[]=new int[capacity];
    int top=0;
	public void push(int data) {
		if(size()==capacity) 
			expand();
			Stack[top]=data;
			top++;
	
		
	}
	private void expand() {
		int length=size();
		int newStack[]=new int[capacity*2];
        System.arraycopy(Stack, 0, newStack, 0, length);
        Stack=newStack;
        capacity=capacity*2;
	}
	public int pop() {
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
		}else {
			top--;
			data=Stack[top];
			Stack[top]=0;
			shrink();
		}
		return data;
	}
	
	private void shrink() {
		int length=size();
		if(length <=((capacity/2)/2)) 
			capacity=capacity/2;
		
		int newStack[]=new int[capacity];
		System.arraycopy(Stack,0, newStack,0,length);
		Stack=newStack;
		
	}
	public int peek() {
		int data=0;
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for(int obj:Stack) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
    
	public static void main(String[] args) {
		DynamicStack s= new DynamicStack();
		s.push(15);
		s.push(25);
		s.push(35);
		s.push(45);
		s.push(55);
		s.push(65);
		s.show();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.show();

	}

}
