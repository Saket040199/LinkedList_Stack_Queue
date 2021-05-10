package com.practice;

public class MyLinkedList<K> {
	
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}

	public void add(INode newNode) {
		if(this.tail==null) {
			this.tail=newNode;
		}
		if(this.head==null) {
			this.head=newNode;
		}
		else {
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	
	
	public void append(INode newNode) {
		if(this.head==null) {
			this.head=newNode;
		}
		if(this.tail==null) {
			this.tail=newNode;
		}
			else {
				this.tail.setNext(newNode);
				this.tail=newNode;
			}
		
	}
	
	
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode.getNext() !=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void insert(INode myNode,INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
		
	}

	public INode delete() {
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
		// TODO Auto-generated method stub
		
	}

	public INode deleteLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
       tempNode = tempNode.getNext();
        
        return tempNode;
	}

	public <K>INode search(K key) {
        INode tempNode = head;
        while (!tempNode.equals(tail)) {
            if (tempNode.getKey() == key) {
                System.out.println("Element is present");
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        if (tempNode.getKey() == key) {
            System.out.println("Element is present");
            return tempNode;
        } else {
            System.out.println("Element is not present");
            return null;
        }
    
		
	}

	public void insertAfter(K myKey, K newKey) {
        INode myNode = search(myKey);
        if (myNode != null) {
            insert(myNode, new MyNode(newKey));
            System.out.println("Element inserted");
        } else {
            System.out.println("Element not inserted");
        }
	}

	public void deleteElement(K key) {
        INode deleteNode = search(key);
        INode tempNode = head;
        if (deleteNode != null) {
            while (!tempNode.getNext().equals(deleteNode)) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(deleteNode.getNext());
            System.out.println("Element deleted");
        } else
            System.out.println("Element not deleted");
    }
		
	

	public int size() {
        int size = 0;
        INode tempNode = head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

	public <K extends Comparable<K>> void addOrdered(INode newNode) {
        if (head == null || (((Comparable<K>) head.getKey()).compareTo((K) newNode.getKey()) >= 0)) {
            newNode.setNext(head);
            this.head = newNode;
        } else {
            INode tempNode = head;
            while (tempNode.getNext() != null && (((Comparable<K>) tempNode.getNext().getKey()).compareTo((K) newNode.getKey())) < 0) {
                tempNode = tempNode.getNext();
            }
            if(tempNode.getNext() == null) {
                INode myNode=search(tempNode.getKey());
                myNode.setNext(newNode);
                this.tail=newNode;
            }
            else {
                newNode.setNext(tempNode.getNext());
                INode myNode=search(tempNode.getKey());
                myNode.setNext(newNode);
            }
        
		
        }
	}
		
	
    }
