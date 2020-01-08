package com.bridgelabz.datastructures;



public class Practise {

	class Node{
		int data;
		Node next;
	}
	
	class Node1{
		int data;
		Node next;
		char c;
	}
	
	public static void main(String[] args) {
		Practise p1 = new Practise();
		p1.initial();
	}
	
	public void initial()	{
		Node n1 = new Node();
//		System.out.println("int = "+n1.data);
//		System.out.println("next = "+n1.next);
		
		Node n2 = new Node();
		n2.data = 222;
		n2.next = n1;
		
		
		Node n3 = new Node();
		n3.data = 333;
		n3.next = n2;
		
		
		
		Node tttt = n3 ; 
				
		
		
		System.out.println("tttt.data="+tttt.data);
		
		tttt = tttt.next;
		
		System.out.println("tttt.data="+tttt.data);
		
		tttt = tttt.next;
		
		System.out.println("tttt.data="+tttt.data);
		
//	System.out.println("n2.next"+n2.next);
		
		
		tttt = n3;
		
		while( tttt!= null )	{
			
			System.out.println(tttt.data);
			tttt = tttt.next;
			
		}
		
	}

}
