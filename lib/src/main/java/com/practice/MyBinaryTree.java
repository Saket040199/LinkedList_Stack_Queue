package com.practice;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root=this.addRecursively(root, key);
		
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if(current==null) {
		return new MyBinaryNode(key);
		}
		
        int comparekey = key.compareTo(current.key);
        if (comparekey == 0)
            return current;

        if (comparekey < 0)
            current.left = addRecursively(current.left, key);
        else if (comparekey > 0)
            current.right = addRecursively(current.right, key);
        return current;
    
		
	}
    public int size() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return (current == null) ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
    }

	public K search(K key) {
        MyBinaryNode<K> searchedNode = this.searchRecursively(this.root, key);
        return (searchedNode == null) ? null : searchedNode.key;
    
		// TODO Auto-generated method stub
		
	}

	private MyBinaryNode<K> searchRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return null;
        int compareOutput = key.compareTo(current.key);
        if (compareOutput == 0)
            return current;
        else if (compareOutput < 0)
            return searchRecursively(current.left, key);
        else
            return searchRecursively(current.right, key);

		}
}