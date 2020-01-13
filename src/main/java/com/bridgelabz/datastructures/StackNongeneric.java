package com.bridgelabz.datastructures;

public class StackNongeneric {
	int Stack[]=new int[10];
	int top=0;
	
	public void push(int data) {
		if(top==10) {
			System.out.println("Stack is Full!");
		}else {
		Stack[top]=data;
		top++;
		}
	}
	
	public int pop(){
		 int data=0;
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
		}else {
	   
		top--;
		data=Stack[top];
		Stack[top]=0;
		
	}
		return data;
	}
	
	public int peek() {
		int data;
		data=Stack[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
    
	public void show() {
		
		for (int arr:Stack) {
			System.out.print(arr+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		 StackNongeneric s=new StackNongeneric();
		 System.out.println("size= "+s.size());
         System.out.println("isempty= " + s.isEmpty());
         s.push(15);
         s.push(25);
         s.push(35);
         s.push(45);
         System.out.println("size= "+s.size());
         System.out.println("isempty= " + s.isEmpty());
         s.show();
         System.out.println("popped elemnt are  "  + s.pop());
         s.show();
         System.out.println("current element:" +s.peek());
         System.out.println("size= "+s.size());
         System.out.println("isempty= " + s.isEmpty());
         s.push(13);
         s.push(24);
         s.push(36);
         s.push(47);
         s.push(18);
         s.push(27);
         s.push(39);
         s.push(40);
         s.show();
         System.out.println("current element:" +s.peek());
         System.out.println("size= "+s.size());
	}

}
