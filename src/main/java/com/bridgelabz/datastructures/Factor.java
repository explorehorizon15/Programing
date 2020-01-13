package com.bridgelabz.datastructures;

public class Factor {
static	StackNongeneric s=new StackNongeneric();
public static StackNongeneric factor() {
	
	int n=15;
	
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			s.push(i);
			
		}
	}
	return s;
}
	
	public static void main(String[] args) {
		StackNongeneric s=factor();
		s.show();
	}

}
