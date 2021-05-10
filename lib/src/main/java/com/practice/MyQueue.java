package com.practice;

public class MyQueue {
	
	private MyLinkedList myLinkedList;

	public MyQueue() {
	this.myLinkedList=new MyLinkedList();
		// TODO Auto-generated constructor stub
	}

	public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
		// TODO Auto-generated method stub
		
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
		// TODO Auto-generated method stub
		
	}

	public INode peek() {
		
		// TODO Auto-generated method stub
		return myLinkedList.head;
	}

	public INode dequeue() {
		// TODO Auto-generated method stub
		return myLinkedList.delete();
	}

}
