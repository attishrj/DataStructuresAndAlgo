package com.ques.geeks.LinkedList;

public class ReverselList {

	public static void main(String[] args) {
		//2 7 8 9 10
		Node node=new Node(2);
       node.insertAtEnd(node, 7);
       node.insertAtEnd(node, 8);
       node.insertAtEnd(node, 9);
       node.insertAtEnd(node, 10);
       reverse(node);
       node.display(node);
	}

	private static Node reverse(Node node) {
	Node current=node;
	Node next,prev=null;
	while(null!=current)
	{
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
		node=prev;
		return node;
	}

}
