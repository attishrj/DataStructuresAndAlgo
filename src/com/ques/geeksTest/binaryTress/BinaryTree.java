package com.ques.geeksTest.binaryTress;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	static Node root;

	public static void main(String[] args) {
		BinaryTree binaryTre = new BinaryTree();
		binaryTre.root = new Node(10);
		binaryTre.root.left = new Node(3);
		binaryTre.root.right = new Node(8);
		binaryTre.root.left.left = new Node(9);
		binaryTre.root.left.right = new Node(12);
		binaryTre.root.right.left = new Node(7);
		System.out.println("Level order Traversal ");
		//binaryTre.printLevelOrderTraversal(root);
	//	binaryTre.printLevelOrderTraversalLineByLine(root);
		System.out.println(binaryTre.printMaxWidth(root));
		
		//System.out.println("height of tree "+binaryTre.maxDepth(binaryTre.root));
	}


	private void printLevelOrderTraversal(Node root) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
            Node tmpNode=queue.poll();
            System.out.println("element is "+tmpNode.data);
            if(null!=tmpNode.left)
            {
            	queue.add(tmpNode.left);
            }
            if(null!=tmpNode.right)
            {
            	queue.add(tmpNode.right);
            }
		}
	}
	private void printLevelOrderTraversalLineByLine(Node root) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int count=queue.size();
            for(int i=0;i<count;i++)
            {
            	Node tmpNode=queue.poll();
            	System.out.print(" "+tmpNode.data);
            if(null!=tmpNode.left)
            {
            	queue.add(tmpNode.left);
            }
            if(null!=tmpNode.right)
            {
            	queue.add(tmpNode.right);
            }
		}
            System.out.println( "^ ^ ^ ");
		}
	}

	private int printMaxWidth(Node root2) {

		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		int maxWidth=Integer.MIN_VALUE;
		while (!queue.isEmpty()) {
			int count=queue.size();
			maxWidth=Math.max(maxWidth, count);
            for(int i=0;i<count;i++)
            {
            	Node tmpNode=queue.poll();
            	//System.out.print(" "+tmpNode.data);
            if(null!=tmpNode.left)
            {
            	queue.add(tmpNode.left);
            }
            if(null!=tmpNode.right)
            {
            	queue.add(tmpNode.right);
            }
		}
           // System.out.println( "^ ^ ^ ");
		}
	    return maxWidth;
		
		
	}
	
	private int maxDepth(Node node) {
		int lDepth;
		int rDepth;
		if (node == null) {
			return 0;
		}

		else {
			lDepth = maxDepth(node.left);
			rDepth = maxDepth(node.right);

		}
		return Math.max(lDepth, rDepth) + 1;

	}

}
