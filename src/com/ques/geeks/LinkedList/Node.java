package com.ques.geeks.LinkedList;


public class Node {
	Node next;
	int data;
	public Node() {
		// TODO Auto-generated constructor stub
	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node insertAtEnd(Node node, int data) {
		Node last=node;
		if (null == node) {
			node = new Node(data);
			return node;
		} else {
			while (last.next != null) {
				last = last.next;

			}
			last.next = new Node(data);
			//node.next=last;
			return last;
		}
	}
	void display(Node node)
	{
		while (node!=null) {
        System.out.println(" "+node.data);
       node= node.next;
		}
	}
}
