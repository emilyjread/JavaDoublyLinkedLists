package com.emilyread.dll;


public class DoublyLinkedLists {
	public Node head;
	public Node tail;

	public DoublyLinkedLists() {
		this.head=null; 
		this.tail=null; 
		
	}
	public void push(int value) {
		Node newNode= new Node(value);
		if (this.head==null){
			this.head=newNode;
			this.tail=newNode;
			return;
		}
		
		this.tail.next= newNode;
		newNode.prev=this.tail;
		this.tail= newNode;
	}
	
	public void pop() {
		if (this.tail==this.head) {
			this.head=null;
			this.tail=null;
			return;
		};
		this.tail= this.tail.prev;
		this.tail.next=null;
		return;
	}
	
	public void printForward() {
		Node runner= this.head;
		while (runner!=null) {
			System.out.println(runner.value);
			runner=runner.next;
			
		}
		return;
	}
	
	public void printBackward() {
		Node runner= this.tail;
		while (runner!=null) {
			System.out.println(runner.value);
			runner=runner.prev;
			
		}
		return;
	}
	
	public boolean contains(int value) {
		Node runner= this.head;
		while (runner!=null) {
			if (runner.value==value) {
				System.out.println("true");
				return true;
			}
			runner=runner.next;
			
		}
		System.out.println("false");
		return false;
	}
	
	public int size() {
		Node runner= this.head;
		int count=0;
		while (runner!=null) {
			count++;
			runner=runner.next;
			
		}
		System.out.println(count);
		return count;
	}
	
	public void insertAt(int nodeVal, int index) {
		Node newNode= new Node(nodeVal);
		
		if (index==0){
			Node prevhead=this.head;
			prevhead=this.head.next;
			prevhead.prev= newNode;
			newNode= this.head;
		
			
			return;
			
		}
		Node runner= this.head;
		
		for (int i=0; i<index-1; i++) {
			if(runner.next!=null) {
				runner=runner.next;
			}
			else {
				return;
			}
			
		}	
		newNode.next=runner.next;
		newNode.prev= runner;
		runner.next.prev=newNode;
		runner.next=newNode;
		
	}
	
	public void removeAt(int index) {
		if (index==0){
			this.head=this.head.next;
			return;		
		}
		Node runner= this.head;
		
		for (int i=0; i<index-1; i++) {
			if(runner.next!=null) {
				runner=runner.next;
			}
			else {
				return;
			}
			
		}	
		
		runner.next=runner.next.next;
		runner.next.prev= runner;
		return;
	}
	
	public boolean isPalindrome() {
		Node left= this.head;
		Node right= this.tail;
		
		while(left!=right) {
			if(left.value!=right.value) {
				System.out.println("false");
				return false;
			}
			left=left.next;
			right= right.prev;
		}
		System.out.println("true");
		return true;
	}
}
