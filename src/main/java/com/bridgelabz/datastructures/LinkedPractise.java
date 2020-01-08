package com.bridgelabz.datastructures;

public class LinkedPractise {
	Node head;
	public void push(int a) {
		Node n1=new Node();
		n1.data=a;
		if(head==null) {
			head=n1;
		}else {
			Node nw= head;
			while(nw.next!=null) {
				nw=nw.next;
			}
	       nw.next=n1;
		}
	}
	public void show() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}

	public static void main(String[] args) {
		LinkedPractise p1= new LinkedPractise();
         p1.push(10);
         p1.push(20);
         p1.push(30);
         p1.push(40);
         p1.show();
	}

}
