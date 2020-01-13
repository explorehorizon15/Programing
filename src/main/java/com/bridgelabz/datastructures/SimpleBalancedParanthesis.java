package com.bridgelabz.datastructures;

public class SimpleBalancedParanthesis <T> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] ch= {'(','{','[','{','(','[',']',')','}',']','}',')'};
System.out.println(checkMaching(ch));  //calling static boolean method.
	}
	
	// if they match it will print true else false.
	public static boolean areMaching(char char1,char char2) {
		if(char1=='(' && char2==')')  return true;
		if(char1=='{' && char2=='}')  return true;
		if(char1=='[' && char2==']')  return true;
		else  return false;
	}
	// check if they match it will print true else false.
	public static boolean checkMaching(char[] ch) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='(' && ch[ch.length-1-i]==')' || ch[i]=='{' && ch[ch.length-1-i]=='}' || ch[i]=='[' && ch[ch.length-1-i]==']')  return true;
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')  stack.push(ch[i]);
			if(ch[i]==')' || ch[i]=='}' || ch[i]==']') {
				if(stack.isEmpty())  return false;
				else if(!areMaching(stack.popFirst(),ch[i]))  return false;
			}
		}
	//	if stack is empty then it will print true else false.
		if(stack.isEmpty())  return true;
		else 
			return false;
	}
}
