package com.bridgelabz.datastructures;

public class StackUsinglinked {
	public class Node {
		int data;
		Node next;
	}

	Node top;

	StackUsinglinked() {
		this.top = null;
	}

	public void push(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (top == null) {
			top = node;
		} else {
			Node n = top;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
	}

	public void pop() {
		if (top == null) {
			System.out.println("Stack is Empty!!");
		} else {
			Node n = top;
			Node prev = null;
			while (n.next != null) {
				prev = n;
				n = n.next;
			}
			System.out.println("Popped data is:" + prev.next.data);
			prev.next = null;
		}
	}

	public void show() {
		Node node = top;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		StackUsinglinked obj = new StackUsinglinked();
		obj.pop();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);

		obj.show();
		obj.pop();
		obj.pop();
		System.out.println("after popped:");
		obj.show();

	}
}
