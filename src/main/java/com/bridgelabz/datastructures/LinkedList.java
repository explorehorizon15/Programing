package com.bridgelabz.datastructures;

public class LinkedList {
public class Node{
	int data;
	Node next;
}
Node head;
int size;
public void insert(int data) {
	Node node= new Node();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
	}else {
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
	n.next=node;
	size++;
	}	
	
}
public void insertAtstart(int data) {
	Node n= new Node();
	n.data=data;
	n.next=null;
	n.next=head;
	head=n;
	size++;
}
public void insertAtpos(int pos,int data) {
	if(pos==0) {
		insertAtstart(data);
	}else {
	
	Node n=new Node();
	n.data=data;
	n.next=null;
    
	Node m=head;
	for(int i=0;i<pos-1;i++) {
		m=m.next;
	}
	n.next=m.next;
	m.next=n;
	size++;
	}
}

public void delete(int pos) {
	if(pos==0) {
		head=head.next;
		
		
	}else {
		Node n=head;
		Node n1=null;
		for(int i=0;i<pos-1;i++) {
			n=n.next;
			
		}
		size--;
		n1=n.next;
		n.next=n1.next;
		System.out.println("n1::"+pos+"is:"+n1.data);
	}
	
}
public int size() {
	return size;
}
public void show(){
	Node node=head;
	while(node.next!=null) {
		System.out.println(node.data);
		node=node.next;
			
	}
	System.out.println(node.data);
}	
public static void main(String args[]) {
	LinkedList list=new LinkedList();
	System.out.println("size="+list.size());
	list.insert(15);
	list.insert(25);
	list.insert(35);
	list.insert(45);
	list.insertAtstart(85);
	list.insertAtpos(2,30);
	list.insertAtpos(1,91);
	System.out.println("size="+list.size());
	list.delete(0);
	list.delete(1);
	System.out.println("size="+list.size());
	list.delete(2);
	list.delete(3);
	list.insertAtpos(2,37);
	
	list.show();
	System.out.println("size="+list.size());
}

}
