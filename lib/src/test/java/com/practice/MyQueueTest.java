package com.practice;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedToQueueShouldHaveFirstNodeAtTop() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);

        MyQueue myQueue = new MyQueue();
        
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        INode top = myQueue.peek();
        myQueue.printQueue();
        Assert.assertEquals(firstNode, top);
    }

    @Test
    public void given3NumberInQueueWhenDequeuedShouldMatchWthFirstAddedNode() {
        MyNode<Integer> firstNode = new MyNode(56);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(70);

        MyQueue myQueue = new MyQueue();
        
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);

        INode dequeuedNode = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(firstNode, dequeuedNode);
    }
}
