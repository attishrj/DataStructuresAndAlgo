package com.ques.geeks.LinkedList;

public class FindMiddleNode {

	public static void main(String[] args) {
		Node node=new Node(1);
		node.insertAtEnd(node, 2);
		node.insertAtEnd(node, 3);
		node.insertAtEnd(node, 4);
		node.insertAtEnd(node, 5);
		node.insertAtEnd(node, 6);
		node.insertAtEnd(node, 7);
		System.out.println("FindMiddleNode.main() "+getMiddle(node));

	}
	
	static int getMiddle(Node head)
	   {
	       Node tmp1=head;
	       Node tmp2=head;
	       while(null!=tmp1&&null!=tmp1.next)
	       {
	           tmp1=tmp1.next.next;
	           tmp2=tmp2.next;
	       }
	       return tmp2.data;
	   }


}
