package com.bridgelabz.datastructures;



public class StackUsinglinked {
	public class Node{
		int data;
		Node next;
	}
	Node top;
	int size=0;
	public void push(int data) {
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(top==null) {
			top=node;
		}else {
			Node n=top;
			while(n.next!=null) {
				n=n.next;
			}
		n.next=node;
		size++;
		}
	}
	
	public void pop(int index) {
		if(top==null) {
			System.out.println("Stack is Empty!!");
		}else {
		if(index==0) {
			top=top.next;	
		}else {
			Node n=top;
			Node n1=null;
			for(int i=0;i<=index-1;i++) {
				n=n.next;
				
			}
			size--;
			n1=n.next;
			n.next=n1.next;
			
		}
		}
		
		
	}
	
	public void show() {
		Node node=top;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
				
		}
		System.out.println(node.data);
	}
	
	
	public boolean isEmpty() {
		if(size>0) {
			return false;
		}
		return true;
	}
	  
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		StackUsinglinked obj= new StackUsinglinked();
		System.out.println(obj.isEmpty());
		obj.push(15);
		obj.push(29);
		obj.push(26);
		obj.push(35);
		obj.push(39);
		obj.push(46);
		
		obj.show();
		System.out.println(obj.getSize());
		System.out.println(obj.isEmpty());
		System.out.println("Popped:");
		obj.pop(1);
		obj.show();
		
	}

}
