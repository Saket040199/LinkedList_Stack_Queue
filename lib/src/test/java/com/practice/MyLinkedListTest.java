package com.practice;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	
	@Test
    public void Given3NumberWhenAddedToLinkedListSholudBeAddedToTop() {
		MyNode<Integer> myFirstNode = new  MyNode<>(70);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		myLinkedList.printMyNodes();
		System.out.println("Test case 1 \n");
		boolean result=myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) &&
				       myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	
	@Test
    public void Given3NumberWhenAppendToLinkedListSholudBeAddedToLast() {
		MyNode<Integer> myFirstNode = new  MyNode<>(56);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		System.out.println("Test case 2 \n");
		boolean result=myLinkedList.head.equals(myFirstNode) &&
				       myLinkedList.head.getNext().equals(mySecondNode) &&
				       myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
    public void Given3NumberWhenInsertToLinkedListSholudBeAddedInMiddle() {
		MyNode<Integer> myFirstNode = new  MyNode<>(56);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNodes();
		System.out.println("Test case 3 \n");
		boolean result=myLinkedList.head.equals(myFirstNode) &&
			       myLinkedList.head.getNext().equals(mySecondNode) &&
			       myLinkedList.tail.equals(myThirdNode);
          	Assert.assertTrue(result);
}
	@Test
    public void Given3NumberWhenDeleteToLinkedListSholudBeDeleteFromFirst() {
		MyNode<Integer> myFirstNode = new  MyNode<>(56);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode deleteNode=myLinkedList.delete();
		myLinkedList.deleteLast();
		myLinkedList.printMyNodes();

		System.out.println("Test case 4 \n");
		Assert.assertEquals( myFirstNode,deleteNode);
	}
	
    @Test
    public void given3NumberWhenSearchForAnElementShouldReturnElement() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
     
      INode searchedNode = myLinkedList.search(thirdNode.getKey());
       
        myLinkedList.printMyNodes();
        System.out.println("Test case 5 \n");
      Assert.assertEquals(thirdNode, searchedNode);
        
    }

	@Test
    public void Given3NumberWhenDeleteToLinkedListSholudBeDeleteFromLast() {
		MyNode<Integer> myFirstNode = new  MyNode<>(56);
		MyNode<Integer> mySecondNode = new  MyNode<>(30);
		MyNode<Integer> myThirdNode = new  MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myThirdNode);
		
		myLinkedList.add(myFirstNode);
		
		myLinkedList.append(mySecondNode);
		
		myLinkedList.append(myThirdNode);
		INode deletedNode=myLinkedList.deleteLast();
	
		System.out.println("Test case 6 \n");
		Assert.assertEquals(myThirdNode,deletedNode);
	}
    @Test
    public void given3NumberWhenInsertingAfterAnElementShouldPassLinkedListTest() {
        MyNode<Integer> myfirstNode = new MyNode(56);
        MyNode<Integer> mysecondNode = new MyNode(30);
        MyNode<Integer> mythirdNode = new MyNode(70);

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myfirstNode);
        myLinkedList.append(mysecondNode);
        myLinkedList.append(mythirdNode);

        myLinkedList.insertAfter(30, 40);

        boolean result = myLinkedList.head.equals(myfirstNode) && myLinkedList.head.getNext().equals(mysecondNode)
                && myLinkedList.head.getNext().getNext().equals(myLinkedList.search(40))  && myLinkedList.tail.equals(mythirdNode);
        
       myLinkedList.printMyNodes();
       System.out.println("Test case 7 \n");
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberWhenDeletingAnElementShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(40);
        MyNode<Integer> fourthNode = new MyNode(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        System.out.println("Size : "+myLinkedList.size());
        myLinkedList.printMyNodes();
        myLinkedList.deleteElement(thirdNode.getKey());
        System.out.println("Size : " + myLinkedList.size());

        boolean result = myLinkedList.head.equals(firstNode) && myLinkedList.head.getNext().equals(secondNode)
                && myLinkedList.tail.equals(fourthNode);
        myLinkedList.printMyNodes();
        System.out.println("Test case 8 \n");
        Assert.assertTrue(result);
    }
    
    @Test
    public void given3NumberWhenAddedAnElementShouldAddinOrder() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(40);
        MyNode<Integer> fourthNode = new MyNode(70);
        
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addOrdered(firstNode);
        myLinkedList.addOrdered(secondNode);
        myLinkedList.addOrdered(thirdNode);
        myLinkedList.addOrdered(fourthNode);
        
        boolean result=myLinkedList.head.equals(secondNode) && myLinkedList.head.getNext().equals(thirdNode)  && myLinkedList.head.getNext().getNext().equals(firstNode)
        		&& myLinkedList.tail.equals(fourthNode);
        myLinkedList.printMyNodes();
        Assert.assertTrue(result);
        
    }
    

}
