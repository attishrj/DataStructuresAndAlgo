package com.learn.data.structure.linkedlist;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		Node second=new Node(2);
		list.head.next=second;
		Node third=new Node(3);
		second.next=third;
		
		travererse(list.head);
		addATEnd(list.head,10);
		System.out.println("after adding at end");
		travererse(list.head);
		System.out.println("\n\nafter adding at begin");
		addATBegin(list, 11);
		travererse(list.head);

	}

	private static Node addATEnd(Node node, int data) {
		while (node!=null&&null!=node.next) {
			node=node.next;
			
		}
	    node.next=new Node(data);
	    return node;
		
	}
	
	private static Node addATBegin(LinkedList list, int data) {
		Node newNode=new Node(data);
		newNode.next=list.head;
		list.head=newNode;
		
	    return list.head;
		
	}

	private static void travererse(Node node) {
		while (null!=node) {
			System.out.println(""+node.data);
			node=node.next;
			
		}
	}

}
