package com.practice;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void Given3NumbersWhenAddedToStackSHouldHaveLastAddedNumber() {
		MyStack mystack=new MyStack();
		
		MyNode<Integer> myFirstNode = new  MyNode<>(70);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(56);
		
		mystack.push(myFirstNode);
		mystack.push(mySecondNode);
		mystack.push(myThirdNode);
		mystack.printStack();
		INode peak=mystack.peak();
		Assert.assertEquals(myThirdNode, peak);
		
	
		
	}

	@Test
	public void Given3NumbersWhenPopToStackSHouldHaveReturnLastElement() {
		MyStack mystack=new MyStack();
		
		MyNode<Integer> myFirstNode = new  MyNode<>(70);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(56);
		
		mystack.push(myFirstNode);
		mystack.push(mySecondNode);
		mystack.push(myThirdNode);
		INode pop=mystack.pop();
		mystack.printStack();
		Assert.assertEquals(myThirdNode, pop);
	}

	@Test
	public void Given3NumbersWhenPopToStackSHouldHaveReturnEmpty() {
		MyStack mystack=new MyStack();
		
		MyNode<Integer> myFirstNode = new  MyNode<>(70);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(56);
		
		mystack.push(myFirstNode);
		mystack.push(mySecondNode);
		mystack.push(myThirdNode);
		
		INode poplast=mystack.pop();
		INode pop2last=mystack.pop();

		INode popfirst=mystack.pop();

		
		Assert.assertTrue(mystack.isEmpty());
	}

}
