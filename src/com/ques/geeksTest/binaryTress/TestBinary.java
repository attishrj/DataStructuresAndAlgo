package com.ques.geeksTest.binaryTress;

import java.util.LinkedList;
import java.util.Queue;

public class TestBinary {
    static Node root;
	public static void main(String[] args) {
		TestBinary binaryTre = new TestBinary();
		binaryTre.root = new Node(10);
		binaryTre.root.left = new Node(3);
		binaryTre.root.right = new Node(8);
		binaryTre.root.left.left = new Node(9);
		binaryTre.root.left.left = new Node(95);
		binaryTre.root.left.left = new Node(47);
		binaryTre.root.left.right = new Node(12);
		binaryTre.root.right.left = new Node(7);
		System.out.println("Level order Traversal ");
	//	levelOrderTraversal(root);
		System.out.println(printmaximumWidth(root));

	}
	private static int printmaximumWidth(Node root) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		int max=Integer.MIN_VALUE;
		  while(!queue.isEmpty())
		{
			  int size = queue.size();
			  max=Math.max(size, max);
			
			Node tmp=queue.poll();
			//System.out.print(" "+tmp.data );
			if ( null!=tmp.left) {
				queue.add(tmp.left);
			}
			if ( null!=tmp.right) {
				queue.add(tmp.right);
			}
		
	}
		return max;
	}
	private static void levelOrderTraversal(Node head) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(head);
		  while(!queue.isEmpty())
		{
			  int size = queue.size();
			for(int i=0;i<size;i++)
			  { 
			Node tmp=queue.poll();
			System.out.print(" "+tmp.data );
			if ( null!=tmp.left) {
				queue.add(tmp.left);
			}
			if ( null!=tmp.right) {
				queue.add(tmp.right);
			}
		}
		  System.out.println();
	}
	}

}
