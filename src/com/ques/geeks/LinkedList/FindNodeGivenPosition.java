package com.ques.geeks.LinkedList;

public class FindNodeGivenPosition {

	//8 7 10 8 6 1 20 91 21 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node(8);
		node.insertAtEnd(node, 7);
		node.insertAtEnd(node, 10);
		node.insertAtEnd(node, 33);
		node.insertAtEnd(node, 6);
		node.insertAtEnd(node, 1);
		node.insertAtEnd(node, 541);
		node.insertAtEnd(node, 20);
		node.insertAtEnd(node, 91);
		node.insertAtEnd(node, 21);
		node.insertAtEnd(node, 54);
	   System.out.println(getNth(node, 1));	
	   System.out.println("Find Middle node");

	}
	public static int getNth(Node node, int ind)
    {
		Node tmp=node;
        int count=0;
      while(null!=node)
      {
    	 
      if(count==ind)
      {
          return node.data;
      }
      count++;
      node=node.next;
      }
      return -1;
    }
	
	
}
