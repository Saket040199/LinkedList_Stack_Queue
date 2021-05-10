package com.practice;

public interface INode<K> {
	
	public <K>K getKey();
	void setKey(K key);
	
	public INode getNext();
	void setNext(INode next);
	

}
