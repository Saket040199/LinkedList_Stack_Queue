package com.practice;

public class MyNode<K> implements INode<K> {
	
	public K key;
	public INode<K> next;
	
	public MyNode(K key) {
		this.key=key;
		this.next=null;
	}

    
	@Override
	public INode<K> getNext() {
		return next;
	}
    
	@Override
	public void setNext(INode next) {
		this.next =(INode<K>)next;
	}

	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key=key;
		
	}

	
}
