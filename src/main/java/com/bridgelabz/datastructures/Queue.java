package com.bridgelabz.datastructures;

public  class Queue {
	int Queue[]=new int[6];
	int front;
	int rear;
	int size;

	public  int enqueue(int data) {
		Queue[rear]=data;
		rear=rear+1;
		size=size+1;
		return data;
	}
	public void dequeue() {
		int data;
		data=Queue[front];
		front=front+1;
		size=size-1;
		
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(Queue[i] + " ");
		}
		System.out.println();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size<=0;
	}
	
	public static void main(String[] args) {
		Queue q= new Queue();
		System.out.println("size is: " +q.isEmpty());
		q.enqueue(15);
		q.enqueue(25);
		q.enqueue(10);
		q.enqueue(5);
		q.show();
		System.out.println("size is: " +q.size());
		q.dequeue();
		q.show();
		System.out.println("size is: " +q.size());
		System.out.println("size is: " +q.isEmpty());
		

	}

}
