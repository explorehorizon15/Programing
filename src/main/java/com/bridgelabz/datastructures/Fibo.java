package com.bridgelabz.datastructures;

public class Fibo {
public static LinkedList fibo() {
	LinkedList list = new LinkedList();
	int n1=0,n2=1,n3,i;
		int	count=10;    
	 list.insert(n1); 
	 list.insert(n2);
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  list.insert(n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	 return list;
}
public static void main(String args[]) {
	LinkedList list = fibo();
	list.show();
	
	
	
}
}
