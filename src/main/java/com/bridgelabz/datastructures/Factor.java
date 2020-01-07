package com.bridgelabz.datastructures;

public class Factor {
	
public static Stack factor() {
	Stack s=new Stack();
	int n=15;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			s.push(i);
		}
	}
	return s;
}
	
	public static void main(String[] args) {
		Stack s=factor();
		s.show();
	}

}
