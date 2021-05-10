package com.practice;

import java.util.LinkedList;

public class MyStack {
	
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList=new MyLinkedList();
		// TODO Auto-generated constructor stub
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
		// TODO Auto-generated method stub
		
	}

	public void printStack() {
	 myLinkedList.printMyNodes();
		// TODO Auto-generated method stub
		
	}

	public INode peak() {
		return myLinkedList.head;
		// TODO Auto-generated method stub
		
	}

	public INode pop() {
		return myLinkedList.delete();
		// TODO Auto-generated method stub
		
	}

	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		
		return false;
	}

	private int size() {
		int size=0;
		size=myLinkedList.size();
		// TODO Auto-generated method stub
		return size;
	}
	
    
}
