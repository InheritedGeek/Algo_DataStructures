package com.company;

// Java program for reversing the linked list

import java.util.ArrayList;
import java.util.List;

class Node {

	// "next" creates a reference to a new instance of a Node
	// Basically creates a new Node linked to the current Node (using reference)
	// When we create a current Node (head), we initialise the next Node (head.next) as null
	// Then using head.next we update it's value and make the head.next.next as null and so on

	int data;
	Node next;

	// Class Constructor
	Node(int value) {
		this.data = value;
		this.next = null;
	}
}

class LinkedList {

	// head refer to the first node
	static Node head;

	public static void main(String[] args) {

		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head  = new Node(10); // head refers to the first node
		Node second = new Node(20);
		Node third  = new Node(30);
        /* Three nodes have been allocated  dynamically.
          We have references to these three blocks as first,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

		llist.head.next = second; // Link first node with the second node

        /*  Now next of first Node refers to second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

		second.next = third; // Link second node with the third node

        /*  Now next of second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

//		llist.append(99);
//        llist.push(4);
//		llist.push(3);
//
//		llist.insertAfter(second,36);
//		llist.delete(10);
//		llist.swapNodes(3,20);

//		llist.deleteFirstNode();
//		llist.printlist();


//		llist.getCount();
//		llist.search(34);
//		llist.GetNth(3);
//		llist.countOccurrence(7);
//		llist.reverseUtil(head,null);
//		System.out.println("\n Reversed linked list ");
//		llist.printlist();
	}

	public static void printlist(){
		Node n = head;
		while (n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data){

		if (prev_node == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);
		new_node.next= prev_node.next;
		prev_node.next = new_node;

	}

	public void append(int new_data) {
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		Node new_node = new Node(new_data);
		last.next = new_node;
		new_node.next = null;
	}

	public void delete(int key){

		// tmp refer to the node which has to be deleted
		Node tmp = head;
		Node prev = null; // prev is node previous to tmp

		while (tmp != null && tmp.data != key){
			prev = tmp;
			tmp = tmp.next;
		}

		// if key not present till tmp is null i.e. key not present
		if (tmp == null) return;

		prev.next = tmp.next;

	}

	public void deleteFirstNode(){
		if (head !=null)
			head = head.next;
	}

	/* Returns count of nodes in linked list */
	public void getCount(){
		int count = 0;
		Node tmp = head;

		while (tmp !=null ){
			tmp= tmp.next;
			count+=1;
		}
		System.out.println("Count is: "+count);

	}

	public void search( int x){
		Node tmp = head;

		while (tmp !=null ){
			if (tmp.data == x) {
				System.out.println("Integer Present!");
				return;
			}
			tmp= tmp.next;
		}
		System.out.println("Integer Absent!");
	}

	public void swapNodes (int x , int y){
		if (x == y)
			return;

		Node prevX = null;
		Node currX = head;

		while (currX!= null && currX.data!=x){
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null;
		Node currY = head;

		while (currY!= null && currY.data!=y){
			prevY = currY;
			currY = currY.next;
		}
		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		// if prevX is null then prevX.next will throw Null Pointer Exception
		if (prevX != null)
			prevX.next = currY;
		else //make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	public void GetNth(int index){
		Node tmp = head;
		int start = 0;

		while (tmp!= null){
			if (index == start){
				System.out.println(tmp.data);
				return;
			}
			start+=1;
			tmp=tmp.next;
		}
		return;
	}

	public void countOccurrence(int key){
		Node tmp = head;
		int count = 0;

		while (tmp!=null){
			if (tmp.data == key)
				count+=1;
			tmp=tmp.next;
		}
		System.out.println("Total Utterances of "+ key  +" are "+count);

	}

	public void reverseUtil(Node curr, Node prev) {

		if (curr.next ==null){
			head = curr;
			curr.next=prev;
			return;
		}

		Node next = curr.next;
		curr.next = prev;

		reverseUtil(next,curr);
	}
}



